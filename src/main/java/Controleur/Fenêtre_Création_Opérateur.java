/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Modele.Operateur;
import Vue.Création_Opérateur;
import javafx.stage.Stage;

/**
 *
 * @author lisaa
 */
public class Fenêtre_Création_Opérateur {
   
    private Création_Opérateur creationOperateur;
    private ModèleCarte modeleCarte;

    public Fenêtre_Création_Opérateur(Stage stage, ModèleCarte modeleCarte) {
        this.modeleCarte = modeleCarte;

        // Initialisation de la vue
        creationOperateur = new Création_Opérateur();

        // Configuration de la fenêtre
        stage.setTitle("Création d'un opérateur");
        stage.setScene(creationOperateur.getFenêtre_Création_Opérateur());
        stage.show();

        // Gestion de l'événement pour le bouton "Créer l'opérateur"
        creationOperateur.getCréerOperateur().setOnAction(e -> {
            // Récupération des données entrées
            String code = creationOperateur.getCode().getText();
            String nom = creationOperateur.getNom().getText();
            String prénom = creationOperateur.getPrénom().getText();
            String compétence = creationOperateur.getCompétence().getText();
            String statut = creationOperateur.getStatut().getText();

            // Vérification des champs vides
            if (code.isEmpty() || nom.isEmpty() || prénom.isEmpty() || compétence.isEmpty() || statut.isEmpty()) {
                creationOperateur.getResultat().setText("Veuillez remplir tous les champs.");
                return;
            }

            try {
                // Création d'un nouvel opérateur
                Operateur nouvelOperateur = new Operateur( compétence, code,  nom,  prénom);
                
                // Confirmation de la création
                creationOperateur.getResultat().setText("Opérateur créé avec succès !");
                creationOperateur.getCode().clear();
                creationOperateur.getNom().clear();
                creationOperateur.getPrénom().clear();
                creationOperateur.getCompétence().clear();
                creationOperateur.getStatut().clear();
            } catch (Exception ex) {
                creationOperateur.getResultat().setText("Erreur lors de la création de l'opérateur.");
            }
        });

        // Gestion de l'événement pour le bouton "HOME"
        creationOperateur.getHome().setOnAction(e -> {
            stage.close();
           Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage, modeleCarte);
        });
    }
}
