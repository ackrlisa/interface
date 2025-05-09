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
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author PC
 */
public class Modification_Identite_Machine extends BorderPane{
    private Button home ; 
    private Button ok ;
    private ComboBox<Machine> comboMachine;
    private Label choixMachine, erreur ;
    private TextField refMachine, dMachine, x, y, cout, type;

    public Modification_Identite_Machine() {
        home = new Button ("HOME");
        ok = new Button ("OK");
        choixMachine = new Label("sélectionnez la machine dont vous voulez modifier l'identite");
        
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
            new Label("Type de machine :"), type, ok, erreur);
        
         this.setCenter(champs);
        
        comboMachine = new ComboBox<>();
        comboMachine.getItems().addAll(Machine.getListeMachines());
                
        VBox centre = new VBox(10);
        centre.getChildren().addAll(choixMachine, comboMachine);
        this.setTop(centre);

        // Partie droite : bouton HOME
        this.setRight(home);      
    }

    public Label getBtnErreur() {
        return erreur;
    }

    public Button getBtnHome() {
        return home;
    }

    public Button getBtnOk() {
        return ok;
    }

    public ComboBox<Machine> getComboMachine() {
        return comboMachine;
    }

    public Label getChoixMachine() {
        return choixMachine;
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
   
    public Scene getFenêtre_modification_identite_machine(){
         return new Scene(this, 600, 400);
    }
    
}
