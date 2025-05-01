/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.application.Application;

/**
 *
 * @author PC
 */
public class Maintenance extends BorderPane{
    public Maintenance(){
        Button fiabilite = new Button("affichier la fiabilité des machines");
        Button affichage = new Button("affichier l'atelier de fabrication");
        Label titre = new Label("Que voulez-vous faire?");
        
        this.setTop(titre);
        this.setCenter(fiabilite);
        this.setBottom(affichage);
    }
    
    public Scene getFenêtre_maintenance(){
         return new Scene(this, 600, 400);
    }
}
