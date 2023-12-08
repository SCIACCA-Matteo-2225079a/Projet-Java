import modele.Creature;

import java.util.ArrayList;

public class Voliere extends Enclos {

    private double hauteur;

    public Voliere(String nom, double superficie, int nbMaxCreatures, int nbCreatures, ArrayList<Creature> creaturesPres, int proprete, double hauteur) {
        super(nom, superficie, nbMaxCreatures, creaturesPres, proprete);
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
        return "Nom : " + getNom() +
                ", Superficie : " + getSuperficie() +
                ", Nombre Maximum de Créatures : " + getNbMaxCreatures() +
                ", Propreté : " + getProprete() +
                ", Hauteur de la volière : " + hauteur;
    }

    @Override
    public String toString() {
        return super.toString() + " Hauteur de la volière : " + hauteur;
    }
}
