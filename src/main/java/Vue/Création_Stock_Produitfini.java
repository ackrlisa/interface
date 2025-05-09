/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Modele.ProduitsFinis;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author lisaa
 */
public class Création_Stock_Produitfini extends BorderPane {
    private TextField nom, quantite, prix;
    private Button ajouter, home;
    private Label resultat;

    public Création_Stock_Produitfini() {
        Label titre = new Label("Ajouter un élément au stock de produits finis de l'atelier");
        this.setTop(titre);
        resultat = new Label();
        
        VBox champs = new VBox(10);

        nom = new TextField();
        quantite = new TextField();
        prix = new TextField();

        champs.getChildren().addAll(
            new Label("Désignation du produit fini :"), nom,
            new Label("Quantité :"), quantite,
            new Label ("Prix"), prix,
            resultat
        );

        this.setCenter(champs);

        ajouter = new Button("Ajouter élément au stock de produits finis");
        home = new Button("HOME");
        this.setRight(home);
        this.setBottom(ajouter);
    }

    public TextField getNom() {
        return nom;
    }
    
    public TextField getQuantite() {
        return quantite;
    }

    public TextField getPrix() {
        return prix;
    }
    
    public Button getAjouter() {
        return ajouter;
    }
    
    public Label getResultat() {
        return resultat;
    }
    public Button getHome() {
        return home;
    }
    
    
    public Scene getFenêtre_Création_Stock_Produitfini() {
        return new Scene(this, 600, 400);
    }
    
    }

