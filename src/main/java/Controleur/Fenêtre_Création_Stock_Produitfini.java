/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Modele.ProduitsFinis;
import Vue.Création_Stock_Produitfini;
import javafx.stage.Stage;

/**
 *
 * @author alicedeboever
 */
public class Fenêtre_Création_Stock_Produitfini {
    private Création_Stock_Produitfini creationstockproduitfini;
     private ModèleCarte modeleCarte;

    public Fenêtre_Création_Stock_Produitfini(Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        creationstockproduitfini = new Création_Stock_Produitfini();
        stage.setTitle("Ajout stock de produits finis");
        stage.setScene(creationstockproduitfini.getFenêtre_Création_Stock_Produitfini());
        stage.show();

        creationstockproduitfini.getAjouter().setOnAction(e -> {
            try{
                String nom = creationstockproduitfini.getNom().getText();
                int quantite = (int) Float.parseFloat(creationstockproduitfini.getQuantite().getText());
                float prix = Float.parseFloat(creationstockproduitfini.getPrix().getText());
                ProduitsFinis produitfini = new ProduitsFinis(nom,prix,quantite);
                ProduitsFinis.ajouterAuStockProduitsFinis(produitfini);
               

                creationstockproduitfini.getResultat().setText("Element ajouté avec succès");
                // Optionnel : Réinitialiser les champs de la vue après la création
                creationstockproduitfini.getQuantite().clear();
                creationstockproduitfini.getNom().clear();
                creationstockproduitfini.getPrix().clear();
                
            } catch (NumberFormatException ex) {
                creationstockproduitfini.getResultat().setText("Veuillez entrer des valeurs numériques valides pour le prix et/ou la quantité");
                creationstockproduitfini.getNom().clear();
                creationstockproduitfini.getQuantite().clear();
                
            } catch (Exception ex) {
                creationstockproduitfini.getResultat().setText("Une erreur est survenue");
                creationstockproduitfini.getNom().clear();
                creationstockproduitfini.getQuantite().clear();
                
            }
        });

        creationstockproduitfini.getHome().setOnAction(e -> {
            stage.close();
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte);
        });
    
    }
}
