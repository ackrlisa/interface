/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Vue.Gestion_Gamme;
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
        stage.setScene(gestionproduit.getFenêtre_Gestion_Produit()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show();

    gestionproduit.getBtnHome().setOnAction(e->{  
       stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
     });
    gestionproduit.getBtnModifier().setOnAction(e->{  
       stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage modifierproduitStage = new Stage();
            new Fenêtre_Modification_Produit(modifierproduitStage,modeleCarte); // Redirige vers la fenêtre d'accueil
     });
    gestionproduit.getBtnSupprimer().setOnAction(e->{  
       stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage supprimerproduitStage = new Stage();
            new Fenêtre_Supprimer_Produit(supprimerproduitStage,modeleCarte); // Redirige vers la fenêtre d'accueil
     });
    gestionproduit.getBtnCréer().setOnAction(e->{  
       stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage créerproduitStage = new Stage();
            new Fenêtre_Création_Produit(créerproduitStage,modeleCarte); // Redirige vers la fenêtre d'accueil
     });
    
    
    
}
}

