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
import javafx.scene.layout.VBox;

/**
 *
 * @author lisaa
 */
public class Fiabilite_Atelier extends BorderPane{
    private Button fiabilite_par_machine, ordrefiabilite, home, inserer;
    TextField chemin_acces = new TextField();
    Label ok = new Label("");
    Label reponse = new Label("");
    
    public Fiabilite_Atelier (){
        home = new Button("HOME");
        fiabilite_par_machine = new Button("Fiabilité des machines");
        ordrefiabilite = new Button("Ordre de fiabilité");
        inserer = new Button("Inserer");
   
        VBox milieu = new VBox(5); 
        milieu.getChildren().addAll(fiabilite_par_machine, ordrefiabilite, reponse);
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

    public Button getBtnInserer() {
        return inserer;
    }
    
    public TextField getChemin_acces() {
        return chemin_acces;
    }

    public Label getOk (){
        return ok;
    }
    
    public Label getReponse (){
        return reponse;
    }
}
