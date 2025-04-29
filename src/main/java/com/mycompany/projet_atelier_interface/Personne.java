/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_atelier_interface;

/**
 *
 * @author alicedeboever
 */
public abstract class Personne {
    private float code ;
    private String nom ;
    private String prenom ;
    
    public float getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setCode(float code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Personne(float code, String nom, String prenom) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
    }

    public void afficher(){
        System.out.println(this.prenom+", "+ this.nom+"code d'identification:"+this.code);
    }
    
}
