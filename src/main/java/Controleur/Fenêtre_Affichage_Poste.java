/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;
import Vue.Affichage_Poste ;
import Modele.Poste ;
import Modele.ModèleCarte;
import javafx.stage.Stage;
/**
 *
 * @author alicedeboever
 */
public class Fenêtre_Affichage_Poste {
    private Affichage_Poste Affichage_Poste ;
     private ModèleCarte modeleCarte;
    
    public Fenêtre_Affichage_Poste (Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        Affichage_Poste = new Affichage_Poste();
    
        stage.setTitle("Affichage d'un poste");
        stage.setScene(Affichage_Poste.getFenêtre_affichage_poste()); // Appelle la méthode pour obtenir la scène de la vue
        Affichage_Poste.getComboPoste().getItems().setAll(Poste.getListePostes());
        stage.show();
        

    Affichage_Poste.getBtnAfficher().setOnAction(e -> {
            Poste posteChoisi = Affichage_Poste.getComboPoste().getValue();
            if (posteChoisi != null) {
                StringBuilder details = new StringBuilder(); // créer l'espace ou on va tout mettre
                details.append("Référence : ").append(posteChoisi.getRefEquipement()).append("\n");
                details.append("Description : ").append(posteChoisi.getdEquipement()).append("\n");

                details.append("\nMachine associées :\n");
                for (var machine : posteChoisi.getListeMachine()) {
                    details.append(" - ").append(machine.getRefEquipement()).append(" : ").append(machine.getdEquipement()).append("\n");
                }

                Affichage_Poste.getAffichagePoste().setText(details.toString());
    
            } else {
                Affichage_Poste.getAffichagePoste().setText("Veuillez sélectionner un poste.");
            }
        });
        
        Affichage_Poste.getBtnHome().setOnAction(e -> {
            stage.close();
            
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
        });
    }
}
