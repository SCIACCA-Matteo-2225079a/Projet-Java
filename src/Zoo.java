package src;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Zoo  {


    private String nom;
    private MaitreZoo maitre;
    private int nbCreatures;
    private Enclos[] enclosExist;
    private int nbEnclos;
    public Creature creature;;
    private ArrayList<Creature> creaturePres;
    private static int jour = 1;

    public Zoo(String nom, MaitreZoo maitre , int nbcrea, int enclos, ArrayList<Creature> creaturePres, int jour)
    {


        this.nom = nom;
        this.maitre= maitre;
        this.nbCreatures=nbcrea;
        this.nbEnclos = nbEnclos;
        this.creaturePres= creaturePres;
        this.jour = jour;
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

    public static int incrementerJour() {
        jour++;

        return jour;
    }


    public static void lancerTimer() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                incrementerJour();
            }
        }, 0, 60*1000); // Le deuxième argument est le délai initial, le troisième est l'intervalle en millisecondes
    }

    public static int getJour() {

        return jour;
    }
}
