package src;
import java.util.ArrayList;

public class Aquarium extends Enclos {

    private double profondeurBassin;
    private double saliniteEau;

    public Aquarium(String nom, double superficie, int nbMaxCreatures, ArrayList<Creature> creaturesPres, int proprete,double profondeurBassin, double saliniteEau) {
        super(nom, superficie, nbMaxCreatures, creaturesPres, proprete);
        this.profondeurBassin = profondeurBassin;
        this.saliniteEau = saliniteEau;
    }

    public double getProfondeurBassin() {
        return profondeurBassin;
    }

    public void setProfondeurBassin(double profondeurBassin) {
        this.profondeurBassin = profondeurBassin;
    }

    public double getSaliniteEau() {
        return saliniteEau;
    }

    public void setSaliniteEau(double saliniteEau) {
        this.saliniteEau = saliniteEau;
    }

    @Override
    public String afficherCaracteristiques() {
        return super.afficherCaracteristiques() + " Profondeur du bassin : " + profondeurBassin + ", Salinité de l'eau : " + saliniteEau;
    }



}
