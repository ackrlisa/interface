/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Modele.Gamme;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 *
 * @author alicedeboever
 */
public class Calcul_Duree_Gamme extends BorderPane {
    private Button home;
    private Button calculer ;
    private ComboBox<Gamme> comboGamme;
    private Label affichageResultat ;

    public Calcul_Duree_Gamme() {
        home = new Button ("HOME");
        calculer = new Button ("Calculer");
        affichageResultat = new Label();
        comboGamme = new ComboBox<>();
        comboGamme.getItems().addAll(Gamme.getListeGammes());
        
        Label question = new Label("Quelle est la gamme dont souhaitez-vous calculer le durée ?");
        this.setTop(question);
        
        VBox centre = new VBox(10);
        centre.getChildren().addAll(comboGamme, calculer, affichageResultat);
        this.setCenter(centre);

        // Partie droite : bouton HOME
        this.setRight(home);
        
        
    }
    public Button getBtnHome() {
        return home;
    }

    public Button getBtnCalculer() {
        return calculer;
    }

    public ComboBox<Gamme> getComboGamme() {
        return comboGamme;
    }

    public Label getAffichageResultat() {
        return affichageResultat;
    }
    
    public Scene getFenetre_calcul_duree_gamme(){
    return new Scene(this, 600, 400);
}

}
