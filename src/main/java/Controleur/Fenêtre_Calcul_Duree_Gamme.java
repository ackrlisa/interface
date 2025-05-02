/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Vue.Calcul_Duree_Gamme;
import Modele.Gamme;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import Modele.Equipement ;
import Modele.Machine ;
import Modele.Operation ;
import Modele.Operateur ;
import Modele.Poste ;
import java.util.ArrayList;

/**
 *
 * @author alicedeboever
 */
public class Fenêtre_Calcul_Duree_Gamme {
    private Calcul_Duree_Gamme Calcul_Duree_Gamme ;
    
    public Fenêtre_Calcul_Duree_Gamme(Stage stage){
        // Création des opérations
//Operation op1 = new Operation("OP01", "Découpe", "M01", 2.0f);
//Operation op2 = new Operation("OP02", "Assemblage", "M01", 1.5f);
//ArrayList<Operation> operationsPourMachine = new ArrayList<>();
//operationsPourMachine.add(op1);
//operationsPourMachine.add(op2);

// Création d'une machine
//ArrayList<Operateur> operateurs = new ArrayList<>();
//Machine machine1 = new Machine(
 //       "M01",                      // refMachine
 //       "Machine découpe",         // dMachine
 //       50.0f,                      // coût horaire
   //     operationsPourMachine,     // liste des opérations
     //   "Type A",                  // type
       // null,                      // poste (on le mettra juste après)
       // operateurs                 // opérateurs
//);

// Création du poste contenant cette machine
//ArrayList<Machine> machinesDuPoste = new ArrayList<>();
//machinesDuPoste.add(machine1);
//Poste poste = new Poste(machinesDuPoste, "Poste découpe", "P01");
//machine1.setPoste(poste); // on lie la machine au poste (rétro-lien)

// Création de la gamme
//ArrayList<Operation> operationsGamme = new ArrayList<>();
//operationsGamme.add(op1);
//operationsGamme.add(op2);

//ArrayList<Equipement> equipementsGamme = new ArrayList<>();
//equipementsGamme.add(machine1); // ou poste si tu veux que la gamme fonctionne par poste

//Gamme gamme = new Gamme("G01", operationsGamme, equipementsGamme);

        Calcul_Duree_Gamme = new Calcul_Duree_Gamme();

        stage.setTitle("Calcul de la durée de la gamme");
        stage.setScene(Calcul_Duree_Gamme.getFenetre_calcul_duree_gamme()); // Appelle la méthode pour obtenir la scène de la vue
        stage.show();
        
        //Calcul_Duree_Gamme.getComboGamme().getItems().clear();
        //Calcul_Duree_Gamme.getComboGamme().getItems().add(gamme);
        
        Calcul_Duree_Gamme.getBtnCalculer().setOnAction(e -> {
            Gamme gammeChoisie = Calcul_Duree_Gamme.getComboGamme().getValue();
            if (gammeChoisie != null) {
                // Calcul du coût et affichage du résultat
                float duree = gammeChoisie.dureeGamme();
                Calcul_Duree_Gamme.getAffichageResultat().setText("Durée total de la gamme : " + duree + " heures ");
            } else {
                Calcul_Duree_Gamme.getAffichageResultat().setText("Veuillez sélectionner une gamme.");
            }
        });
        
        Calcul_Duree_Gamme.getBtnHome().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage); // Redirige vers la fenêtre d'accueil
        });
        
    }
}
