import java.util.ArrayList;

public class Enclos {

    private String nom;
    private double superficie;
    private int nbMaxCreatures;
    private int nbCreatures;
    private ArrayList<Creature> creaturesPres;


    private String proprete;

    public Enclos(String nom, double superficie, int nbMaxCreatures, ArrayList<Creature>creaturesPres) {
        this.nom = nom;
        this.superficie = superficie;
        this.nbMaxCreatures = nbMaxCreatures;
        this.creaturesPres = creaturesPres;
        this.proprete = "bon";
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

    public void ajouterCreature(String nom, String sexe, int poids, int taille, int age) {
        // Vérifier si l'enclos a atteint sa capacité maximale
        if (nbCreatures < nbMaxCreatures) {
            // Créer une nouvelle créature en utilisant les paramètres de la méthode
            Creature newCreature = new Creature(nom, sexe, poids, taille, age);

            // Ajouter la créature à la liste des créatures présentes
            creaturesPres.add(newCreature);

            // Incrémenter le nombre total de créatures
            nbCreatures++;

            System.out.println("La créature " + newCreature.getNom() + " a été ajoutée à l'enclos.");
        } else {
            System.out.println("L'enclos est plein, impossible d'ajouter une nouvelle créature.");
        }
    }




    public void enleverCreature(Creature creature) {
        if (creaturesPres.contains(creature)) {
            creaturesPres.remove(creature);
            nbCreatures--; // Décrémenter le nombre total de créatures
            System.out.println("La créature a été enlevée de l'enclos.");
        } else {
            System.out.println("La créature n'est pas présente dans l'enclos.");
        }
    }


    public void nourrirCreatures() {
        for (Creature creature : creaturesPres) {
            creature.manger();
        }

        System.out.println("Toutes les créatures de l'enclos ont été nourries.");
        System.out.println("Nombre total de créatures dans l'enclos : " + nbCreatures);
    }

    private void nettoyerEnclos() {
        System.out.println("Nettoyage en cours de l'enclos...");

        // Logique de nettoyage (à adapter en fonction de vos besoins)
        // Réinitialiser l'indicateur de propreté à "bon", par exemple
        proprete = "bon";

        System.out.println("L'enclos a été nettoyé avec succès.");
    }


    public void entretenir() {
        // Vérifier si l'enclos est sale et vide
        if ("mauvais".equals(proprete) && nbCreatures == 0) {
            nettoyerEnclos();
        } else {
            System.out.println("L'enclos ne nécessite pas d'entretien pour le moment.");
        }
    }


}

