/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.Gamme;
import Modele.ModèleCarte;
import Vue.Affichage_Gamme;
import javafx.stage.Stage;

/**
 *
 * @author alicedeboever
 */
public class Fenêtre_Affichage_Gamme {
    private Affichage_Gamme Affichage_Gamme ;
     private ModèleCarte modeleCarte;
    public Fenêtre_Affichage_Gamme(Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        Affichage_Gamme = new Affichage_Gamme();

        stage.setTitle("Affichage d'une gamme");
        stage.setScene(Affichage_Gamme.getFenetre_affichage_gamme()); // Appelle la méthode pour obtenir la scène de la vue
        Affichage_Gamme.getComboGamme().getItems().setAll(Gamme.getListeGammes());
        stage.show();
        
        Affichage_Gamme.getBtnAfficher().setOnAction(e -> {
            Gamme gammeChoisie = Affichage_Gamme.getComboGamme().getValue();
            if (gammeChoisie != null) {
                StringBuilder details = new StringBuilder(); // créer l'espace ou on va tout mettre
                details.append("Référence : ").append(gammeChoisie.getRefGamme()).append("\n");
                
                details.append("\nOpérations associées :\n");
                for (var op : gammeChoisie.getListeOperation()) { 
                    details.append(" - ").append(op.getRefOperation()).append(" : ").append(op.getdOperation()).append("\n");
                }

                details.append("\nMachines associées:\n");
                for (var equip : gammeChoisie.getListeEquipement()) {
                    details.append(" - ").append(equip.getRefEquipement()).append(" ").append(equip.getdEquipement()).append("\n");
                }
                
                details.append("\nProduits associés:\n");
                for (var prod : gammeChoisie.getListeProduit()) {
                    details.append(" - ").append(prod.getDproduit()).append(" ").append(prod.getCodeProduit()).append("\n");
                }

                Affichage_Gamme.getAffichageGamme().setText(details.toString());
    
            } else {
                Affichage_Gamme.getAffichageGamme().setText("Veuillez sélectionner une gamme.");
            }
        
        });
        
        Affichage_Gamme.getBtnHome().setOnAction(e -> {
            stage.close();
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
        });
    }
}
