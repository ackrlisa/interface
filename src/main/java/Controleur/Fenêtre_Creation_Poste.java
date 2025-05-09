/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;
import Vue.Creation_Poste;
import Modele.Machine;
import Modele.Poste;
import javafx.stage.Stage;
import java.util.ArrayList;
/**
 *
 * @author alicedeboever
 */
public class Fenêtre_Creation_Poste {
    private Creation_Poste creationPoste;
    private ArrayList<Machine> machinesAjoutees = new ArrayList<>();

    public Fenêtre_Creation_Poste(Stage stage) {
        creationPoste = new Creation_Poste();
        stage.setTitle("Création d’un poste");
        stage.setScene(creationPoste.getFenetreCreationPoste());
        creationPoste.getComboMachines().getItems().addAll(Machine.getListeMachines());
        stage.show();


        creationPoste.getAjouterMachine().setOnAction(e -> {
            Machine machineChoisie = creationPoste.getComboMachines().getValue();
            if (machineChoisie != null && !machinesAjoutees.contains(machineChoisie)) {
                machinesAjoutees.add(machineChoisie);
                updateMachinesAffichees();
            }
        });

        creationPoste.getCreerPoste().setOnAction(e -> {
            String refPoste = creationPoste.getRefPoste().getText();
            String dPoste = creationPoste.getdPoste().getText();

            if (refPoste.isEmpty() || dPoste.isEmpty()) {
                creationPoste.getResultat().setText("Veuillez remplir tous les champs.");
            } else {
                Poste nouveauPoste = new Poste(machinesAjoutees, dPoste, refPoste);
                nouveauPoste.setListeMachine(machinesAjoutees);
                
                creationPoste.getResultat().setText("Poste créé avec succès !");
                creationPoste.getRefPoste().clear();
                creationPoste.getdPoste().clear();
                machinesAjoutees.clear();
                creationPoste.getMachinesAjoutees().clear();
            }
        });

        creationPoste.getHome().setOnAction(e -> {
            stage.close();
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage);
        });
    }

    private void updateMachinesAffichees() { // methode pour afficher les machines ajoutée au poste
        StringBuilder builder = new StringBuilder();
        for (Machine machine : machinesAjoutees) {
            builder.append(machine.toString()).append("\n");
        }
        creationPoste.getMachinesAjoutees().setText(builder.toString());
    }

    
}
