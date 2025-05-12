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
public class Produit {
    private String codeProduit;
    private String dproduit;
    private ArrayList<Gamme> listeGamme=new ArrayList<>(); // un produit peut avoir plusieurs gammes
private static ArrayList<Produit> listeProduits = new ArrayList<>();

    public Produit(String codeProduit, String dproduit,ArrayList<Gamme> listeGamme) {
        this.codeProduit = codeProduit;
        this.dproduit = dproduit;
        this.listeGamme=listeGamme;
         listeProduits.add(this);
    }
    public Produit(String codeProduit, String dproduit) {
        this.codeProduit = codeProduit;
        this.dproduit = dproduit;
                 listeProduits.add(this);
    }

    public void setListeGamme(ArrayList<Gamme> listeGamme) {
        this.listeGamme = listeGamme;
    }
public static ArrayList<Produit> getListeProduits() {
        return listeProduits;
    }
    public ArrayList<Gamme> getListeGamme() {
        return listeGamme;
    }

    public String getCodeProduit() {
        return codeProduit;
    }

    public String getDproduit() {
        return dproduit;
    }

    public void setCodeProduit(String codeProduit) {
        this.codeProduit = codeProduit;
    }

    public void setDproduit(String dproduit) {
        this.dproduit = dproduit;
    }
    
public void afficheProduit(){
    if((this.codeProduit!=null)&&(this.dproduit!=null)){
        System.out.println("Produit: code "+this.codeProduit+", désignation "+this.dproduit);
    }else{
        System.out.println("Le produit n'existe pas");
    }
}
public void modifierProduit(String nouveauCodeProduit, String nouveauDProduit) {
        if (nouveauCodeProduit != null && !nouveauCodeProduit.isEmpty()) {
            this.codeProduit = nouveauCodeProduit;
        } else {
        }
        if (nouveauDProduit != null && !nouveauDProduit.isEmpty()) {
            this.dproduit = nouveauDProduit;
        }
    }

public void supprimerProduit(){
      this.codeProduit=null;
        this.listeGamme.clear();
        System.out.println("Produit "+dproduit+" supprimé !");  
        this.dproduit=null;
    }
//Gestion gammes
public void ajouterGamme (Gamme gamme){
    if (!this.listeGamme.contains(gamme)){
        this.listeGamme.add(gamme);
        System.out.println("Gamme de fabrication ajoutée à ce produit");
    }
}
   public void retirerGamme (Gamme gamme){
    if (this.listeGamme.remove(gamme)){
        System.out.println("Gamme de fabrication retirée de ce produit");
    } else {
        System.out.println("Cette gamme n’est pas associée à ce produit");
    }
}


}

