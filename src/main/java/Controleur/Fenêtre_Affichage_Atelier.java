/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;
import Vue.Accueil;
import Vue.Maintenance;
import Vue.Affichage_Atelier;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
/**
 *
 * @author lisaa
 */
public class Fenêtre_Affichage_Atelier {
    private Affichage_Atelier affichageAtelier;
    
    public Fenêtre_Affichage_Atelier(Stage stage) {
        affichageAtelier = new Affichage_Atelier();
        //System.out.println("Initialisation...");
        //System.out.println("getBtnMachine() = " + affichageAtelier.getBtnMachine());

        stage.setTitle("Affichage de l'Atelier");
        stage.setScene(affichageAtelier.getFenêtre_Affichage_Atelier());
        stage.show();
        
        // Gestionnaire pour le bouton "Machines"
        affichageAtelier.getBtnMachine().setOnAction(e -> {
            stage.close();
            
            // Ouvrir une fentre pour afficher les machines
            Stage afficherMachineStage = new Stage();
            new Fenêtre_Affichage_Machine(afficherMachineStage);
            });
        
        // Gestionnaire pour le bouton "Postes"
        affichageAtelier.getBtnPoste().setOnAction(e -> {
            stage.close();
            
            Stage afficherPosteStage = new Stage();
            new Fenêtre_Affichage_Poste(afficherPosteStage);
           });
        
        // Gestionnaire pour le bouton "Gammes"
        affichageAtelier.getBtnGamme().setOnAction(e -> {
            stage.close();
            
            Stage afficherGammeStage = new Stage();
            new Fenêtre_Affichage_Gamme(afficherGammeStage);
          });
        
        // Gestionnaire pour le bouton "Personnel"
        affichageAtelier.getBtnPersonnel().setOnAction(e -> {
            stage.close();
            
            Stage afficherChoixPersonne = new Stage ();
            new Fenêtre_Affichage_Choix_Personne(afficherChoixPersonne);
        });
        
      
        affichageAtelier.getBtnProduits_finis().setOnAction(e -> {
            stage.close();
            
            Stage afficherProduitsFinis = new Stage ();
            new Fenêtre_Affichage_Produits_Finis(afficherProduitsFinis);
            });
        
        // Gestionnaire pour le bouton "Stock brut"
        affichageAtelier.getBtnStock_brut().setOnAction(e -> {
            stage.close();
            
            Stage afficherStockBrut = new Stage ();
            new Fenêtre_Affichage_Stock_Brut(afficherStockBrut);           
        });
        
        
        // Gestionnaire pour le bouton "HOME"
        affichageAtelier.getBtnHome().setOnAction(e -> {
            System.out.println(affichageAtelier.getBtnMachine());
             stage.close();
             
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage); // <-- Et pas new Accueil()
        });
    }

}
