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
    private String refGamme, n ;
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

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
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
    public void ajoutEquipement(Machine machine){
        if (this.getListeEquipement().contains(machine)){
            this.setN("la machine est déjà associée à cette gamme");
        }else{
        this.listeEquipement.add(machine);
        this.setN("Equipement "+machine.getRefEquipement()+" ajoutée!");
        }
    }
    public void ajoutOperation(Operation operation){
        if (this.getListeOperation().contains(operation)){
            this.setN("l'opération est déjà associée à cette gamme");
        }else{
            this.listeOperation.add(operation);
            this.setN("operation "+operation.getdOperation()+" ajoutée!");
        }
    }
    
    public void enleverEquipement(Machine machine){
        if (listeEquipement.contains(machine)) {
            listeEquipement.remove(machine); 
            this.setN("Machine" + machine.getRefEquipement() + " retirée!");
        } else {
            this.setN("Cette machine n'est pas utilisée pour cette gamme");
        }
    }

    public void enleverOperation(Operation operation){
        if (listeOperation.contains(operation)) { 
            listeOperation.remove(operation);//vérifier direct si l'opération est dans la gamme, et si oui elle est alors supprimée
            this.setN("operation" + operation.getdOperation() + " retirée!");
        } else {
            this.setN("Cette opération n'est pas utilisée pour cette gamme");
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
