/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

import com.mycompany.projet_atelier_interface.*;
import java.util.ArrayList;

/**
 *
 * @author lisaa
 */
public class Poste extends Equipement {
    private ArrayList<Machine> listeMachine=new ArrayList<>();
    private String dPoste;
    private String refPoste;
    private static ArrayList<Poste> listePostes = new ArrayList<>(); 

    public ArrayList<Machine> getListeMachine() {
        return listeMachine;
    }

    public String getdPoste() {
        return dPoste;
    }

    public String getRefPoste() {
        return refPoste;
    }
    
    public static ArrayList<Poste> getListePostes() {
        ArrayList<Poste> postes = new ArrayList<>();
    for (Equipement e : listeEquipements) {
        if (e instanceof Poste) {
            postes.add((Poste) e);
        }
    }
    return postes;
    }
    
      public void setListeMachine(ArrayList<Machine> listeMachine) {
        this.listeMachine = listeMachine;
    }

    public void setdPoste(String dPoste) {
        this.dPoste = dPoste;
    }

    public void setRefPoste(String refPoste) {
        this.refPoste = refPoste;
    }
   
    public Poste(ArrayList<Machine> listeMachine, String dPoste, String refPoste) {
        super(dPoste, refPoste, 0); // Initialisation --> coût sera recalculé
        this.dPoste = dPoste;
        this.refPoste = refPoste;
        this.listeMachine = listeMachine;
        Equipement.getListeEquipements().add(this);


        float n = 0;
        for (Machine i : this.listeMachine){
            n += i.getCout();
        }
        super.setCout(n);
    }
     // Méthode toString redéfinie
    @Override
    public String toString() {
        return "Poste [Référence: " + refPoste + ", Nombre de machines: " + listeMachine.size() + "]";
    }
    
    public void affichePoste(){
        super.afficheEquipement();
        System.out.println("Liste des Machines de ce poste:");
        for (Machine i:this.listeMachine){
            i.afficheMachine();
        }
}
    public void modifierPoste(Poste poste, Machine machine, boolean ajouter){
       if (ajouter){
           if (poste.getListeMachine().contains(machine)){
               System.out.println("cette machine est déjà contenu dans ce poste, vous ne pouvez pas l'ajouter");
           }else{
           poste.getListeMachine().add(machine); 
           System.out.println("Machine"+ machine.getRefEquipement() + " ajoutée au poste " );
            }
       }else{
           if (poste.getListeMachine().contains(machine)){
               poste.getListeMachine().remove(machine);
        }else{
               System.out.println("La machine n'existe pas dans ce poste, vous ne pouvez donc pas l'enlever");
        }
      }      
    }
    
    
    public void supprimerPoste(){
        for (Machine machine : listeMachine) {
            machine.setPoste(null);  // On met la référence du poste à null dans chaque machine
        }
        
        // Maintenant, on vide la liste des machines associées à ce poste
        listeMachine.clear();
        listePostes.remove(this);
        // Après la suppression des machines, le poste peut être supprimé de l'application (pas d'autre action ici)
        System.out.println("Le poste " + refPoste + " a été supprimé.");
            listePostes.remove(this);  // Supprime cette instance de la liste

    }
   
    //@Override
    public float getCoutHoraire() {
        // Le coût horaire d'un poste est la somme des coûts horaires de ses machines
        float coutTotal = 0;
        for (Machine m : listeMachine) {
            coutTotal += m.getCout();
        }
        return coutTotal;
    } 
    
    //méthode pour renvoyer opérations que peut faire le poste
    public ArrayList<Operation> getListeOperations(){
        ArrayList<Operation> listeOperations=new ArrayList<>();
        for (Machine m : listeMachine) {
            listeOperations.addAll(m.getOperations());
        }
        return listeOperations;
    }
    
    
}
    
