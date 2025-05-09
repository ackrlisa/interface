package com.mycompany.projet_atelier_interface;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import Controleur.Fenêtre_Accueil;
import Controleur.Fenêtre_Calcul_Duree_Gamme ;
import Controleur.Fenêtre_Affichage_Poste ; 
import Controleur.Fenêtre_CarteFx;
import Modele.ModèleCarte;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        //var javaVersion = SystemInfo.javaVersion();
        //var javafxVersion = SystemInfo.javafxVersion();
        //var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        //var scene = new Scene(new StackPane(label), 640, 480);
        //stage.setScene(scene);
        //stage.show();
        ModèleCarte modeleCarte=new ModèleCarte();
        new Fenêtre_Accueil(stage,modeleCarte); //Lance le controleur
        
       
        
               
    }

    public static void main(String[] args) {
        launch(args);
        
    }

}