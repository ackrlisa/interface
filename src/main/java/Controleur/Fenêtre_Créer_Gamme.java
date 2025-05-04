/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.Gamme;
import Modele.Machine;
import Vue.Créer_Gamme;
import Vue.Gestion_Gamme;
import java.util.ArrayList;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Créer_Gamme {
    private Créer_Gamme créergamme;
    public Fenêtre_Créer_Gamme(Stage stage){
        créergamme= new Créer_Gamme();
        
        stage.setTitle("Fenêtre création de gammes");
        stage.setScene(créergamme.getFenêtre_Créer_Gamme()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show();
        
        créergamme.getHome().setOnAction(e->{  
       stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage); // Redirige vers la fenêtre d'accueil
     });
        
        
}
}