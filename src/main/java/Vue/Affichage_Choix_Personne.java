/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
/**
 *
 * @author alicedeboever
 */
public class Affichage_Choix_Personne extends BorderPane{
    private Button operateur, chefAtelier, home;
    
    public Affichage_Choix_Personne (){
        operateur = new Button("Operateurs");
        chefAtelier = new Button("Chef d'Atelier ");
        home = new Button("HOME");
        Label question = new Label("Quel type de personnel souhaitez vous afficher ?");
    
        this.setTop(question);
        VBox milieu = new VBox(5); 
        milieu.getChildren().addAll(operateur, chefAtelier);
        this.setCenter(milieu);
        this.setRight(home);
    
    }

    public Button getBtnOperateur() {
        return operateur;
    }

    public Button getBtnChefAtelier() {
        return chefAtelier;
    }

    public Button getBtnHome() {
        return home;
    }
 
    public Scene getFenêtre_affichage_choix_personne(){
         return new Scene(this, 600, 400);
    }  
}
