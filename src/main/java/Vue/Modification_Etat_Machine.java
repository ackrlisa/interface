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
import javafx.scene.layout.VBox;

/**
 *
 * @author PC
 */
public class Modification_Etat_Machine extends BorderPane {
    private Button home ; 
    private Button operationnel, panne, maintenance,operationnel2 ;
    private Label choixEtat, choixMachine, erreur ;
    private ComboBox<Machine> comboMachine;
    
    public Modification_Etat_Machine() {
        home = new Button ("HOME");
        operationnel = new Button ("opérationnelle disponible");
        operationnel2 = new Button ("opérationnelle occupée");
        panne = new Button("en panne");
        maintenance = new Button("en maintenance");
        choixEtat = new Label("quel est le nouvel état de la machine?");
        choixMachine = new Label("sélectionnez une machine");
        erreur = new Label(" ");       
        comboMachine = new ComboBox<>();
        comboMachine.getItems().addAll(Machine.getListeMachines());
        
        VBox champs = new VBox(10);
        champs.getChildren().addAll(choixMachine, comboMachine, choixEtat, operationnel,operationnel2, panne, maintenance, erreur);      
         this.setCenter(champs);
   
                
        // Partie droite : bouton HOME
        this.setRight(home);      
    }

    public Button getBtnHome() {
        return home;
    }

    public Button getBtnOperationnel() {
        return operationnel;
    }
    public Button getBtnOperationnel2() {
        return operationnel2;
    }

    public Button getBtnPanne() {
        return panne;
    }

    public Button getBtnMaintenance() {
        return maintenance;
    }

    public Label getErreur() {
        return erreur;
    }

    public ComboBox<Machine> getComboMachine() {
        return comboMachine;
    }
    
    public Scene getFenêtre_Modification_Etat_Machine(){
         return new Scene(this, 600, 400);
    }
    
}
