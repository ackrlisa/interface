/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.Equipement;
import Modele.Machine;
import Modele.Operation;
import Vue.Creation_Opération;
import java.util.ArrayList;
import javafx.stage.Stage;
import Modele.ModèleCarte;


/**
 *
 * @author alicedeboever
 */
public class Fenêtre_Creation_Opération {
    private Creation_Opération creationOperation;
    private String refEquipement; // <- variable accessible dans toute la classe
    private ModèleCarte modeleCarte;


    public Fenêtre_Creation_Opération(Stage stage, ModèleCarte modeleCarte) {
       this.modeleCarte=modeleCarte;
        creationOperation = new Creation_Opération();
        stage.setTitle("Création d’une opération");
        stage.setScene(creationOperation.getFenetreCreationOperation());
        creationOperation.getComboEquipement().getItems().addAll(Equipement.getListeEquipements());
        stage.show();


        creationOperation.getAjouterEquipement().setOnAction(e -> {
            Equipement equipementChoisi = creationOperation.getComboEquipement().getValue();
            if (equipementChoisi != null  ) {
                refEquipement = equipementChoisi.getRefEquipement();
                creationOperation.getEquipementsAjoutes().setText("Référence de l'équipement ajoutée à l'opération");
            }else{
                creationOperation.getEquipementsAjoutes().setText("Veuillez remplir tous les champs");                
            }
                
        });

        creationOperation.getCreerOperation().setOnAction(e -> {
            String refOperation = creationOperation.getRefOperation().getText();
            String dOperation = creationOperation.getdOperation().getText();
            String duréeOpérationText = creationOperation.getDuréeOpération().getText();
            Equipement equipementChoisi = creationOperation.getComboEquipement().getValue();
            if (refOperation.isEmpty() || dOperation.isEmpty() || refEquipement == null || duréeOpérationText.isEmpty()) {
                creationOperation.getResultat().setText("Veuillez remplir tous les champs.");
            } else {
                try {
                    float duréeOperation = Float.parseFloat(duréeOpérationText);
                    Operation nouvelleOperation = new Operation(refOperation, dOperation, refEquipement, duréeOperation);
                    if (equipementChoisi instanceof Machine) {
                        ((Machine) equipementChoisi).ajouterOperationRealisable(nouvelleOperation);
                    }
                    creationOperation.getResultat().setText("Opération créée avec succès !");
                    creationOperation.getRefOperation().clear();
                    creationOperation.getdOperation().clear();
                    creationOperation.getEquipementsAjoutes().clear();
                    refEquipement = null; // remise à zéro si nécessaire
                } catch (NumberFormatException ex) {
                    creationOperation.getResultat().setText("Durée invalide (nombre attendu).");
                }
            }
        });

        creationOperation.getHome().setOnAction(e -> {
            stage.close();
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte);
        });
    }


    
}
