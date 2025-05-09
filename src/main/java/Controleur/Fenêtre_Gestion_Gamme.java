/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Vue.Gestion_Gamme;
import Vue.Gestion_Poste;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Gestion_Gamme {
    private Gestion_Gamme gestiongamme;
    public Fenêtre_Gestion_Gamme(Stage stage){
        gestiongamme= new Gestion_Gamme();
        
        stage.setTitle("Fenêtre gestion des gammes");
        stage.setScene(gestiongamme.getFenêtre_Gestion_Gamme()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show();

    gestiongamme.getBtnHome().setOnAction(e->{  
       stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage); // Redirige vers la fenêtre d'accueil
     });
    gestiongamme.getBtnModifier().setOnAction(e->{  
       stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage modifiergammeStage = new Stage();
            new Fenêtre_Modification_Gamme(modifiergammeStage); // Redirige vers la fenêtre d'accueil
     });
    gestiongamme.getBtnSupprimer().setOnAction(e->{  
       stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage supprimergammeStage = new Stage();
            new Fenêtre_Supprimer_Gamme(supprimergammeStage); // Redirige vers la fenêtre d'accueil
     });
    gestiongamme.getBtnAjouter().setOnAction(e->{  
       stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage créergammeStage = new Stage();
            new Fenêtre_Créer_Gamme(créergammeStage); // Redirige vers la fenêtre d'accueil
     });
    gestiongamme.getCreerOperation().setOnAction(e->{  
       
     });
    gestiongamme.getSupprimerOperation().setOnAction(e->{  
       
     });
    
    
}
}
