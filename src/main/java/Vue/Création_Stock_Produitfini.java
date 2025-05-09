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
     private TextField designation, quantite;
    private ComboBox<ProduitsFinis> comboProduitsfinis;
    private Button ajouter, home;
     private TextArea produitsfinisAjoutees;
    private Label resultat;

    public Création_Stock_Produitfini() {
        Label titre = new Label("Ajouter un élément au stock des produits finis de l'atelier");
        this.setTop(titre);
        resultat = new Label();


        VBox champs = new VBox(10);

        designation = new TextField();
        quantite = new TextField();
        
        comboProduitsfinis= new ComboBox<>();
        produitsfinisAjoutees = new TextArea();
        produitsfinisAjoutees.setEditable(false);
        
        champs.getChildren().addAll(
            new Label("Désignation du nouvel élément du stock :"), designation,
            new Label("Quantité :"), quantite,
            comboProduitsfinis, ajouter,
            new Label("Element ajouté:"), produitsfinisAjoutees,
                        resultat
        );

        this.setCenter(champs);

        ajouter = new Button("Ajouter élément au stock produits finis");
        home = new Button("HOME");
        this.setRight(home);
        this.setBottom(ajouter);
    }

    public TextField getDesignation() {
        return designation;
    }

    public TextField getQuantite() {
        return quantite;
    }

   public ComboBox<ProduitsFinis> getComboProduitsFinis(){
   return comboProduitsfinis;
   }
    public Button getAjouter() {
        return ajouter;
    }
    
    public Label getResultat() {
        return resultat;
}
public TextArea getStockbrutAjoutees(){
    return produitsfinisAjoutees;
    
}
    public Button getHome() {
        return home;
    }
    
    
    public Scene getFenêtre_Création_Stock_Brut() {
        return new Scene(this, 600, 400);
    }

    
    }

