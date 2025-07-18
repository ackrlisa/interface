/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Vue.Modification_Gamme;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Modification_Gamme {
     private Modification_Gamme modifiergamme;
     private ModèleCarte modeleCarte;
    
    public Fenêtre_Modification_Gamme (Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        modifiergamme= new Modification_Gamme();
        
        stage.setTitle("Fenêtre modification de gamme");
        stage.setScene(modifiergamme.getFenêtre_Modification_Gamme());
        try {
            stage.show();
        }catch(Exception ex) {
            ex.printStackTrace();
        }

     modifiergamme.getBtnAjout_supprimer_équiop().setOnAction(e->{  
         stage.close();
            Stage modificationStage = new Stage();
            new Fenêtre_Ajout_Suppression_Machine_Gamme(modificationStage,modeleCarte);
     });
     
     modifiergamme.getAjout_supprimer_produit().setOnAction(e->{  
         stage.close();
            Stage modificationStage = new Stage();
            new Fenêtre_Ajout_Suppression_Produit_Gamme(modificationStage,modeleCarte);
     });

   modifiergamme.getBtnHome().setOnAction(e->{  
       stage.close();
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte);
     });
    }
}
