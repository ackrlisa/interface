/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Modele.Gamme;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author lisaa
 */
public class Supprimer_Gamme extends BorderPane{
    private Button home;
    private Button supprimer ;
    private ComboBox<Gamme> comboGamme;
    private Label resultat ;

    public Supprimer_Gamme() {
        home = new Button ("HOME");
        supprimer = new Button ("Surpprimer");
        resultat = new Label();
        comboGamme = new ComboBox<>();
        comboGamme.getItems().addAll(Gamme.getListeGammes());
        
        Label question = new Label("Quelle gamme souhaitez vous afficher ?");
        this.setTop(question);
        
        VBox centre = new VBox(10);
        centre.getChildren().addAll(comboGamme, supprimer, resultat);
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

    public ComboBox<Gamme> getComboGamme() {
        return comboGamme;
    }

    public Label getResultat() {
        return resultat;
    }
    
    public Scene getFenetre_supprimer_gamme(){
         return new Scene(this, 600, 400);
    }

}

