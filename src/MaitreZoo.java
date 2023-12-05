package src;

/**
 * Définition des statistiques nécéssaires au maître du Zoo.
 */

public class MaitreZoo {
    private String nom;
    private String sexe;
    private int age;


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
        System.out.println("Le maître du Zoo examine l'enclos.");

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
                System.out.println("Le maître du Zoo nourrit les animaux.");
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


    public void transfer(Enclos enclosActuel, Enclos nouvelEnclos, Creature creature) {
        Creature[] liste = {}; // Déclaration d'un tableau vide, mais inutile ici

        // Vérifier si la créature est présente dans l'enclos actuel
        if (enclosActuel.contientCreature(creature)) {
            System.out.println("La créature va être transférée dans un autre enclos.");

            // Enlever la créature de l'enclos actuel
            enclosActuel.enleverCreature(creature);

            // Ajouter la créature au nouvel enclos
            nouvelEnclos.ajouterCreature(creature);

            System.out.println("La créature a été transférée avec succès dans le nouvel enclos.");
        } else {
            System.out.println("La créature n'est pas présente dans l'enclos actuel. Aucun transfert nécessaire.");
        }
    }
    public void seDeplacer(char touche)
    {
         // Ajustez la valeur du déplacement selon vos besoins

        if (touche == 'q' ) {
            System.out.println("Le maitre se déplace à gauche");
        } else if (touche == 'd' ) {
            System.out.println("Le maitre se déplace à droite");
        } else if (touche == 'z') {
            System.out.println("Le maitre se déplace en haut");
        } else if (touche == 's') {
            System.out.println("Le maitre se déplace en bas");
        }
    }

    public void actionMaitre(char touche){}
    @Override
    public String toString() {
        return
                 nom + " "+ sexe + " " +age + " ans" ;
    }
}