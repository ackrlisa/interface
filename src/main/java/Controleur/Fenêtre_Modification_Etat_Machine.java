/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.EtatMachine;
import Modele.Machine;
import Modele.ModèleCarte;
import Vue.Modification_Etat_Machine;
import javafx.stage.Stage;

/**
 *
 * @author PC
 */
public class Fenêtre_Modification_Etat_Machine {
    private Modification_Etat_Machine Modification_Etat_Machine;
     private ModèleCarte modeleCarte;
    
    public Fenêtre_Modification_Etat_Machine (Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        Modification_Etat_Machine= new Modification_Etat_Machine();
        
        stage.setTitle("Fenêtre modification état machine");
        stage.setScene(Modification_Etat_Machine.getFenêtre_Modification_Etat_Machine());
        stage.show();
       
     Modification_Etat_Machine.getBtnOperationnel().setOnAction(e->{
         Machine machineChoisie = Modification_Etat_Machine.getComboMachine().getValue();
            if (machineChoisie != null) {
                machineChoisie.setEtatMachine(EtatMachine.OPERATIONNEL_DISPO);
                machineChoisie.setDispo(true);
                Modification_Etat_Machine.getErreur().setText("La machine est maintenant opérationnelle et disponible ");
            }else{
                Modification_Etat_Machine.getErreur().setText("Veuillez sélectionner une machine");
            }
     });
     
     Modification_Etat_Machine.getBtnOperationnel2().setOnAction(e->{
         Machine machineChoisie = Modification_Etat_Machine.getComboMachine().getValue();
            if (machineChoisie != null) {
                machineChoisie.setEtatMachine(EtatMachine.OPERATIONNEL_OCCU);
                machineChoisie.setDispo(true);
                Modification_Etat_Machine.getErreur().setText("La machine est maintenant opérationnelle et occupée ");
            }else{
                Modification_Etat_Machine.getErreur().setText("Veuillez sélectionner une machine");
            }
     });
     Modification_Etat_Machine.getBtnPanne().setOnAction(e->{
         Machine machineChoisie = Modification_Etat_Machine.getComboMachine().getValue();
            if (machineChoisie != null) {
                machineChoisie.setEtatMachine(EtatMachine.ARRET_PANNE);
                machineChoisie.setDispo(false);
                Modification_Etat_Machine.getErreur().setText("La machine est maintenant en arrêt pour panne");
            }else{
                Modification_Etat_Machine.getErreur().setText("Veuillez sélectionner une machine");
            }
     });
     Modification_Etat_Machine.getBtnMaintenance().setOnAction(e->{
         Machine machineChoisie = Modification_Etat_Machine.getComboMachine().getValue();
            if (machineChoisie != null) {
                machineChoisie.setEtatMachine(EtatMachine.ARRET_MAINTENANCE);
                machineChoisie.setDispo(false);
                Modification_Etat_Machine.getErreur().setText("La machine est maintenant en arrêt pour maintenance");
            }else{
                Modification_Etat_Machine.getErreur().setText("Veuillez sélectionner une machine");
            }
     });
     Modification_Etat_Machine.getBtnHome().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
        });
    }
}
