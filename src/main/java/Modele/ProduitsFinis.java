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
public class ProduitsFinis {
   private String nom;
   private float prix;
   private int quantité;
   private static ArrayList<ProduitsFinis> listeStockProduitsFinis = new ArrayList<>();



    public String getNom() {
        return nom;
    }

    public float getPrix() {
        return prix;
    }

    public int getQuantité() {
        return quantité;
    }

    public static ArrayList<ProduitsFinis> getListeStockProduitsFinis() {
        return listeStockProduitsFinis;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }

    public ProduitsFinis(String nom, float prix, int quantité) {
        this.nom = nom;
        this.prix = prix;
        this.quantité = quantité;
    }
    
    public static void ajouterAuStockProduitsFinis(ProduitsFinis produitfini) {
        for (ProduitsFinis pf : listeStockProduitsFinis) {
            if (pf.getNom().equalsIgnoreCase(produitfini.getNom())) {
                pf.setQuantité(pf.getQuantité() + produitfini.getQuantité());
                return;
            }
        }
        listeStockProduitsFinis.add(produitfini);
    }

    public static void supprimerDuStockProduitsFinis(ProduitsFinis produitfini) {
        for (ProduitsFinis pf : listeStockProduitsFinis) {
            if (pf.getNom().equalsIgnoreCase(produitfini.getNom())) {
                int nouvelleQuantite = (pf.getQuantité() - produitfini.getQuantité());
                if (nouvelleQuantite <= 0) {
                    listeStockProduitsFinis.remove(pf); // Retire complètement si la quantité est 0 ou négative
                } else {
                    pf.setQuantité(nouvelleQuantite);
                }
                return;
            }
        }
        // Sinon, on ne fait rien car l'élément n'existe pas dans le stock
    }
   
   @Override
    public String toString() {
        return nom + " - Quantité : " + quantité + " - Prix : "+prix;
    }
    
    
    
}
