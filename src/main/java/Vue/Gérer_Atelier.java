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
    private Button home;
    private Button poste;
    private Button gamme;
   private Button stock_produits_finis;
    private Button stock_brut;
    private Button machine;
    private Button produit;
    private Button opérateur;
    
    
    public Gérer_Atelier (){
        home = new Button("HOME");
         machine = new Button("Machines");
         poste = new Button("Postes");
         gamme = new Button("Gammes");
         stock_produits_finis = new Button("Stock des produits finis");
         stock_brut = new Button("Stock brut");
         produit= new Button ("Produit");
         opérateur=new Button ("Opérateur");
         
        Label question = new Label("Que voulez-vous gérer ?");
    
        this.setTop(question);
        VBox milieu = new VBox(5); 
        milieu.getChildren().addAll(machine, gamme, poste, stock_produits_finis, stock_brut, produit, opérateur);
        this.setCenter(milieu);
        this.setRight(home);
    
    }

    public Button getBtnMachine() {
        return machine;
    }
public Button getBtnProduit() {
        return produit;
    }
public Button getBtnOpérateur() {
        return opérateur;
    }
    

    public Button getBtnPoste() {
        return poste;
    }

    public Button getBtnGamme() {
        return gamme;
    }

    
    public Button getBtnStock_produits_finis() {
        return stock_produits_finis;
    }

    public Button getBtnStock_brut() {
        return stock_brut;
    }

    public Button getBtnHome() {
        return home;
    }  
    
    public Scene getFenêtre_Gérer_Atelier(){
         return new Scene(this, 600, 400);
    }  
}

