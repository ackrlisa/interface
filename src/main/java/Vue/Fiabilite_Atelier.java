/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author lisaa
 */
public class Fiabilite_Atelier extends BorderPane{
    private Button fiabilite_par_machine;
    private Button ordrefiabilite;
    private Button home;
    
    public Fiabilite_Atelier (){
        home = new Button("HOME");
        fiabilite_par_machine = new Button("Fiabilité des machines");
        ordrefiabilite = new Button("Ordre de fiabilité");
    
    Label question = new Label("Que voulez-vous afficher ?");
    
        this.setTop(question);
        VBox milieu = new VBox(5); 
        milieu.getChildren().addAll(ordrefiabilite, fiabilite_par_machine);
        this.setCenter(milieu);
        this.setRight(home);
    
    }
    public Button getBtnOrdrefiabilite() {
        return ordrefiabilite;
    }

    public Button getBtnFiabilite_par_machine() {
        return fiabilite_par_machine;
    }

    public Button getBtnHome() {
        return home;
    }
public Scene getFenêtre_Fiabilite_Atelier(){
         return new Scene(this, 600, 400);
    } 

}
