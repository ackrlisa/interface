/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Vue.Gestion_Produit;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Gestion_Produit {
    private Gestion_Produit gestionproduit;
     private ModèleCarte modeleCarte;
     
    public Fenêtre_Gestion_Produit(Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        gestionproduit= new Gestion_Produit();
        
        stage.setTitle("Fenêtre gestion des produits");
        stage.setScene(gestionproduit.getFenêtre_Gestion_Produit());
        stage.show();

    gestionproduit.getBtnHome().setOnAction(e->{  
       stage.close();
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte);
     });
    gestionproduit.getBtnModifier().setOnAction(e->{  
       stage.close();
            Stage modifierproduitStage = new Stage();
            new Fenêtre_Modification_Produit(modifierproduitStage,modeleCarte);
     });
    gestionproduit.getBtnSupprimer().setOnAction(e->{  
       stage.close();
            Stage supprimerproduitStage = new Stage();
            new Fenêtre_Supprimer_Produit(supprimerproduitStage,modeleCarte);
     });
    gestionproduit.getBtnCréer().setOnAction(e->{  
       stage.close();
            Stage créerproduitStage = new Stage();
            new Fenêtre_Création_Produit(créerproduitStage,modeleCarte);
     });
    
    
    
}
}

