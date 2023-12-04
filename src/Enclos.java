package src;
import java.util.ArrayList;

/**
 * Définition de toutes les statistiques nécéssaires pour chaque enclos.
 */

public class Enclos  {

    private String nom;
    private double superficie;
    private int nbMaxCreatures;
    private int nbCreatures;
    private ArrayList<Creature> creaturesPres;
    public int proprete;

    public Enclos (String nom, double superficie, int nbMaxCreatures, int nbCreatures, ArrayList<Creature> creaturesPres, int proprete) {

        this.nom = nom;
        this.superficie = superficie;
        this.nbMaxCreatures = nbMaxCreatures;
        this.nbCreatures = nbCreatures;
        this.creaturesPres = creaturesPres;
        this.proprete = proprete;
    }

    public String afficherCaracteristiques()
    {
        return "";
    }

    public void ajouterCreature()
    {

    }

    public void enleverCreature()
    {

    }

    public void nourrir()
    {

    }

    public void entretenir()
    {

    }
}
