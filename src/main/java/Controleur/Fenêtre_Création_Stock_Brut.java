/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.StockBrut;
import Vue.Création_Stock_Brut;
import java.util.ArrayList;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Création_Stock_Brut {
    private Création_Stock_Brut creationstockbrut;

    public Fenêtre_Création_Stock_Brut(Stage stage) {
        creationstockbrut = new Création_Stock_Brut();
        stage.setTitle("Ajout stock brut");
        stage.setScene(creationstockbrut.getFenêtre_Création_Stock_Brut());
        stage.show();

        creationstockbrut.getAjouter().setOnAction(e -> {
            try{
                String designation = creationstockbrut.getDesignation().getText();
                String quantite = creationstockbrut.getQuantite().getText();
                
                // Tu peux modifier ces deux listes si tu veux permettre leur saisie dans l'UI
                ArrayList<Modele.Operation> operations = new ArrayList<>();
                Modele.Poste poste = null;
                ArrayList<Modele.Operateur> operateurs = new ArrayList<>();

                StockBrut stockbrut = new StockBrut(quantite, designation);
                creationstockbrut.getResultat().setText("Machine créée avec succès !");
                // Optionnel : Réinitialiser les champs de la vue après la création
                creationstockbrut.getQuantite().clear();
                creationstockbrut.getDesignation().clear();
                
            } catch (NumberFormatException ex) {
                creationstockbrut.getResultat().setText("Veuillez entrer des valeurs numériques valides pour X, Y et coût.");
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
            new Fenêtre_Accueil(accueilStage);
        });
    
    }}

