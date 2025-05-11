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
public class Modification_Machine extends BorderPane{
    private Button identité;
    private Button état;
    private Button ajoutopération;
    private Button suppressionopération;
    private Button home;
    
    public Modification_Machine(){
        identité = new Button("Modifier l'identité de la machine");
        état = new Button("Modifier l'état de la machine");
        ajoutopération = new Button("Ajouter/Supprimer une opération à la machine");
        home= new Button ("HOME");
        Label qui = new Label("Que voulez-vous modifier?");
    
        this.setTop(qui);
        
        VBox milieu = new VBox(10); // 10 = espacement entre les boutons
        milieu.getChildren().addAll(identité, état, ajoutopération);
        this.setCenter(milieu);
        this.setRight(home);
    }

    public Button getBtnAjoutopération() {
        return ajoutopération;
    }

    public Button getBtnIdentité() {
        return identité;
    }
    public Button getBtnEtat() {
        return état;
    }
    public Button getBtnHome() {
        return home;
    }
    public Scene getFenêtre_Modification_Machine(){
         return new Scene(this, 600, 400);
    }
}
