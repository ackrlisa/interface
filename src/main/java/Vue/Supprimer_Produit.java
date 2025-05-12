/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Modele.Element;
import Modele.Produit;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author lisaa
 */
public class Supprimer_Produit extends BorderPane{
     private Button home ; 
    private Button supprimer ;
    private ComboBox<Produit> comboProduit;
    private Label resultat ;

    public Supprimer_Produit() {
        home = new Button ("HOME");
        supprimer = new Button ("Supprimer");
        resultat = new Label();
        
        comboProduit = new ComboBox<>();
        comboProduit.getItems().addAll(Produit.getListeProduits());
        
        

        Label question = new Label("Quel produit voulez vous supprimer ?");
        this.setTop(question);
        
        VBox centre = new VBox(10);
        centre.getChildren().addAll(comboProduit, supprimer, resultat);
        this.setCenter(centre);

        // Partie droite : bouton HOME
        this.setRight(home);
        
        
    }

    public Button getBtnHome() {
        return home;
    }

    public Button getBtnSupprimer() {
        return supprimer;
    }

    public ComboBox<Produit> getComboProduit() {
        return comboProduit;
    }

    public Label getResultat() {
        return resultat;
    }

      
    
    public Scene getFenêtre_Supprimer_Produit(){
         return new Scene(this, 600, 400);
    }
}

