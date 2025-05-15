/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;
/**
 *
 * @author alicedeboever
 */
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
/**
 *
 * @author alicedeboever
 */
public class Creation_Machine extends BorderPane {
    private TextField refMachine, dMachine, x, y, cout, type;
    private Button creer, home, carte;
    private Label resultat;

    public Creation_Machine() {
        Label titre = new Label("Création d'une nouvelle machine");
        this.setTop(titre);
        resultat = new Label();

        VBox champs = new VBox(10);
        refMachine = new TextField();
        dMachine = new TextField();
        x = new TextField();
        y = new TextField();
        cout = new TextField();
        type = new TextField();

        champs.getChildren().addAll(
            new Label("Référence de la machine :"), refMachine,
            new Label("Description :"), dMachine,
            new Label("Coordonnée X :"), x,
            new Label("Coordonnée Y :"), y,
            new Label("Coût horaire :"), cout,
            new Label("Type de machine :"), type ,
            resultat
        );

        this.setCenter(champs);
        creer = new Button("Créer la machine");
        home = new Button("HOME");
        carte=new Button ("Carte");
        this.setRight(home);
        this.setLeft(carte);
        this.setBottom(creer);
    }

    public TextField getRefMachine() {
        return refMachine;
    }

    public TextField getdMachine() {
        return dMachine;
    }

    public TextField getX() {
        return x;
    }

    public TextField getY() {
        return y;
    }

    public TextField getCout() {
        return cout;
    }

    public TextField getType() {
        return type;
    }

    public Button getCreer() {
        return creer;
    }
    
    public Label getResultat() {
        return resultat;
}

    public Button getHome() {
        return home;
    }
    public Button getCarte() {
        return carte;
    }
    public Scene getFenêtre_creation_machine(){
         return new Scene(this, 700, 500);
    }
}