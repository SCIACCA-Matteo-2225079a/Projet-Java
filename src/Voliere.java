package src;
import java.util.ArrayList;

public class Voliere extends Enclos {

    private double hauteur;

    public Voliere(String nom, double superficie, int nbMaxCreatures, ArrayList<Creature> creaturesPres, double hauteur) {
        super(nom, superficie, nbMaxCreatures, creaturesPres);
        this.hauteur = hauteur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    public String afficherCaracteristiques() {
        return super.afficherCaracteristiques() + " Hauteur de la volière : " + hauteur;
    }


}
