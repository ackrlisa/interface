/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Modele.Poste;
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
public class Supprimer_Poste extends BorderPane{
    private Button home;
    private Button supprimer ;
    private ComboBox<Poste> comboPoste;
    private Label resultat ;

    public Supprimer_Poste() {
        home = new Button ("HOME");
        supprimer = new Button ("Surpprimer");
        resultat = new Label();
        comboPoste = new ComboBox<>();
        comboPoste.getItems().addAll(Poste.getListePostes());
        
        Label question = new Label("Quelle gamme souhaitez vous afficher ?");
        this.setTop(question);
        
        VBox centre = new VBox(10);
        centre.getChildren().addAll(comboPoste, supprimer, resultat);
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

    public ComboBox<Poste> getComboPoste() {
        return comboPoste;
    }

    public Label getResultat() {
        return resultat;
    }
    
    public Scene getFenetre_supprimer_poste(){
         return new Scene(this, 600, 400);
    }
    
}
