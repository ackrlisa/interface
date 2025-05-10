/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Vue.Modification_Gamme;
import Vue.Modification_Machine;
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
        stage.setScene(modifiergamme.getFenêtre_Modification_Gamme()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show();
        
        
      
     modifiergamme.getBtnAjoutéquiop().setOnAction(e->{      
     });
               
    modifiergamme.getBtnSupprimeréquiop().setOnAction(e->{      
     });
    
   modifiergamme.getBtnHome().setOnAction(e->{  
       stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
     });
}
}
