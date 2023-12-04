package src;

/**
 * Définition des statistiques nécéssaires au maître du zoo.
 */

public class MaitreZoo {
    private String nom;
    private String sexe;
    private int age;
    public Creature creature;


    public MaitreZoo(String nom, String sexe, int age )
    {

        this.nom = nom;
        this.sexe = sexe;
        this.age = age;
    }

    public String getNom() {

        return nom;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {

        this.sexe = sexe;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void examinerEnclos(Enclos enclos) {
        System.out.println("Le maître du zoo examine l'enclos.");

        System.out.println(enclos.getNom());
        System.out.println(enclos.getSuperficie());
        System.out.println(enclos.getNbCreatures()+ "/ "+ enclos.getNbMaxCreatures());
        System.out.println(enclos.getCreaturesPres());
        System.out.println(enclos.getProprete());

        // Ajoutez d'autres vérifications en fonction de vos besoins...

        // Exemple : Afficher un message après l'examen
        System.out.println("Examen de l'enclos terminé.");

    }

        public void nettoyage(Enclos enclos)
    {
        enclos.entretenir();
    }

    public boolean nourrir(Creature creature) {


        // Vérifier si la créature est null avant d'appeler ses méthodes
        if (creature != null) {

            // Exemple : Vérifier si la créature a besoin de nourriture
            if (creature.isIndicateurDeFaim()) {
                System.out.println("Le maître du zoo nourrit les animaux.");
                System.out.println(creature.getNom()+" a faim. Nourrissage nécessaire.");
                creature.manger();
            }
            else {
                System.out.println(creature.getNom()+" n'a pas faim.");
            }

            // Ajoutez d'autres opérations liées à l'alimentation en fonction de vos besoins...
        } else {
            System.out.println("Erreur : La créature est null. Impossible de nourrir.");
            return true;
        }

        // Exemple : Afficher un message après l'alimentation
        System.out.println(creature.getNom()+" a été nourris.");
        return false;
    }
    public void transfer(Enclos enclos, Creature creature)
    {
        Creature[] liste = {};
        int i = 1;
        if (liste!=null)
        {
            System.out.println("La créature doit être transférer dans un autre enclos");
            enclos.enleverCreature(creature);
            liste = new Creature[] {creature};
            System.out.println(liste[0]);

        }
        else
        {
            System.out.println("Il n'y a pas de créature à transférer");
        }

    }
    public void seDeplacer()
    {}

    @Override
    public String toString() {
        return
                 nom + " "+ sexe + " " +age + " ans" ;
    }
}