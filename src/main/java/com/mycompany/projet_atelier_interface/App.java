package com.mycompany.projet_atelier_interface;

import javafx.application.Application;
import javafx.stage.Stage;
import Controleur.Fenêtre_Accueil;
import Modele.ModèleCarte;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        ModèleCarte modeleCarte=new ModèleCarte();
        new Fenêtre_Accueil(stage,modeleCarte); //Lance le controleur
        
       
        
               
    }

    public static void main(String[] args) {
        launch(args);
        
    }

}