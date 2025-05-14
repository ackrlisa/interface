/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Modele.ProduitsFinis;
import Vue.Supprimer_Stock_Produitfini;
import javafx.stage.Stage;

/**
 *
 * @author alicedeboever
 */
public class Fenêtre_Supprimer_Stock_Porduitfini {
    private Supprimer_Stock_Produitfini supprimerproduitfini ;
    private ModèleCarte modeleCarte;
    
    public Fenêtre_Supprimer_Stock_Porduitfini(Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        supprimerproduitfini = new Supprimer_Stock_Produitfini();

        stage.setTitle("Suppression d'un produit fini du stock");
        stage.setScene(supprimerproduitfini.getFenêtre_supprimer_stock_produitfini()); 
        supprimerproduitfini.getComboProduitsFinis().getItems().setAll(ProduitsFinis.getListeStockProduitsFinis());
        stage.show();
        
        supprimerproduitfini.getBtnSupprimer().setOnAction(e -> {
           ProduitsFinis produitChoisi = supprimerproduitfini.getComboProduitsFinis().getValue();
           String texteQuantiteASupprimer = supprimerproduitfini.getQuantiteASupprimer().getText();
            if (produitChoisi != null && texteQuantiteASupprimer != null && !texteQuantiteASupprimer.isEmpty()) {
                try {
                    int quantiteDemandee = Integer.parseInt(texteQuantiteASupprimer);
                    if (quantiteDemandee < 0) {
                        supprimerproduitfini.getResultat().setText("La quantité doit être positive.");
                        return;
                    }else{
                        int quantiteActuelle = produitChoisi.getQuantité(); 
                        int nouvelleQuantite = Math.max(0, quantiteActuelle - quantiteDemandee);
                        produitChoisi.setQuantité(nouvelleQuantite); 
                        supprimerproduitfini.getResultat().setText("Nouvelle quantité : " + nouvelleQuantite);
                    }
                } catch (NumberFormatException ex) {
                    supprimerproduitfini.getResultat().setText("Veuillez entrer une quantité valide.");
                }  
            } else {
                supprimerproduitfini.getResultat().setText("Veuillez sélectionner un produit et entrer une quantité.");
            }
        });
        
        supprimerproduitfini.getBtnHome().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
        });
    }
}
