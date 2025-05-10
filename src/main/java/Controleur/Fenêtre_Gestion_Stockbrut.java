/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Vue.Gestion_Stockbrut;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Gestion_Stockbrut {
    private Gestion_Stockbrut gérerstockbrut;
     private ModèleCarte modeleCarte;
    
    public Fenêtre_Gestion_Stockbrut (Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        gérerstockbrut= new Gestion_Stockbrut();
        
        stage.setTitle("Fenêtre gestion stock brut");
        stage.setScene(gérerstockbrut.getFenêtre_Gestion_Stockbrut()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show();
        
        gérerstockbrut.getBtnAjouter().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage créationstockbrutStage = new Stage();
            new Fenêtre_Création_Stock_Brut(créationstockbrutStage,modeleCarte); // Redirige vers la fenêtre d'accueil
           });
        
        gérerstockbrut.getBtnSupprimer().setOnAction(e -> {
           stage.close();
            Stage suppressionstockbrutStage = new Stage();
            new Fenêtre_Supprimer_Stockbrut(suppressionstockbrutStage,modeleCarte);
           });
        gérerstockbrut.getBtnHome().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
        });
           
                
}
}
