/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Modele.Equipement;
import Modele.Gamme;
import Modele.Machine;
import Modele.Operation;
import Modele.Poste;
import java.util.ArrayList;
import java.util.List;
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
public class Ajout_Suppression_Operation_Gamme extends BorderPane{
    private Button home ; 
    private Button ajouter, supprimer ;
    private ComboBox<Gamme> comboGamme;
    List<Equipement> equipements = new ArrayList<>();
    private ComboBox<Equipement> comboEquipement;
    private Label choixGamme, choixEquipement, erreur ;
    
    public Ajout_Suppression_Operation_Gamme() {
        home = new Button ("HOME");
        ajouter = new Button ("AJOUTER");
        supprimer = new Button("SUPPRIMER");
        choixEquipement = new Label("Quel équipement voulez vous ajouter/supprimer?");
        choixGamme = new Label("sélectionnez une Gamme");
        erreur = new Label(" ");  
        List<Equipement> equipements = new ArrayList<>();
        equipements.addAll(Machine.getListeMachines());
        equipements.addAll(Poste.getListePostes());

        comboEquipement.getItems().addAll(equipements);
        comboGamme = new ComboBox<>();
        comboGamme.getItems().addAll(Gamme.getListeGammes());
        
        VBox champs = new VBox(15);
        champs.getChildren().addAll(
            choixGamme, comboGamme, choixEquipement, comboEquipement, ajouter, supprimer, erreur);      
         this.setCenter(champs);
            
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

    public ComboBox<Equipement> getComboEquipement() {
      return comboEquipement;
    }

    public ComboBox<Gamme> getComboGamme() {
        return comboGamme;
    }

    public Label getErreur() {
        return erreur;
    }
    
    public Scene getFenêtre_Ajout_Suppression_Operation_Gamme(){
         return new Scene(this, 600, 400);
    }
}
