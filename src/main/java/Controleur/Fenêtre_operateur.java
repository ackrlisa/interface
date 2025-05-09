/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;
import Modele.ModèleCarte;
import Vue.Accueil;
import Vue.Operateur;
import Vue.Affichage_Atelier;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */

//INUTILE !!!
public class Fenêtre_operateur {
    private Operateur operateur;
    private ModèleCarte modeleCarte;
    
    public Fenêtre_operateur (Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte =modeleCarte;
        operateur= new Operateur();
        
        stage.setTitle("Fenêtre opérateur");
        stage.setScene(operateur.getFenêtre_operateur()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show();
        
        operateur.getBtnAffichage().setOnAction(e -> { //quand on clique sur le bouton
            // Ferme la fenêtre 
            stage.close();
            // Crée une nouvelle fenêtre pour operateur
            Stage affichageStage = new Stage();
            new Fenêtre_Affichage_Atelier(affichageStage,modeleCarte);
        });
                 
        
       
    }

}
