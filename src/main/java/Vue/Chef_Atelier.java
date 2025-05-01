/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
/**
 *
 * @author lisaa
 */
public class Chef_Atelier extends BorderPane{
    private Button home;
    private Button gérer_atelier;
    private Button calculer;
    private Button affichage;
            
    public Chef_Atelier(){
        home = new Button("HOME");
        calculer= new Button ("Calculer");
        gérer_atelier = new Button("Gérer l'atelier");
        affichage = new Button("afficher l'atelier de fabrication");
        Label titre = new Label("Que voulez-vous faire?");
        
        this.setTop(titre);
        VBox milieu = new VBox(5); 
        milieu.getChildren().addAll(affichage, gérer_atelier, calculer);
        this.setCenter(milieu);
        this.setRight(home);
    }
    
    public Button getBtnHome() {
        return home;
    }
    
       public Button getBtnCalculer() {
        return calculer;
    }

    public Button getBtnAffichage() {
        return affichage;
    }
    public Button getBtnGérer_atelier() {
        return gérer_atelier;
    }

   public Scene getFenêtre_chefAtelier(){
         return new Scene(this, 600, 400);
    }
}
