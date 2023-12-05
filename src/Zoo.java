package src;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Zoo {


    private String nom;
    private MaitreZoo maitre;
    private int nbCreatures;
    private int enclosExist;
    public Creature creature;
    private ArrayList<Creature> creaturePres;
    private static int jour = 1;

    public Zoo(String nom, MaitreZoo maitre , int nbcrea, int enclos, ArrayList<Creature> creaturePres, int jour)
    {


        this.nom = nom;
        this.maitre= maitre;
        this.nbCreatures=nbcrea;
        this.enclosExist = enclos;
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
        }, 60 * 1000, 60 * 1000);
    }

    public static int getJour() {
        return jour;
    }
}
