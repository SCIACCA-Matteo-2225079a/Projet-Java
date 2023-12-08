import java.util.ArrayList;
import java.util.Scanner;


/**
 * Exécution des fonctions.
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age ;
        String nom;
        String genre;
        String espece;

        // TODO Auto-generated method stub
        MaitreZoo maitre;
        maitre = new MaitreZoo("Raoul", "Homme",24);
        Creature creature = new Creature("Lycanthropes","femme",32,5,19,false,false,false,50,false," OK");
        ArrayList<Creature> ListeCrea = new ArrayList<>();
        Enclos enclos = new Enclos("Cage", 32,6,ListeCrea,4);
        ArrayList<Enclos> enclosArrayList = new ArrayList<>();
        Zoo zoo = new Zoo("Foires au monstres",maitre,8,ListeCrea,enclosArrayList,5);
        Zoo.lancerTimer();
        zoo.ajouterEnclos(enclos);
        System.out.println(zoo);
        creature.startVieillissement();  // Démarrer le thread de vieillissement
        creature.emettreSon();

        enclos.setNbCreatures(1);
        creature.sommeil();
        espece = creature.getNom();
        System.out.println("Toutes les créatures dans le zoo :");
        for (int i = 0; i < ListeCrea.size(); i++) {
            maitre.nourrir(ListeCrea.get(i));
        }


    /*

        System.out.println("Ecrit ton nom");
        nom = sc.nextLine();
        maitre.setNom(nom);
        System.out.println("Choisis ton genre");
        genre= sc.nextLine();
        maitre.setSexe(genre);
        System.out.println("Choisis ton age");
        age = sc.nextInt();
        maitre.setAge(age);*/


        System.out.println("Bonjour je suis "+ maitre);

        // Entrée un lettre au clavier
        while (true) {
            System.out.println("Quelle action voulez-vous faire ? (i pour pour faire une action, w pour se déplacer, x pour quitter)");
            String action = sc.nextLine();

            if (action.equals("w")) {
                System.out.println("Utilisez les touches fléchées pour vous déplacer (c pour quitter le déplacement)");

                // Attend l'entrée des touches fléchées
                while (true) {
                    char move = sc.next().charAt(0);

                    //Utilisez 'w' pour monter, 'a' pour aller à gauche, 's' pour descendre, 'd' pour aller à droite.
                    // Lorsque l'utilisateur appuie sur 'q', quittez la boucle interne
                    maitre.seDeplacer(move);

                    if (move == 'c') {
                        break; // Quitte la boucle interne si l'utilisateur choisit de quitter le déplacement
                    }
                }
            }
            else if (action.equals("i"))
            {
                // Attend l'entrée des touches fléchées
                while (true) {
                    System.out.println("Nous sommes dans le jour " + Zoo.getJour());
                    System.out.println("Utilisez les touches pour effectuer une action"+
                            '\n'+"- n pour nourrir les créatures d'un enclos"+
                            '\n'+"- t pour tranfèrer les créatures dans un autre enclos"+
                            '\n'+"- e pour examiner un enclos"+
                            '\n'+"- m pour nettoyer un enclos"+
                            '\n'+"- s pour soigner une créature"+
                            '\n'+"- a pour ajouter une créature"+
                            '\n'+"- o pour ajouter un enclos"+
                            '\n'+"- p pour voir le nombre de créatures présentes dans le zoo"+
                            '\n'+"- c pour quitter l'interface action");

                    char interragir = sc.next().charAt(0);

                    if (interragir == 'n') {
                        System.out.println(enclos.getCreaturesPres());
                        for (int i = 0; i < ListeCrea.size(); i++) {
                            maitre.nourrir(ListeCrea.get(i));
                        }
                    }
                    else if (interragir == 't') {
                        //maitre.transfer(enclose,creature);
                    }
                    else if (interragir == 'e') {

                        System.out.println(zoo);
                        for (int i = 0; i < enclosArrayList.size(); i++) {
                            maitre.examinerEnclos(enclosArrayList.get(i));
                        }
                    }
                    else if (interragir == 'm') {
                        maitre.nettoyage(enclos);
                    }
                    else if (interragir == 's') {
                        for (int i = 0; i < ListeCrea.size(); i++) {
                            ListeCrea.get(i).etreSoigne();
                        }
                    }
                    else if (interragir == 'a') {
                        if (zoo.enclosExist.size() > 1) {
                            System.out.println("Où voulez-vous ajouter la créature ?");

                            for (int i = 0; i < zoo.enclosExist.size(); i++) {
                                System.out.println(zoo.enclosExist.get(i).getNom() + " : " + i);
                            }
                            while (true) {
                                int choixEnclos = sc.nextInt();
                                if (choixEnclos <= zoo.enclosExist.size()) {
                                    zoo.enclosExist.get(choixEnclos).ajouterCreature(creature.genererNouvelleCréature());


                                    break;
                                } else {
                                    System.out.println("Erreur : Choisis un nombre entre 1 et " + (zoo.enclosExist.size() - 1) + " seulement");
                                }
                            }

                        }
                        else
                        {
                            zoo.enclosExist.get(0).ajouterCreature(creature);
                        }
                    }
                    else if (interragir == 'o') {
                        zoo.ajouterEnclos(enclos);
                    }
                    else if (interragir == 'p') {
                        System.out.println("Il y a " + zoo.getNbCreaturesZoo() + " créatures dans le zoo");
                        System.out.println("Toutes les créatures dans le zoo :");
                        zoo.afficherCreaturesPres(ListeCrea);
                    }
                    else if (interragir == 'c') {
                        break; // Quitte la boucle interne si l'utilisateur choisit de quitter le déplacement
                    }
                    else {
                        System.out.println("Commande non reconnue. Veuillez réessayer.");
                    }
                }
            }
            else if (action.equals("x")) {
                // Ferme le scanner après utilisation
                sc.close();
                break; // Quitte la boucle principale si l'utilisateur choisit de quitter
            }
            else {
                System.out.println("Commande non reconnue. Veuillez réessayer.");
            }
        }
        }
}