/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Modele.Machine;
import Modele.Operation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author PC
 */
public class Ajout_Operation_Machine extends BorderPane{
    private Button home ; 
    private Button ajouter, supprimer ;
    private ComboBox<Machine> comboMachine;
    private ComboBox<Operation> comboOperation;
    private Label choixMachine, choixOperation, erreur ;
    
    public Ajout_Operation_Machine() {
        home = new Button ("HOME");
        ajouter = new Button ("AJOUTER");
        supprimer = new Button("SUPPRIMER");
        choixOperation = new Label("Quelle opération voulez vous ajouter/supprimer?");
        choixMachine = new Label("sélectionnez une machine");
        erreur = new Label(" ");       
        comboMachine = new ComboBox<>();
        comboMachine.getItems().addAll(Machine.getListeMachines());
        comboOperation = new ComboBox<>();
        comboOperation.getItems().addAll(Operation.getListeOperations());
        
        VBox champs = new VBox(15);
        champs.getChildren().addAll(
            choixMachine, comboMachine, choixOperation, comboOperation, ajouter, supprimer, erreur);      
         this.setCenter(champs);
            
        // Partie droite : bouton HOME
        this.setRight(home);      
    }

    public Button getBtnHome() {
        return home;
    }

    public Button getBtnAjouter() {
        return ajouter;
    }

    public Button getBtnSupprimer() {
        return supprimer;
    }

    public ComboBox<Machine> getComboMachine() {
        return comboMachine;
    }

    public ComboBox<Operation> getComboOperation() {
        return comboOperation;
    }

    public Label getErreur() {
        return erreur;
    }
    
    public Scene getFenêtre_Ajout_Operation_Machine(){
         return new Scene(this, 600, 400);
    }
}
