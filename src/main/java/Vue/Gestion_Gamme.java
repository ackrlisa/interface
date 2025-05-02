/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author lisaa
 */
public class Gestion_Gamme extends BorderPane {
    private Button ajouter;
    private Button home;
    private Button supprimer;
    private Button modifier;
    
    public Gestion_Gamme (){
        ajouter = new Button("Ajouter une nouvelle gamme");
        home = new Button("HOME");
        supprimer = new Button("Supprimer une gamme");
        modifier= new Button ("Modifier une gamme existante");
        Label qui = new Label("Que voulez-vous faire?");
    
        this.setTop(qui);
        
        HBox bas = new HBox(10); // 10 = espacement entre les boutons
        bas.getChildren().addAll(ajouter, supprimer, modifier);
        this.setCenter(bas);
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
   
    public Scene getFenêtre_Gestion_Gamme(){
         return new Scene(this, 600, 400);
    }
}

