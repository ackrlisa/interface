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
    private static ArrayList<Element> listeStock = new ArrayList<>();


    public static void setListeStock(ArrayList<Element> listeStock) {
        StockBrut.listeStock = listeStock;
    }

    

    // Ajouter un élément au stock
    public static void ajouterAuStock(Element element) {
        listeStock.add(element);
    }

    // Supprimer un élément du stock
    public static void supprimerAuStock(Element element) {
        listeStock.remove(element);
    }

    // Récupérer la liste complète
    public static ArrayList<Element> getListeStock() {
        return listeStock;
    }

    // Afficher le contenu du stock
    public static void afficheStock() {
        if (listeStock.isEmpty()) {
            System.out.println("Le stock BRUT est vide.");
        } else {
            System.out.println("Stock BRUT :");
            for (Element element : listeStock) {
                System.out.println("- " + element);
            }
        }
    }
}

    
    

