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
public class Calculer extends BorderPane {
   private Button duréegamme;
    private Button coutgamme;
    private Button home;
   
    
    public Calculer (){
        duréegamme = new Button("Durée de gamme");
        coutgamme = new Button("Cout d'une gamme ");
        home = new Button("HOME");
        Label question = new Label("Que voulez-vous faire ?");
    
        this.setTop(question);
        VBox milieu = new VBox(5); 
        milieu.getChildren().addAll(duréegamme, coutgamme);
        this.setCenter(milieu);
        this.setRight(home);
    
    }

    public Button getBtnCoutgamme() {
        return coutgamme;
    }

    public Button getBtnDureegamme() {
        return duréegamme;
    }

    public Button getBtnHome() {
        return home;
    }
 
    public Scene getFenêtre_Calculer_Atelier(){
         return new Scene(this, 600, 400);
    }  
}
 

