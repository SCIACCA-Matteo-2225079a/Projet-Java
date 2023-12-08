package modele;

import java.util.ArrayList;

/**
 * Définition des statistiques nécéssaires au maître du Zoo.
 */

/**
 * Caractéristiques du maître du zoo
 */
public class MaitreZoo {
    private String nom;
    private String sexe;
    private int age;


    /**
     * Récupérer les caractéristiques du maître du zoo
     * @param nom
     * @param sexe
     * @param age
     */
    public MaitreZoo(String nom, String sexe, int age )
    {

        this.nom = nom;
        this.sexe = sexe;
        this.age = age;
    }

    /**
     * Récupérer le nom du maître du zoo
     * @return nom
     */
    public String getNom() {

        return nom;
    }

    /**
     * Modifier le nom du maître du zoo
     * @param nom
     */
    public void setNom(String nom) {

        this.nom = nom;
    }

    /**
     * Récupérer le sexe du maître du zoo
     * @return sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * Modifier le sexe du maître du zoo
     * @param sexe
     */
    public void setSexe(String sexe) {

        this.sexe = sexe;
    }

    /**
     * Récupérer l'age du maître du zoo
     * @return age
     */
    public int getAge() {

        return age;
    }

    /**
     * Modifier l'age du maître du zoo
     * @param age
     */
    public void setAge(int age) {

        this.age = age;
    }

    /**
     * Examination de l'enclos
     * @param enclos
     */
    public void examinerEnclos(Enclos enclos) {
        System.out.println("Le maître du Zoo examine l'enclos.");

        System.out.println(enclos);
        // Ajoutez d'autres vérifications en fonction de vos besoins...
        enclos.Etatpropete();
        // Afficher un message après l'examen
        System.out.println("Examen de l'enclos terminé.");

    }

    /**
     * Nettoyage de l'enclos
     * @param enclos
     */
        public void nettoyage(Enclos enclos)
    {


        // Vérifier si l'enclos est sale et vide
        if (enclos.proprete<5 && enclos.getNbCreatures() == 0) {
            System.out.println("Nettoyage en cours de l'enclos...");
            // Logique de nettoyage (à adapter en fonction de vos besoins)
            // Réinitialiser l'indicateur de propreté à "bon", par exemple
            enclos.proprete = 10;

            System.out.println("L'enclos a été nettoyé avec succès.");
        } else {
            System.out.println("L'enclos ne nécessite pas d'entretien pour le moment.");
        }
    }

    /**
     * Nourrir les créatures de l'enclos
     * @param creature
     * @return true or false
     */
    public boolean nourrir(Creature creature) {


        // Vérifier si la créature est null avant d'appeler ses méthodes
        if (creature != null) {
            // Exemple : Vérifier si la créature a besoin de nourriture
                if (creature.isIndicateurDeFaim()==true) {
                    System.out.println("Le maître du Zoo nourrit les animaux.");
                    creature.manger();
                    System.out.println(creature.getNom()+" a faim. Nourrissage nécessaire.");

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

    /**
     * Ajout de créatures dans l'enclos
     * @param enclos
     * @param creature
     */
    public void ajouterCreatureDansEnclos(Enclos enclos, Creature creature) {
        // Vérifier si l'enclos a atteint sa capacité maximale
        if (enclos.getNbCreatures() < enclos.getNbCreatures()) {

            // Ajouter la créature à la liste des créatures présentes
            enclos.getCreaturesPres().add(creature);

            // Incrémenter le nombre total de créatures
            enclos.setNbCreatures(+1);

            System.out.println("La créature " + creature.getNom() + " a été ajoutée à l'enclos.");
        } else {
            System.out.println("L'enclos est plein, impossible d'ajouter une nouvelle créature.");
        }
    }

    /**
     * Transfer de créatures vers un autre enclos
     * @param enclosActuel
     * @param nouvelEnclos
     * @param creature
     */
    public void transfer(Enclos enclosActuel, Enclos nouvelEnclos, Creature creature) {
        // Vérifier si la créature est présente dans l'enclos actuel
        ArrayList<Creature> Transfere= new ArrayList<>();
        if (enclosActuel.contientCreature(creature)) {
            System.out.println("La créature va être transférée dans un autre enclos.");
            Transfere.add(creature);
            // Enlever la créature de l'enclos actuel
            enclosActuel.enleverCreature(creature);
            // Ajouter la créature au nouvel enclos
            ajouterCreatureDansEnclos(nouvelEnclos,Transfere.get(0));
            Transfere.remove(0);
            System.out.println("La créature a été transférée avec succès dans le nouvel enclos.");
        } else {
            System.out.println("La créature n'est pas présente dans l'enclos actuel. Aucun transfert nécessaire.");
        }
    }

    /**
     * Déplacement vers un autre enclos
     * @param touche
     */
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
        else
        {
            System.out.println("Commande non reconnue");
        }
    }


    /**
     * Affichage caractéristiques maître du zoo
     * @return toString
     */
    @Override
    public String toString() {
        return
                 nom + " "+ sexe + " " +age + " ans" ;
    }
}