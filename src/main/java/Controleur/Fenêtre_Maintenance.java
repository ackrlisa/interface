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
 * @author lisaa
 */
public class Fenêtre_Maintenance {
       private Maintenance maintenance;
    
    public Fenêtre_Maintenance (Stage stage){
        maintenance= new Maintenance();
        
        stage.setTitle("Fenêtre maintenance");
        stage.setScene(maintenance.getFenêtre_maintenance()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show();
        
        maintenance.getBtnAffichage().setOnAction(e -> { //quand on clique sur le bouton
            // Ferme la fenêtre d'
            stage.close();
            Stage affichageStage = new Stage();
            new Fenêtre_Affichage_Atelier(affichageStage); // <-- C’est lui qui attache les actions !
        });
                
        maintenance.getBtnFiabilite().setOnAction(e -> {
            stage.close();
            Stage affichageStage = new Stage();
            new Fenêtre_Fiabilité(affichageStage);
                });
        
        
        maintenance.getBtnHome().setOnAction(e -> {
            // Ferme la fenêtre de maintenance
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage);
        });
        
       
    }

}
