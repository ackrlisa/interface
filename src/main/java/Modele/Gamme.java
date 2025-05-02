/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

import com.mycompany.projet_atelier_interface.*;
import java.util.ArrayList;

/**
 *
 * @author alicedeboever
 */
public class Gamme {
    private String refGamme ;
    private ArrayList<Operation> listeOperation=new ArrayList<>();
    private ArrayList<Equipement> listeEquipement=new ArrayList<>() ;
    private static ArrayList<Gamme> listeGammes = new ArrayList<>(); 

    public String getRefGamme() {
        return refGamme;
    }

    public ArrayList<Operation> getListeOperation() {
        return listeOperation;
    }

    public ArrayList<Equipement> getListeEquipement() {
        return listeEquipement;
    }

    public static ArrayList<Gamme> getListeGammes() {
        return listeGammes;
    }
    
    
    public void setRefGamme(String refGamme) {
        this.refGamme = refGamme;
    }

    public void setListeOperation(ArrayList<Operation> listeOperation) {
        this.listeOperation = listeOperation;
    }

    public void setListeEquipement(ArrayList<Equipement> listeEquipement) {
        this.listeEquipement = listeEquipement;
    }

    
    

    public Gamme(String refGamme, ArrayList<Operation> listeOperation, ArrayList<Equipement> listeEquipement) {
        this.refGamme = refGamme;
        this.listeOperation = listeOperation;
        this.listeEquipement = listeEquipement;
        listeGammes.add(this);
    }
    // Méthode toString redéfinie
    @Override
    public String toString() {
        return "Gamme [Référence: " + refGamme + ", Nombre d'opérations: " + listeOperation.size() + ", Nombre d'équipements: " + listeEquipement.size() + "]";
    }
    
    public static void creerGamme(String refGamme) {
        Gamme nouvelle = new Gamme(refGamme, new ArrayList<>(), new ArrayList<>());
        System.out.println("Nouvelle gamme créée de référence : " + refGamme);
    }
    //Modifier la référence de la game
    public void modifierGamme(String newRefGamme) {
        System.out.println("Référence de la gamme "+ refGamme +" modifiée!");
        this.refGamme = newRefGamme;
    
    }
    
    public void supprimerGamme(){
        this.refGamme = null;
        this.listeOperation.clear();
        this.listeEquipement.clear();
        listeGammes.remove(this);  // Supprime cette instance de la liste
        
        System.out.println("Gamme supprimée !");   
    }
    
    
   //Modifier gamme en ajoutant ou supprimant une opération ou un équipement
    public void ajoutEquipementOperation(Equipement equipement,Operation operation){
        this.listeOperation.add(operation);
        System.out.println("Opération "+operation.getRefOperation()+" ajoutée!");
        this.listeEquipement.add(equipement);
        System.out.println("Equipement "+equipement.getRefEquipement()+" ajouté!");
    }
    public void enleverEquipementOperation(Equipement equipement,Operation operation){
       if (listeOperation.remove(operation)) {   //vérifier direct si l'opération est dans la gamme, et si oui elle est alors supprimée
        System.out.println("Opération " + operation.getRefOperation() + " retirée !");
    } else {
        System.out.println("Cette opération n'est pas utilisée dans cette gamme");
    }
    if (listeEquipement.remove(equipement)) {   //vérifier direct si l'opération est dans la gamme, et si oui elle est alors supprimée
        System.out.println("Equipement " + equipement.getRefEquipement() + " retiré!");
    } else {
        System.out.println("Cte équipement n'est pas utilisé pour cette gamme");
    }
}
 
    

        
    public void afficheGamme(){
        if ((refGamme==null)&&(listeEquipement.isEmpty())&&(listeOperation.isEmpty())){
            System.out.println("La gamme n'existe pas");
        }else{
         System.out.println("Gamme de réference: " + refGamme);
        System.out.println("Liste des equipements necessaires " + listeEquipement.size() + ":");
        for (Equipement e : listeEquipement) {
            e.afficheEquipement();
            System.out.println();
    }
        System.out.println("Liste des operations " + listeOperation.size() + ":");
        for (int i = 0; i < listeOperation.size(); i++) {
            System.out.println("Etape " + (i+1) + ":");
            listeOperation.get(i).afficheOperation();
            System.out.println();
        }
        System.out.println("Cout total de la gamme: " + coutGamme() + " euro");
        System.out.println("Duree totale de la gamme: " + dureeGamme() + " h");
        }
       }
    
    public float coutGamme(){
        float coutTotal = 0;
        
        // Pour chaque opération, trouver l'équipement correspondant et calculer le coût
        for (Operation op : listeOperation) {
            for (Equipement eq : listeEquipement) {
                if (eq.getRefEquipement().equals(op.getRefEquipement())) {
                    coutTotal += op.calculerCout(eq);
                    break;
                }
            }
        }  
        return coutTotal;
    }
    
    public float dureeGamme(){
        float dureeTotal = 0;
        
        // Somme des durées de toutes les opérations
        for (Operation op : listeOperation) {
            dureeTotal += op.getDureeOperation();
        }
        
        return dureeTotal;
    }

}
