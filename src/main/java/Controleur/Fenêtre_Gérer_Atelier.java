/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;


import Modele.ModèleCarte;
import Vue.Gérer_Atelier;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Gérer_Atelier {
    private Gérer_Atelier gérerAtelier;
     private ModèleCarte modeleCarte;
    
    public Fenêtre_Gérer_Atelier (Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        gérerAtelier= new Gérer_Atelier();
        
        stage.setTitle("Fenêtre gérer atelier");
        stage.setScene(gérerAtelier.getFenêtre_Gérer_Atelier());
        stage.show();
        
        gérerAtelier.getBtnMachine().setOnAction(e -> {
             stage.close();
            Stage gestionmachineStage = new Stage();
            new Fenêtre_Gérer_Machine (gestionmachineStage,modeleCarte);
                    });
        
        gérerAtelier.getBtnPoste().setOnAction(e -> {
            stage.close();
            Stage gestionposteStage = new Stage();
            new Fenêtre_Gestion_Poste (gestionposteStage,modeleCarte);
            });
        
        gérerAtelier.getBtnProduit().setOnAction(e -> {
            stage.close();
            Stage gestionproduitStage = new Stage();
            new Fenêtre_Gestion_Produit (gestionproduitStage,modeleCarte);
            });
        
        gérerAtelier.getBtnOpérateur().setOnAction(e -> {
            stage.close();
            Stage gestionopérateurtStage = new Stage();
            new Fenêtre_Gestion_Opérateur (gestionopérateurtStage,modeleCarte);
            });
        
        gérerAtelier.getBtnGamme().setOnAction(e -> {
           stage.close();        
           Stage gestiongammeStage = new Stage();
           new Fenêtre_Gestion_Gamme (gestiongammeStage,modeleCarte);
            });
       
        gérerAtelier.getBtnStock_produits_finis().setOnAction(e -> {
           stage.close();
           Stage gestionstockfiniStage = new Stage();
           new Fenêtre_Gestion_Stockfini (gestionstockfiniStage,modeleCarte);
          });
        
        gérerAtelier.getBtnStock_brut().setOnAction(e -> {
            stage.close();
           Stage gestionstockbrutStage = new Stage();
           new Fenêtre_Gestion_Stockbrut(gestionstockbrutStage,modeleCarte);
        });
        
        gérerAtelier.getBtnHome().setOnAction(e -> {
             stage.close();
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte);
        });
    }

}
