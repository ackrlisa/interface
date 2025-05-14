/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Modele.Machine;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
/**
 *
 * @author alicedeboever
 */
public class Creation_Poste extends BorderPane {
    private TextField refPoste, dPoste;
    private ComboBox<Machine> comboMachines;
    private Button ajouterMachine, creerPoste, home;
    private TextArea machinesAjoutees;
    private Label resultat;

    public Creation_Poste() {
        Label titre = new Label("Création d’un nouveau poste");
        this.setTop(titre);

        VBox champs = new VBox(10);

        refPoste = new TextField();
        dPoste = new TextField();
        comboMachines = new ComboBox<>();
        ajouterMachine = new Button("Ajouter au poste");
        machinesAjoutees = new TextArea();
        machinesAjoutees.setEditable(false);

        resultat = new Label();

        creerPoste = new Button("Créer le poste");
        home = new Button("HOME");

        champs.getChildren().addAll(
            new Label("Référence du poste :"), refPoste,
            new Label("Description du poste :"), dPoste,
            new Label("Ajouter une machine au poste :"),
            comboMachines, ajouterMachine,
            new Label("Machines ajoutées :"), machinesAjoutees,
            resultat
        );

        this.setCenter(champs);
        this.setBottom(creerPoste);
        this.setRight(home);
    }

    public TextField getRefPoste() {
        return refPoste;
    }

    public TextField getdPoste() {
        return dPoste;
    }

    public ComboBox<Machine> getComboMachines() {
        return comboMachines;
    }

    public Button getAjouterMachine() {
        return ajouterMachine;
    }

    public Button getCreerPoste() {
        return creerPoste;
    }

    public Button getHome() {
        return home;
    }

    public TextArea getMachinesAjoutees() {
        return machinesAjoutees;
    }

    public Label getResultat() {
        return resultat;
    }

    public Scene getFenetreCreationPoste() {
        return new Scene(this, 600, 450);
    }
}
