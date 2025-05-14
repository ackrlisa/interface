/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import Modele.Operation;
import Modele.Equipement;
/**
 *
 * @author lisaa
 */
public class Créer_Gamme extends BorderPane {
    private TextField refGamme ;
    private Button creer, home, ajouterOperation, ajouterEquipement;
    private ComboBox<Operation> comboOperation;
    private ComboBox<Equipement> comboEquipement;
    private TextArea operationAjoutees, equipementAjoutes;
    private Label resultat;

    public Créer_Gamme() {
        Label titre = new Label("Création d'une nouvelle gamme");
        this.setTop(titre);
        VBox champs = new VBox(10);
        refGamme = new TextField();
        comboOperation = new ComboBox<>();
        ajouterOperation = new Button("Ajouter l'opération à la gamme");
        operationAjoutees = new TextArea();
        operationAjoutees.setEditable(false);
        comboEquipement = new ComboBox<>();
        ajouterEquipement = new Button("Ajouter l'équipement à la gamme");
        equipementAjoutes = new TextArea();
        equipementAjoutes.setEditable(false);
        resultat = new Label();
        creer = new Button("Créer la gamme");
        home = new Button("HOME");
        champs.getChildren().addAll(
            new Label("Référence de la gamme :"), refGamme,
            new Label("Ajouter une opération à la gamme  :"),
            comboOperation, ajouterOperation,
            new Label("Opération ajoutées :"), operationAjoutees,
            new Label("Ajouter un équipement à la gamme  :"),
            comboEquipement, ajouterEquipement,
            new Label("Équipement ajoutés :"), equipementAjoutes,
            resultat
        );

        this.setCenter(champs);
        creer = new Button("Créer la gamme");
        home = new Button("HOME");
        this.setRight(home);
        this.setBottom(creer);
        this.setRight(home);
        
    }

    public TextField getRefGamme() {
        return refGamme;
    }

    public Button getCreer() {
        return creer;
    }

    public Button getHome() {
        return home;
    }

    public Button getAjouterOperation() {
        return ajouterOperation;
    }

    public Button getAjouterEquipement() {
        return ajouterEquipement;
    }

    public ComboBox<Operation> getComboOperation() {
        return comboOperation;
    }

    public ComboBox<Equipement> getComboEquipement() {
        return comboEquipement;
    }

    public TextArea getOperationAjoutees() {
        return operationAjoutees;
    }

    public TextArea getEquipementAjoutes() {
        return equipementAjoutes;
    }

    public Label getResultat() {
        return resultat;
    }
 
    public Scene getFenêtre_Créer_Gamme(){
         return new Scene(this, 600, 400);
    }
}
