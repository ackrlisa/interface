/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Modele.StockBrut ;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author alicedeboever
 */
public class Affichage_Stock_Brut extends BorderPane {
    private Button home;
    private Label affichageStockBrut ;
   
    
    public Affichage_Stock_Brut (){
        home = new Button("HOME");
        Label déclaration = new Label("Voici le stock brut ");
        affichageStockBrut = new Label();
        
        VBox centre = new VBox(10);
        centre.getChildren().addAll(affichageStockBrut);
        this.setCenter(centre);
        this.setTop(déclaration);
        this.setRight(home);
        
    }

    public Button getBtnHome() {
        return home;
    }
    
    public Label getAffichageStockBrut() {
        return affichageStockBrut;
    }
    public Scene getFenêtre_affichage_stock_brut(){
         return new Scene(this, 600, 400);
    }  
    
}
