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
   private Label suppressionMachine ;
    
    public Supprimer_Machine (){
        
        supprimer = new Button("Supprimer machine");
        home = new Button("HOME");
        Label qui = new Label("Quelle machine voulez-vous supprimer?");
        suppressionMachine = new Label();
        comboMachine = new ComboBox<>();
        comboMachine.getItems().addAll(Machine.getListeMachines());    

        this.setTop(qui);
         VBox centre = new VBox(10);
        centre.getChildren().addAll(comboMachine, supprimer, suppressionMachine);
        this.setCenter(centre);
        HBox bas = new HBox(10); // 10 = espacement entre les boutons
        bas.getChildren().addAll(supprimer);
        this.setCenter(bas);
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

    public Label getSuppressionMachine() {
        return suppressionMachine;
    }
    
    public Scene getFenêtre_Supprimer_Machine(){
         return new Scene(this, 600, 400);
    }
    
}
   
    
      
   