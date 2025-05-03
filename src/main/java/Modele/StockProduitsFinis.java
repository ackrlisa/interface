/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;
import com.mycompany.projet_atelier_interface.*;
import java.util.ArrayList;

/**
 *
 * @author alicedeboever
 */
public class StockProduitsFinis {
    private final ArrayList<ProduitsFinis> listeStockProduitsFinis = new ArrayList<>();
    
    public void ajouterProduitFini(ProduitsFinis produit){
        listeStockProduitsFinis.add(produit);
    }
    
    public void supprimerProduitFini(ProduitsFinis produit){
        if(!listeStockProduitsFinis.contains(produit)){
            System.out.println("Le produit fini "+ produit.getNom()+" n'est pas associé à cet atelier de fabrication");
        } else {
            listeStockProduitsFinis.remove(produit);
            System.out.println ("Le produit fini "+ produit.getNom()+" a bien été retiré de l'atelier de fabrication");
        }
    }
    
    public void afficheStockProduitsFinis () {
        if (listeStockProduitsFinis.isEmpty()){
            System.out.println("L'atelier n'est associé a aucun produit fini");
        } else {
            System.out.println("PRODUITS FINIS DE L'ATELIER :");
            for(ProduitsFinis produitsFinis : listeStockProduitsFinis) {
                System.out.print(" - ");
                produitsFinis.afficheProduitFini();
            }
        }
}

    public ArrayList<ProduitsFinis> getListeStockProduitsFinis() {
        return listeStockProduitsFinis;
    }
    
}
