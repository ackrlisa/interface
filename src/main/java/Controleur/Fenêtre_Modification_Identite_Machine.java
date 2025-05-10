/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;
import Modele.Machine;
import Vue.Modification_Identite_Machine;
import java.util.ArrayList;
import javafx.stage.Stage;

/**
 *
 * @author PC
 */
public class Fenêtre_Modification_Identite_Machine {
    private Modification_Identite_Machine Modification_Identite_Machine;
    
    public Fenêtre_Modification_Identite_Machine (Stage stage) {
    Modification_Identite_Machine = new Modification_Identite_Machine();
    
    stage.setTitle("Affichage d'une machine");
        stage.setScene(Modification_Identite_Machine.getFenêtre_modification_identite_machine()); // Appelle la méthode pour obtenir la scène de la vue
        Modification_Identite_Machine.getComboMachine().getItems().setAll(Machine.getListeMachines());
        stage.show();
    
        Modification_Identite_Machine.getBtnOk().setOnAction(e -> {
            Machine machineChoisie = Modification_Identite_Machine.getComboMachine().getValue();
            if (machineChoisie != null) {
                try {
                String ref = Modification_Identite_Machine.getRefMachine().getText();
                String description = Modification_Identite_Machine.getdMachine().getText();
                float x = Float.parseFloat(Modification_Identite_Machine.getX().getText());
                float y = Float.parseFloat(Modification_Identite_Machine.getY().getText());
                float cout = Float.parseFloat(Modification_Identite_Machine.getCout().getText());
                String type = Modification_Identite_Machine.getType().getText();

                // Tu peux modifier ces deux listes si tu veux permettre leur saisie dans l'UI
                ArrayList<Modele.Operation> operations = new ArrayList<>();
                Modele.Poste poste = null;
                ArrayList<Modele.Operateur> operateurs = new ArrayList<>();

                Machine machine = new Machine(ref, description, x, y, cout, operations, type, poste, operateurs);
                Modification_Identite_Machine.getBtnOk().setText("Machine modifiée avec succès !");
                // Optionnel : Réinitialiser les champs de la vue après la création
                Modification_Identite_Machine.getRefMachine().clear();
                Modification_Identite_Machine.getdMachine().clear();
                Modification_Identite_Machine.getX().clear();
                Modification_Identite_Machine.getY().clear();
                Modification_Identite_Machine.getCout().clear();
                Modification_Identite_Machine.getType().clear();



            } catch (NumberFormatException ex) {
                Modification_Identite_Machine.getBtnOk().setText("Veuillez entrer des valeurs numériques valides pour X, Y et coût.");
                Modification_Identite_Machine.getRefMachine().clear();
                Modification_Identite_Machine.getdMachine().clear();
                Modification_Identite_Machine.getX().clear();
                Modification_Identite_Machine.getY().clear();
                Modification_Identite_Machine.getCout().clear();
                Modification_Identite_Machine.getType().clear();
            } catch (Exception ex) {
                Modification_Identite_Machine.getBtnOk().setText("Une erreur est survenue.");
                Modification_Identite_Machine.getRefMachine().clear();
                Modification_Identite_Machine.getdMachine().clear();
                Modification_Identite_Machine.getX().clear();
                Modification_Identite_Machine.getY().clear();
                Modification_Identite_Machine.getCout().clear();
                Modification_Identite_Machine.getType().clear();
            }
                
            }else{
                Modification_Identite_Machine.getBtnErreur().setText("Veuillez sélectionner une machine.");
            }
        });
    }
}
