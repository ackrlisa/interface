/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import Modele.ModèleCarte;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class CarteFx  {
    private Stage stage;
    private Carte vueCarte;

    public CarteFx(ModèleCarte modeleCarte) {
        stage = new Stage();
        stage.setTitle("Carte de l'atelier");

        vueCarte = new Carte(modeleCarte);
        Scene scene = new Scene(vueCarte, 900, 900);
        stage.setScene(scene);
    }

    public void show() {
        stage.show();
    }

    public void close() {
        stage.close();
    }

    public boolean estVisible() {
        return stage.isShowing();
    }

    public void rafraichirCarte() {
        vueCarte.rafraichirCarte();
    }

    public void toFront() {
        stage.toFront();
    }
}