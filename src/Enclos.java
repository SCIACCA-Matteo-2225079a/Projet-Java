import java.util.ArrayList;

public class Enclos {

    private String nom;
    private double superficie;
    private int nbMaxCreatures;
    private int nbCreatures;
    private ArrayList<Creature> creaturesPres;
    private String proprete;

    public Enclos(String nom, double superficie, int nbMaxCreatures) {
        this.nom = nom;
        this.superficie = superficie;
        this.nbMaxCreatures = nbMaxCreatures;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getNbMaxCreatures() {
        return nbMaxCreatures;
    }

    public void setNbMaxCreatures(int nbMaxCreatures) {
        this.nbMaxCreatures = nbMaxCreatures;
    }

    public int getNbCreatures() {
        return nbCreatures;
    }

    public void setNbCreatures(int nbCreatures) {
        this.nbCreatures = nbCreatures;
    }

    public ArrayList<Creature> getCreaturesPres() {
        return creaturesPres;
    }

    public void setCreaturesPres(ArrayList<Creature> creaturesPres) {
        this.creaturesPres = creaturesPres;
    }

    public String getProprete() {
        return proprete;
    }

    public void setProprete(String proprete) {
        this.proprete = proprete;
    }

    @Override
    public String toString() {
        return "Enclos{" +
                "nom='" + nom + '\'' +
                ", superficie=" + superficie +
                ", nbMaxCreatures=" + nbMaxCreatures +
                ", nbCreatures=" + nbCreatures +
                ", creaturesPres=" + creaturesPres +
                ", proprete='" + proprete + '\'' +
                '}';
    }

    public String afficherCaracteristiques()
    {
        return toString();
    }

    public void ajouterCreature(String nom, String sexe, int poids, int taille, int age)
    {
        Creature newCreature = new Creature(nom, sexe, poids, taille, age);
    }

    public void enleverCreature()
    {

    }

    public void nourrir(Creature creature)
    {
        creature.indicateurDeFaim = false;
    }

    public void entretenir()
    {

    }
}
