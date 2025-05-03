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
   private float quantiteStock;
   private static ArrayList<ProduitsFinis> listeProduitsFinis = new ArrayList<>(); 


    public String getNom() {
        return nom;
    }

    public float getPrix() {
        return prix;
    }

    public float getQuantiteStock() {
        return quantiteStock;
    }

    public static ArrayList<ProduitsFinis> getListeProduitsFinis() {
        return listeProduitsFinis;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setQuantiteStock(float quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public ProduitsFinis(String nom, float prix, float quantiteStock) {
        this.nom = nom;
        this.prix = prix;
        this.quantiteStock = quantiteStock;
        listeProduitsFinis.add(this);
    }
   
   
      public void afficheProduitFini(){
    System.out.println("Le produit"+this.nom+" est fabriqué et disponible en"+ this.quantiteStock+" exemplaires.");
    System.out.println("Prix à l'unité:"+ this.prix+" euros.");
    }
    
    public static void ajouterProduitFini(String nom, float prix, float quantiteStock) {
        ProduitsFinis nouveau = new ProduitsFinis(nom, prix, quantiteStock);
        System.out.println("Produit ajouté : " + nouveau.nom);
    }

    
    public static void supprimerProduitFini(ProduitsFinis produit) {
        if (listeProduitsFinis.remove(produit)) {
            System.out.println("Produit supprimé : " + produit.getNom());
        } else {
            System.out.println("Le produit n'existe pas dans la liste.");
        }
    }
}
