/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Vue.Gestion_Stockfini;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Gestion_Stockfini {
    private Gestion_Stockfini gestionstockfini;
     private ModèleCarte modeleCarte;
     
    public Fenêtre_Gestion_Stockfini(Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        gestionstockfini= new Gestion_Stockfini();
        
        stage.setTitle("Fenêtre gestion des produits finis, du stock de l'atelier");
        stage.setScene(gestionstockfini.getFenêtre_Gestion_Stockfini());
        stage.show();
        
        gestionstockfini.getBtnAjouter().setOnAction(e -> {
            stage.close();
            Stage créationstockfiniStage = new Stage();
            new Fenêtre_Création_Stock_Produitfini(créationstockfiniStage,modeleCarte);
           });
        
        gestionstockfini.getBtnSupprimer().setOnAction(e -> {
           stage.close();
            Stage suppressionstockfiniStage = new Stage();
            new Fenêtre_Supprimer_Stock_Porduitfini(suppressionstockfiniStage,modeleCarte);
           
           });
        gestionstockfini.getBtnHome().setOnAction(e->{  
       stage.close();
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte);
     });
}
}


