/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;
import Vue.Affichage_Machine ;
import Modele.Machine;
import Modele.ModèleCarte;
import javafx.stage.Stage;
/**
 *
 * @author alicedeboever
 */
public class Fenêtre_Affichage_Machine {
    private Affichage_Machine Affichage_Machine ;
     private ModèleCarte modeleCarte;
    
    public Fenêtre_Affichage_Machine (Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
    Affichage_Machine = new Affichage_Machine();
   

        stage.setTitle("Affichage d'une machine");
        stage.setScene(Affichage_Machine.getFenêtre_affichage_machine()); // Appelle la méthode pour obtenir la scène de la vue
        Affichage_Machine.getComboMachine().getItems().setAll(Machine.getListeMachines());
        stage.show();
        
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


                Affichage_Machine.getAffichageMachine().setText(details.toString());
    
            } else {
                Affichage_Machine.getAffichageMachine().setText("Veuillez sélectionner une machine.");
            }
        });
      Affichage_Machine.getComboMachine().getItems().setAll(Machine.getListeMachines());

        
      Affichage_Machine.getBtnHome().setOnAction(e -> {
            stage.close();
            
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
        });
        
}
    
}
