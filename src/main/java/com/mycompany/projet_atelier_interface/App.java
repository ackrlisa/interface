package com.mycompany.projet_atelier_interface;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
        
        Accueil accueil = new Accueil();
        Scene scene2 = new Scene(accueil, 400, 300);
        stage.setTitle("fenêtre Accueil");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        
    }

}