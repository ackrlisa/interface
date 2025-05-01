/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
/**
 *
 * @author lisaa
 */
public class Gérer_Atelier extends BorderPane {
       private Button créer;
    private Button home;
    private Button modifier;
    private Button supprimer;
   
    
    public Gérer_Atelier (){
        home = new Button("HOME");
        créer = new Button("Créer ");
        modifier = new Button("Modifier");
        supprimer = new Button("Supprimer");
        Label question = new Label("Que voulez-vous faire ?");
    
        this.setTop(question);
        VBox milieu = new VBox(5); 
        milieu.getChildren().addAll(créer, supprimer, modifier);
        this.setCenter(milieu);
        this.setRight(home);
    
    }

    public Button getBtnCréer() {
        return créer;
    }

    public Button getBtnModifier() {
        return modifier;
    }

    public Button getBtnSupprimer() {
        return supprimer;
    }

  
    
    
    public Scene getFenêtre_Gérer_Atelier(){
         return new Scene(this, 600, 400);
    }  
}

