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

    public zoo(String nom, MaitreZoo maitre ,int nbcrea, int enclos, Creature creature)
    {
        super(creature.getNom(), creature.getSexe(), creature.getPoids(),creature.getTaille(),creature.getAge(),creature.isIndicateurDeFaim(), creature.isIndicateurDeSommeil(), creature.isDormir(),creature.getIndicateurDeSante(), creature.isMalade());
        this.nom = nom;
        this.maitre= maitre;
        this.nbCreatures=nbcrea;
        this.enclosExist = enclos;
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

   /* public String Maitre(String maitre) {
       this.maitre= getnom();
    }*/

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




    public int afficherNbCreatures() {
    return 0;
    }

    public Creature afficherCreaturesPres() {
        return creaturePres.get(0);
    }

}
