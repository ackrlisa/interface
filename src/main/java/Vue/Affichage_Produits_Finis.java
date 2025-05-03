/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;


import Modele.ProduitsFinis;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author alicedeboever
 */
public class Affichage_Produits_Finis extends BorderPane {
    private Button home ; 
    private Button afficher ;
    private ComboBox<ProduitsFinis> comboProduitsFinis;
    private Label affichageProduitsFinis ;

    public Affichage_Produits_Finis() {
        home = new Button ("HOME");
        afficher = new Button ("Afficher");
        affichageProduitsFinis = new Label();
        comboProduitsFinis = new ComboBox<>();
        comboProduitsFinis.getItems().addAll(ProduitsFinis.getListeProduitsFinis());
        
        Label question = new Label("Quel produit fini voulez vous afficher ?");
        this.setTop(question);
        
        VBox centre = new VBox(10);
        centre.getChildren().addAll(comboProduitsFinis, afficher, affichageProduitsFinis);
        this.setCenter(centre);

        // Partie droite : bouton HOME
        this.setRight(home);
        
        
    }

    public Button getBtnHome() {
        return home;
    }

    public Button getBtnAfficher() {
        return afficher;
    }

    public ComboBox<ProduitsFinis> getComboProduitsFinis() {
        return comboProduitsFinis;
    }

    public Label getAffichageProduitsFinis() {
        return affichageProduitsFinis;
    }
    
    public Scene getFenêtre_affichage_produits_finis(){
         return new Scene(this, 600, 400);
    }
    
}
