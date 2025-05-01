/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Vue.Accueil;
import Vue.Maintenance;
import Vue.Affichage_Atelier;
import javafx.stage.Stage;
/**
 *
 * @author PC
 */

public class Fenêtre_Accueil {
    private Accueil accueil;
    
    public Fenêtre_Accueil(Stage stage){
        accueil= new Accueil();
        
        stage.setTitle("Fenêtre accueil");
        stage.setScene(accueil.getFenêtre_accueil()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show();
        
        accueil.getBtnMaintenance().setOnAction(e -> { //quand on clique sur le bouton
            // Ferme la fenêtre d'accueil
            stage.close();
            // Crée une nouvelle fenêtre pour la maintenance
            Stage maintenanceStage = new Stage();
            new Fenêtre_Maintenance(maintenanceStage); // Utilise le contrôleur
        });
        
        accueil.getBtnOperateur().setOnAction(e -> { //quand on clique sur le bouton
            // Ferme la fenêtre d'accueil
            stage.close();
            // Crée une nouvelle fenêtre pour la maintenance
            Stage affichage_atelier = new Stage();
            Affichage_Atelier vueAffichage_Atelier = new Affichage_Atelier();

            affichage_atelier.setTitle("Fenêtre Affichage Atelier");
            affichage_atelier.setScene(vueAffichage_Atelier.getFenêtre_Affichage_Atelier());
            affichage_atelier.show();
        });
    }
}
