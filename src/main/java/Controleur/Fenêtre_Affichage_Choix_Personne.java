/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Vue.Affichage_Choix_Personne;
import javafx.stage.Stage;
/**
 *
 * @author alicedeboever
 */
public class Fenêtre_Affichage_Choix_Personne {
    private Affichage_Choix_Personne affichageChoixPersonne;  
     private ModèleCarte modeleCarte;
    
    public Fenêtre_Affichage_Choix_Personne(Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        affichageChoixPersonne = new Affichage_Choix_Personne();

        stage.setTitle("Choix personne");
        stage.setScene(affichageChoixPersonne.getFenêtre_affichage_choix_personne());
        stage.show();
        
        affichageChoixPersonne.getBtnOperateur().setOnAction(e -> { //quand on clique sur le bouton
            stage.close();
            
            Stage afficherOperateurStage = new Stage();
            new Fenetre_Affichage_Operateur(afficherOperateurStage,modeleCarte);
        });
        
        affichageChoixPersonne.getBtnChefAtelier().setOnAction(e->{
            stage.close();
            
            Stage afficherChefAtelierStage = new Stage();
            new Fenêtre_Affichage_Chef_Atelier(afficherChefAtelierStage,modeleCarte);
        });
        
        affichageChoixPersonne.getBtnHome().setOnAction(e -> {
            stage.close();
            
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
        });
        
        affichageChoixPersonne.getBtnHome().setOnAction(e -> {
            stage.close();
            
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
        });

    }
}
