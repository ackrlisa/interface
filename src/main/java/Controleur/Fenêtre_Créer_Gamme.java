/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.Gamme;
import Modele.Equipement;
import Modele.Operation ;
import Modele.ModèleCarte;
import Vue.Créer_Gamme;
import java.util.ArrayList;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Créer_Gamme {
    private Créer_Gamme creationGamme;
    private ArrayList<Operation> operationAjoutees = new ArrayList<>();
    private ArrayList<Equipement> equipementAjoutes = new ArrayList<>();
    private ModèleCarte modeleCarte;

    public Fenêtre_Créer_Gamme(Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        creationGamme = new Créer_Gamme();
        stage.setTitle("Création d’une gamme ");
        stage.setScene(creationGamme.getFenêtre_Créer_Gamme());
        creationGamme.getComboOperation().getItems().addAll(Operation.getListeOperations());
        creationGamme.getComboEquipement().getItems().addAll(Equipement.getListeEquipements());
        stage.show();


        creationGamme.getAjouterOperation().setOnAction(e -> {
            Operation operationChoisie = creationGamme.getComboOperation().getValue();
            if (operationChoisie != null && !operationAjoutees.contains(operationChoisie)) {
                operationAjoutees.add(operationChoisie);
                updateOperationsAffichees();
            }
        });
        
        creationGamme.getAjouterEquipement().setOnAction(e -> {
            Equipement equipementChoisi = creationGamme.getComboEquipement().getValue();
            if (equipementChoisi != null && !equipementAjoutes.contains(equipementChoisi)) {
                equipementAjoutes.add(equipementChoisi);
                updateEquipementAffiches();
            }
        });

        creationGamme.getCreer().setOnAction(e -> {
            String refGamme = creationGamme.getRefGamme().getText();
            
            if (refGamme.isEmpty() ) {
                creationGamme.getResultat().setText("Veuillez remplir tous les champs.");
            } else {
                Gamme nouvelleGamme = new Gamme(refGamme, new ArrayList<>(operationAjoutees),new ArrayList<>(equipementAjoutes));
                
                creationGamme.getResultat().setText("Gamme créée avec succès !");
                creationGamme.getRefGamme().clear();
                operationAjoutees.clear();
                equipementAjoutes.clear();
                creationGamme.getOperationAjoutees().clear();
                creationGamme.getEquipementAjoutes().clear();
            }
        });

        creationGamme.getHome().setOnAction(e -> {
            stage.close();
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte);
        });
    }

    private void updateOperationsAffichees() { // methode pour afficher les operations ajoutée à la gamme
        StringBuilder builder = new StringBuilder();
        for (Operation operation : operationAjoutees) {
            builder.append(operation.toString()).append("\n");
        }
        creationGamme.getOperationAjoutees().setText(builder.toString());
    }
    
    private void updateEquipementAffiches() { // methode pour afficher les equipements ajoutés à la gamme
        StringBuilder builder = new StringBuilder();
        for (Equipement equipement : equipementAjoutes) {
            builder.append(equipement.toString()).append("\n");
        }
        creationGamme.getEquipementAjoutes().setText(builder.toString());
    }

    
}