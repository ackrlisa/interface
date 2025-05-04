/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author lisaa
 */
public class Gestion_Stockfini extends BorderPane {
    private Button ajouter;
    private Button supprimer;
    private Button home;
    
    public Gestion_Stockfini (){
        ajouter = new Button("Ajouter un produit fini au stock");
        supprimer = new Button("Supprimer produit fini du stock");
        home = new Button("HOME");
        Label qui = new Label("Que voulez-vous faire?");
    
        this.setTop(qui);
        
        HBox bas = new HBox(10); // 10 = espacement entre les boutons
        bas.getChildren().addAll(supprimer,ajouter);
        this.setCenter(bas);
        this.setRight(home);
    }
    
    
    
    public Button getBtnAjouter(){
        return ajouter;
    }
    
    public Button getBtnSupprimer(){
        return supprimer;
    }
    
    public Button getBtnHome(){
        return home;
    }
   
    public Scene getFenêtre_Gestion_Stockfini(){
         return new Scene(this, 600, 400);
    }

}


