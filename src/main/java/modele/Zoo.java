package modele;

import java.util.*;

public class Zoo  {


    private String nom;
    private MaitreZoo maitre;
    private int nbCreaturesZoo;
    public ArrayList<Enclos> enclosExist;

    private ArrayList<Creature> creaturePres;
    private static int jour = 1;
    private int nbMaxEnclos;
    private int affichernbCreaturesZoo;

    public Zoo(String nom, MaitreZoo maitre , int nbCrea, ArrayList<Creature> creaturePres, ArrayList<Enclos> enclosExist, int nbMaxEnclos)
    {

        this.nom = nom;
        this.maitre= maitre;
        this.nbCreaturesZoo=nbCrea;
        this.creaturePres = new ArrayList<>();
        this.enclosExist=enclosExist;
        this.nbMaxEnclos = nbMaxEnclos;

        //this.jour = jour;
    }

    public void setCreaturePres(ArrayList<Creature> creaturePres) {
        this.creaturePres = creaturePres;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

   public String maitre(MaitreZoo maitre) {

       return maitre.getNom();
   }

    public int getNbCreaturesZoo() {
        int nbCreaturesZoo = 0;

        for (Enclos enclos : enclosExist) {
            nbCreaturesZoo += enclos.getNbCreatures();
        }

        return nbCreaturesZoo;
    }



    public void setNbCreaturesZoo(int nbCreaturesZoo) {

        this.nbCreaturesZoo = nbCreaturesZoo;
    }



    public int afficherNbCreaturesZoo() {

        return nbCreaturesZoo;

    }

    public ArrayList<Creature> afficherCreaturesPres(ArrayList<Creature> creaturePresZoo) {
        // Tri par sélection
        trierParOrdreAlphabetique(creaturePresZoo);

        // Affichage après le tri
        for (Creature creature : creaturePresZoo) {
            System.out.println(creature);
        }

        return creaturePresZoo;
    }

    public void trierParOrdreAlphabetique(ArrayList<Creature> creatures) {
        Collections.sort(creatures, new Comparator<Creature>() {
            @Override
            public int compare(Creature creature1, Creature creature2) {
                // Comparaison par le nom (ou autre attribut) de la créature
                return creature1.getNom().compareTo(creature2.getNom());
            }
        });
    }

    public static int incrementerJour() {
        jour++;
        return jour;
    }


    public static void lancerTimer() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                incrementerJour();
            }
        }, 10*1000, 10*1000); // Le deuxième argument est le délai initial, le troisième est l'intervalle en millisecondes
    }

    public static int getJour() {

        return jour;
    }

    public int nbMaxEnclos() {

        return nbMaxEnclos;
    }
    public void ajouterEnclos(Enclos enclos) {
        // Vérifier si l'enclos a atteint sa capacité maximale
        if (enclosExist.size() < nbMaxEnclos) {
            // Créer une nouvelle créature en utilisant les paramètres de la méthode
            Enclos newEnclos = enclos.genererNouvelleEnclos();

            // Ajouter l'enclos à la liste d'enclos présentes
            enclosExist.add(newEnclos);

            System.out.println("L'Enclos " + newEnclos.getNom() + " a été ajoutée à Zoo.");
        } else {
            System.out.println("Le Zoo est plein, impossible d'ajouter une nouvel  enclos.");
        }
    }
    @Override
    public String toString() {
        return "Bienvenue à " + nom + ". Nombre d'enclos : "+ enclosExist.size();
    }




}

