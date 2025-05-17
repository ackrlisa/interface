/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Modele.Gamme;
import Modele.Produit;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author alicedeboever
 */
public class Ajout_Suppression_Produit_Gamme extends BorderPane{
    private Button home, ajouter, supprimer ;
    private ComboBox<Gamme> comboGamme;
    private ComboBox<Produit> comboProduits;
    private Label choixGamme, choixProduit, erreur ;
    
    public Ajout_Suppression_Produit_Gamme() {
        home = new Button ("HOME");
        ajouter = new Button ("AJOUTER");
        supprimer = new Button("SUPPRIMER");
        choixProduit = new Label("Quel produit voulez vous ajouter/supprimer?");
        choixGamme = new Label("sélectionnez une Gamme");
        erreur = new Label(" ");  
        comboProduits = new ComboBox<>();
        comboProduits.getItems().addAll(Produit.getListeProduits());
        comboGamme = new ComboBox<>();
        comboGamme.getItems().addAll(Gamme.getListeGammes());
        
        VBox champs = new VBox(15);
        champs.getChildren().addAll(
            choixGamme, comboGamme, choixProduit, comboProduits, ajouter, supprimer, erreur);      
         this.setCenter(champs);
            
        this.setRight(home);      
    }

    public Button getBtnHome() {
        return home;
    }

    public Button getBtnAjouter() {
        return ajouter;
    }

    public Button getBtnSupprimer() {
        return supprimer;
    }

    public Label getChoixProduit() {
        return choixProduit;
    }

    public Label getChoixGamme() {
        return choixGamme;
    }
    
    public ComboBox<Produit> getComboProduits() {
      return comboProduits;
    }

    public ComboBox<Gamme> getComboGamme() {
        return comboGamme;
    }

    public Label getErreur() {
        return erreur;
    }
    
    public Scene getFenêtre_Ajout_Suppression_Produit_Gamme(){
         return new Scene(this, 600, 400);
    }
    
}
