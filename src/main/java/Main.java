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

        // TODO Auto-generated method stub
        Creature creatureParDéfaut = new Creature("Jean","femme",32,5,19,false,false,false,50,false);
        Creature creature = creatureParDéfaut.genererNouvelleCréature();
        ArrayList<Creature> ListeCrea = new ArrayList<>();
        ArrayList<Enclos> enclosArrayList = new ArrayList<>();
        MaitreZoo maitre = new MaitreZoo("Raoul", "Homme",24);
        Enclos enclosParDefaut = new Enclos("Tanière", 32,6,ListeCrea,4);
        Enclos enclos = enclosParDefaut.genererNouvelleEnclos();
        Zoo zoo = new Zoo("Foires au monstres",maitre,8,ListeCrea,enclosArrayList,5);
        Zoo.lancerTimer();
        System.out.println(zoo );
        enclosArrayList.add(enclos);
        enclos.ajouterCreature(creature);


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
                            '\n'+"- h pour savoir quel jour on est"+
                            '\n'+"- c pour quitter l'interface action");

                    char interragir = sc.next().charAt(0);

                    if (interragir == 'n') {
                        for (int i = 0; i < ListeCrea.size(); i++) {
                            maitre.nourrir(ListeCrea.get(i),enclos);
                        }
                    }
                    else if (interragir == 't') {
                        maitre.transfer(enclos,enclosParDefaut,creature);
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
                        enclos.ajouterCreature(creature);
                    }
                    else if (interragir == 'o') {
                        zoo.ajouterEnclos(enclos);
                    }
                    else if (interragir == 'p') {
                        System.out.println("Il y a " + zoo.getNbCreatures() + " créatures dans le zoo");
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