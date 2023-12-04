package src;


import java.util.ArrayList;

public class zoo  {


    private String nom;
    private MaitreZoo maitre;
    private int nbCreatures;
    private int enclosExist;
    public Creature creature;;
    private ArrayList<Creature> creaturePres;

    public zoo(String nom, MaitreZoo maitre ,int nbcrea, int enclos, ArrayList<Creature> creaturePres)
    {


        this.nom = nom;
        this.maitre= maitre;
        this.nbCreatures=nbcrea;
        this.enclosExist = enclos;
        this.creaturePres= creaturePres;
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
