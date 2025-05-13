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
    private StatutOpé statut ; 
    private static ArrayList<Operateur> listeOperateurs = new ArrayList<>(); 

    
    public String getCompetance() {
        return competance;
    }
    
    public static ArrayList<Operateur> getListeOperateurs() {
        return listeOperateurs;
    }

    public StatutOpé getStatutOpé() {
        return statut;
    }

  
    public void setCompetance(String competance) {
        this.competance = competance;
    }

    public void setStatutOpé(StatutOpé statut) {
        this.statut = statut;
    }
//constructeur
    public Operateur(String competance,String code, String nom, String prenom) {
        super(code, nom, prenom);
        this.competance = competance;
        this.statut = StatutOpé.LIBRE;
        listeOperateurs.add(this);
    }
    
    
    @Override
    public String toString() {
        return "Operateur [Nom: " + super.getNom() + ", Prénom " + super.getPrenom() + ", Code " + super.getCode() +"]";
    }
    
   
    
}
