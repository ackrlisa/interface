/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.Equipement;
import Modele.Poste;
import Modele.ModèleCarte;
import Vue.Supprimer_Poste;
import javafx.stage.Stage;

/**
 *
 * @author alicedeboever
 */
public class Fenêtre_Supprimer_Poste {
    private Supprimer_Poste supprimerposte;
    private ModèleCarte modeleCarte;
    
    public Fenêtre_Supprimer_Poste (Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        supprimerposte= new Supprimer_Poste();
        
        stage.setTitle("Fenêtre supprimer poste");
        stage.setScene(supprimerposte.getFenetre_supprimer_poste());
        stage.show(); 
        
        supprimerposte.getBtnSupprimer().setOnAction(e->{
            Poste poste = supprimerposte.getComboPoste().getValue();
            if (poste != null) {
                Equipement.getListeEquipements().remove(poste);
                supprimerposte.getComboPoste().getItems().remove(poste); // Mise à jour du menu déroulant
                supprimerposte.getResultat().setText("Poste supprimé");
            } else {
                supprimerposte.getResultat().setText("Veuillez sélectionner un poste à supprimer.");
            }
        });
        supprimerposte.getBtnHome().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
           });
    }
}
