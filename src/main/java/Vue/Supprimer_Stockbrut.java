/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Modele.Element;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author alicedeboever
 */
public class Supprimer_Stockbrut extends BorderPane{
    private Button home ; 
    private Button supprimer ;
    private TextField quantiteASupprimer ;
    private ComboBox<Element> comboElement;
    private Label resultat, questionQuantite ;

    public Supprimer_Stockbrut() {
        home = new Button ("HOME");
        supprimer = new Button ("Supprimer");
        resultat = new Label();
        questionQuantite = new Label("Quel quantité de ce produit voulez vous supprimer");
        comboElement = new ComboBox<>();
        comboElement.getItems().addAll(Element.getListeStockBrut());
        
        quantiteASupprimer = new TextField();

        Label question = new Label("Quel produit fini voulez vous supprimer ?");
        this.setTop(question);
        
        VBox centre = new VBox(10);
        centre.getChildren().addAll(comboElement, questionQuantite, quantiteASupprimer, supprimer, resultat);
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

    public ComboBox<Element> getComboElement() {
        return comboElement;
    }

    public Label getResultat() {
        return resultat;
    }

    public TextField getQuantiteASupprimer() {
        return quantiteASupprimer;
    }
    
    
    
    public Scene getFenêtre_supprimer_stockbrut(){
         return new Scene(this, 600, 400);
    }
}
