/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author lisaa
 */
public class Créer_Gamme extends BorderPane {
       private TextField refGamme, listeOperation, listeEquipement, listeGammes;
    private Button creer, home;
    private Label resultat;

    public Créer_Gamme() {
        Label titre = new Label("Création d'une nouvelle gamme");
        this.setTop(titre);
        resultat = new Label();

        VBox champs = new VBox(10);

        refGamme = new TextField();
        

        champs.getChildren().addAll(
            new Label("Référence de la gamme :"), refGamme,
            
            resultat
        );

        this.setCenter(champs);

        creer = new Button("Créer la gamme");
        home = new Button("HOME");
        this.setRight(home);
        this.setBottom(creer);
    }

    public TextField getRefGamme() {
        return refGamme;
    }

    
    public Label getResultat() {
        return resultat;
}

    public Button getHome() {
        return home;
    }
    public Button getCréer() {
        return home;
    }
    
    public Scene getFenêtre_Créer_Gamme(){
         return new Scene(this, 600, 400);
    }
}