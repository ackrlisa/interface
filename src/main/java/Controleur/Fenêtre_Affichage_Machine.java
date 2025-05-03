/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;
import Vue.Affichage_Machine ;
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
public class Fenêtre_Affichage_Machine {
    private Affichage_Machine Affichage_Machine ;
    
    public Fenêtre_Affichage_Machine (Stage stage) {
    Affichage_Machine = new Affichage_Machine();
       //Création des opérations
       //Operation op1 = new Operation("OP01", "Découpe", "M01", 2.0f);
//Operation op2 = new Operation("OP02", "Assemblage", "M01", 1.5f);
//ArrayList<Operation> operationsPourMachine = new ArrayList<>();
//operationsPourMachine.add(op1);
//operationsPourMachine.add(op2);

//Création d'une machine
//ArrayList<Operateur> operateurs = new ArrayList<>();
//Machine machine1 = new Machine(
  //    "M01",                      // refMachine
  //    "Machine découpe", 
//10.0f,                     // x
  //  20.0f,        // dMachine
  //      50.0f,                      // coût horaire
    //   operationsPourMachine,     // liste des opérations
     // "Type A",                  // type
    //   null,                      // poste (on le mettra juste après)
     //   operateurs                 // opérateurs
//);

// Création du poste contenant cette machine
//ArrayList<Machine> machinesDuPoste = new ArrayList<>();
//machinesDuPoste.add(machine1);
//Poste poste = new Poste(machinesDuPoste, "Poste découpe", "P01");
//machine1.setPoste(poste); // on lie la machine au poste (rétro-lien)


  //      stage.setTitle("Affiche d'une machine");
    //    stage.setScene(Affichage_Machine.getFenêtre_affichage_machine()); // Appelle la méthode pour obtenir la scène de la vue
     //   stage.show();
        
     //  Affichage_Machine.getComboMachine().getItems().clear();
      //  Affichage_Machine.getComboMachine().getItems().add(machine1);
        
      Affichage_Machine.getBtnAfficher().setOnAction(e -> {
            Machine machineChoisie = Affichage_Machine.getComboMachine().getValue();
            if (machineChoisie != null) {
                StringBuilder details = new StringBuilder(); // créer l'espace ou on va tout mettre
                details.append("Référence : ").append(machineChoisie.getRefEquipement()).append("\n");
                details.append("Description : ").append(machineChoisie.getdEquipement()).append("\n");
                details.append("Type : ").append(machineChoisie.getType()).append("\n");
                details.append("Localisation : (").append(machineChoisie.getX()).append(", ").append(machineChoisie.getY()).append(")\n");
                details.append("État : ").append(machineChoisie.getEtatMachine()).append("\n"); // /n correspond à un saut de ligne 
                details.append("Disponible : ").append(machineChoisie.estDispo() ? "Oui" : "Non").append("\n");
                details.append("Poste : ").append(machineChoisie.getPoste() != null ? machineChoisie.getPoste().getdPoste() : "Aucun").append("\n");
                details.append("Coût horaire : ").append(machineChoisie.getCoutHoraire()).append(" €\n");

                details.append("\nOpérations réalisables :\n");
                for (var op : machineChoisie.getOperations()) {
                    details.append(" - ").append(op.getRefOperation()).append(" : ").append(op.getdOperation()).append("\n");
                }

                details.append("\nOpérateurs autorisés :\n");
                for (var oper : machineChoisie.getOperateursMachine()) {
                    details.append(" - ").append(oper.getPrenom()).append(" ").append(oper.getNom()).append("\n");
                }

                Affichage_Machine.getAffichageMachine().setText(details.toString());
    
            } else {
                Affichage_Machine.getAffichageMachine().setText("Veuillez sélectionner une gamme.");
            }
        });
        
        
}
}
