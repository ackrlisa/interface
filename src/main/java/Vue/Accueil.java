/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;
//import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
//import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;

/**
 *
 * @author PC
 */
public class Accueil extends BorderPane {
    private Button maintenance;
    private Button chefAtelier;
    private Button operateur;
    private Button carte;
    
    public Accueil (){
        maintenance = new Button("Maintenance");
        chefAtelier = new Button("Chef d'atelier");
        operateur = new Button("Operateur");
        carte= new Button("Carte");
        Label qui = new Label("Bonjour, qui êtes vous?");
    
        this.setTop(qui);
        
        HBox bas = new HBox(10); // 10 = espacement entre les boutons
        bas.getChildren().addAll(maintenance, chefAtelier, operateur);
        this.setCenter(bas);
        this.setRight(carte);
    }
    
    public BorderPane getAccueil() {
        return this;
    }
    
    public Button getBtnMaintenance(){
        return maintenance;
    }
     public Button getBtnCarte(){
        return carte;
    }
    
    public Button getBtnOperateur(){
        return operateur;
    }
    
    public Button getBtnChefAtelier(){
        return chefAtelier;
    }
   
    public Scene getFenêtre_accueil(){
         return new Scene(this, 600, 400);
    }
}
