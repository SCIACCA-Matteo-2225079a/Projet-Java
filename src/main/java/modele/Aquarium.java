package modele;

import java.util.ArrayList;

public class Aquarium extends Enclos {

    private double profondeurBassin;
    private double saliniteEau;

    public Aquarium(String nom, double superficie, int nbMaxCreatures, ArrayList<Creature> creaturesPres, int proprete, double profondeurBassin, double saliniteEau) {
        super(nom, superficie, nbMaxCreatures, creaturesPres, proprete);
        this.profondeurBassin = profondeurBassin;
        this.saliniteEau = saliniteEau;
    }

    /**
     * Récuperer la profondeur du bassin
     * @return profondeurBassin
     */
    public double getProfondeurBassin() {
        return profondeurBassin;
    }

    /**
     * Modifier la pronfondeur du bassin
     * @param profondeurBassin
     */
    public void setProfondeurBassin(double profondeurBassin) {
        this.profondeurBassin = profondeurBassin;
    }

    /**
     * Récupérer la salinité de l'eau
     * @return saliniteEau
     */
    public double getSaliniteEau() {
        return saliniteEau;
    }

    /**
     * Modifier la salinité de l'eau
     * @param saliniteEau
     */
    public void setSaliniteEau(double saliniteEau) {
        this.saliniteEau = saliniteEau;
    }

    /**
     * Affiche les caractéristiques de l'aquarium
     * @return profondeurBassin + saliniteEau
     */
    @Override
    public String afficherCaracteristiques() {
        return super.afficherCaracteristiques() + " Profondeur du bassin : " + profondeurBassin + ", Salinité de l'eau : " + saliniteEau;
    }



}
