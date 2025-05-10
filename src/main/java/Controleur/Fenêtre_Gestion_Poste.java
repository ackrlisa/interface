/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Vue.Gestion_Poste;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Gestion_Poste {
    private Gestion_Poste gestionposte;
     private ModèleCarte modeleCarte;
    
    public Fenêtre_Gestion_Poste (Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        gestionposte= new Gestion_Poste();
        
        stage.setTitle("Fenêtre gestion des postes");
        stage.setScene(gestionposte.getFenêtre_Gestion_Poste()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show();
        
        gestionposte.getBtnAjouter().setOnAction(e -> { //quand on clique sur le bouton
            // Ferme la fenêtre 
            stage.close();
            // Crée une nouvelle fenêtre pour operateur
           
            Stage creationPoste = new Stage();
            new Fenêtre_Creation_Poste(creationPoste,modeleCarte);
        });
        
                
      
        //inutile car dans fenêTRE Atelier on inicie pas de nvelle fenêtre, on ouvre la fenetre affichage donc le bouton Home correspond déjà à celui de affichage
        gestionposte.getBtnHome().setOnAction(e -> {
            // Ferme la fenêtre de maintenance
            stage.close();
            
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte);
        });
        
       
    }
}
