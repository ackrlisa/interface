/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Modele;
import com.mycompany.projet_atelier_interface.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author alicedeboever
 */
public class Projet_Atelier {

    public static void main(String[] args) {
      
    //trie les machines par ordre de fiabilité
    
    //TEST METHODES STOCKBRUT
    //StockBrut stockbrut = new StockBrut();
    
    //stockbrut.ajouterAuStock("Bois");
    //stockbrut.ajouterAuStock("Acier");
    
    //stockbrut.afficheStock();
    
    // TEST METHODES PRODUIT 
        // Création des opérations et équipements
        //Operation sciage = new Operation("scieuse", "Sciage", "scieuse", 1);
        //Equipement scie = new Machine("scieuse", "m1", 0, 0, 3, sciage, "scie", null);
    

    //TEST ATELIER DE FABRICATION
        //Poste Poste1 = new Poste(new ArrayList<Machine>(), "1", "poste de sciage");
        //Poste Poste2 = new Poste(new ArrayList<Machine>(),"2","Poste de perçage");
        
        //AtelierDeFabrication ChezJRH = new AtelierDeFabrication("Chez JRH", null, new ArrayList<Equipement>(), new ArrayList<>());
        //ChezJRH.ajoutEquipement(Poste2);
        //ChezJRH.enleverEquipement(Poste1);
        //System.out.println("Nb poste "+ ChezJRH.getNbPostes());
    // TEST METHODES PRODUIT    
    
        //Produit chaise = new Produit(101, "Chaise en bois", new ArrayList<>());
        //Operation Sciage = new Operation("sciage", "op1", "scieuse", 1);
        //Machine Scieuse = new Machine("scieuse","m1", 0, 0, 3, Sciage, "scie", null);
        //Gamme Table =new Gamme("table1",new ArrayList<Operation>() {{add(Sciage);}}, new ArrayList<Equipement>(){{add(Scieuse);}}) ;
        //Operation Poncage = new Operation("poncage", "op2", "ponceuse", 2);
        //Machine Ponceuse = new Machine("ponceuse","m2", 4, 4,5,Poncage, "ponceuse", null);
        //System.out.println("État initial du produit :");
    
        //Table.afficheGamme();
        //Table.ajoutEquipementOperation(Ponceuse, Poncage);
        //Table.modifierGamme("table2");
        //chaise.supprimerProduit();
        //chaise.modifierProduit(202, "Chaise en métal");
        //Table.supprimerGamme();
        //System.out.println("État après modification :");
        //Table.afficheGamme();
    
        //Table.enleverEquipementOperation(Scieuse,Sciage);
        //Table.afficheGamme();
        //chaise.ajouterGamme(Table);
        //System.out.println("Nombre de gammes après ajout : " + chaise.getListeGamme().size());

        // Test retrait
        //chaise.retirerGamme(Table);
        //System.out.println("Nombre de gammes après retrait : " + chaise.getListeGamme().size());

        
    // TEST METHODES MACHINES ET OPERATIONS    
        //Operateur Ouvrier1 = new Operateur("scier", true, 001, "Alain", "Louris");
        //ChefAtelier Boss = new ChefAtelier(002, "JR", "Heu");
        //Operation Sciage = new Operation("sciage", "op1", "scieuse", 1);
        //Operation Poncage = new Operation("poncage", "op2", "ponceuse", 2);
        //Operation Cuisson = new Operation("cuisson", "op3", "four", 5);
        //ArrayList<Operation> listeOperation = new ArrayList<>();
        //listeOperation.add(Sciage);
        //Machine Scieuse = new Machine("scieuse","m1", 0, 0, 3, listeOperation, "scie", null, new ArrayList<>());
        //Scieuse.afficheMachine();
        //Scieuse.ajouterOperationRealisable(Cuisson);
        //Scieuse.afficheMachine();
        
    // TEST METHODE POSTE
    //Machine Ponceuse = new Machine("ponceuse","m2", 4, 4,5,new ArrayList<Operation>(Arrays.asList(Poncage)), "ponceuse", null, new ArrayList<>());
        //Machine Four = new Machine("four", "m3", 2, 1,6, new ArrayList<Operation>(Arrays.asList(Cuisson)), "four", null, new ArrayList<>());
        //Scieuse.setDispo(false);
        //Scieuse.setEtatMachine(EtatMachine.ARRET_PANNE);
        //Poste Poste1 = new Poste(new ArrayList<Machine>() {{add(Scieuse);add(Ponceuse);}}, "1", "poste1");
        //Scieuse.setPoste(Poste1);
        //Ponceuse.setPoste(Poste1);
        //Gamme Table = new Gamme("table1",new ArrayList<Operation>() {{add(Sciage);add(Poncage);}}, new ArrayList<Equipement>() {{add(Scieuse);add(Ponceuse);}});
        //System.out.println("nouvel Atelier");
        //Ouvrier1.afficher(); 
        //Boss.afficher(); 
        //Sciage.afficheOperation(); 
        //System.out.println("Poncage");
        //Poncage.afficheOperation(); 
        //System.out.println("Poste1");
        //Poste1.affichePoste(); 
        //Poste1.modifierPoste(Poste1, Four, true);
        //System.out.println("Poste1 modifie");
        //Poste1.affichePoste();
        //Ponceuse.supprimerMachine();
        //Poste1.affichePoste();
        //Poste1.supprimerPoste();
        //System.out.println("Scieuse ");
        //Scieuse.afficheMachine();
        //Scieuse.modifierMachine(1, 1, 2, "scie", "usee", Sciage, "scieuse", "m1");
        //System.out.println("Scieuse modifiee ");
        //Scieuse.afficheMachine();
        //System.out.println(Table.coutGamme());  
    }  
}