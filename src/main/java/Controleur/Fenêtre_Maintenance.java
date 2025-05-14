/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;
import Modele.ModèleCarte;
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
        private ModèleCarte modeleCarte;
    
    public Fenêtre_Maintenance (Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        maintenance= new Maintenance();
        
        stage.setTitle("Fenêtre maintenance");
        stage.setScene(maintenance.getFenêtre_maintenance());
        stage.show();
        
        maintenance.getBtnAffichage().setOnAction(e -> {
            stage.close();
            Stage affichageStage = new Stage();
            new Fenêtre_Affichage_Atelier(affichageStage,modeleCarte);
        });
                
        maintenance.getBtnFiabilite().setOnAction(e -> {
            stage.close();
            Stage affichageStage = new Stage();
            new Fenêtre_Fiabilité(affichageStage,modeleCarte);
                });
      
        maintenance.getBtnHome().setOnAction(e -> {
            stage.close();
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte);
        });
    }
}
