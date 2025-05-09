/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Vue.Gestion_Machine;
import Vue.Supprimer_Machine;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Supprimer_Machine {
    private Supprimer_Machine supprimermachine;
     private ModèleCarte modeleCarte;
    
    public Fenêtre_Supprimer_Machine (Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        supprimermachine= new Supprimer_Machine();
        
        stage.setTitle("Fenêtre suppression machines");
        stage.setScene(supprimermachine.getFenêtre_Supprimer_Machine()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show();

    supprimermachine.getBtnHome().setOnAction(e->{
         stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
           });

            
supprimermachine.getBtnSupprimer().setOnAction(e->{
});
    }
}       
