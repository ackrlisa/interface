/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.ModèleCarte;
import Modele.Element;
import Vue.Supprimer_Stockbrut;
import javafx.stage.Stage;

/**
 *
 * @author alicedeboever
 */
public class Fenêtre_Supprimer_Stockbrut {
    private Supprimer_Stockbrut supprimerelement ;
    private ModèleCarte modeleCarte;
    
    public Fenêtre_Supprimer_Stockbrut(Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        supprimerelement = new Supprimer_Stockbrut();

        stage.setTitle("Suppression d'un élément du stock brut");
        stage.setScene(supprimerelement.getFenêtre_supprimer_stockbrut()); 
        supprimerelement.getComboElement().getItems().setAll(Element.getListeStockBrut());
        stage.show();
        
        supprimerelement.getBtnSupprimer().setOnAction(e -> {
           Element elementChoisi = supprimerelement.getComboElement().getValue();
           String texteQuantiteASupprimer = supprimerelement.getQuantiteASupprimer().getText();

            if (elementChoisi != null && texteQuantiteASupprimer != null && !texteQuantiteASupprimer.isEmpty()) {
                try {
                    int quantiteDemandee = Integer.parseInt(texteQuantiteASupprimer);
                    if (quantiteDemandee < 0) {
                        supprimerelement.getResultat().setText("La quantité doit être positive.");
                        return;
                    }else{
                        int quantiteActuelle = elementChoisi.getQuantite(); 
                        int nouvelleQuantite = Math.max(0, quantiteActuelle - quantiteDemandee);
                        elementChoisi.setQuantite(nouvelleQuantite); 
                        supprimerelement.getResultat().setText("Nouvelle quantité : " + nouvelleQuantite);
                    }
                } catch (NumberFormatException ex) {
                    supprimerelement.getResultat().setText("Veuillez entrer une quantité valide.");
                }  
            } else {
                supprimerelement.getResultat().setText("Veuillez sélectionner un produit et entrer une quantité.");
            } 
        });
        
        supprimerelement.getBtnHome().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
        });
    }
}
