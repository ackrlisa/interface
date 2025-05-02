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
public class Gestion_Poste extends BorderPane{
    private Button ajouter;
    private Button supprimer;
    private Button modifier;
    private Button home;
    
    public Gestion_Poste(){
        ajouter = new Button("Ajouter un poste");
        supprimer = new Button("Supprimer un poste");
        modifier = new Button("Modifier un poste");
        home= new Button ("HOME");
        Label qui = new Label("Bonjour, qui êtes vous?");
    
        this.setTop(qui);
        
        HBox bas = new HBox(10); // 10 = espacement entre les boutons
        bas.getChildren().addAll(ajouter, supprimer, modifier);
        this.setCenter(bas);
    }
public BorderPane getGestion_Poste() {
        return this;
    }
    public Button getBtnAjouter() {
        return ajouter;
    }

    public Button getBtnSupprimer() {
        return supprimer;
    }

    public Button getBtnModifier() {
        return modifier;
    }

    public Button getBtnHome() {
        return home;
    }
    public Scene getFenêtre_Gestion_Poste(){
         return new Scene(this, 600, 400);
    }
}
