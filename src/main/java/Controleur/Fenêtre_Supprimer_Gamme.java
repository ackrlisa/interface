/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Vue.Modification_Gamme;
import Vue.Supprimer_Gamme;
import javafx.stage.Stage;
import Modele.Gamme;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Supprimer_Gamme {
   private Supprimer_Gamme supprimergamme;
    private ModèleCarte modeleCarte;
    
    public Fenêtre_Supprimer_Gamme (Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        supprimergamme= new Supprimer_Gamme();
        
        stage.setTitle("Fenêtre supprimer gamme");
        stage.setScene(supprimergamme.getFenetre_supprimer_gamme()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show(); 
        
        supprimergamme.getBtnSupprimer().setOnAction(e->{
            Gamme gamme = supprimergamme.getComboGamme().getValue(); // Récupérer la machine sélectionnée
    
            if (gamme != null) {
                Gamme.getListeGammes().remove(gamme);
                supprimergamme.getComboGamme().getItems().remove(gamme); // Mise à jour du menu déroulant
                supprimergamme.getResultat().setText("Gamme supprimée.");
    
            } else {
                supprimergamme.getResultat().setText("Veuillez sélectionner une gamme à supprimer.");
            }
        });
        supprimergamme.getBtnHome().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
           });
        
    }
}
