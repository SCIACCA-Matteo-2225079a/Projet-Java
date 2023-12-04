package src;

/**
 * ffrff.
 */

import java.util.ArrayList;

public class zoo extends Creature {


    private String nom;
    private MaitreZoo maitre;
    private int nbCreatures;
    private int enclosExist;
    private ArrayList<Creature> creaturePres;

    public zoo(String nom, String sexe, int poids, int taille, int age, boolean indicateurDeFaim, boolean indicateurDeSommeil, int indicateurDeSante ,boolean malade) {
        super(nom, sexe, poids, taille, age, indicateurDeSante, indicateurDeFaim, indicateurDeSommeil, malade);
    }

    public void setCreaturePres(ArrayList<Creature> creaturePres) {

        this.creaturePres = creaturePres;
    }

    public String getNom() {

        return nom;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    public String getMaitre() {

        return maitre;
    }

    public void setMaitre(String maitre) {

        this.maitre = maitre;
    }

    public int getNbCreatures() {

        return nbCreatures;
    }

    public void setNbCreatures(int nbCreatures) {

        this.nbCreatures = nbCreatures;
    }

    public int getEnclosExist() {

        return enclosExist;
    }

    public void setEnclosExist(int enclosExist) {

        this.enclosExist = enclosExist;
    }




    public afficherNbCreatures() {

    }

    public afficherCreaturesPres() {

    }
}
