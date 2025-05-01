/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

import com.mycompany.projet_atelier_interface.*;

/**
 *
 * @author alicedeboever
 */
public class ChefAtelier extends Personne {
    public ChefAtelier(float code, String nom, String prenom) {
        super(code, nom, prenom);
    }
    @Override
    public void afficher() {
        System.out.println("Chef d'atelier: "+this.getPrenom()+", "+this.getNom()+",code: "+this.getCode());  
    }
}
