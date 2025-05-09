/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Modele.Operation;
import Modele.Equipement;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author alicedeboever
 */
public class Creation_Opération extends BorderPane{
    private TextField refOperation, dOperation;
    private ComboBox<Equipement> comboEquipement;
    private Button ajouterEquipement, creerOperation, home;
    private TextArea equipementsAjoutes;
    private Label resultat;

    public Creation_Opération() {
        Label titre = new Label("Création d’un nouveau poste");
        this.setTop(titre);

        VBox champs = new VBox(10);

        refOperation = new TextField();
        dOperation = new TextField();

        comboEquipement = new ComboBox<>();
        ajouterEquipement = new Button("Ajouter à l'opération");

        equipementsAjoutes = new TextArea();
        equipementsAjoutes.setEditable(false);

        resultat = new Label();

        creerOperation = new Button("Créer le poste");
        home = new Button("HOME");

        champs.getChildren().addAll(
            new Label("Référence de l'opération :"), refOperation,
            new Label("Description de l'opératon :"), dOperation,
            new Label("Ajouter un équipement à l'opération :"),
            comboEquipement, ajouterEquipement,
            new Label("Équipement ajoutées :"), equipementsAjoutes,
            resultat
        );

        this.setCenter(champs);
        this.setBottom(creerOperation);
        this.setRight(home);
    }

    public TextField getRefOperation() {
        return refOperation;
    }

    public TextField getdOperation() {
        return dOperation;
    }

    public ComboBox<Equipement> getComboEquipement() {
        return comboEquipement;
    }

    public Button getAjouterEquipement() {
        return ajouterEquipement;
    }

    public Button getCreerOperation() {
        return creerOperation;
    }

    public Button getHome() {
        return home;
    }

    public TextArea getEquipementsAjoutes() {
        return equipementsAjoutes;
    }

    public Label getResultat() {
        return resultat;
    }

    

    public Scene getFenetreCreationOperation() {
        return new Scene(this, 600, 450);
    }
}
