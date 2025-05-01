/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

import com.mycompany.projet_atelier_interface.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author PC
 */
public class TestFichier {
    public void Test(){
    System.out.println("fiabilite MACHINE");
      //établis liste des machines étudiées dans la fichier suiviMaintenance"
        ArrayList<String> machines = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader("suiviMaintenance2.txt"));
            String ligne;

            while ((ligne = in.readLine()) != null) {
                StringTokenizer t = new StringTokenizer(ligne, " ");
                if (t.hasMoreTokens()) {
                    t.nextToken(); // saute 1er
                    t.nextToken(); // saute 2ème
                    String machine = t.nextToken();
                    
                    // Vérifie si la machine est déjà enregistrée
                    if (!machines.contains(machine)) {
                        machines.add(machine);
                    }
                } else {
                    System.out.println("Ligne ignorée (pas assez d'informations) : " + ligne);
                }
            }
            in.close(); 
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
        
    //pour chaque machine, calculer la durée en arrêt
    for(String m: machines){
        System.out.println(m);
        long totalMinutes = 0; //long = chiffres longs
        DateTimeFormatter formatHeure = DateTimeFormatter.ofPattern("HH:mm");
        List<String> evenements = new ArrayList<>();

        try {
            BufferedReader in = new BufferedReader(new FileReader("suiviMaintenance2.txt"));
            String ligne;
            while ((ligne = in.readLine()) != null) {
                String[] parts = ligne.split(" "); //sépare chaque ligne en tableau, un mot=une case
                if (parts.length >= 4) {
                    String heure = parts[1];
                    String machine = parts[2];
                    String evenement = parts[3]; // "A" ou "D"

                    if (machine.equals(m)) {
                        evenements.add(heure + " " + evenement);
                        
                    }
                }
            }
            //evenements.add("FIN DE LA JOURNEE");
            //for (String i: evenements){
            //    System.out.println(i);
            //}
            in.close();
            // Traitement : calcul des durées entre A et D
            LocalTime debut = null; //LocalTime = classe spéciale pr les heures
            

            System.out.println("Evenements pour la machine : " + m);
            for (String evt : evenements) {
                //while (!evt.equals("FIN DE LA JOURNEE")){
                String[] split = evt.split(" "); // Sépare "08:15 A" en ["08:15", "A"]
                LocalTime heure = LocalTime.parse(split[0], formatHeure); // Convertit "08:15" en un objet heure
                String type = split[1]; //"A" ou "D"

                if (type.equals("A")) {  //cas ou on rencontre un A pour la première fois
                    debut = heure; //on enregistre heure de début de la panne
                    
                } else if (type.equals("D") && debut != null) { //cas où on rencontre un D et qu'on a eu un A juste avant
                    Duration duree = Duration.between(debut, heure);  // Calcul de durée entre l’heure du A et celle du D
                    long minutes = duree.toMinutes();//le convertit en minute
                    System.out.println(" Duree de panne : " + minutes + " minutes");
                    totalMinutes += minutes;  // ajoute cette durée à la durée totale de panne
                    debut = null;  //réinitialise heure de début, jusqu'au prochain A croisé
                }else if (type.equals("D") && debut == null) {//cas ou la machien ne marchait pas depuis le début de la journée
                    debut = LocalTime.of(6, 0);
                    Duration duree = Duration.between(debut, heure);
                    long minutes = duree.toMinutes();
                    System.out.println(" Duree de panne : " + minutes + " minutes");
                    totalMinutes += minutes;
                    debut = null;
                }
                //}
                //if (evt.equals("FIN DE LA JOURNEE")&&(debut != null)){ //cas ou on a fini la liste mais il reste un A = machine s'est arr^été et n'a pas repris avant 22h
                  //  LocalTime heure = LocalTime.of(22, 0);
                    //Duration duree = Duration.between(debut, heure);
                    //long minutes = duree.toMinutes();
                    //System.out.println(" Duree de panne : " + minutes + " minutes");
                    //totalMinutes += minutes;
                    //debut = null;
                //}
            }

            System.out.println("Total des pannes pour la "+m+": " + totalMinutes + " minutes");
            long n = 100 * (840 - totalMinutes) / 840;  //840= minutes entre 6h et 20h
            System.out.println("fabilite de la machine: "+ n+" pourcent");

        } catch (IOException e) {
            System.err.println("Erreur de lecture : " + e.getMessage());
        }
    }
    }

    public static void main(String[] args) {
        TestFichier test = new TestFichier();
        test.Test(); // exécution de ta méthode
        
    }
}
