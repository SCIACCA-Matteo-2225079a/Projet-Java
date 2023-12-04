package src;

/**
 * Définition des statistiques nécéssaires au maître du zoo.
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
        System.out.println("Le maître du zoo examine l'enclos.");

        // Exemple : Vérifier si l'enclos est sale
        if (enclos.proprete == 5) {
            System.out.println("L'enclos est sale. Nettoyer nécessaire.");
        }
        else {
            System.out.println("L'enclos est propre.");
        }

        // Exemple : Vérifier si l'enclos a suffisamment de nourriture
        if (nourrir()) {
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

    public boolean nourrir(Creature creature)
    {
        if(creature.isIndicateurDeFaim()==false )
        {
            creature.manger();
            return true;
        } else {
            return false ;
        }


    }
    public void transfer()
    {}
    public void seDeplacer()
    {}
}