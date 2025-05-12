/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Modele.Machine;
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
public class Modification_Produit extends BorderPane{
    private Button home ; 
    private Button ok ;
    private ComboBox<Produit> comboProduits;
    private Label choixProduit, erreur ;
    private TextField codeProduit, dproduit;
    private Label textecodeProduit, textedproduit;

    public Modification_Produit() {
        home = new Button ("HOME");
        ok = new Button ("OK");
        choixProduit = new Label("sélectionnez le produit que vous voulez modifier");
        erreur = new Label(" ");
        textecodeProduit = new Label("Code du produit :"); textedproduit = new Label("Description :");
          
        VBox champs = new VBox(15);
        codeProduit = new TextField();
        dproduit = new TextField();
        
        champs.getChildren().addAll(
            textecodeProduit, dproduit,
             ok, erreur);      
         this.setCenter(champs);
        
        comboProduits = new ComboBox<>();
        comboProduits.getItems().addAll(Produit.getListeProduits());
                
        VBox centre = new VBox(10);
        centre.getChildren().addAll(choixProduit, comboProduits);
        this.setTop(centre);

        // Partie droite : bouton HOME
        this.setRight(home);      
    }

    public Label getErreur() {
        return erreur;
    }

    public Button getBtnHome() {
        return home;
    }

    public Button getBtnOk() {
        return ok;
    }

    public ComboBox<Produit> getComboProduits() {
        return comboProduits;
    }

    public Label getChoixProduit() {
        return choixProduit;
    }
    
    public TextField getCodeProduit() {
        return codeProduit;
    }

    public TextField getdproduit() {
        return dproduit;
    }

   
    public Label getTextecodeproduit() {
        return textecodeProduit;
    }

    public Label textecodeProduit() {
        return textedproduit;
    }

    
    public void setTextecodeProduit(Label textecodeProduit) {
        this.textecodeProduit = textecodeProduit;
    }

    public void setextecodeProduit(Label textecodeProduit) {
        this.textecodeProduit = textecodeProduit;
    }

        public Scene getFenêtre_Modification_Produit(){
         return new Scene(this, 600, 600);
    }
    
}

