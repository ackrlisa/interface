/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Vue.Modification_Gamme;
import Vue.Supprimer_Gamme;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Supprimer_Gamme {
   private Supprimer_Gamme supprimergamme;
    private ModèleCarte modeleCarte;
    
    public Fenêtre_Supprimer_Gamme (Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        supprimergamme= new Supprimer_Gamme();
        
        stage.setTitle("Fenêtre supprimer gamme");
        stage.setScene(supprimergamme.getFenêtre_Supprimer_Gamme()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show(); 
        
        
        supprimergamme.getBtnHome().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
           });
        
    }}
