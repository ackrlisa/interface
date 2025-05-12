/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Vue.Gestion_Opérateur;
import Vue.Gestion_Produit;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Gestion_Opérateur {
    private Gestion_Opérateur gestionopérateur;
     private ModèleCarte modeleCarte;
    public Fenêtre_Gestion_Opérateur(Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        gestionopérateur= new Gestion_Opérateur();
        
        stage.setTitle("Fenêtre gestion des produits");
        stage.setScene(gestionopérateur.getFenêtre_Gestion_Opérateur()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show();

    gestionopérateur.getBtnHome().setOnAction(e->{  
       stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
     });
    gestionopérateur.getBtnModifier().setOnAction(e->{  
       stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage modifieropérateurStage = new Stage();
            new Fenêtre_Modification_Opérateur(modifieropérateurStage,modeleCarte); // Redirige vers la fenêtre d'accueil
     });
    
    gestionopérateur.getBtnCréer().setOnAction(e->{  
       stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage créeropérateurStage = new Stage();
            new Fenêtre_Création_Opérateur(créeropérateurStage,modeleCarte); // Redirige vers la fenêtre d'accueil
     });
    
    
    
}
}
