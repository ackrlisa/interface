/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;
import Modele.ModèleCarte;
import Vue.Calculer;
import javafx.stage.Stage;
/**
 *
 * @author lisaa
 */
public class Fenêtre_Calculer_Atelier {
    private Calculer calculer;  
     private ModèleCarte modeleCarte;
    
    public Fenêtre_Calculer_Atelier(Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        calculer = new Calculer();

        stage.setTitle("Calculer");
        stage.setScene(calculer.getFenêtre_Calculer_Atelier()); 
        stage.show();
        
        calculer.getBtnCoutgamme().setOnAction(e -> { //quand on clique sur le bouton
                        stage.close();
                       Stage calculCoutGammeStage = new Stage();
            new Fenêtre_Calcul_Cout_Gamme(calculCoutGammeStage,modeleCarte); 
           
        });
        
        calculer.getBtnDureegamme().setOnAction(e->{
            stage.close();
            Stage calculDureeGammeStage = new Stage();
            new Fenêtre_Calcul_Duree_Gamme(calculDureeGammeStage,modeleCarte);
        });
        
        calculer.getBtnHome().setOnAction(e -> {
            stage.close();
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
        });

    }
}
