/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.Operateur;
import Vue.Affichage_Operateur;
import javafx.stage.Stage;
import Modele.ModèleCarte;

/**
 *
 * @author alicedeboever
 */
public class Fenetre_Affichage_Operateur {
    private Affichage_Operateur Affichage_Operateur ;
    private ModèleCarte modeleCarte;
    
    public Fenetre_Affichage_Operateur(Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        Affichage_Operateur = new Affichage_Operateur();

        stage.setTitle("Affichage d'un operateur");
        stage.setScene(Affichage_Operateur.getFenetre_affichage_operateur()); // Appelle la méthode pour obtenir la scène de la vue
        Affichage_Operateur.getComboOperateur().getItems().setAll(Operateur.getListeOperateurs());
        stage.show();
        
        Affichage_Operateur.getBtnAfficher().setOnAction(e -> {
            Operateur operateurChoisi = Affichage_Operateur.getComboOperateur().getValue();
            if (operateurChoisi != null) {
                StringBuilder details = new StringBuilder(); // créer l'espace ou on va tout mettre
                details.append("Nom : ").append(operateurChoisi.getNom()).append("\n");
                details.append("Prénom : ").append(operateurChoisi.getPrenom()).append("\n");
                details.append("Code : ").append(operateurChoisi.getCode()).append("\n");
                details.append("Compétance : ").append(operateurChoisi.getCompetance()).append("\n");
                details.append("Disponibilité : ").append(operateurChoisi.isDisponible()).append("\n");
                

                Affichage_Operateur.getAffichageOperateur().setText(details.toString());
    
            } else {
                Affichage_Operateur.getAffichageOperateur().setText("Veuillez sélectionner un opérateur .");
            }
        
        });
        
        Affichage_Operateur.getBtnHome().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
        });
    }
}
