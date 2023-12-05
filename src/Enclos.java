package src;

import java.util.ArrayList;

public class Enclos {

    private String nom;
    private double superficie;
    private int nbMaxCreatures;
    private int nbCreatures;
    private ArrayList<Creature> creaturesPres;


    public int proprete = 10;

    public Enclos(String nom, double superficie, int nbMaxCreatures, ArrayList<Creature>creaturesPres) {
        this.nom = nom;
        this.superficie = superficie;
        this.nbMaxCreatures = nbMaxCreatures;
        this.creaturesPres = creaturesPres;
        this.proprete= getProprete();
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

    public int getProprete() {
        return proprete;
    }

    public void setProprete(int proprete) {
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

    public void ajouterCreature(Creature creature) {
        // Vérifier si l'enclos a atteint sa capacité maximale
        if (nbCreatures < nbMaxCreatures) {
            // Créer une nouvelle créature en utilisant les paramètres de la méthode
            /*Creature newCreature = new Creature(creature.getNom(),creature.getSexe(),creature.getPoids(),creature.getTaille(),
                    creature.getIndicateurDeSante(),creature.isIndicateurDeFaim(),creature.isIndicateurDeSommeil(),
                    creature.isDormir(),creature.getIndicateurDeSante(),creature.isMalade());*/

            // Ajouter la créature à la liste des créatures présentes
            creaturesPres.add(creature);

            // Incrémenter le nombre total de créatures
            nbCreatures++;

            System.out.println("La créature " + creature.getNom() + " a été ajoutée à l'enclos.");
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
    public boolean contientCreature(Creature creatureTrue) {
        // Supposons que creature est une propriété de votre Enclos
        // Vérifiez si la créature donnée est présente dans l'enclos
        for (Creature c : creaturesPres) {
            if (c.equals(creatureTrue)) {
                return true;
            }
        }
        return false;
    }

    /*public void nourrirCreatures() {
        for (Creature creature : creaturesPres) {
            creature.manger();
        }

        System.out.println("Toutes les créatures de l'enclos ont été nourries.");
        System.out.println("Nombre total de créatures dans l'enclos : " + nbCreatures);
    }*/

    public void nettoyerEnclos() {
        System.out.println("Nettoyage en cours de l'enclos...");

        // Logique de nettoyage (à adapter en fonction de vos besoins)
        // Réinitialiser l'indicateur de propreté à "bon", par exemple
        proprete = 10;

        System.out.println("L'enclos a été nettoyé avec succès.");
    }


    public void entretenir() {
        // Vérifier si l'enclos est sale et vide
        if (proprete<5 && nbCreatures == 0) {
            nettoyerEnclos();
        } else {
            System.out.println("L'enclos ne nécessite pas d'entretien pour le moment.");
        }
    }


}

