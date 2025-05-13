/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

/**
 *
 * @author lisaa
 */


import java.util.ArrayList;
public class Machine extends Equipement {
    private String type, n;
    private float x;
    private String refMachine;
    private float y;
    private boolean dispo;
    private EtatMachine etatMachine;
    private ArrayList<Operation> operations = new ArrayList<>();    
    private Poste poste;
    private ArrayList<Operateur> operateursMachine = new ArrayList<>();
    private static ArrayList<Machine> listeMachines = new ArrayList<>(); 


   

    public Machine(String refEquipement,String dMachine, float x, float y,float cout, ArrayList<Operation> listOperations, String type,Poste poste, ArrayList<Operateur> operateurMachine) {
       super(refEquipement, dMachine, cout);
        this.x = x;
        this.dispo = true;
        this.y = y;
        this.etatMachine = EtatMachine.OPERATIONNEL_DISPO;
        this.operations = new ArrayList<>(listOperations);
        this.type = type;
        this.poste=poste;
        this.operateursMachine = new ArrayList<>(operateurMachine);
        Equipement.getListeEquipements().add(this);
    }
public String getRefMachine() {
      
    return super.getRefEquipement();
       
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
        ArrayList<Machine> machines = new ArrayList<>();
    for (Equipement e : listeEquipements) {
        if (e instanceof Machine) {
            machines.add((Machine) e);
        }
    }
    return machines;
    }

    public void setRefMachine(String refMachine) {
        this.refMachine = refMachine;
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

    public void setN(String n) {
        this.n = n;
    }

    public String getN() {
        return n;
    }
    
    @Override
    public String toString() {
        return "Machine [Réf: " + getRefEquipement() + ", Type: " + type + ", État: " + etatMachine + ", Poste: " + (poste != null ? poste.getdPoste() : "Aucun") + "]";
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
        return this.etatMachine==EtatMachine.OPERATIONNEL_DISPO; // vérifie si machine opérationnelle, on a une classe spéciale EtatMachine pour donner juste els différents types
    }
   
   
   public void supprimerMachine(ModèleCarte modeleCarte, Machine machine) {
    for (Poste poste : Poste.getListePostes()) {
        if (poste.getListeMachine().contains(machine)) {
            poste.getListeMachine().remove(machine);
        }
    
   
       if (poste!= null){
           poste.modifierPoste(this,false);
           System.out.println("Machine " + super.getRefEquipement() + " supprimée du poste.");
        } else {
            System.out.println("Erreur : La machine n'est pas associée à un poste.");
       }
    }

    

    for (Gamme gamme : Gamme.getListeGammes()) {
        for (Operation op : gamme.getListeOperation()) {
            if (op.getRefEquipement().equals(machine.getRefEquipement())) {
                gamme.enleverEquipement(machine);
                gamme.enleverOperation(op);
            }
        }
    }

    ArrayList<Operation> operationsASupprimer = new ArrayList<>();
    for (Operation op : Operation.getListeOperations()) {
        if (op.getRefEquipement().equals(machine.getRefEquipement())) {
            operationsASupprimer.add(op);
        }
    }
    for (Operation op : operationsASupprimer) {
        Operation.getListeOperations().remove(op);
        System.out.println("Opération " + op.getRefOperation() + " supprimée.");
    }
    modeleCarte.supprimerMachine(this);

}
   
   public void ajouterOperationRealisable(Operation operation){
       if (!operations.contains(operation)) {
        operations.add(operation);
        this.setN("Opération " + operation.getRefOperation() + " ajoutée à la machine.");
    } else {
        this.setN("Cette opération est déjà réalisable par cette machine.");
        System.out.println(n);
    }
   }
   
   public void supprimerOperationRealisable(Operation operation){
       if(operations.contains(operation)){
           operations.remove(operation);
           this.setN("Operation "+ operation.getRefOperation()+" a été retirée de la machine");
       } else {
           this.setN("La machine ne pouvais déjà par réaliser l'opération "+operation.getRefOperation() );
           System.out.println(n);
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
   
   public static void supprimerMachineStatique(Machine machine) {
        Equipement.getListeEquipements().remove(machine);
}

   
}
    
    


