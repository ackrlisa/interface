/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.Machine;
import Modele.ModèleCarte;
import Modele.Produit;
import Vue.Modification_Identite_Machine;
import Vue.Modification_Produit;
import java.util.ArrayList;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Modification_Produit {
     private Modification_Produit Modification_Produit;
    private ModèleCarte modeleCarte;
    
    public Fenêtre_Modification_Produit(Stage stage, ModèleCarte modeleCarte) {
    Modification_Produit = new Modification_Produit();
    this.modeleCarte=modeleCarte;
    
    stage.setTitle("Modification d'un produit du catalogue");
        stage.setScene(Modification_Produit.getFenêtre_Modification_Produit()); // Appelle la méthode pour obtenir la scène de la vue
        Modification_Produit.getComboProduits().getItems().setAll(Produit.getListeProduits());      
        stage.show();
        
       Modification_Produit.getBtnOk().setOnAction(e -> {
            Produit produitChoisi = Modification_Produit.getComboProduits().getValue();
            if (produitChoisi != null) {
                try {
                    String nouveauCode = Modification_Produit.getCodeProduit().getText();
                    String nouvelleDescription = Modification_Produit.getDproduit().getText();

                    if (nouveauCode.isEmpty() || nouvelleDescription.isEmpty()) {
                        Modification_Produit.getErreur().setText("Veuillez remplir tous les champs.");
                    } else {
                        produitChoisi.setCodeProduit(nouveauCode);
                        produitChoisi.setDproduit(nouvelleDescription);
                        Modification_Produit.getErreur().setText("Produit modifié avec succès !");
                        Modification_Produit.getCodeProduit().clear();
                        Modification_Produit.getDproduit().clear();
                    }
                } catch (Exception ex) {
                    Modification_Produit.getErreur().setText("Une erreur est survenue lors de la modification.");
                }
            } else {
                Modification_Produit.getErreur().setText("Veuillez sélectionner un produit.");
            }
        });
        
        Modification_Produit.getBtnHome().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
        });
    }
}


