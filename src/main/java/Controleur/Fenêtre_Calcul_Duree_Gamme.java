/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Vue.Calcul_Duree_Gamme;
import Modele.Gamme;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
/**
 *
 * @author alicedeboever
 */
public class Fenêtre_Calcul_Duree_Gamme {
    private Calcul_Duree_Gamme Calcul_Duree_Gamme ;
    
    public Fenêtre_Calcul_Duree_Gamme(Stage stage){
        System.out.println("Ouverture fenêtre durée");
        Calcul_Duree_Gamme = new Calcul_Duree_Gamme();

        stage.setTitle("Calcul de la durée de la gamme");
        stage.setScene(Calcul_Duree_Gamme.getFenetre_calcul_duree_gamme()); // Appelle la méthode pour obtenir la scène de la vue
        stage.show();
        
        Calcul_Duree_Gamme.getBtnCalculer().setOnAction(e -> {
            Gamme gammeChoisie = Calcul_Duree_Gamme.getComboGamme().getValue();
            if (gammeChoisie != null) {
                // Calcul du coût et affichage du résultat
                float duree = gammeChoisie.dureeGamme();
                Calcul_Duree_Gamme.getAffichageResultat().setText("Durée total de la gamme : " + duree + " €");
            } else {
                Calcul_Duree_Gamme.getAffichageResultat().setText("Veuillez sélectionner une gamme.");
            }
        });
        
        Calcul_Duree_Gamme.getBtnHome().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage); // Redirige vers la fenêtre d'accueil
        });
        
    }
}
