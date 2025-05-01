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
public class Operation {
    private String refOperation;
    private String dOperation ;
    private String refEquipement ;
    private float dureeOperation ;

    public String getRefOperation() {
        return refOperation;
    }

    public String getdOperation() {
        return dOperation;
    }

    public String getRefEquipement() {
        return refEquipement;
    }

    public float getDureeOperation() {
        return dureeOperation;
    }

    public void setRefOperation(String refOperation) {
        this.refOperation = refOperation;
    }

    public void setdOperation(String dOperation) {
        this.dOperation = dOperation;
    }

    public void setRefEquipement(String refEquipement) {
        this.refEquipement = refEquipement;
    }

    public void setDureeOperation(float dureeOperation) {
        this.dureeOperation = dureeOperation;
    }

    public Operation(String refOperation, String dOperation, String refEquipement, float dureeOperation) {
        this.refOperation = refOperation;
        this.dOperation = dOperation;
        this.refEquipement = refEquipement; //mettre le meme refEquipement que celui de l'équipement faisant l'opération (ex: scieuse, ponceuse...)
        this.dureeOperation = dureeOperation;
    }
    
   // Méthode pour calculer le coût d'une opération en fonction de l'équipement utilisé
    public float calculerCout(Equipement equipement) {
        if (equipement != null && equipement.getRefEquipement().equals(refEquipement)) {
            return dureeOperation * equipement.getCout();
        }
        return 0; // Équipement non trouvé ou non correspondant
    }
    public void afficheOperation() {
        System.out.println("Operation [Reference: " + refOperation + ", Designation: " + dOperation + "]");
        System.out.println("Equipement utilise: " + refEquipement);
        System.out.println("Duree: " + dureeOperation + " h");
    }
}
