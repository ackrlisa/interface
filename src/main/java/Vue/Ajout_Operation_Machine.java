/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Modele.Machine;
import Modele.Operation;
import Modele.Poste;
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
        choixMachine = new Label("Quelle machine voulez-vous ajouter/supprimer?");
        erreur = new Label(" ");       
        comboMachine = new ComboBox<>();
        comboMachine.getItems().addAll(Machine.getListeMachines());
        comboOperation = new ComboBox<>();
        comboOperation.getItems().addAll(Operation.getListeOperations());
        
        VBox champs = new VBox(15);
        champs.getChildren().addAll(
            choixOperation, comboOperation, choixMachine, comboMachine, ajouter, supprimer, erreur);      
         this.setCenter(champs);
   
                
        // Partie droite : bouton HOME
        this.setRight(home);      
    }
}
