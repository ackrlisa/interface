/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author lisaa
 */
public class Modification_Gamme extends BorderPane{
    private Button ajoutéquiop;
    private Button supprimeréquiop;
        private Button home;
    
    public Modification_Gamme(){
        ajoutéquiop = new Button("Ajouter un équipement donc opération à la gamme");
        supprimeréquiop = new Button("Supprimer un équipement donc opération de la gamme");
        home= new Button ("HOME");
        Label qui = new Label("Que voulez-vous modifier");
    
        this.setTop(qui);
        
        VBox milieu = new VBox(10); // 10 = espacement entre les boutons
        milieu.getChildren().addAll(ajoutéquiop, supprimeréquiop);
        this.setCenter(milieu);
        this.setRight(home);
    }

    public Button getBtnAjoutéquiop() {
        return ajoutéquiop;
    }

    public Button getBtnSupprimeréquiop() {
        return supprimeréquiop;
    }

       
    public Button getBtnHome() {
        return home;
    }
    public Scene getFenêtre_Modification_Gamme(){
         return new Scene(this, 600, 400);
    }
}

