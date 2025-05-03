/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ChefAtelier;
import Vue.Affichage_Chef_Atelier;
import javafx.stage.Stage;

/**
 *
 * @author alicedeboever
 */
public class Fenêtre_Affichage_Chef_Atelier {
    private Affichage_Chef_Atelier Affichage_Chef_Atelier ;
    
    public Fenêtre_Affichage_Chef_Atelier(Stage stage){
        
        Affichage_Chef_Atelier = new Affichage_Chef_Atelier();

        stage.setTitle("Affichage d'un chef d'atelier");
        stage.setScene(Affichage_Chef_Atelier.getFenetre_affichage_chef_atelier()); // Appelle la méthode pour obtenir la scène de la vue
        Affichage_Chef_Atelier.getComboChefAtelier().getItems().setAll(ChefAtelier.getListeChefsAtelier());
        stage.show();
        
        Affichage_Chef_Atelier.getBtnAfficher().setOnAction(e -> {
            ChefAtelier chefChoisi = Affichage_Chef_Atelier.getComboChefAtelier().getValue();
            if (chefChoisi != null) {
                StringBuilder details = new StringBuilder(); // créer l'espace ou on va tout mettre
                details.append("Nom : ").append(chefChoisi.getNom()).append("\n");
                details.append("Prénom : ").append(chefChoisi.getPrenom()).append("\n");
                details.append("Code : ").append(chefChoisi.getCode()).append("\n");
                
                Affichage_Chef_Atelier.getAffichageChefAtelier().setText(details.toString());
    
            } else {
                Affichage_Chef_Atelier.getAffichageChefAtelier().setText("Veuillez sélectionner un chef d'atelier .");
            }
        
        });
    }
}
