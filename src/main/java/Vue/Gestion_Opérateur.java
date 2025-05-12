/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author lisaa
 */
public class Gestion_Opérateur extends BorderPane{
     private Button home;
    private Button créer;
    
    private Button modifier;
            
    public Gestion_Opérateur(){
        home = new Button("HOME");
        créer= new Button ("Ajouter un opérateur");
        
        modifier = new Button("Modifier le statut d'un opérateur");
        Label titre = new Label("Que voulez-vous faire?");
        
        this.setTop(titre);
        VBox milieu = new VBox(5); 
        milieu.getChildren().addAll(créer, modifier);
        this.setCenter(milieu);
        this.setRight(home);
    }
    
    public Button getBtnHome() {
        return home;
    }
    
       public Button getBtnCréer() {
        return créer;
    }

    
    public Button getBtnModifier() {
        return modifier;
    }

   public Scene getFenêtre_Gestion_Opérateur(){
         return new Scene(this, 600, 400);
    }
}


