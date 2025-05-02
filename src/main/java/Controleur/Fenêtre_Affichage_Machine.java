/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;
import Vue.Affichage_Machine ;
import Modele.Machine;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
/**
 *
 * @author alicedeboever
 */
public class Fenêtre_Affichage_Machine {
    private Affichage_Machine Affichage_Machine ;
    
    public Fenêtre_Affichage_Machine (Stage stage) {
    Affichage_Machine = new Affichage_Machine();

        stage.setTitle("Affiche d'une machine");
        stage.setScene(Affichage_Machine.getFenêtre_affichage_machine()); // Appelle la méthode pour obtenir la scène de la vue
        stage.show();
        
        Affichage_Machine.getBtnAfficher().setOnAction(e -> {
            Machine machineChoisie = Affichage_Machine.getComboMachine().getValue();
            if (machineChoisie != null) {
              } else {
                Affichage_Machine.getAffichageMachine().setText("Veuillez sélectionner une gamme.");
            }
        });
        
        
}
}
