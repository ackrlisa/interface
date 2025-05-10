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
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author alicedeboever
 */
public class Supprimer_Stock_Produitfini extends BorderPane{
    private Button home ; 
    private Button supprimer ;
    private TextField quantiteASupprimer ;
    private ComboBox<ProduitsFinis> comboProduitsFinis;
    private Label resultat, questionQuantite ;

    public Supprimer_Stock_Produitfini() {
        home = new Button ("HOME");
        supprimer = new Button ("Afficher");
        resultat = new Label();
        questionQuantite = new Label("Quel quantité de ce produit voulez vous supprimer");
        comboProduitsFinis = new ComboBox<>();
        comboProduitsFinis.getItems().addAll(ProduitsFinis.getListeStockProduitsFinis());
        
        quantiteASupprimer = new TextField();

        Label question = new Label("Quel produit fini voulez vous supprimer ?");
        this.setTop(question);
        
        VBox centre = new VBox(10);
        centre.getChildren().addAll(comboProduitsFinis, questionQuantite, quantiteASupprimer, supprimer, resultat);
        this.setCenter(centre);

        // Partie droite : bouton HOME
        this.setRight(home);
        
        
    }

    public Button getBtnHome() {
        return home;
    }

    public Button getBtnSupprimer() {
        return supprimer;
    }

    public ComboBox<ProduitsFinis> getComboProduitsFinis() {
        return comboProduitsFinis;
    }

    public Label getResultat() {
        return resultat;
    }

    public TextField getQuantiteASupprimer() {
        return quantiteASupprimer;
    }
    
    
    
    public Scene getFenêtre_supprimer_stock_produitfini(){
         return new Scene(this, 600, 400);
    }
}
