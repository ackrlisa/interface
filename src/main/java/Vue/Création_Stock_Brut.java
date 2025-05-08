/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Modele.StockBrut;
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
public class Création_Stock_Brut {

    
 
public class Creation_Stock_Brut extends BorderPane {
    private TextField designation, quantité;
    private ComboBox<StockBrut> comboStockBrut;
    private Button ajouter, home;
     private TextArea stockbrutAjoutees;
    private Label resultat;

    public Creation_Stock_Brut() {
        Label titre = new Label("Ajouter un élément au stock brut de l'atelier");
        this.setTop(titre);
        resultat = new Label();


        VBox champs = new VBox(10);

        designation = new TextField();
        quantité = new TextField();
        
        comboStockBrut= new ComboBox<>();
        stockbrutAjoutees = new TextArea();
        stockbrutAjoutees.setEditable(false);
        
        champs.getChildren().addAll(
            new Label("Désignation du nouvel élément du stock :"), designation,
            new Label("Quantité :"), quantité,
            comboStockBrut, ajouter,
            new Label("Element ajouté:"), stockbrutAjoutees,
                        resultat
        );

        this.setCenter(champs);

        ajouter = new Button("Ajouter élément au stock brut");
        home = new Button("HOME");
        this.setRight(home);
        this.setBottom(ajouter);
    }

    public TextField getDesignation() {
        return designation;
    }

    public TextField getdQuantité() {
        return quantité;
    }

   public ComboBox<StockBrut> getComboStockBrut(){
   return comboStockBrut;
   }
    public Button getAjouter() {
        return ajouter;
    }
    
    public Label getResultat() {
        return resultat;
}
public TextArea getStockbrutAjoutees(){
    return stockbrutAjoutees;
    
}
    public Button getHome() {
        return home;
    }
    
    
    public Scene getFenêtre_Création_Stock_Brut() {
        return new Scene(this, 600, 400);
    }

    
    }
}
   

