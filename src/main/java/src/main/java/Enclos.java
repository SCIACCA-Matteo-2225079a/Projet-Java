package src.main.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Enclos {

    private String nom;
    private double superficie;
    private int nbMaxCreatures;
    private int nbCreatures;
    private ArrayList<Creature> creaturesPres;


    public int proprete = 10;

    public Enclos(String nom, double superficie, int nbMaxCreatures, ArrayList<Creature>creaturesPres, int proprete) {
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
            Creature newCreature = creature.genererNouvelleCréature();
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

    public void typeEnclos()
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> typeEnclos = new ArrayList<>();
        typeEnclos.add("Cage");
        typeEnclos.add("Volière");
        typeEnclos.add("Aquarium");
        System.out.println("Quel type d'enclos voulez-vous ?" + '\n'+"-Cage : 1"+'\n'+"-Volière : 2"+'\n'+"-Aquarium : 3");
        while (true)
        {
            int type = sc.nextInt();
            if (type == 1)
            {
                setNom(typeEnclos.get(0));
                break;
            }
            else if (type == 2)
            {
                setNom(typeEnclos.get(1));
                break;
            }
            else if (type == 3)
            {
                setNom(typeEnclos.get(2));
                break;
            }
            else
            {
                System.out.println("Erreur : Choisis un nombre entre 1 et 3 seulement");
            }
        }
    }

    public void Etatpropete()
    {
        if (proprete>= 7)
        {
            System.out.println("bon");
        }
        else if (proprete< 7 && proprete > 3)
        {
            System.out.println("correct");
        }
        else
        {
            System.out.println("mauvais");
        }

    }
    public  Enclos genererNouvelleEnclos()
    {

        typeEnclos();
        Enclos newEnclos  = new Enclos(getNom(),getSuperficie(),getNbMaxCreatures(),getCreaturesPres(),getProprete());
        return newEnclos;
    }

}

