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
    private Gérer_Atelier gérer;
    
    public Fenêtre_Gérer (Stage stage){
        gérer= new Gérer_Atelier();
        
        stage.setTitle("Fenêtre gérer atelier");
        stage.setScene(gérer.getFenêtre_Gérer_Atelier()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show();
        
        gérer.getBtnModifier().setOnAction(e -> { //quand on clique sur le bouton
            // Ferme la fenêtre d'
            stage.close();
            // Crée une nouvelle fenêtre pour la maintenance
            Stage modifierStage = new Stage();
            Gérer_Atelier modifierAtelier = new Gérer_Atelier();
            modifierStage.setTitle("Gérer l'Atelier");
            modifierStage.setScene(modifierAtelier.getFenêtre_Modifier_Atelier());
            modifierStage.show();
        });
                
        gérer.getBtnSupprimer().setOnAction(e -> {
            // Code pour afficher la fiabilité des machines
        });
        
        gérer.getBtnModifier().setOnAction(e -> {
            // Code pour afficher la fiabilité des machines
        });
        
        gérer.getBtnHome().setOnAction(e -> {
            // Ferme la fenêtre de maintenance
            stage.close();
            
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage);
        });
        
       
    }

}
