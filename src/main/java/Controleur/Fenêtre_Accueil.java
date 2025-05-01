/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Vue.Accueil;
import Vue.Maintenance;
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
            Stage maintenance = new Stage();
            Maintenance vueMaintenance = new Maintenance();

            maintenance.setTitle("Fenêtre Maintenance");
            maintenance.setScene(vueMaintenance.getScene());
            maintenance.show();
        });
    }
}
