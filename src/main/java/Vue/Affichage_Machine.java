/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;
import Modele.Machine;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
/**
 *
 * @author alicedeboever
 */
public class Affichage_Machine extends BorderPane {
    private Button home ; 
    private Button afficher ;
    private ComboBox<Machine> comboMachine;
    private Label affichageMachine ;

    public Affichage_Machine() {
        home = new Button ("HOME");
        afficher = new Button ("Afficher");
        affichageMachine = new Label();
        comboMachine = new ComboBox<>();
        comboMachine.getItems().addAll(Machine.getListeMachines());
        
        Label question = new Label("Quelle est  la machine que vous souahitez afficher ?");
        this.setTop(question);
        
        VBox centre = new VBox(10);
        centre.getChildren().addAll(comboMachine, afficher, affichageMachine);
        this.setCenter(centre);

        // Partie droite : bouton HOME
        this.setRight(home);
        
        
    }

    public Button getBtnHome() {
        return home;
    }

    public Button getBtnAfficher() {
        return afficher;
    }

    public ComboBox<Machine> getComboMachine() {
        return comboMachine;
    }

    public Label getAffichageMachine() {
        return affichageMachine;
    }
    
    public Scene getFenêtre_affichage_machine(){
         return new Scene(this, 600, 400);
    }
    
}
