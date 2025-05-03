/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Modele.Operateur;
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
public class Affichage_Operateur extends BorderPane {
    private Button home;
    private Button afficher ;
    private ComboBox<Operateur> comboOperateur;
    private Label affichageOperateur ;

    public Affichage_Operateur() {
        home = new Button ("HOME");
        afficher = new Button ("Afficher");
        affichageOperateur = new Label();
        comboOperateur = new ComboBox<>();
        comboOperateur.getItems().addAll(Operateur.getListeOperateurs());
        
        Label question = new Label("Quel operateur souhaitez vous afficher ?");
        this.setTop(question);
        
        VBox centre = new VBox(10);
        centre.getChildren().addAll(comboOperateur, afficher, affichageOperateur);
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

    public ComboBox<Operateur> getComboOperateur() {
        return comboOperateur;
    }

    public Label getAffichageOperateur() {
        return affichageOperateur;
    }
    
    public Scene getFenetre_affichage_operateur(){
         return new Scene(this, 600, 400);
    }
}
