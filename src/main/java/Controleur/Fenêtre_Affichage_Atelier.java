/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;
import Vue.Accueil;
import Vue.Maintenance;
import Vue.Affichage_Atelier;
import javafx.stage.Stage;
/**
 *
 * @author lisaa
 */
public class Fenêtre_Affichage_Atelier {
    private Affichage_Atelier affichageAtelier;
    
    public Fenêtre_Affichage_Atelier(Stage stage) {
        affichageAtelier = new Affichage_Atelier();
        
        stage.setTitle("Affichage de l'Atelier");
        stage.setScene(affichageAtelier.getFenêtre_Affichage_Atelier());
        stage.show();
        
        // Gestionnaire pour le bouton "Machines"
        affichageAtelier.getBtnMachine().setOnAction(e -> {
            System.out.println("Affichage des machines");
            });
        
        // Gestionnaire pour le bouton "Postes"
        affichageAtelier.getBtnPoste().setOnAction(e -> {
            System.out.println("Affichage des postes");
           });
        
        // Gestionnaire pour le bouton "Gammes"
        affichageAtelier.getBtnGamme().setOnAction(e -> {
            System.out.println("Affichage des gammes");
          });
        
        // Gestionnaire pour le bouton "Personnel"
        affichageAtelier.getBtnPersonnel().setOnAction(e -> {
            System.out.println("Affichage du personnel");
            // À compléter selon vos besoins
        });
        // Gestionnaire pour le bouton "Equipement"
        affichageAtelier.getBtnEquipement().setOnAction(e -> {
            System.out.println("Affichage des équipements");
            // À compléter selon vos besoins
        });
        
        // Gestionnaire pour le bouton "Stock des produits finis"
        affichageAtelier.getBtnStock_produits_finis().setOnAction(e -> {
            System.out.println("Affichage du stock des produits finis");
            });
        
        // Gestionnaire pour le bouton "Stock brut"
        affichageAtelier.getBtnStock_brut().setOnAction(e -> {
            System.out.println("Affichage du stock brut");
            });
        // Gestionnaire pour le bouton "Equipement"
        affichageAtelier.getBtnEquipement().setOnAction(e -> {
            System.out.println("Affichage des équipements");
            });
        
        // Gestionnaire pour le bouton "HOME"
        affichageAtelier.getBtnHome().setOnAction(e -> {
             stage.close();
            
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage);
        });
    }

}
