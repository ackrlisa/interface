/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Modele.ProduitsFinis;
import Vue.Affichage_Produits_Finis;
import javafx.stage.Stage;

/**
 *
 * @author alicedeboever
 */
public class Fenêtre_Affichage_Produits_Finis {
    private Affichage_Produits_Finis Affichage_Produits_Finis ;
     private ModèleCarte modeleCarte;
    
    public Fenêtre_Affichage_Produits_Finis(Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        
        Affichage_Produits_Finis = new Affichage_Produits_Finis();

        stage.setTitle("Affichage d'un produit fini");
        stage.setScene(Affichage_Produits_Finis.getFenêtre_affichage_produits_finis()); // Appelle la méthode pour obtenir la scène de la vue
        Affichage_Produits_Finis.getComboProduitsFinis().getItems().setAll(ProduitsFinis.getListeStockProduitsFinis());
        stage.show();
        
        Affichage_Produits_Finis.getBtnAfficher().setOnAction(e -> {
            ProduitsFinis produitChoisi = Affichage_Produits_Finis.getComboProduitsFinis().getValue();
            if (produitChoisi != null) {
                StringBuilder details = new StringBuilder(); // créer l'espace ou on va tout mettre
                details.append("Nom : ").append(produitChoisi.getNom()).append("\n");
                details.append("Prix : ").append(produitChoisi.getPrix()).append("\n");
                details.append("Quantité de stock : ").append(produitChoisi.getQuantité()).append("\n");
                
                Affichage_Produits_Finis.getAffichageProduitsFinis().setText(details.toString());
    
            } else {
                Affichage_Produits_Finis.getAffichageProduitsFinis().setText("Veuillez sélectionner un produit fini.");
            }
        
        });
        
        Affichage_Produits_Finis.getBtnHome().setOnAction(e -> {
            stage.close();
            
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
        });
    }
}
