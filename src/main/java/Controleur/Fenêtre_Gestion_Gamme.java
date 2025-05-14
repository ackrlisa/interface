/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Vue.Gestion_Gamme;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Gestion_Gamme {
    private Gestion_Gamme gestiongamme;
     private ModèleCarte modeleCarte;
    public Fenêtre_Gestion_Gamme(Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        gestiongamme= new Gestion_Gamme();
        
        stage.setTitle("Fenêtre gestion des gammes");
        stage.setScene(gestiongamme.getFenêtre_Gestion_Gamme());
        stage.show();

    gestiongamme.getBtnHome().setOnAction(e->{  
       stage.close();
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
     });
    gestiongamme.getBtnModifier().setOnAction(e->{  
       stage.close();
            Stage modifiergammeStage = new Stage();
            new Fenêtre_Modification_Gamme(modifiergammeStage,modeleCarte);
     });
    gestiongamme.getBtnSupprimer().setOnAction(e->{  
       stage.close();
            Stage supprimergammeStage = new Stage();
            new Fenêtre_Supprimer_Gamme(supprimergammeStage,modeleCarte);
     });
    gestiongamme.getBtnAjouter().setOnAction(e->{  
       stage.close();
            Stage créergammeStage = new Stage();
            new Fenêtre_Créer_Gamme(créergammeStage,modeleCarte);
     });
    gestiongamme.getCreerOperation().setOnAction(e->{  
       stage.close();
       Stage créerspérationStage = new Stage();
       new Fenêtre_Creation_Opération(créerspérationStage,modeleCarte);
     });
    }
}
