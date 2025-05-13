/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.Element;
import Modele.ModèleCarte;
import Vue.Affichage_Stock_Brut;
import javafx.stage.Stage;

/**
 *
 * @author alicedeboever
 */
public class Fenêtre_Affichage_Stock_Brut {
    private Affichage_Stock_Brut Affichage_Stock_Brut ;
     private ModèleCarte modeleCarte;
    
    public Fenêtre_Affichage_Stock_Brut(Stage stage, ModèleCarte modeleCarte){
       this.modeleCarte=modeleCarte;
        
        Affichage_Stock_Brut = new Affichage_Stock_Brut();

        stage.setTitle("Affichage du stock brut");
        stage.setScene(Affichage_Stock_Brut.getFenêtre_affichage_stock_brut()); // Appelle la méthode pour obtenir la scène de la vue
        stage.show();
        
        StringBuilder details = new StringBuilder();
        if (Element.getListeStockBrut().isEmpty()) {
            details.append("Le stock brut est vide.");
        } else {
            for (Element element : Element.getListeStockBrut()) {
                details.append(" - ").append(element).append("\n");
            }
        }
        
        Affichage_Stock_Brut.getAffichageStockBrut().setText(details.toString());
        
        Affichage_Stock_Brut.getBtnHome().setOnAction(e -> {
            stage.close();
            // Crée une nouvelle fenêtre d'accueil
            Stage accueilStage = new Stage();
            new Fenêtre_Accueil(accueilStage,modeleCarte); // Redirige vers la fenêtre d'accueil
        });

    }
}
