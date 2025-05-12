/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.Equipement;
import Modele.Machine;
import Modele.ModèleCarte;
import Modele.Operation;
import Modele.Produit;
import Vue.Creation_Opération;
import Vue.Création_Produit;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Création_Produit {
    private Création_Produit creationProduit;
       private ModèleCarte modeleCarte;


    public Fenêtre_Création_Produit(Stage stage, ModèleCarte modeleCarte) {
       this.modeleCarte=modeleCarte;
        creationProduit = new Création_Produit();
        stage.setTitle("Création d’une opération");
        stage.setScene(creationProduit.getFenêtre_Création_Produit());
         stage.show();

        creationProduit.getCréerproduit().setOnAction(e -> {
            String codeProduit = creationProduit.getCodeProduit().getText();
            String dproduit = creationProduit.getdproduit().getText();

            if (codeProduit.isEmpty() || dproduit.isEmpty()) {
                creationProduit.getResultat().setText("Veuillez remplir tous les champs.");
            } else {
                try {
                    Produit nouveauProduit = new Produit(codeProduit,dproduit);
                    
                    creationProduit.getResultat().setText("Produit créé avec succès !");
                    creationProduit.getCodeProduit().clear();
                    creationProduit.getdproduit().clear();
                } catch (Exception ex) {
                    creationProduit.getResultat().setText("Erreur lors de la création du produit.");
                }
            }
        });

        creationProduit.getHome().setOnAction(e -> {
            stage.close();
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte);
        });
    }


    
}


