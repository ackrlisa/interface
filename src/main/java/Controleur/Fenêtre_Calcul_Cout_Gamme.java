/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.Gamme;
import Vue.Calcul_Cout_Gamme;
import javafx.stage.Stage;

/**
 *
 * @author alicedeboever
 */
public class Fenêtre_Calcul_Cout_Gamme {
    private Calcul_Cout_Gamme Calcul_Cout_Gamme ;
    
    public Fenêtre_Calcul_Cout_Gamme(Stage stage){
        
        Calcul_Cout_Gamme = new Calcul_Cout_Gamme();

        stage.setTitle("Calcul du cout de la gamme");
        stage.setScene(Calcul_Cout_Gamme.getFenetre_calcul_cout_gamme()); // Appelle la méthode pour obtenir la scène de la vue
        Calcul_Cout_Gamme.getComboGamme().getItems().setAll(Gamme.getListeGammes());
        stage.show();
        
        Calcul_Cout_Gamme.getBtnCalculer().setOnAction(e -> {
            Gamme gammeChoisie = Calcul_Cout_Gamme.getComboGamme().getValue();
            if (gammeChoisie != null) {
                // Calcul du coût et affichage du résultat
                float cout = gammeChoisie.coutGamme();
                Calcul_Cout_Gamme.getAffichageResultat().setText("Cout total de la gamme : " + cout + " € ");
            } else {
                Calcul_Cout_Gamme.getAffichageResultat().setText("Veuillez sélectionner une gamme.");
            }
        });
        
        Calcul_Cout_Gamme.getBtnHome().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage); // Redirige vers la fenêtre d'accueil
        });
        
    }
}
