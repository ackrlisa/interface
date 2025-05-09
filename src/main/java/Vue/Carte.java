/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;
import Modele.Machine;
import Modele.ModèleCarte;
import java.util.ArrayList;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
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
        setTop(titre);

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

        Text textRef = new Text(x + 5, y + 20, machine.getRefMachine());
        textRef.setFill(Color.BLACK);
        textRef.setStyle("-fx-font-weight: bold; -fx-font-size: 12px;");

        cartePane.getChildren().addAll(rectMachine, textRef);
    }

    public void setEchelle(int echelle) {
        this.echelle = echelle;
        rafraichirCarte();
    }
}

  

