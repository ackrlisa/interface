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
 * @author PC
 */
public class Affichage_Atelier extends BorderPane{
    private Button machine;
    private Button poste;
    private Button gamme;
    private Button personnel;
    private Button produits_finis;
    private Button stock_brut;
    private Button home;
    
    public Affichage_Atelier (){
        home = new Button("HOME");
        machine = new Button("Machines");
        poste = new Button("Postes");
        gamme = new Button("Gammes");
        personnel = new Button("Personnel");
        produits_finis = new Button("Produits finis");
        stock_brut = new Button("Stock brut");
        Label question = new Label("Que voulez-vous afficher ?");
    
        this.setTop(question);
        VBox milieu = new VBox(5); 
        milieu.getChildren().addAll(machine, gamme, poste, personnel, produits_finis, stock_brut);
        this.setCenter(milieu);
        this.setRight(home);
    
    }

    public Button getBtnMachine() {
        return machine;
    }

    

    public Button getBtnPoste() {
        return poste;
    }

    public Button getBtnGamme() {
        return gamme;
    }

    public Button getBtnPersonnel() {
        return personnel;
    }

    public Button getBtnProduits_finis() {
        return produits_finis;
    }

    public Button getBtnStock_brut() {
        return stock_brut;
    }

    public Button getBtnHome() {
        return home;
    }  
    
    public Scene getFenêtre_Affichage_Atelier(){
         return new Scene(this, 600, 400);
    }  
}
