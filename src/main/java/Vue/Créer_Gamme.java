/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author lisaa
 */
public class Créer_Gamme extends BorderPane {
         private Button home;
    
    
    public Créer_Gamme(){
        
        
        home = new Button("HOME");
        Label qui = new Label("Quelle machine voulez-vous supprimer?");
    
        this.setTop(qui);
        
        HBox bas = new HBox(10); // 10 = espacement entre les boutons
        bas.getChildren().addAll();
        this.setCenter(bas);
        this.setRight(home);
    }
    
   
    
      
   
    
    public Button getBtnHome(){
        return home;
    }
   
    public Scene getFenêtre_Créer_Gamme(){
         return new Scene(this, 600, 400);
    }

}
