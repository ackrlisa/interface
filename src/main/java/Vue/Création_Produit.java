/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author lisaa
 */
public class Création_Produit extends BorderPane{
    private TextField codeProduit, dproduit;
    private Button home, créerproduit;
    private Label resultat;

    public Création_Produit() {
        Label titre = new Label("Création d’un nouveau produit");
        this.setTop(titre);

        VBox champs = new VBox(10);
        codeProduit = new TextField();
        dproduit = new TextField();
        resultat = new Label();
        créerproduit = new Button("Créer le produit");
        home = new Button("HOME");

        champs.getChildren().addAll(
            new Label("Code du produit:"), codeProduit,
            new Label("Description du produit :"), dproduit,
           
            resultat
        );

        this.setCenter(champs);
        this.setBottom(créerproduit);
        this.setRight(home);
    }

    public TextField getCodeProduit() {
        return codeProduit;
    }

    public TextField getdproduit() {
        return dproduit;
    }

    
   

    public Button getCréerproduit() {
        return créerproduit;
    }

    public Button getHome() {
        return home;
    }

        

    public Label getResultat() {
        return resultat;
    }

    

    public Scene getFenêtre_Création_Produit() {
        return new Scene(this, 600, 450);
    }
}


