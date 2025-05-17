/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.Gamme;
import Modele.Produit;
import Modele.ModèleCarte;
import Vue.Ajout_Suppression_Produit_Gamme;
import javafx.stage.Stage;

/**
 *
 * @author alicedeboever
 */
public class Fenêtre_Ajout_Suppression_Produit_Gamme {
    private Ajout_Suppression_Produit_Gamme Ajout_Suppression_Produit_Gamme;
    private ModèleCarte modeleCarte;
    
    public Fenêtre_Ajout_Suppression_Produit_Gamme (Stage stage, ModèleCarte modeleCarte) {
        Ajout_Suppression_Produit_Gamme = new Ajout_Suppression_Produit_Gamme();
        this.modeleCarte=modeleCarte;
        stage.setScene(Ajout_Suppression_Produit_Gamme.getFenêtre_Ajout_Suppression_Produit_Gamme()); // Appelle la méthode pour obtenir la scène de la vue
        Ajout_Suppression_Produit_Gamme.getComboProduits().getItems().setAll(Produit.getListeProduits());
        Ajout_Suppression_Produit_Gamme.getComboGamme().getItems().setAll(Gamme.getListeGammes());
        stage.show();
        
        Ajout_Suppression_Produit_Gamme.getBtnAjouter().setOnAction(e -> {
            Gamme gammeChoisie = Ajout_Suppression_Produit_Gamme.getComboGamme().getValue();
            Produit produitChoisi = Ajout_Suppression_Produit_Gamme.getComboProduits().getValue();
            if (produitChoisi != null) {
                gammeChoisie.ajoutProduit(produitChoisi);
                Ajout_Suppression_Produit_Gamme.getErreur().setText(gammeChoisie.getN());
            }else{
                Ajout_Suppression_Produit_Gamme.getErreur().setText("Veuillez sélectionner un produit et/ou une gamme.");
            }
        });
        Ajout_Suppression_Produit_Gamme.getBtnSupprimer().setOnAction(e -> {
            Gamme gammeChoisie = Ajout_Suppression_Produit_Gamme.getComboGamme().getValue();
            Produit produitChoisi = Ajout_Suppression_Produit_Gamme.getComboProduits().getValue();
            if (produitChoisi != null) {
                gammeChoisie.enleverProduit(produitChoisi);
                Ajout_Suppression_Produit_Gamme.getErreur().setText(gammeChoisie.getN());
            }else{
                Ajout_Suppression_Produit_Gamme.getErreur().setText("Veuillez sélectionner un produit et/ou une gamme.");
            }
        });
        
        Ajout_Suppression_Produit_Gamme.getBtnHome().setOnAction(e -> {
            stage.close();
                        Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
        });
    }
}
