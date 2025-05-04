/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Vue.Modification_Machine;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Modification_Machine {
    private Modification_Machine modifiermachine;
    
    public Fenêtre_Modification_Machine (Stage stage){
        modifiermachine= new Modification_Machine();
        
        stage.setTitle("Fenêtre modification machine");
        stage.setScene(modifiermachine.getFenêtre_Modification_Machine()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show();
        
        // Gestionnaire pour le bouton "Machines"
     modifiermachine.getBtnEtat().setOnAction(e->{
         
     });
        // Gestionnaire pour le bouton "Machines"
     modifiermachine.getBtnIdentité().setOnAction(e->{       
     });     
      
     modifiermachine.getBtnAjoutopération().setOnAction(e->{      
     });
               
    modifiermachine.getBtnSuppressionopération().setOnAction(e->{      
     });
    
   modifiermachine.getBtnHome().setOnAction(e->{  
       stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage); // Redirige vers la fenêtre d'accueil
     });
}
}
