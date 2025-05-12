/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.Gamme;
import Modele.Machine;
import Modele.ModèleCarte;
import Modele.Operation;
import Vue.Ajout_Suppression_Operation_Gamme;
import javafx.stage.Stage;

/**
 *
 * @author PC
 */
public class Fenêtre_Ajout_Suppression_Machine_Gamme {
    private Ajout_Suppression_Operation_Gamme Ajout_Suppression_Operation_Gamme;
    private ModèleCarte modeleCarte;
    
    public Fenêtre_Ajout_Suppression_Machine_Gamme (Stage stage, ModèleCarte modeleCarte) {
        Ajout_Suppression_Operation_Gamme = new Ajout_Suppression_Operation_Gamme();
        this.modeleCarte=modeleCarte;
        stage.setScene(Ajout_Suppression_Operation_Gamme.getFenêtre_Ajout_Suppression_Operation_Gamme()); // Appelle la méthode pour obtenir la scène de la vue
        Ajout_Suppression_Operation_Gamme.getComboMachines().getItems().setAll(Machine.getListeMachines());
        Ajout_Suppression_Operation_Gamme.getComboGamme().getItems().setAll(Gamme.getListeGammes());
        stage.show();
        
        Ajout_Suppression_Operation_Gamme.getBtnAjouter().setOnAction(e -> {
            Gamme gammeChoisie = Ajout_Suppression_Operation_Gamme.getComboGamme().getValue();
            Machine machineChoisie = Ajout_Suppression_Operation_Gamme.getComboMachines().getValue();
            if (machineChoisie != null) {
                gammeChoisie.enleverEquipementOperation(machineChoisie);
                Ajout_Suppression_Operation_Gamme.getErreur().setText(machineChoisie.getN());
            }else{
                Ajout_Suppression_Operation_Gamme.getErreur().setText("Veuillez sélectionner une machine et/ou une gamme.");
            }
        });
        
        
        Ajout_Suppression_Operation_Gamme.getBtnHome().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
        });
    }
}
