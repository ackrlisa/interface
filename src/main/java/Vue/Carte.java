/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;
import Modele.Machine;
import Modele.ModèleCarte;
import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


/**
 *
 * @author lisaa
 */
public class Carte extends BorderPane {      
    private Pane cartePane;
    private ModèleCarte modeleCarte;
    private int echelle = 10; // Conversion unités en pixels

    public Carte(ModèleCarte modeleCarte) {
        this.modeleCarte = modeleCarte;

        // Titre
        Label titre = new Label("Carte de l'atelier de fabrication");
       titre.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        // Conteneur pour centrer le titre
        StackPane titrePane = new StackPane(titre);
        titrePane.setPadding(new Insets(10, 0, 10, 0)); // Marges pour espacer le titre
        setTop(titrePane);

        // Pane pour les machines
        cartePane = new Pane();
        setCenter(cartePane);

        // Rafraîchir pour afficher les machines
        rafraichirCarte();
    }

    public void rafraichirCarte() {
        cartePane.getChildren().clear();
        for (Machine machine : modeleCarte.getMachines()) {
            ajouterMachineaCarte(machine);
        }
    }

    private void ajouterMachineaCarte(Machine machine) {
        double x = machine.getX() * echelle;
        double y = machine.getY() * echelle;

        Rectangle rectMachine = new Rectangle(x, y, 30, 30);
        rectMachine.setFill(Color.PINK);
        rectMachine.setStroke(Color.BLACK);

        // Créer le texte pour la référence de la machine
    Text textRef = new Text(machine.getRefMachine());
    textRef.setFill(Color.BLACK);
    textRef.setStyle("-fx-font-size: 12px;"); // Enlève le gras en supprimant `font-weight: bold`

   // Positionner le texte au-dessus du rectangle
    textRef.setX(x + 15 - textRef.getBoundsInLocal().getWidth() / 2); // Centrer horizontalement
    textRef.setY(y - 5); // Placer juste au-dessus du rectangle

    // Positionner le rectangle
    rectMachine.setX(x);
    rectMachine.setY(y);

    // Ajouter le rectangle et le texte à la carte
    cartePane.getChildren().addAll(rectMachine, textRef);
    }

    public void setEchelle(int echelle) {
        this.echelle = echelle;
        rafraichirCarte();
    }
}

  

