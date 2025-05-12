/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.Element;
import Modele.ModèleCarte;
import Modele.Produit;
import Vue.Supprimer_Produit;
import Vue.Supprimer_Stockbrut;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Supprimer_Produit {
     private Supprimer_Produit supprimerproduit ;
    private ModèleCarte modeleCarte;
    
    public Fenêtre_Supprimer_Produit(Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        
        supprimerproduit = new Supprimer_Produit();

        stage.setTitle("Suppression d'un produit fini");
        stage.setScene(supprimerproduit.getFenêtre_Supprimer_Produit()); 
        supprimerproduit.getComboProduit().getItems().setAll(Produit.getListeProduits());
        stage.show();
        
        supprimerproduit.getBtnSupprimer().setOnAction(e -> {
            Produit produitChoisi = supprimerproduit.getComboProduit().getValue();

            if (produitChoisi != null) {
                try {
                    // Supprimer le produit de la liste ou du modèle
                    Produit.getListeProduits().remove(produitChoisi); 
                   
                    // Met à jour la liste déroulante
                    supprimerproduit.getComboProduit().getItems().setAll(Produit.getListeProduits());
                    supprimerproduit.getResultat().setText("Produit supprimé avec succès !");
                } catch (Exception ex) {
                    supprimerproduit.getResultat().setText("Erreur lors de la suppression du produit.");
                }
            } else {
                supprimerproduit.getResultat().setText("Veuillez sélectionner un produit à supprimer.");
            }
        });
        
        supprimerproduit.getBtnHome().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
        });
    }
}


