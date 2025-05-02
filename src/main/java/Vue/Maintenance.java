/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;


import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

/**
 *
 * @author PC
 */
public class Maintenance extends BorderPane{
    private Button home;
    private Button fiabilite;
    private Button affichage;
            
    public Maintenance(){
        home = new Button("HOME");
        fiabilite = new Button("Afficher la fiabilité des machines");
        affichage = new Button("Afficher l'atelier de fabrication");
        Label titre = new Label("Que voulez-vous faire?");
        
        this.setTop(titre);
        VBox milieu = new VBox(5); 
        milieu.getChildren().addAll(affichage, fiabilite);
        this.setCenter(milieu);
        this.setRight(home);
    }
    
    public Button getBtnHome() {
        return home;
    }
    
    public Scene getFenêtre_maintenance(){
         return new Scene(this, 600, 400);
    }

    public Button getBtnFiabilite() {
        return fiabilite;
    }

    public Button getBtnAffichage() {
        return affichage;
    }

       
}
