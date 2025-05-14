/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Modele.TestFichier;
import Vue.Fiabilite_Atelier;
import java.util.Arrays;
import java.util.Map;
import javafx.stage.Stage;
import javafx.scene.control.Label;

/**
 *
 * @author PC
 */
public class Fenêtre_Fiabilité {
    private Fiabilite_Atelier fiabilite;
     private ModèleCarte modeleCarte;
    String c;
    
    public Fenêtre_Fiabilité (Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        fiabilite= new Fiabilite_Atelier();
        
        stage.setTitle("Fenêtre fiabilité");
        stage.setScene(fiabilite.getFenêtre_Fiabilite_Atelier()); //Appelle la méthode d'instance de la fenêtre accueil
        stage.show();
        
        fiabilite.getBtnHome().setOnAction(e -> {
            // Ferme la fenêtre de maintenance
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte);
        });
        
        fiabilite.getBtnInserer().setOnAction(e -> {
            c= fiabilite.getChemin_acces().getText();
            fiabilite.getOk().setText("fichier inséré avec succès!");          
        });
        
        fiabilite.getBtnFiabilite_par_machine().setOnAction(e -> {
            TestFichier test = new TestFichier();
            test.Test();
            fiabilite.getReponse().setText("Fiabilite des machines:\n "+ String.join("\n",test.getListe_fiabilité().toString()));        
        });
        
        fiabilite.getBtnOrdrefiabilite().setOnAction(e -> {
            TestFichier test = new TestFichier();
            test.Test();
            String texte = "Machines par ordres decroissants de fiabilite:\n" + String.join("\n", test.fiabilite_decroissant ());
            fiabilite.getReponse().setText(texte);
        });
    }
    
    
}
