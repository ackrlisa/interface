/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;


import Vue.Gestion_Machine;
import Vue.Modification_Machine;
import Vue.Supprimer_Machine;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Gérer_Machine {
    private Gestion_Machine gérermachine;
    
    public Fenêtre_Gérer_Machine (Stage stage){
        gérermachine= new Gestion_Machine();
        
        stage.setTitle("Fenêtre gestion machine");
        stage.setScene(gérermachine.getFenêtre_Gérer_Machine()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show();
        
        gérermachine.getBtnCréer().setOnAction(e -> {
            // Ferme la fenêtre 
            stage.close();
            // Crée une nouvelle fenêtre pour operateur
            Stage créermachineStage = new Stage();
           new Fenêtre_Creation_Machine (créermachineStage);
           
        });
           
        gérermachine.getBtnHome().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage); // Redirige vers la fenêtre d'accueil
           });
        
        gérermachine.getBtnSupprimer().setOnAction(e -> {
           // Ferme la fenêtre 
            stage.close();
            // Crée une nouvelle fenêtre pour operateur
            Stage supprimerStage = new Stage();
            new Fenêtre_Supprimer_Machine (supprimerStage);
           
                      });
                
        
        gérermachine.getBtnModifier().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre pour la maintenance
            Stage modifiermachineStage = new Stage();
            new Fenêtre_Modification_Machine (modifiermachineStage);
                       });
                
}
}
