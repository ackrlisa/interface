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
public class Gestion_Gamme extends BorderPane {
    private Button ajouter, home, supprimer,modifier, creerOperation;
    
    public Gestion_Gamme (){
        ajouter = new Button("Ajouter une nouvelle gamme");
        home = new Button("HOME");
        supprimer = new Button("Supprimer une gamme");
        modifier= new Button ("Modifier une gamme existante");
        creerOperation = new Button("Creer une operation");
        Label operation = new Label ("En lien avec les gammes");
        Label qui = new Label("Que voulez-vous faire?");
        this.setTop(qui);
        
        VBox milieu = new VBox(10);
        milieu.getChildren().addAll(ajouter, supprimer, modifier,operation, creerOperation);
        this.setCenter(milieu);
        this.setRight(home);
    }
    
    public BorderPane getGestion_Gamme() {
        return this;
    }
    
    public Button getBtnSupprimer(){
        return supprimer;
    }
    
    public Button getBtnModifier(){
        return modifier;
    }
    
    public Button getBtnAjouter(){
        return ajouter;
    }
   public Button getBtnHome(){
        return home;
    }

    public Button getCreerOperation() {
        return creerOperation;
    }

   
   
    public Scene getFenêtre_Gestion_Gamme(){
         return new Scene(this, 600, 400);
    }
}

