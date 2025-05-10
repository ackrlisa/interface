/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.Machine;
import Modele.ModèleCarte;
import Vue.Carte;
import Vue.Gestion_Machine;
import Vue.Supprimer_Machine;
import javafx.stage.Stage;
import Vue.Affichage_Machine ;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Supprimer_Machine {
    private Supprimer_Machine supprimermachine;
     private ModèleCarte modeleCarte;
     private Carte vueCarte;

    
    public Fenêtre_Supprimer_Machine (Stage stage, ModèleCarte modeleCarte,Carte vueCarte){
       this.modeleCarte=modeleCarte;
       this.vueCarte = vueCarte;
        
        supprimermachine= new Supprimer_Machine();
        // Initialiser la liste des machines dans la ComboBox
supprimermachine.getComboMachine().getItems().clear();
supprimermachine.getComboMachine().getItems().addAll(Machine.getListeMachines());

        
        stage.setTitle("Fenêtre suppression machines");
        stage.setScene(supprimermachine.getFenêtre_Supprimer_Machine()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show();

    supprimermachine.getBtnHome().setOnAction(e->{
         stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
           });

            
supprimermachine.getBtnSupprimer().setOnAction(e -> {
    Machine machine = supprimermachine.getComboMachine().getValue(); // Récupérer la machine sélectionnée
    
    if (machine != null) {
        machine.supprimerMachine(modeleCarte, machine); // Supprime la machine (inclut la suppression du modèle et du poste)
        supprimermachine.getComboMachine().getItems().remove(machine); // Mise à jour du menu déroulant
        supprimermachine.getResultat().setText("Machine " + machine.getRefEquipement() + " supprimée.");
        machine.supprimerMachineStatique(machine);
    
    } else {
        supprimermachine.getResultat().setText("Veuillez sélectionner une machine à supprimer.");
    }
});


    }
}       
