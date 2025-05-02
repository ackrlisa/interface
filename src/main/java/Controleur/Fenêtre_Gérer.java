/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Vue.Gérer_Atelier;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Gérer {
    private Gérer_Atelier gérerAtelier;
    
    public Fenêtre_Gérer (Stage stage){
        gérerAtelier= new Gérer_Atelier();
        
        stage.setTitle("Fenêtre gérer atelier");
        stage.setScene(gérerAtelier.getFenêtre_Gérer_Atelier()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show();
        
        // Gestionnaire pour le bouton "Machines"
        gérerAtelier.getBtnMachine().setOnAction(e -> {
            System.out.println("Affichage des machines");
            });
        
        // Gestionnaire pour le bouton "Postes"
        gérerAtelier.getBtnPoste().setOnAction(e -> {
            System.out.println("Affichage des postes");
           });
        
        // Gestionnaire pour le bouton "Gammes"
        gérerAtelier.getBtnGamme().setOnAction(e -> {
            System.out.println("Affichage des gammes");
          });
        
        // Gestionnaire pour le bouton "Personnel"
        gérerAtelier.getBtnPersonnel().setOnAction(e -> {
            System.out.println("Affichage du personnel");
            // À compléter selon vos besoins
        });
        // Gestionnaire pour le bouton "Equipement"
        gérerAtelier.getBtnEquipement().setOnAction(e -> {
            System.out.println("Affichage des équipements");
            // À compléter selon vos besoins
        });
        
        // Gestionnaire pour le bouton "Stock des produits finis"
        gérerAtelier.getBtnStock_produits_finis().setOnAction(e -> {
            System.out.println("Affichage du stock des produits finis");
            });
        
        // Gestionnaire pour le bouton "Stock brut"
        gérerAtelier.getBtnStock_brut().setOnAction(e -> {
            System.out.println("Affichage du stock brut");
            });
        // Gestionnaire pour le bouton "Equipement"
        gérerAtelier.getBtnEquipement().setOnAction(e -> {
            System.out.println("Affichage des équipements");
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
