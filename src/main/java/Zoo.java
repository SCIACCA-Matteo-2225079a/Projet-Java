import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Zoo  {


    private String nom;
    private MaitreZoo maitre;
    private int nbCreatures;
    private ArrayList<Enclos> enclosExist;

    private ArrayList<Creature> creaturePres;
    private static int jour = 1;
    private int nbMaxEnclos;
    private int afficherNbCreatures;

    public Zoo(String nom, MaitreZoo maitre , int nbCrea, ArrayList<Creature> creaturePres, ArrayList<Enclos> enclosExist, int nbMaxEnclos)
    {

        this.nom = nom;
        this.maitre= maitre;
        this.nbCreatures=nbCrea;
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

    public int getNbCreatures() {
        int nbCreatures = 0;

        for (Enclos enclos : enclosExist) {
            nbCreatures += enclos.getNbCreatures();
        }

        return nbCreatures;
    }



    public void setNbCreatures(int nbCreatures) {

        this.nbCreatures = nbCreatures;
    }



    public int afficherNbCreatures() {

        return nbCreatures;

    }

    public ArrayList<Creature>  afficherCreaturesPres() {

        return creaturePres;
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

            // Ajouter la créature à la liste des créatures présentes
            enclosExist.add(newEnclos);

            System.out.println("L'Enclos " + newEnclos.getNom() + " a été ajoutée à Zoo.");
        } else {
            System.out.println("Le Zoo est plein, impossible d'ajouter une nouvel  enclos.");
        }
    }
    @Override
    public String toString() {
        return "Bienvenue à " + nom + "nombre d'enclos : "+ enclosExist.size();
    }
}

