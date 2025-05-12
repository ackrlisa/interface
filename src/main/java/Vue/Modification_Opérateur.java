/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
/**
 *
 * @author lisaa
 */
public class Modification_Opérateur extends BorderPane {
    private ComboBox<Operateur> comboOpérateurs;
    private TextField statut;
    private Button modifierStatut, home, occupé, libre;
    private Label erreur;

    public Modification_Opérateur() {
        // Titre
        Label titre = new Label("Modification du statut d’un opérateur");
        this.setTop(new VBox(titre));
        BorderPane.setAlignment(titre, javafx.geometry.Pos.CENTER);

        // Sélecteur d'opérateurs
        comboOpérateurs = new ComboBox<>();
        VBox selecteur = new VBox(10);
        selecteur.getChildren().addAll(new Label("Sélectionnez un opérateur :"), comboOpérateurs);
        this.setTop(selecteur);

        // Boutons pour modifier le statut
        occupé = new Button("Occupé");
        libre = new Button("Libre");
        HBox statutButtons = new HBox(10, occupé, libre);

        // Messages d'erreur ou confirmation
        erreur = new Label();

        VBox actions = new VBox(10, statutButtons, erreur);
        this.setCenter(actions);

        // Bouton HOME
        home = new Button("HOME");
        this.setRight(home);
    }

    public ComboBox<Operateur> getComboOpérateur() {
        return comboOpérateurs;
    }

    public Button getBtnOccupé() {
        return occupé;
    }

    public Button getBtnLibre() {
        return libre;
    }

    public Button getHome() {
        return home;
    }

    public Label getErreur() {
        return erreur;
    }

    public Scene getFenêtre_Modification_Opérateur() {
        return new Scene(this, 600, 450);
    }

    public Object getComboOpérateurs() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
