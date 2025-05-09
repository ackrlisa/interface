/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

import com.mycompany.projet_atelier_interface.*;
import java.util.ArrayList;

/**
 *
 * @author lisaa
 */
public class StockBrut {
    private String designation;
    private String quantite;
    private static ArrayList<String> listeStock = new ArrayList<>();

    public StockBrut(String designation, String quantite) {
        this.designation = designation;
        this.quantite = quantite;
    }

    

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }

    public static void setListeStock(ArrayList<String> listeStock) {
        StockBrut.listeStock = listeStock;
    }

    public String getQuantite() {
        return quantite;
    }

    // Ajouter un élément au stock
    public static void ajouterAuStock(String element) {
        listeStock.add(element);
    }

    // Supprimer un élément du stock
    public static void supprimerAuStock(String element) {
        listeStock.remove(element);
    }

    // Récupérer la liste complète
    public static ArrayList<String> getListeStock() {
        return listeStock;
    }

    // Afficher le contenu du stock
    public static void afficheStock() {
        if (listeStock.isEmpty()) {
            System.out.println("Le stock BRUT est vide.");
        } else {
            System.out.println("Stock BRUT :");
            for (String element : listeStock) {
                System.out.println("- " + element);
            }
        }
    }
}

    
    

