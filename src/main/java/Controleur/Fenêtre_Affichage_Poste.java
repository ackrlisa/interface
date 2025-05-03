/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;
import Vue.Affichage_Poste ;
import Modele.Operation;
import Modele.Poste ;
import Modele.Machine;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import java.util.ArrayList;
import Modele.Operateur ;
/**
 *
 * @author alicedeboever
 */
public class Fenêtre_Affichage_Poste {
    private Affichage_Poste Affichage_Poste ;
    
    public Fenêtre_Affichage_Poste (Stage stage) {
    Affichage_Poste = new Affichage_Poste();
    Operation op1 = new Operation("OP01", "Découpe", "M01", 2.0f);
Operation op2 = new Operation("OP02", "Assemblage", "M01", 1.5f);
ArrayList<Operation> operationsPourMachine = new ArrayList<>();
operationsPourMachine.add(op1);
operationsPourMachine.add(op2);

ArrayList<Operateur> operateurs = new ArrayList<>();
Machine machine1 = new Machine("M01","Machine découpe",10.0f,20.0f,50.0f,operationsPourMachine,"Type A",null,operateurs);

ArrayList<Machine> machinesDuPoste = new ArrayList<>();
machinesDuPoste.add(machine1);
Poste poste = new Poste(machinesDuPoste, "Poste découpe", "P01");
machine1.setPoste(poste);
    Affichage_Poste.getBtnAfficher().setOnAction(e -> {
            Poste posteChoisi = Affichage_Poste.getComboPoste().getValue();
            if (posteChoisi != null) {
                StringBuilder details = new StringBuilder(); // créer l'espace ou on va tout mettre
                details.append("Référence : ").append(posteChoisi.getRefEquipement()).append("\n");
                details.append("Description : ").append(posteChoisi.getdEquipement()).append("\n");

                details.append("\nMachine associées :\n");
                for (var machine : posteChoisi.getListeMachine()) {
                    details.append(" - ").append(machine.getRefEquipement()).append(" : ").append(machine.getdEquipement()).append("\n");
                }

                Affichage_Poste.getAffichagePoste().setText(details.toString());
    
            } else {
                Affichage_Poste.getAffichagePoste().setText("Veuillez sélectionner une gamme.");
            }
        });
        
        
    }
}
