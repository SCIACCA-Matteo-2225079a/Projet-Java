package modele;

import java.util.ArrayList;

public class Voliere extends Enclos {

    private double hauteur;

    /**
     * Caractéristiques de la voliére
     * @param nom
     * @param superficie
     * @param nbMaxCreatures
     * @param nbCreatures
     * @param creaturesPres
     * @param proprete
     * @param hauteur
     */
    public Voliere(String nom, double superficie, int nbMaxCreatures, int nbCreatures, ArrayList<Creature> creaturesPres, int proprete, double hauteur) {
        super(nom, superficie, nbMaxCreatures, creaturesPres, proprete);
        this.hauteur = hauteur;
    }

    /**
     * Récupérer la hauteur de la voliére
     * @return hauteur
     */
    public double getHauteur() {
        return hauteur;
    }

    /**
     * Modifier l'hauteur de la voliére
     * @param hauteur
     */
    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    /**
     * Affichage caractéristiques de la voliére
     * @return Caractéristiques de la voliére
     */
    @Override
    public String afficherCaracteristiques() {
        return "Nom : " + getNom() +
                ", Superficie : " + getSuperficie() +
                ", Nombre Maximum de Créatures : " + getNbMaxCreatures() +
                ", Propreté : " + getProprete() +
                ", Hauteur de la volière : " + getHauteur();
    }

    /**
     * Affichage hauteur de la voliére
     * @return toString
     */
    @Override
    public String toString() {
        return super.toString() + " Hauteur de la volière : " + getHauteur();
    }
}
