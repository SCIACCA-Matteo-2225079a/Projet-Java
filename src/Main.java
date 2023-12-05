package src;


import java.util.ArrayList;
//Ceci importe la classe Scanner du package java.util
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

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
        Creature creature = new Creature("Jean","femme",32,5,19,false,false,false,50,false);
        Creature creature2 = new Creature("Dragon","homme",32,5,19,true,false,false,50,false);
        ArrayList<Creature> ListeCrea = new ArrayList<>();
        ArrayList<Creature> ListecreaEnclos2 = new ArrayList<>();
        MaitreZoo maitre = new MaitreZoo("Raoul", "Homme",24);
        Enclos enclos = new Enclos("Tanière", 32,6,ListeCrea);
        Enclos enclos2 = new Enclos("Grotte", 60,8,ListecreaEnclos2);
        Zoo zoo = new Zoo("Foires au monstres",maitre,8,6,ListeCrea, 1);
        Zoo.lancerTimer();
        enclos.ajouterCreature(creature);
        enclos.ajouterCreature(creature2);


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
        System.out.println("Quelle action voulez-vous faire ?");
        for (int i = 0; i < ListeCrea.size(); i++) {
            maitre.nourrir(ListeCrea.get(i));
        }
        while (true) {
            System.out.println("Quelle action voulez-vous faire ? (d pour se déplacer, f pour quitter)");
            String action = sc.nextLine();

            if (action.equals("t")) {
                System.out.println("Utilisez les touches fléchées pour vous déplacer (q pour quitter le déplacement)");

                // Attend l'entrée des touches fléchées
                while (true) {
                    char move = sc.next().charAt(0);

                    // TODO: Ajoutez ici la logique pour gérer le déplacement avec les touches fléchées
                    // Vous pouvez ajuster les coordonnées du maître du zoo en fonction des touches.
                    // Par exemple, utilisez 'w' pour monter, 'a' pour aller à gauche, 's' pour descendre, 'd' pour aller à droite.
                    // Lorsque l'utilisateur appuie sur 'q', quittez la boucle interne
                    maitre.seDeplacer(move);

                    if (move == 'c') {
                        break; // Quitte la boucle interne si l'utilisateur choisit de quitter le déplacement
                    }
                }
            } else if (action.equals("f")) {
                break; // Quitte la boucle principale si l'utilisateur choisit de quitter
            } else {
                System.out.println("Commande non reconnue. Veuillez réessayer.");
            }
        }

        // Ferme le scanner après utilisation
        sc.close();

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
        System.out.println("Quelle action voulez-vous faire ?");
        //String str = sc.nextLine();
        maitre.examinerEnclos(enclos);
        System.out.println(" ");

        maitre.transfer(enclos,enclos2,creature);
        System.out.println(" ");

        maitre.examinerEnclos(enclos);
        System.out.println(" ");

        maitre.examinerEnclos(enclos2);

        }
}