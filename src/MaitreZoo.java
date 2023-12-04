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

        // Exemple : Vérifier si l'enclos est sale
        if (enclos.proprete < 5) {
            System.out.println("L'enclos est sale. Nettoyer nécessaire.");
        }
        else {
            System.out.println("L'enclos est propre.");
        }

        // Exemple : Vérifier si l'enclos a suffisamment de nourriture
        if (nourrir(creature)) {
            System.out.println("L'enclos a suffisamment de nourriture.");
        }
        else {
            System.out.println("L'enclos a besoin de plus de nourriture.");
        }

        // Ajoutez d'autres vérifications en fonction de vos besoins...

        // Exemple : Afficher un message après l'examen
        System.out.println("Examen de l'enclos terminé.");

    }
    private boolean enclosEstSale() {
        // Ajoutez ici la logique pour déterminer si l'enclos est sale
        // Vous pouvez utiliser des variables d'état, des capteurs, etc.
        // Pour cet exemple, nous retournerons toujours true.
        return false;
    }
        public void nettoyerEnclos()
    {
        if (enclosEstSale()) {
            System.out.println("Le maître du zoo nettoie l'enclos.");
            // Ajoutez ici la logique spécifique de nettoyage de l'enclos
            // ...
        } else {
            System.out.println("L'enclos n'est pas sale. Pas besoin de nettoyer.");
        }
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
    public void transfer()
    {}
    public void seDeplacer()
    {}

    @Override
    public String toString() {
        return
                 nom + " "+ sexe + " " +age ;
    }
}