/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;
import Modele.Machine;
import Modele.ModèleCarte;
import Vue.Modification_Identite_Machine;
import java.util.ArrayList;
import javafx.stage.Stage;

/**
 *
 * @author PC
 */
public class Fenêtre_Modification_Identite_Machine {
    private Modification_Identite_Machine Modification_Identite_Machine;
    private ModèleCarte modeleCarte;
    
    public Fenêtre_Modification_Identite_Machine (Stage stage, ModèleCarte modeleCarte) {
    Modification_Identite_Machine = new Modification_Identite_Machine();
    this.modeleCarte=modeleCarte;
    
    stage.setTitle("Modification de l'identité de la machine");
        stage.setScene(Modification_Identite_Machine.getFenêtre_modification_identite_machine());
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
                    
                    ArrayList<Modele.Operation> operations = new ArrayList<>();
                    Modele.Poste poste = null;
                    ArrayList<Modele.Operateur> operateurs = new ArrayList<>();

                    machineChoisie.setRefMachine(ref);
                    machineChoisie.setdEquipement(description);
                    machineChoisie.setX(x);
                    machineChoisie.setY(y);
                    machineChoisie.setCout(cout);
                    machineChoisie.setType(type);
                
                    Modification_Identite_Machine.getErreur().setText("Machine modifiée avec succès !");
                
                //Réinitialise les champs de la vue après la création
                    Modification_Identite_Machine.getRefMachine().clear();
                    Modification_Identite_Machine.getdMachine().clear();
                    Modification_Identite_Machine.getX().clear();
                    Modification_Identite_Machine.getY().clear();
                    Modification_Identite_Machine.getCout().clear();
                    Modification_Identite_Machine.getType().clear();

                } catch (NumberFormatException ex) {
                    Modification_Identite_Machine.getErreur().setText("Veuillez entrer des valeurs numériques valides pour X, Y et coût.");
                    // Optionnel : Réinitialiser les champs de la vue après l'erreur
                    Modification_Identite_Machine.getRefMachine().clear();
                    Modification_Identite_Machine.getdMachine().clear();
                    Modification_Identite_Machine.getX().clear();
                    Modification_Identite_Machine.getY().clear();
                    Modification_Identite_Machine.getCout().clear();
                    Modification_Identite_Machine.getType().clear();
                } catch (Exception ex) {
                    Modification_Identite_Machine.getErreur().setText("Une erreur est survenue.");
                // Optionnel : Réinitialiser les champs de la vue après l'erreur
                    Modification_Identite_Machine.getRefMachine().clear();
                    Modification_Identite_Machine.getdMachine().clear();
                    Modification_Identite_Machine.getX().clear();
                    Modification_Identite_Machine.getY().clear();
                    Modification_Identite_Machine.getCout().clear();
                    Modification_Identite_Machine.getType().clear();
                }             
            }else{
                Modification_Identite_Machine.getErreur().setText("Veuillez sélectionner une machine.");
            }
        });
        
        Modification_Identite_Machine.getBtnHome().setOnAction(e -> {
            stage.close();
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte);
        });
    }
}
