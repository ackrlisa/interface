/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import javafx.scene.layout.BorderPane;
import Modele.Poste;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.ComboBox;

/**
 *
 * @author alicedeboever
 */
public class Affichage_Poste extends BorderPane {
    private Button home, afficher ; 
    private ComboBox<Poste> comboPoste;
    private Label affichagePoste ;

    public Affichage_Poste() {
        home = new Button ("HOME");
        afficher = new Button ("Afficher");
        affichagePoste = new Label();
        comboPoste = new ComboBox<>();
        comboPoste.getItems().addAll(Poste.getListePostes());
        
        Label question = new Label("Quelle est  le poste que vous souahitez afficher ?");
        this.setTop(question);
        
        VBox centre = new VBox(10);
        centre.getChildren().addAll(comboPoste, afficher, affichagePoste);
        this.setCenter(centre);
        this.setRight(home);
        
        
    }

    public Button getBtnHome() {
        return home;
    }

    public Button getBtnAfficher() {
        return afficher;
    }

    public ComboBox<Poste> getComboPoste() {
        return comboPoste;
    }

    public Label getAffichagePoste() {
        return affichagePoste;
    }
    
    public Scene getFenêtre_affichage_poste(){
         return new Scene(this, 600, 400);
    }
}
