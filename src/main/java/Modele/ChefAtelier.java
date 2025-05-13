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
public class ChefAtelier extends Personne {
    private static ArrayList<ChefAtelier> listeChefsAtelier = new ArrayList<>(); 
    public static ArrayList<ChefAtelier> getListeChefsAtelier() {
        return listeChefsAtelier;
    }

    public ChefAtelier(String code, String nom, String prenom) {
        super(code, nom, prenom);
        listeChefsAtelier.add(this);
    }
    
    @Override
    public String toString() {
        return "Chef Atelier [Nom: " + super.getNom() + ", Prénom " + super.getPrenom() + ", Code " + super.getCode() + "]";
    }
    
    
}
