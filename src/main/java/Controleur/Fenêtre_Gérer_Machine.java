/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Vue.Gestion_Machine;
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
            
           });
        
        gérermachine.getBtnSupprimer().setOnAction(e -> {
           
           });
        gérermachine.getBtnModifier().setOnAction(e -> {
            
           });
                
}
}
