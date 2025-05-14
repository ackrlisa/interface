/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;


import Modele.ModèleCarte;
import Vue.Carte;
import Vue.Gestion_Machine;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Gérer_Machine {
    private Gestion_Machine gérermachine;
    private ModèleCarte modeleCarte;
    private Carte vueCarte;
    
    public Fenêtre_Gérer_Machine (Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        gérermachine= new Gestion_Machine();
        
        stage.setTitle("Fenêtre gestion machine");
        stage.setScene(gérermachine.getFenêtre_Gérer_Machine());
        stage.show();
        
        gérermachine.getBtnCréer().setOnAction(e -> {
            stage.close();
            Stage créermachineStage = new Stage();
           new Fenêtre_Creation_Machine (créermachineStage,modeleCarte);
        });
           
        gérermachine.getBtnHome().setOnAction(e -> {
            stage.close();
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte);
           });
        
        gérermachine.getBtnSupprimer().setOnAction(e -> {
            stage.close();
            Stage supprimerStage = new Stage();
            new Fenêtre_Supprimer_Machine (supprimerStage,modeleCarte, vueCarte);
        });
                
        gérermachine.getBtnModifier().setOnAction(e -> {
            stage.close();
            Stage modifiermachineStage = new Stage();
            new Fenêtre_Modification_Machine (modifiermachineStage,modeleCarte);
        });                
    }
}
