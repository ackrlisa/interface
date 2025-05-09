/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

import java.util.ArrayList;

/**
 *
 * @author alicedeboever
 */
public class Element {
    private String designation;
    private int quantite;
    private static ArrayList<Element> listeStockBrut = new ArrayList<>(); 

    public Element(String designation, int quantite) {
        this.designation = designation;
        this.quantite = quantite;
    }
    
    public String getDesignation() {
        return designation;
    }
    
    public int getQuantite() {
        return quantite;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    public static ArrayList<Element> getListeStockBrut() {
        return listeStockBrut;
    }
    
    public static void ajouterAuStockBrut(Element element) {
        for (Element e : listeStockBrut) {
            if (e.getDesignation().equalsIgnoreCase(element.getDesignation())) {
                e.setQuantite(e.getQuantite() + element.getQuantite());
                return;
            }
        }
        listeStockBrut.add(element);
    }

    public static void supprimerDuStockBrut(Element element) {
        for (Element e : listeStockBrut) {
            if (e.getDesignation().equalsIgnoreCase(element.getDesignation())) {
                int nouvelleQuantite = (e.getQuantite() - element.getQuantite());
                if (nouvelleQuantite <= 0) {
                    listeStockBrut.remove(e); // Retire complètement si la quantité est 0 ou négative
                } else {
                    e.setQuantite(nouvelleQuantite);
                }
                return;
            }
        }
        // Sinon, on ne fait rien car l'élément n'existe pas dans le stock
    }

    @Override
    public String toString() {
        return designation + " - Quantité : " + quantite;
    }
}
