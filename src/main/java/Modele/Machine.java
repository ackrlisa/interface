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
        Equipement.getListeEquipements().add(this);
    }
    public String getRefMachine() {
        return super.getRefEquipement();
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
   
   public static void supprimerMachineStatique(Machine machine) {
        Equipement.getListeEquipements().remove(machine);
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
    
    public float getCoutHoraire() {
        return super.getCout();
    } 
}
    
    


