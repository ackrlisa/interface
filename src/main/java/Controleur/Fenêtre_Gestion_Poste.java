/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Vue.Gestion_Poste;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Gestion_Poste {
    private Gestion_Poste gestionposte;
     private ModèleCarte modeleCarte;
    
    public Fenêtre_Gestion_Poste (Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        gestionposte= new Gestion_Poste();
        
        stage.setTitle("Fenêtre gestion des postes");
        stage.setScene(gestionposte.getFenêtre_Gestion_Poste());
        stage.show();
        
        gestionposte.getBtnAjouter().setOnAction(e -> {
            stage.close();           
            Stage creationPoste = new Stage();
            new Fenêtre_Creation_Poste(creationPoste,modeleCarte);
        });
        
        gestionposte.getBtnSupprimer().setOnAction(e -> {
            stage.close();           
            Stage suppressionPoste = new Stage();
            new Fenêtre_Supprimer_Poste(suppressionPoste,modeleCarte);
        });
        
        gestionposte.getBtnModifier().setOnAction(e -> {
            stage.close();     
            Stage modificationPoste = new Stage();
            new Fenêtre_Modification_Poste(modificationPoste,modeleCarte);
        });
    
        gestionposte.getBtnHome().setOnAction(e -> {
            stage.close();          
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte);
        });
    }
}
