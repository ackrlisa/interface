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
    private Button ajout_supprimer_équiop;
        private Button home;
    
    public Modification_Gamme(){
        ajout_supprimer_équiop = new Button("Ajouter/supprimer une machines donc opération(s) à la gamme");
        home= new Button ("HOME");
        Label qui = new Label("Que voulez-vous modifier");
    
        this.setTop(qui);
        
        VBox milieu = new VBox(10); // 10 = espacement entre les boutons
        milieu.getChildren().addAll(ajout_supprimer_équiop);
        this.setCenter(milieu);
        this.setRight(home);
    }

    public Button getBtnAjout_supprimer_équiop() {
        return ajout_supprimer_équiop;
    }


    public Button getBtnHome() {
        return home;
    }
    public Scene getFenêtre_Modification_Gamme(){
         return new Scene(this, 600, 400);
    }
}

