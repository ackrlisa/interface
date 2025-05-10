/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Modele.Operateur;
import Modele.Operation;
import Modele.Poste;
import Vue.Carte;
import Vue.CarteFx;
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_CarteFx {
    private Stage stage;
    private Carte vueCarte;
    private CarteFx carteFx;
    private Stage stageCarte;
    private Fenêtre_Accueil accueil;

    public Fenêtre_CarteFx(Stage stage, ModèleCarte modeleCarte) {
        Carte vueCarte= new Carte (modeleCarte);
 // Titre de la fenêtre
    stage.setTitle("Carte de l'atelier");

    // Création du bouton "Accueil"
    Button btnRetourAccueil = new Button("Accueil");
    
    btnRetourAccueil.setOnAction(e -> {
        stage.close(); // Ferme la fenêtre de la carte
        Stage accueilStage = new Stage(); // Crée une nouvelle fenêtre pour l'accueil
        new Fenêtre_Accueil(accueilStage, modeleCarte); // Retourne à l'accueil
    });

    // Ajout des éléments à la scène
    BorderPane root = new BorderPane();
    root.setCenter(vueCarte); // Ajout de la vue de la carte au centre
    root.setBottom(btnRetourAccueil); // Ajout du bouton en bas

    // Configuration de la scène
    Scene scene = new Scene(root, 800, 800);
    stage.setScene(scene);
    stage.show(); // Affiche la fenêtre
}
public void fermerCarte(){
    if (stageCarte.isShowing()){
        stageCarte.close();
    }
}
    public void ouvrirCarte() {
        if (!stageCarte.isShowing()) {
            stageCarte.show();
                    } else {
            stage.toFront();
        }
    }
}