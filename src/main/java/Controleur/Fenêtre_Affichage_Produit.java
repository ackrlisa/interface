/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Modele.Operateur;
import Modele.Produit;
import Modele.ProduitsFinis;
import Vue.Affichage_Operateur;
import Vue.Affichage_Produit;
import Vue.Affichage_Produits_Finis;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Affichage_Produit {
   private Affichage_Produit Affichage_Produit ;
    private ModèleCarte modeleCarte;
    
    public Fenêtre_Affichage_Produit(Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        Affichage_Produit = new Affichage_Produit();

        stage.setTitle("Affichage des produits");
        stage.setScene(Affichage_Produit.getFenêtre_Affichage_Produit()); // Appelle la méthode pour obtenir la scène de la vue
        Affichage_Produit.getComboProduits().getItems().setAll(Produit.getListeProduits());
        stage.show();
        
        Affichage_Produit.getBtnAfficher().setOnAction(e -> {
            Produit produitChoisi = Affichage_Produit.getComboProduits().getValue();
            if (produitChoisi != null) {
                StringBuilder details = new StringBuilder(); // créer l'espace ou on va tout mettre
                details.append("Code produit : ").append(produitChoisi.getCodeProduit()).append("\n");
                details.append("Description: ").append(produitChoisi.getDproduit()).append("\n");
                

                Affichage_Produit.getAffichageProduits().setText(details.toString());
    
            } else {
                Affichage_Produit.getAffichageProduits().setText("Veuillez sélectionner un produit .");
            }
        
        });
        
        Affichage_Produit.getBtnHome().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
        });
    }
}

