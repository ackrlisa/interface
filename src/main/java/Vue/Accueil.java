/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.application.Application;

/**
 *
 * @author PC
 */
public class Accueil extends BorderPane {
    private Button maintenance;
    private Button chefAtelier;
    private Button operateur;
    
    public Accueil (){
        maintenance = new Button("Maintenance");
        chefAtelier = new Button("Chef d'atelier");
        operateur = new Button("Operateur");
        Label qui = new Label("Bonjour, qui êtes vous?");
    
        this.setTop(qui);
        
        HBox bas = new HBox(10); // 10 = espacement entre les boutons
        bas.getChildren().addAll(maintenance, chefAtelier, operateur);
        this.setCenter(bas);
    }
    
    public BorderPane getAccueil() {
        return this;
    }
    
    public Button getBtnMaintenance(){
        return maintenance;
    }
   
    public Scene getFenêtre_accueil(){
         return new Scene(this, 600, 400);
    }
}
