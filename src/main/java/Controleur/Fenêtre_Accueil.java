/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Vue.Accueil;
import Vue.Maintenance;
import Vue.Affichage_Atelier;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author PC
 */

public class Fenêtre_Accueil {
    private Accueil accueil;
    private Stage stage;
    private Scene scene;
    private Fenêtre_CarteFx fenetreCarteFx;
    
    public Fenêtre_Accueil(Stage stage, ModèleCarte modeleCarte){
        this.stage = stage;
        accueil= new Accueil();
        
        stage.setTitle("Fenêtre accueil");
        stage.setScene(accueil.getFenêtre_accueil()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show();
        
        accueil.getBtnCarte().setOnAction(e-> {
            stage.close();
            Stage carteStage= new Stage();
            new Fenêtre_CarteFx (carteStage, modeleCarte);
           });
        
        accueil.getBtnMaintenance().setOnAction(e -> { //quand on clique sur le bouton
            // Ferme la fenêtre d'accueil
            stage.close();
            // Crée une nouvelle fenêtre pour la maintenance
            Stage maintenanceStage = new Stage();
            new Fenêtre_Maintenance(maintenanceStage,modeleCarte); // Utilise le contrôleur
        });
        
        accueil.getBtnOperateur().setOnAction(e -> { //quand on clique sur le bouton
            // Ferme la fenêtre d'accueil
            stage.close();
            // Crée une nouvelle fenêtre pour la maintenance
            Stage affichage_atelier = new Stage();
            new Fenêtre_Affichage_Atelier(affichage_atelier,modeleCarte);
        });
        accueil.getBtnChefAtelier().setOnAction(e -> { //quand on clique sur le bouton
            // Ferme la fenêtre d'accueil
            stage.close();
            // Crée une nouvelle fenêtre pour la maintenance
            Stage chef_AtelierStage = new Stage();
            new Fenêtre_ChefAtelier(chef_AtelierStage,modeleCarte); // Utilise le contrôleur
        });
    }
    public Scene getScene(){
        return scene;
    }
    public void revenirAccueil(){
        stage.setScene(scene);
    }
}
