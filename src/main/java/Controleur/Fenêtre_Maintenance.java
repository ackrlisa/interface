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
            // Crée une nouvelle fenêtre pour la maintenance
            Stage affichageStage = new Stage();
            Affichage_Atelier affichageAtelier = new Affichage_Atelier();
            affichageStage.setTitle("Affichage de l'Atelier");
            affichageStage.setScene(affichageAtelier.getFenêtre_Affichage_Atelier());
            affichageStage.show();
        });
                
        maintenance.getBtnFiabilite().setOnAction(e -> {
            // Code pour afficher la fiabilité des machines
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
