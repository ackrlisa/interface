/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_atelier_interface;

/**
 *
 * @author lisaa
 */
public class ProduitsFinis {
   private String nom;
   private float prix;
   private float quantiteStock;

    public String getNom() {
        return nom;
    }

    public float getPrix() {
        return prix;
    }

    public float getQuantiteStock() {
        return quantiteStock;
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
    }
   
   
      public void afficheProduitFini(){
    System.out.println("Le produit"+this.nom+" est fabriqué et disponible en"+ this.quantiteStock+" exemplaires.");
    System.out.println("Prix à l'unité:"+ this.prix+" euros.");
    }
}
