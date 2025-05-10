/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.StockBrut;
import Modele.Element;
import Modele.ModèleCarte;
import Vue.Création_Stock_Brut;
import java.util.ArrayList;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Création_Stock_Brut {
    private Création_Stock_Brut creationstockbrut;
     private ModèleCarte modeleCarte;

    public Fenêtre_Création_Stock_Brut(Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        creationstockbrut = new Création_Stock_Brut();
        stage.setTitle("Ajout stock brut");
        stage.setScene(creationstockbrut.getFenêtre_Création_Stock_Brut());
        stage.show();

        creationstockbrut.getAjouter().setOnAction(e -> {
            try{
                String designation = creationstockbrut.getDesignation().getText();
                int quantite = (int) Float.parseFloat(creationstockbrut.getQuantite().getText());
                Element element = new Element(designation,quantite);
                Element.ajouterAuStockBrut(element);
               

                creationstockbrut.getResultat().setText("Element ajouté avec succès");
                // Optionnel : Réinitialiser les champs de la vue après la création
                creationstockbrut.getQuantite().clear();
                creationstockbrut.getDesignation().clear();
                
            } catch (NumberFormatException ex) {
                creationstockbrut.getResultat().setText("Veuillez entrer une valeur numérique valide pour la quantité");
                creationstockbrut.getDesignation().clear();
                creationstockbrut.getQuantite().clear();
                
            } catch (Exception ex) {
                creationstockbrut.getResultat().setText("Une erreur est survenue.");
                creationstockbrut.getDesignation().clear();
                creationstockbrut.getQuantite().clear();
                
            }
        });

        creationstockbrut.getHome().setOnAction(e -> {
            stage.close();
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte);
        });
    
    }
}

