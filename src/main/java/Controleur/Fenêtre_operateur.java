/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;
import Vue.Accueil;
import Vue.Operateur;
import Vue.Affichage_Atelier;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_operateur {
    private Operateur operateur;
    
    public Fenêtre_operateur (Stage stage){
        operateur= new Operateur();
        
        stage.setTitle("Fenêtre opérateur");
        stage.setScene(operateur.getFenêtre_operateur()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show();
        
        operateur.getBtnAffichage().setOnAction(e -> { //quand on clique sur le bouton
            // Ferme la fenêtre 
            stage.close();
            // Crée une nouvelle fenêtre pour operateur
            Stage affichageStage = new Stage();
            Affichage_Atelier affichageAtelier = new Affichage_Atelier();
            affichageStage.setTitle("Affichage de l'Atelier");
            affichageStage.setScene(affichageAtelier.getFenêtre_Affichage_Atelier());
            affichageStage.show();
        });
                
      
        //inutile car dans fenêTRE Atelier on inicie pas de nvelle fenêtre, on ouvre la fenetre affichage donc le bouton Home correspond déjà à celui de affichage
        operateur.getBtnHome().setOnAction(e -> {
            // Ferme la fenêtre de maintenance
            stage.close();
            
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage);
        });
        
       
    }

}
