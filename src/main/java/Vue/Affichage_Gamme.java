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
import javafx.scene.layout.VBox;

/**
 *
 * @author alicedeboever
 */
public class Affichage_Gamme extends BorderPane {
    private Button home, afficher;
    private ComboBox<Gamme> comboGamme;
    private Label affichageGammme ;

    public Affichage_Gamme() {
        home = new Button ("HOME");
        afficher = new Button ("Afficher");
        affichageGammme = new Label();
        comboGamme = new ComboBox<>();
        comboGamme.getItems().addAll(Gamme.getListeGammes());
        
        Label question = new Label("Quelle gamme souhaitez vous afficher ?");
        this.setTop(question);
        
        VBox centre = new VBox(10);
        centre.getChildren().addAll(comboGamme, afficher, affichageGammme);
        this.setCenter(centre);

        // Partie droite : bouton HOME
        this.setRight(home);
        
        
    }
    public Button getBtnHome() {
        return home;
    }

    public Button getBtnAfficher() {
        return afficher;
    }

    public ComboBox<Gamme> getComboGamme() {
        return comboGamme;
    }

    public Label getAffichageGamme() {
        return affichageGammme;
    }
    
    public Scene getFenetre_affichage_gamme(){
         return new Scene(this, 600, 400);
    }
}
