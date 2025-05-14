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
public class Création_Opérateur extends BorderPane {
          private TextField code, nom, prénom, compétence;
       
    private Button home, créerOperateur;
    private Label resultat;

    public Création_Opérateur() {
        // Titre
        Label titre = new Label("Création d’un nouvel opérateur");
        this.setTop(new VBox(titre));
        

        // Champs pour les informations de l'opérateur
        VBox champs = new VBox(10);

        code = new TextField();
        nom = new TextField();
        prénom = new TextField();
        compétence = new TextField();

        resultat = new Label();
        créerOperateur = new Button("Créer l'opérateur");
        home = new Button("HOME");

        champs.getChildren().addAll(
            new Label("Code :"), code,
            new Label("Nom :"), nom,
            new Label("Prénom :"), prénom,
            new Label("Compétence :"), compétence,
            resultat
        );

        this.setCenter(champs);

        // Boutons
        this.setBottom(créerOperateur);
        this.setRight(home);

        
    }

    // Getters pour récupérer les champs et boutons
    public TextField getCode() {
        return code;
    }

    public TextField getNom() {
        return nom;
    }

    public TextField getPrénom() {
        return prénom;
    }

    public TextField getCompétence() {
        return compétence;
    }

    public Button getCréerOperateur() {
        return créerOperateur;
    }

    public Button getHome() {
        return home;
    }

    public Label getResultat() {
        return resultat;
    }

    // Scène associée à cette vue
    public Scene getFenêtre_Création_Opérateur() {
        return new Scene(this, 600, 450);
    }
}
