/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

import java.util.ArrayList;

/**
 *
 * @author lisaa
 */

public class ModèleCarte {
 private ArrayList<Machine> machines;

    public ModèleCarte() {
        machines = new ArrayList<>();
    }

    public ModèleCarte(ArrayList<Machine> machines) {
        this.machines = machines;
    }

    public void setMachines(ArrayList<Machine> machines) {
        this.machines = machines;
    }

    // Méthode pour obtenir la liste des machines
    public ArrayList<Machine> getMachines() {
        return machines;
    }
    
    
     // Méthode pour chercher une machine par référence
    public Machine getMachineParRef(String ref) {
        for (Machine m : machines) {
            if (m.getRefMachine().equals(ref)) {
                return m;
            }
        }
        return null;
    }
    
    public void ajoutMachine(String refMachine, String dMachine, float x, float y,float cout, ArrayList<Operation> listOperations, String type,Poste poste, ArrayList<Operateur> operateurMachine) {
        machines.add(new Machine(refMachine,dMachine, x, y, cout, listOperations, type, poste, operateurMachine));
    }
    // Méthode pour mettre à jour la position d'une machine existante
    public boolean updateEmplacement(String refMachine, float newX, float newY) {
        Machine machine = getMachineParRef(refMachine);
        if (machine != null) {
            machine.setX(newX);
            machine.setY(newY);
            return true;
        }
        return false;
    }

}



