package src;


import java.util.ArrayList;

public class Zoo  {


    private String nom;
    private MaitreZoo maitre;
    private int nbCreatures;
    private Enclos[] enclosExist;
    private int nbEnclos;
    public Creature creature;;
    private ArrayList<Creature> creaturePres;

    public Zoo(String nom, MaitreZoo maitre ,int nbcrea, int nbEnclos, ArrayList<Creature> creaturePres)
    {


        this.nom = nom;
        this.maitre= maitre;
        this.nbCreatures=nbcrea;
        this.nbEnclos = nbEnclos;
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

    public int getNbEnclos() {

        return nbEnclos;
    }

    public void setNbEnclos(int nbEnclos) {

        this.nbEnclos = nbEnclos;
    }




    public int afficherNbCreatures() {

        return nbCreatures;
    }

    public ArrayList<Creature>  afficherCreaturesPres() {

        return creaturePres;
    }

}
