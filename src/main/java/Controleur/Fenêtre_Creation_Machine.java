/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

/**
 *
 * @author alicedeboever
 */
import Vue.Creation_Machine;
import Modele.Machine;
import Modele.ModèleCarte;
import javafx.stage.Stage;
import java.util.ArrayList;

/**
 *
 * @author alicedeboever
 */
public class Fenêtre_Creation_Machine {
    private Creation_Machine creationMachine;
     private ModèleCarte modeleCarte;

    public Fenêtre_Creation_Machine(Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        creationMachine = new Creation_Machine();
        stage.setTitle("Création d'une machine");
        stage.setScene(creationMachine.getFenêtre_creation_machine());
        stage.show();

        creationMachine.getCreer().setOnAction(e -> {
            try {
                String ref = creationMachine.getRefMachine().getText();
                String description = creationMachine.getdMachine().getText();
                float x = Float.parseFloat(creationMachine.getX().getText());
                float y = Float.parseFloat(creationMachine.getY().getText());
                float cout = Float.parseFloat(creationMachine.getCout().getText());
                String type = creationMachine.getType().getText();

                // Tu peux modifier ces deux listes si tu veux permettre leur saisie dans l'UI
                ArrayList<Modele.Operation> operations = new ArrayList<>();
                Modele.Poste poste = null;
                ArrayList<Modele.Operateur> operateurs = new ArrayList<>();

                Machine machine = new Machine(ref, description, x, y, cout, operations, type, poste, operateurs);
                
               //ajout machine au modèle pour récupérer pour la carte
               modeleCarte.ajoutMachine(ref, description, x, y, cout, operations, type, poste, operateurs);
               
               
                creationMachine.getResultat().setText("Machine créée avec succès !");
                // Optionnel : Réinitialiser les champs de la vue après la création
                creationMachine.getRefMachine().clear();
                creationMachine.getdMachine().clear();
                creationMachine.getX().clear();
                creationMachine.getY().clear();
                creationMachine.getCout().clear();
                creationMachine.getType().clear();



            } catch (NumberFormatException ex) {
                creationMachine.getResultat().setText("Veuillez entrer des valeurs numériques valides pour X, Y et coût.");
                creationMachine.getRefMachine().clear();
                creationMachine.getdMachine().clear();
                creationMachine.getX().clear();
                creationMachine.getY().clear();
                creationMachine.getCout().clear();
                creationMachine.getType().clear();
            } catch (Exception ex) {
                creationMachine.getResultat().setText("Une erreur est survenue.");
                creationMachine.getRefMachine().clear();
                creationMachine.getdMachine().clear();
                creationMachine.getX().clear();
                creationMachine.getY().clear();
                creationMachine.getCout().clear();
                creationMachine.getType().clear();
            }
        });
creationMachine.getCarte().setOnAction(e-> {
            stage.close();
            Stage carteStage= new Stage();
            new Fenêtre_CarteFx (carteStage, modeleCarte);
           });
        creationMachine.getHome().setOnAction(e -> {
            stage.close();
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte);
        });
    }
}
