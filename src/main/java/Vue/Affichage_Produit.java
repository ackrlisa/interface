/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Modele.Produit;
import Modele.ProduitsFinis;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author lisaa
 */
public class Affichage_Produit extends BorderPane {
    private Button afficher ;
    private ComboBox<Produit> comboProduits;
    private Label affichageProduits ;
    private Button home;

    public Affichage_Produit() {
        home = new Button ("HOME");
        afficher = new Button ("Afficher");
        affichageProduits = new Label();
        comboProduits = new ComboBox<>();
        comboProduits.getItems().addAll(Produit.getListeProduits());
        
        Label question = new Label("Quel produit fini voulez vous afficher ?");
        this.setTop(question);
        
        VBox centre = new VBox(10);
        centre.getChildren().addAll(comboProduits, afficher, affichageProduits);
        this.setCenter(centre);

        // Partie droite : bouton HOME
        this.setRight(home);
        
        
    }

    public Button getBtnHome() {
        return home;
    }

    public Button getBtnAfficher() {
        return afficher;
    }

    public ComboBox<Produit> getComboProduits() {
        return comboProduits;
    }

    public Label getAffichageProduits() {
        return affichageProduits;
    }
    
    public Scene getFenêtre_Affichage_Produit(){
         return new Scene(this, 600, 400);
    }
    
}


