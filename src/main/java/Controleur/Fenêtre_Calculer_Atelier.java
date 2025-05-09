/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;
import Vue.Calculer;
import Vue.Calcul_Cout_Gamme;
import Vue.Calcul_Duree_Gamme;
import javafx.stage.Stage;
/**
 *
 * @author lisaa
 */
public class Fenêtre_Calculer_Atelier {
    private Calculer calculer;  // Vue pour le calcul (fenêtre principale)
    
    public Fenêtre_Calculer_Atelier(Stage stage) {
        calculer = new Calculer();

        stage.setTitle("Calculer");
        stage.setScene(calculer.getFenêtre_Calculer_Atelier()); 
        stage.show();
        
        calculer.getBtnCoutgamme().setOnAction(e -> { //quand on clique sur le bouton
            // Ferme la fenêtre d'accueil
            stage.close();
            // Crée une nouvelle fenêtre pour la maintenance
            Stage calculCoutGammeStage = new Stage();
            new Fenêtre_Calcul_Cout_Gamme(calculCoutGammeStage); 
           
        });
        
        calculer.getBtnDureegamme().setOnAction(e->{
            stage.close();
            Stage calculDureeGammeStage = new Stage();
            new Fenêtre_Calcul_Duree_Gamme(calculDureeGammeStage);
        });
        
        calculer.getBtnHome().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage); // Redirige vers la fenêtre d'accueil
        });

    }
}
