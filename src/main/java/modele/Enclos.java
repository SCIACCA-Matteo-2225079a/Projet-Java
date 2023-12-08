package modele;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Enclos {

    private String nom;
    private double superficie;
    private int nbMaxCreatures;
    private int nbCreatures;
    private ArrayList<Creature> creaturesPres;
    private Random random = new Random();

    public int proprete = 10;

    /**
     * Paramètres de l'enclos
     * @param nom
     * @param superficie
     * @param nbMaxCreatures
     * @param creaturesPres
     * @param proprete
     */
    public Enclos(String nom, double superficie, int nbMaxCreatures, ArrayList<Creature>creaturesPres, int proprete) {
        this.nom = nom;
        this.superficie = superficie;
        this.nbMaxCreatures = nbMaxCreatures;
        this.creaturesPres = creaturesPres;
        this.proprete= getProprete();
    }

    /**
     * Récupérer le nom de l'enclos
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Modifier le nom de l'enclos
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Récupérer la superficie de l'enclos
     * @return superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Modifier la superficie de l'enclos
     * @param superficie
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Récupérer le numéro maximal de créatures dans l'enclos
     * @return nbMaxCreatures
     */
    public int getNbMaxCreatures() {
        return nbMaxCreatures;
    }

    /**
     * Modifier le numéro maximal de créatures dans l'enclos
     * @param nbMaxCreatures
     */
    public void setNbMaxCreatures(int nbMaxCreatures) {
        this.nbMaxCreatures = nbMaxCreatures;
    }

    /**
     * Récupérer le numéro de créatures dans l'enclos
     * @return nbCreatures
     */
    public int getNbCreatures() {
        return nbCreatures;
    }

    /**
     * Modifier le numéro de créatures dans l'enclos
     * @param nbCreatures
     */
    public void setNbCreatures(int nbCreatures) {
        this.nbCreatures = nbCreatures;
    }

    /**
     * Récupérer les créatures présentes
     * @return creaturesPres
     */
    public ArrayList<Creature> getCreaturesPres() {
        return creaturesPres;
    }

    /**
     * Modifier les créatures présentes
     * @param creaturesPres
     */
    public void setCreaturesPres(ArrayList<Creature> creaturesPres) {
        this.creaturesPres = creaturesPres;
    }

    /**
     * Récupérer la propreté de l'enclos
     * @return proprete
     */
    public int getProprete() {
        return proprete;
    }

    /**
     * Modifier la propreté de l'enclos
     * @param proprete
     */
    public void setProprete(int proprete) {
        this.proprete = proprete;
    }

    /**
     * Affichage de toutes les statistiques de l'enclos
     * @return Statistiques de l'enclos
     */
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

    /**
     * Affiche les caractéristiques de l'enclos
     * @return toString
     */
    public String afficherCaracteristiques()
    {
        return toString();
    }

    /**
     * Ajouter une nouvelle créature dans l'enclos
     * @param creature
     */
    public void ajouterCreature(Creature creature) {
        // Vérifier si l'enclos a atteint sa capacité maximale
        if (nbCreatures < nbMaxCreatures) {
            // Créer une nouvelle créature en utilisant les paramètres de la méthode
            Creature newCreature = creature.genererNouvelleCréature();
            System.out.println("La créature " + newCreature.getNom() + " a été ajoutée à l'enclos.");
            // Ajouter la créature à la liste des créatures présentes
            creaturesPres.add(newCreature);
            // Incrémenter le nombre total de créatures
            nbCreatures++;

        } else {
            System.out.println("L'enclos est plein, impossible d'ajouter une nouvelle créature.");
        }
    }

    /**
     * Enlever une créature de l'enclos
     * @param creature
     */
    public void enleverCreature(Creature creature) {
        if (creaturesPres.contains(creature)) {
            creaturesPres.remove(creature);

            System.out.println("La créature a été enlevée de l'enclos.");
        } else {
            System.out.println("La créature n'est pas présente dans l'enclos.");
        }
    }

    /**
     * Vérifier si l'enclos contient une créature
     * @param creatureTrue
     * @return true or false
     */
    public boolean contientCreature(Creature creatureTrue) {
        for (Creature c : creaturesPres) {
            System.out.println("Comparing: " + c + " with " + creatureTrue);
            if (c.equals(creatureTrue)) {
                System.out.println("Match found!");
                return true;
            }
        }
        System.out.println("No match found.");
        return false;
    }

    /**
     * Vérifier si la créature est morte
     * @param creature
     */
    public void CreatureMorte(Creature creature)

    {
        Thread thread = new Thread(() -> {
            if (creature.getIndicateurDeSante() == 0) {
                creaturesPres.remove(creature);
                System.out.println(creature.getNom() + " a été retirée de l'enclos car elle est morte.");
            }
        });

        thread.start();
    }

    /**
     * Choisir le type d'enclos
     */
    public void typeEnclos() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> typeEnclos = new ArrayList<>();
        typeEnclos.add("Cage");
        typeEnclos.add("Volière");
        typeEnclos.add("Aquarium");

        ArrayList<String> especeEnclos = new ArrayList<>();
        especeEnclos.add("Lycanthropes");
        especeEnclos.add("Licornes");
        especeEnclos.add("Nymphes");
        especeEnclos.add("Krakens");
        especeEnclos.add("Sirènes");
        especeEnclos.add("Mégalodons");
        especeEnclos.add("Phénix");
        especeEnclos.add("Dragons");

        int type;
        System.out.println("Quel type d'enclos voulez-vous ?" + '\n' + "-Cage : 0" + '\n' + "-Volière : 1" + '\n' + "-Aquarium : 2");

        while (true) {
            type = sc.nextInt();
            if (type >= 0 && type < typeEnclos.size()) {
                setNom(typeEnclos.get(type));
                break;
            } else {
                System.out.println("Erreur : Choisissez un nombre entre 0 et " + (typeEnclos.size() - 1) + " seulement");
            }
        }

        System.out.println("Pour quelles espèces ?");
        while (true) {
            if (type == 0) {
                for (int i = 0; i < 2; i++) {
                    System.out.println(especeEnclos.get(i) + ": " + i);
                }
                System.out.println(especeEnclos.get(7) + ": " + 7);
            } else if (type == 1) {
                for (int i = 6; i <= 7; i++) {
                    System.out.println(especeEnclos.get(i) + ": " + i);
                }
            } else if (type == 2) {
                for (int i = 2; i < 6; i++) {
                    System.out.println(especeEnclos.get(i) + ": " + i);
                }
            }else {
                System.out.println("Erreur : Choisissez un nombre entre 0 et " + (typeEnclos.size() - 1) + " seulement");
            }


            int especeChoix = sc.nextInt();
            if (especeChoix >= 0 && especeChoix < especeEnclos.size()) {
                setNom(typeEnclos.get(type) + " de " + especeEnclos.get(especeChoix));
                int superficieAl = random.nextInt(120) + 60;
                setSuperficie(superficieAl);
                break;
            } else {
                System.out.println("Erreur : Choisissez un nombre entre 0 et " + (especeEnclos.size() - 1) + " seulement");
            }
        }
    }

    /**
     * Vérifier la propreté de l'enclos
     * @param proprete
     */
    public void propreteEnclos(int proprete) {
        Thread propreteThread;
        this.proprete = proprete;

        propreteThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(10000); // intervalle de 10 secondes
                    decrementerProprete();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    // Gérer l'interruption du thread si nécessaire
                    break;
                }
            }
        });
        propreteThread.start();
    }

    /**
     * Affichage de l'état de propreté de l'enclos
     */
    private synchronized void decrementerProprete() {
        if (proprete > 0) {
            proprete--;
            setProprete(proprete);
            System.out.println("La propreté de " + getNom() + " est maintenant à " + getProprete());
            Etatpropete(); // Appeler la méthode Etatpropete après la modification
        }
    }

    /**
     * Différents états de propreté de l'enclos
     */
    public void Etatpropete()
    {
        if (proprete== 10)
        {
            System.out.println("bon");
        }
        else if (proprete == 7)
        {
            System.out.println("correct");
        }
        else if (proprete == 3)
        {
            System.out.println("mauvais");
        }

    }

    /**
     * Génération d'un nouvel enclos
     * @return newEnclos
     */
    public  Enclos genererNouvelleEnclos()
    {

        typeEnclos();
        Enclos newEnclos  = new Enclos(nom,superficie,nbMaxCreatures,creaturesPres,proprete);
        return newEnclos;
    }


    private ArrayList<Creature> creatures;

    /**
     * Initialisation de l'enclos
     * @param nom
     */
    public Enclos(String nom) {
        // Initialisation de l'enclos
        this.nom = nom;
        this.creatures = new ArrayList<>();
    }

    // ... (autres méthodes de la classe)

    /**
     * Listes des créatures dans l'enclos
     * @return creatures
     */
    public ArrayList<Creature> getCreatures() {
        return creatures;
    }

}

