/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;


import Vue.Gestion_Gamme;
import Vue.Gestion_Machine;
import Vue.Gestion_Poste;
import Vue.Gestion_Stockbrut;
import Vue.Gestion_Stockfini;
import Vue.Gérer_Atelier;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Gérer_Atelier {
    private Gérer_Atelier gérerAtelier;
    
    public Fenêtre_Gérer_Atelier (Stage stage){
        gérerAtelier= new Gérer_Atelier();
        
        stage.setTitle("Fenêtre gérer atelier");
        stage.setScene(gérerAtelier.getFenêtre_Gérer_Atelier()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show();
        
        // Gestionnaire pour le bouton "Machines"
        gérerAtelier.getBtnMachine().setOnAction(e -> {
             stage.close();
            
            Stage gestionmachineStage = new Stage();
            new Fenêtre_Gérer_Machine (gestionmachineStage);
                    });
        
        // Gestionnaire pour le bouton "Postes"
        gérerAtelier.getBtnPoste().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre pour la maintenance
            Stage gestionposteStage = new Stage();
            new Fenêtre_Gestion_Poste (gestionposteStage);
            });
        
        // Gestionnaire pour le bouton "Gammes"
        gérerAtelier.getBtnGamme().setOnAction(e -> {
           stage.close();
           
           Stage gestiongammeStage = new Stage();
           new Fenêtre_Gestion_Gamme (gestiongammeStage);
            });
        
                      
        // Gestionnaire pour le bouton "Stock des produits finis"
        gérerAtelier.getBtnStock_produits_finis().setOnAction(e -> {
            stage.close();
           
           Stage gestionstockfiniStage = new Stage();
           new Fenêtre_Gestion_Stockfini (gestionstockfiniStage);
          });
        
        // Gestionnaire pour le bouton "Stock brut"
        gérerAtelier.getBtnStock_brut().setOnAction(e -> {
            stage.close();
           
           Stage gestionstockbrutStage = new Stage();
           new Fenêtre_Gestion_Stockbrut(gestionstockbrutStage);
        });
             
                  // Gestionnaire pour le bouton "HOME"
        gérerAtelier.getBtnHome().setOnAction(e -> {
             stage.close();
            
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage);
        });
    }

}
