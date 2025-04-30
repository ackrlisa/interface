/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.application.Application;

/**
 *
 * @author PC
 */
public class Accueil extends BorderPane {
    public void Accueil (Stage primaryStage){
        BorderPane accueil = new BorderPane();
        Button maintenance = new Button("Maintenance");
        Button chefAtelier = new Button("Chef d'atelier");
        Button operateur = new Button("Operateur");
        Label qui = new Label("Bonjour, qui êtes vous?");
    
        accueil.setCenter(qui);
        accueil.setLeft(maintenance);
        
        
    
    }
}
