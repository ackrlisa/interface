/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;
import Modele.ModèleCarte;
import Vue.Chef_Atelier;
import Vue.Affichage_Atelier;
import Vue.Calculer;
import Vue.Gérer_Atelier;
import javafx.stage.Stage;
/**
 *
 * @author lisaa
 */
public class Fenêtre_ChefAtelier {
    private Chef_Atelier chef_atelier;
     private ModèleCarte modeleCarte;
    
    public Fenêtre_ChefAtelier (Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        chef_atelier= new Chef_Atelier();
        
        stage.setTitle("Fenêtre chef atelier");
        stage.setScene(chef_atelier.getFenêtre_chefAtelier()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show();
        
        chef_atelier.getBtnAffichage().setOnAction(e -> { //quand on clique sur le bouton
            // Ferme la fenêtre 
            stage.close();
            // Crée une nouvelle fenêtre 
            Stage affichageStage = new Stage();
            new Fenêtre_Affichage_Atelier(affichageStage,modeleCarte);
        });
                
        chef_atelier.getBtnGérer_atelier().setOnAction(e -> { //quand on clique sur le bouton
            // Ferme la fenêtre 
            stage.close();
            // Crée une nouvelle fenêtre pour operateur
            Stage gérerStage = new Stage();
            new Fenêtre_Gérer_Atelier(gérerStage,modeleCarte);
        });
        chef_atelier.getBtnCalculer().setOnAction(e -> { //quand on clique sur le bouton
            // Ferme la fenêtre 
            stage.close();
            // Crée une nouvelle fenêtre pour operateur
            Stage calculerStage = new Stage();
            new Fenêtre_Calculer_Atelier(calculerStage,modeleCarte);
        });
      
        
        chef_atelier.getBtnHome().setOnAction(e -> {
            // Ferme la fenêtre de chefAtelier
            stage.close();
            
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte);
        });
        
       
    }

}
