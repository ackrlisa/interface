/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

/**
 *
 * @author lisaa
 */

import com.mycompany.projet_atelier_interface.*;
import java.util.ArrayList;
public class Machine extends Equipement {
    private String type;
    private float x;
      private String refMachine;
    private float y;
    private boolean dispo;
    private EtatMachine etatMachine;
    private ArrayList<Operation> operations = new ArrayList<>();    
    private Poste poste;
    private ArrayList<Operateur> operateursMachine = new ArrayList<>();
    private static ArrayList<Machine> listeMachines = new ArrayList<>(); 


   

    public Machine(String refMachine, String dMachine, float x, float y,float cout, ArrayList<Operation> listOperations, String type,Poste poste, ArrayList<Operateur> operateurMachine) {
       super(refMachine, dMachine, cout);
        this.x = x;
        this.dispo = true;
        this.y = y;
        this.etatMachine = EtatMachine.OPERATIONNEL;
        this.operations = new ArrayList<>(listOperations);
        this.type = type;
        this.poste=poste;
        this.operateursMachine = new ArrayList<>(operateurMachine);
        listeMachines.add(this);
    }
public String getRefMachine() {
        return refMachine;
       
}
    public ArrayList<Operateur> getOperateursMachine() {
        return operateursMachine;
    }

    public float getX() {
        return x;
    }

    public Poste getPoste() {
        return poste;
    }

    public boolean estDispo() {
        return dispo;
    }

    public float getY() {
        return y;
    }

    public EtatMachine getEtatMachine() {
        return etatMachine;
    }

    public ArrayList<Operation> getOperations() {
        return new ArrayList<>(operations);
    }

    public String getType() {
        return type;
    }
    
    public static ArrayList<Machine> getListeMachines() {
        return listeMachines;
    }

       public void setX(float x) {
        this.x = x;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
        if (poste != null && !poste.getListeMachine().contains(this)) {
        poste.getListeMachine().add(this);
    }
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setEtatMachine(EtatMachine etatMachine) {
        this.etatMachine = etatMachine;
    }

    public void setOperations(ArrayList<Operation> operations) {
        this.operations = operations;
        
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOperateursMachine(ArrayList<Operateur> operateursMachine) {
        this.operateursMachine = operateursMachine;
    }
    
    @Override
    public String toString() {
        return "Machine [Réf: " + getRefEquipement() + ", Type: " + type + ", État: " + etatMachine + ", Poste: " + (poste != null ? poste.getdPoste() : "Aucun") + "]";
    }

    
    public void afficheMachine(){
     super.afficheEquipement();
      System.out.println("Machine de type:" +this.type+", localisation: "+this.x+","+this.y+", etat:"+this.etatMachine+", disponibilite:"+this.dispo);
      System.out.println("Operation de cette machine:");
      for (Operation op : operations) {
        System.out.print(" - ");
        op.afficheOperation(); 
    }
   }
    
    public void modifierMachine(float newx, float newy, float newcout, String newtype, EtatMachine newetat, Operation newoperations,String newrefMachine,String newdMachine){
        if (newrefMachine != null && !newrefMachine.isEmpty()) {
        super.setRefEquipement(newrefMachine);}
       if (newdMachine != null && !newdMachine.isEmpty()) {
        super.setdEquipement(newdMachine);}
        if (newx!=0){
            this.x=newx;
        }
        if (newy != 0) this.y = newy;
        if (newcout != 0) super.setCout(newcout);
        if (newtype != null && !newtype.isEmpty()) this.type = newtype;
        //if (newt != 0) this.t = newt; comme on a elevé t de la classe Machine: plus besoin
        if (newetat != null) this.etatMachine = newetat;
        if ((newoperations!=null)&&(!this.operations.contains(newoperations))){
            operations.add(newoperations);
        }
        System.out.println("Machine modifiee !");
    }
    
    public boolean estOperationnel(){
        return this.etatMachine==EtatMachine.OPERATIONNEL; // vérifie si machine opérationnelle, on a une classe spéciale EtatMachine pour donner juste els différents types
    }
   public void supprimerMachine(){
       if (poste!= null){
           poste.modifierPoste(poste,this,false);
           System.out.println("Machine " + super.getRefEquipement() + " supprimée du poste.");
        } else {
            System.out.println("Erreur : La machine n'est pas associée à un poste.");
       }

    }
   
   public void ajouterOperationRealisable(Operation operation){
       if (!operations.contains(operation)) {
        operations.add(operation);
        System.out.println("Opération " + operation.getRefOperation() + " ajoutée à la machine.");
    } else {
        System.out.println("Cette opération est déjà réalisable par cette machine.");
    }
   }
   
   public void supprimerOperationRealisable(Operation operation){
       if(operations.contains(operation)){
           operations.remove(operation);
           System.out.println("Operation "+ operation.getRefOperation()+" a été retirée de la machine");
       } else {
           System.out.println("La machine ne pouvais déjà par réaliser l'opération "+operation.getRefOperation() );
       }
   }
    
    public float getCoutHoraire() { // Implémentation de la méthode abstraite de Equipement
        return super.getCout();
    } 
    
   public void ajouterOperateurMachine (Operateur operateur){
       if (!operateursMachine.contains(operateur)) {
        operateursMachine.add(operateur);
        System.out.println("Opérateur " + operateur.getPrenom()+" "+operateur.getNom()+" ajouté à la machine.");
    } else {
        System.out.println("Cet opérateur peut déjà utiliser la machine");
    }
  }
   
   public void supprimerOperateurMachine(Operateur operateur){
       if(operateursMachine.contains(operateur)){
           operateursMachine.remove(operateur);
           System.out.println("Operateur "+ operateur.getPrenom()+" "+ operateur.getNom()+" a été retire de la machine");
       } else {
           System.out.println("l'opérateur"+ operateur.getPrenom()+" "+ operateur.getNom()+"ne pouvait déjà pas utiliser cette machine");
       }
   }
   
}
    
    

