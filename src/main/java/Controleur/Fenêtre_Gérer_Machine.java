/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;


import Vue.Gestion_Machine;
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
           //Créer_Machine créermachine = new Créer_Machine();
            créermachineStage.setTitle("Création Machine");
           //créermachineStage.setScene(créermachine.getFenêtre_Créer_Machine());
            créermachineStage.show();
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
            //Supprimer_Machine supprimer=new Supprimer_Machine();
           supprimerStage.setTitle ("Supprimer machine ");
           //supprimerStage.setScene(supprimer.getFenêtre_Supprimer_Machine());
           supprimerStage.show();
                      });
                
        
        gérermachine.getBtnModifier().setOnAction(e -> {
            
           });
                
}
}
