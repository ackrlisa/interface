/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Vue.Gestion_Equi;
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
            // Crée une nouvelle fenêtre pour la maintenance
            Stage gestionmachineStage = new Stage();
            Gestion_Machine gestionmachine = new Gestion_Machine();
            gestionmachineStage.setTitle("Gestion des machines dans l'atelier");
            gestionmachineStage.setScene(gestionmachine.getFenêtre_Gérer_Machine());
            gestionmachineStage.show();
        });
        
        // Gestionnaire pour le bouton "Postes"
        gérerAtelier.getBtnPoste().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre pour la maintenance
            Stage gestionposteStage = new Stage();
            Gestion_Poste gestionposte = new Gestion_Poste();
            gestionposteStage.setTitle("Gestion des postes dans l'atelier");
            gestionposteStage.setScene(gestionposte.getFenêtre_Gestion_Poste());
            gestionposteStage.show();
        });
        
        // Gestionnaire pour le bouton "Gammes"
        gérerAtelier.getBtnGamme().setOnAction(e -> {
           stage.close();
           
           Stage gestiongammeStage = new Stage();
           Gestion_Gamme gestiongamme= new Gestion_Gamme();
           gestiongammeStage.setTitle ("Gestion des gammes ");
           gestiongammeStage.setScene(gestiongamme.getFenêtre_Gestion_Gamme());
           gestiongammeStage.show();
           
          });
        
        // Gestionnaire pour le bouton "Personnel"
        gérerAtelier.getBtnPersonnel().setOnAction(e -> {
          
        });
               
        // Gestionnaire pour le bouton "Stock des produits finis"
        gérerAtelier.getBtnStock_produits_finis().setOnAction(e -> {
            stage.close();
           
           Stage gestionstockfiniStage = new Stage();
           Gestion_Stockfini gestionstockfini= new Gestion_Stockfini();
           gestionstockfiniStage.setTitle ("Gestion ddu stock des produits finis ");
           gestionstockfiniStage.setScene(gestionstockfini.getFenêtre_Gestion_Stockfini());
           gestionstockfiniStage.show();
            });
        
        // Gestionnaire pour le bouton "Stock brut"
        gérerAtelier.getBtnStock_brut().setOnAction(e -> {
            stage.close();
           
           Stage gestionstockbrutStage = new Stage();
           Gestion_Stockbrut gestionstockbrut= new Gestion_Stockbrut();
           gestionstockbrutStage.setTitle ("Gestion du stock des matériaux/ éléments bruts ");
           gestionstockbrutStage.setScene(gestionstockbrut.getFenêtre_Gestion_Stockbrut());
           gestionstockbrutStage.show();
            });
             
           // Gestionnaire pour le bouton "Equipement"
        gérerAtelier.getBtnEquipement().setOnAction(e -> {
           stage.close();
           
           Stage gestionequiStage = new Stage();
           Gestion_Equi gestionequi= new Gestion_Equi();
           gestionequiStage.setTitle ("Gestion des équipements de l'atelier ");
           gestionequiStage.setScene(gestionequi.getFenêtre_Gestion_Equi());
           gestionequiStage.show();
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
