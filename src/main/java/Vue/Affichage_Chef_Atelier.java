/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Modele.ChefAtelier;
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
public class Affichage_Chef_Atelier extends BorderPane {
    private Button home;
    private Button afficher ;
    private ComboBox<ChefAtelier> comboChefAtelier;
    private Label affichageChefsAtelier ;

    public Affichage_Chef_Atelier() {
        home = new Button ("HOME");
        afficher = new Button ("Afficher");
        affichageChefsAtelier = new Label();
        comboChefAtelier = new ComboBox<>();
        comboChefAtelier.getItems().addAll(ChefAtelier.getListeChefsAtelier());
        
        Label question = new Label("Quel est le chef d'Atelier que souhaitez vous afficher ?");
        this.setTop(question);
        
        VBox centre = new VBox(10);
        centre.getChildren().addAll(comboChefAtelier, afficher, affichageChefsAtelier);
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

    public ComboBox<ChefAtelier> getComboChefAtelier() {
        return comboChefAtelier;
    }

    public Label getAffichageChefAtelier() {
        return affichageChefsAtelier;
    }
    
    public Scene getFenetre_affichage_chef_atelier(){
         return new Scene(this, 600, 400);
    }
}
