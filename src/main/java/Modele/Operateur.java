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
public class Operateur extends Personne{
    
    private String competance ;
    private boolean disponible ; 
    private static ArrayList<Operateur> listeOperateurs = new ArrayList<>(); 

    
    public String getCompetance() {
        return competance;
    }
    
    public static ArrayList<Operateur> getListeOperateurs() {
        return listeOperateurs;
    }

    public boolean isDisponible() {
        return disponible;
    }


    public void setCompetance(String competance) {
        this.competance = competance;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
//constructeur
    public Operateur(String competance, boolean disponible, float code, String nom, String prenom) {
        super(code, nom, prenom);
        this.competance = competance;
        this.disponible = disponible;
        listeOperateurs.add(this);
    }
    
    
    @Override
    public String toString() {
        return "Operateur [Nom: " + super.getNom() + ", Prénom " + super.getPrenom() + ", Code " + super.getCode() +"]";
    }
    
    @Override
    public void afficher() {
        System.out.print("Operateur: "+this.getPrenom()+" "+this.getNom()+",code: "+this.getCode()+",competence "+this.competance);
        if(disponible){
            System.out.println(", statut:disponible");
        }else{
            System.out.println(", statut: indisponible");
        }     
    }
   
    
}
