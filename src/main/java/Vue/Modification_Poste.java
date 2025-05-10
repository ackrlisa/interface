/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Modele.Machine;
import Modele.Poste;
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
public class Modification_Poste extends BorderPane{
    private Button home ; 
    private Button ajouter, supprimer ;
    private ComboBox<Machine> comboMachine;
    private ComboBox<Poste> comboPoste;
    private Label choixMachine, choixPoste, erreur ;
    
    public Modification_Poste() {
        home = new Button ("HOME");
        ajouter = new Button ("AJOUTER");
        supprimer = new Button("SUPPRIMER");
        choixPoste = new Label("Quel poste voulez-vous modifier");
        choixMachine = new Label("Quelle machine voulez-vous ajouter/supprimer?");
        erreur = new Label(" ");       
        comboMachine = new ComboBox<>();
        comboMachine.getItems().addAll(Machine.getListeMachines());
        comboPoste = new ComboBox<>();
        comboPoste.getItems().addAll(Poste.getListePostes());
        
        VBox champs = new VBox(15);
        champs.getChildren().addAll(
            choixPoste, comboPoste, choixMachine, comboMachine, ajouter, supprimer, erreur);      
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

    public Label getChoixMachine() {
        return choixMachine;
    }

    public Label getErreur() {
        return erreur;
    }
    
    public ComboBox<Machine> getComboMachine() {
        return comboMachine;
    }
    
    public ComboBox<Poste> getComboPoste() {
        return comboPoste;
    }

    public Scene getFenêtre_Modification_Poste(){
         return new Scene(this, 600, 400);
    }
}
