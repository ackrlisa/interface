/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.Machine;
import Modele.Poste;
import Modele.ModèleCarte;
import Vue.Modification_Poste;
import javafx.stage.Stage;

/**
 *
 * @author PC
 */
public class Fenêtre_Modification_Poste {
    private Modification_Poste Modification_Poste;
    private ModèleCarte modeleCarte;
    
    public Fenêtre_Modification_Poste (Stage stage, ModèleCarte modeleCarte) {
        Modification_Poste = new Modification_Poste();
        this.modeleCarte=modeleCarte;
        stage.setScene(Modification_Poste.getFenêtre_Modification_Poste()); // Appelle la méthode pour obtenir la scène de la vue
        Modification_Poste.getComboMachine().getItems().setAll(Machine.getListeMachines());
        Modification_Poste.getComboPoste().getItems().setAll(Poste.getListePostes());
        stage.show();
    
        Modification_Poste.getBtnAjouter().setOnAction(e -> {
            Poste posteChoisie = Modification_Poste.getComboPoste().getValue();
            Machine machineChoisie = Modification_Poste.getComboMachine().getValue();
            if (machineChoisie != null) {
                posteChoisie.modifierPoste(posteChoisie, machineChoisie, true);
            }else{
                Modification_Poste.getErreur().setText("Veuillez sélectionner une machine et/ou un poste.");
            }
        });
        
        Modification_Poste.getBtnSupprimer().setOnAction(e -> {
            Poste posteChoisie = Modification_Poste.getComboPoste().getValue();
            Machine machineChoisie = Modification_Poste.getComboMachine().getValue();
            if (machineChoisie != null) {
                posteChoisie.modifierPoste(posteChoisie, machineChoisie, false);
                Modification_Poste.getErreur().setText(posteChoisie.getN());
            }else{
                Modification_Poste.getErreur().setText("Veuillez sélectionner une machine et/ou un poste.");
            }
        });
        
        Modification_Poste.getBtnHome().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
        });
    }
}
