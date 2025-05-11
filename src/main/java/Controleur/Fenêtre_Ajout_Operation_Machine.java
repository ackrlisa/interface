/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.Machine;
import Modele.ModèleCarte;
import Modele.Operation;
import Modele.Poste;
import Vue.Ajout_Operation_Machine;
import javafx.stage.Stage;

/**
 *
 * @author PC
 */
public class Fenêtre_Ajout_Operation_Machine {
    private Ajout_Operation_Machine Ajout_Operation_Machine;
    private ModèleCarte modeleCarte;
    
    public Fenêtre_Ajout_Operation_Machine (Stage stage, ModèleCarte modeleCarte) {
        Ajout_Operation_Machine = new Ajout_Operation_Machine();
        this.modeleCarte=modeleCarte;
        stage.setScene(Ajout_Operation_Machine.getFenêtre_Ajout_Operation_Machine()); // Appelle la méthode pour obtenir la scène de la vue
        Ajout_Operation_Machine.getComboMachine().getItems().setAll(Machine.getListeMachines());
        Ajout_Operation_Machine.getComboOperation().getItems().setAll(Operation.getListeOperations());
        stage.show();
    
        Ajout_Operation_Machine.getBtnAjouter().setOnAction(e -> {
            Operation operationChoisie = Ajout_Operation_Machine.getComboOperation().getValue();
            Machine machineChoisie = Ajout_Operation_Machine.getComboMachine().getValue();
            if (machineChoisie != null) {
                machineChoisie.ajouterOperationRealisable(operationChoisie);
                Ajout_Operation_Machine.getErreur().setText(machineChoisie.getN());
            }else{
                Ajout_Operation_Machine.getErreur().setText("Veuillez sélectionner une machine et/ou une opération.");
            }
        });
        
        Ajout_Operation_Machine.getBtnSupprimer().setOnAction(e -> {
            Operation operationChoisie = Ajout_Operation_Machine.getComboOperation().getValue();
            Machine machineChoisie = Ajout_Operation_Machine.getComboMachine().getValue();
            if (machineChoisie != null) {
                machineChoisie.supprimerOperationRealisable(operationChoisie);
                Ajout_Operation_Machine.getErreur().setText(machineChoisie.getN());
            }else{
                Ajout_Operation_Machine.getErreur().setText("Veuillez sélectionner une machine et/ou une opération.");
            }
        });
        
        Ajout_Operation_Machine.getBtnHome().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
        });
    }
}
