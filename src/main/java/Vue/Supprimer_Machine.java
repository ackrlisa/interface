/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Modele.Machine;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author lisaa
 */
public class Supprimer_Machine extends BorderPane{
    private Button supprimer;
    private Button home;
    private ComboBox<Machine> comboMachine;
    private Label resultat ;
    
    public Supprimer_Machine (){
        home = new Button ("HOME");
        supprimer = new Button ("Supprimer");
        resultat = new Label();
        comboMachine = new ComboBox<>();
        comboMachine.getItems().addAll(Machine.getListeMachines());
        
        Label question = new Label("Quelle est  la machine que vous souahitez supprimer ?");
        this.setTop(question);
        
        VBox centre = new VBox(10);
        centre.getChildren().addAll(comboMachine, supprimer, resultat);
        this.setCenter(centre);

        this.setRight(home);
    }
        public Button getBtnHome() {
        return home;
    }

    public Button getBtnSupprimer() {
        return supprimer;
    }

    public ComboBox<Machine> getComboMachine() {
        return comboMachine;
    }

    public Label getResultat() {
        return resultat;
    }
    
    public Scene getFenêtre_Supprimer_Machine(){
         return new Scene(this, 600, 400);
    }
    
}
   
    
      
   