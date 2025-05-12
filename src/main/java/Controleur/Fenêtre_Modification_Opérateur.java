/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

/**
 *
 * @author lisaa
 */
import Modele.EtatMachine;
import Modele.Machine;
import Modele.ModèleCarte;
import Modele.Operateur;
import Modele.StatutOpé;

import Vue.Modification_Opérateur;
    import javafx.stage.Stage;

public class Fenêtre_Modification_Opérateur {
    private Modification_Opérateur modificationOperateur;
    private ModèleCarte modeleCarte;

    public Fenêtre_Modification_Opérateur(Stage stage, ModèleCarte modeleCarte) {
        this.modeleCarte = modeleCarte;

        // Initialisation de la vue
        modificationOperateur = new Modification_Opérateur();

        // Configuration de la fenêtre
        stage.setTitle("Modification d'un opérateur");
        stage.setScene(modificationOperateur.getFenêtre_Modification_Opérateur());
        stage.show();

        modificationOperateur.getBtnLibre().setOnAction(e -> {
        //Operateur operateurChoisie = modificationOperateur.getComboOpérateurs().getValue();
          //  if (operateurChoisie != null) {
            //    operateurChoisie.setStatutOpé(StatutOpé.LIBRE);
                
                modificationOperateur.getErreur().setText("L'opérateur est maintenant disponible ");
           // }else{
           //     modificationOperateur.getErreur().setText("Veuillez sélectionner un opérateur");
            //}
     });
    
               modificationOperateur.getBtnOccupé().setOnAction(e -> {
            //Operateur operateurChoisie = modificationOperateur.getComboOpérateur().getValue();
           // if (operateurChoisie != null) {
           //     operateurChoisie.setStatutOpé(StatutOpé.OCCUPE);
                
                modificationOperateur.getErreur().setText("L'opérateur est maintenant occupé ");
          //  }else{
                modificationOperateur.getErreur().setText("Veuillez sélectionner un opérateur");
           // }
    // });
        
      

        // Gestion de l'événement pour le bouton "HOME"
        //modificationOperateur.getHome().setOnAction(e -> {
            stage.close();
            // Ouvrir une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage, modeleCarte);
        });
    }
}
