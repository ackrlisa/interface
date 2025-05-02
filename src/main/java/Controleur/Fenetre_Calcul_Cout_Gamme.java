/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Vue.Calcul_Cout_Gamme;
import Modele.Gamme;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

/**
 *
 * @author alicedeboever
 */
public class Fenetre_Calcul_Cout_Gamme {
    private Calcul_Cout_Gamme Calcul_Cout_Gamme ;
    
    public Fenetre_Calcul_Cout_Gamme(Stage stage){
        Calcul_Cout_Gamme = new Calcul_Cout_Gamme();

        stage.setTitle("Calcul du coût de la gamme");
        stage.setScene(Calcul_Cout_Gamme.getFenetre_calcul_cout_gamme()); // Appelle la méthode pour obtenir la scène de la vue
        stage.show();
        
        Calcul_Cout_Gamme.getCalculer().setOnAction(e -> {
            Gamme gammeChoisie = Calcul_Cout_Gamme.getComboGamme().getValue();
            if (gammeChoisie != null) {
                // Calcul du coût et affichage du résultat
                float cout = gammeChoisie.coutGamme();
                Calcul_Cout_Gamme.getAffichageResultat().setText("Coût total de la gamme : " + cout + " €");
            } else {
                Calcul_Cout_Gamme.getAffichageResultat().setText("Veuillez sélectionner une gamme.");
            }
        });
        
        Calcul_Cout_Gamme.getHome().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage); // Redirige vers la fenêtre d'accueil
        });
        
    }
}
