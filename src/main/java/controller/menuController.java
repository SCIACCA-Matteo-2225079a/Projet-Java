package controller;

import java.util.ArrayList;
import java.util.Scanner;
import MaitreZoo.*;
public class menuController {
    Scanner sc = new Scanner(System.in);
    MaitreZoo maitre;
    Creature creature;
    Enclos enclos;
    ArrayList<Creature> ListeCrea = new ArrayList<>();
    ArrayList<Enclos> enclosArrayList = new ArrayList<>();
    Zoo zoo;

    public menuController() {
        maitre = new MaitreZoo("Raoul", "Homme", 24);
        creature = new Creature("Lycanthropes", "femme", 32, 5, 19, false, false, false, 50, true, "OK");
        enclos = new Enclos("Cage", 32, 6, ListeCrea, 4);
        zoo = new Zoo("Foires au monstres", maitre, 8, ListeCrea, enclosArrayList, 5);
        zoo.lancerTimer();
        zoo.ajouterEnclos(enclos);

        if (!enclos.getCreaturesPres().isEmpty()) {
            enclos.propreteEnclos(enclos.getProprete());
        }

        System.out.println(zoo);
        System.out.println("Toutes les créatures dans le zoo :");
        for (Creature crea : ListeCrea) {
            maitre.nourrir(crea);
        }
    }

    public void commandeMaitreZoo() {
        System.out.println("Ecris ton nom");
        String nom = sc.nextLine();
        maitre.setNom(nom);
        System.out.println("Choisis ton genre");
        String genre = sc.nextLine();
        maitre.setSexe(genre);
        System.out.println("Choisis ton age");
        int age = sc.nextInt();
        maitre.setAge(age);
    }

    public void interaction() {
        System.out.println("Bonjour, je suis " + maitre);

        while (true) {
            System.out.println("Quelle action voulez-vous faire ? (i pour faire une action, w pour se déplacer, x pour quitter)");
            String action = sc.next();

            if (action.equals("w")) {
                System.out.println("Utilisez les touches fléchées pour vous déplacer (c pour quitter le déplacement)");

                while (true) {
                    char move = sc.next().charAt(0);
                    maitre.seDeplacer(move);

                    if (move == 'c') {
                        break;
                    }
                }
            } else if (action.equals("i")) {
                while (true) {
                    System.out.println("Nous sommes dans le jour " + Zoo.getJour());
                    System.out.println("Utilisez les touches pour effectuer une action\n"
                            + "- n pour nourrir les créatures d'un enclos\n"
                            + "- t pour transférer les créatures dans un autre enclos\n"
                            + "- e pour examiner un enclos\n"
                            + "- m pour nettoyer un enclos\n"
                            + "- s pour soigner une créature\n"
                            + "- a pour ajouter une créature\n"
                            + "- o pour ajouter un enclos\n"
                            + "- p pour voir le nombre de créatures présentes dans le zoo\n"
                            + "- c pour quitter l'interface action");

                    char interagir = sc.next().charAt(0);

                    if (interagir == 'n') {
                        System.out.println(enclos.getCreaturesPres());
                        for (Creature crea : ListeCrea) {
                            maitre.nourrir(crea);
                        }
                    } else if (interagir == 't') {
                        // maitre.transfer(enclos,creature);
                    } else if (interagir == 'e') {
                        System.out.println(zoo);
                        for (Enclos enclo : enclosArrayList) {
                            maitre.examinerEnclos(enclo);
                        }
                    } else if (interagir == 'm') {
                        maitre.nettoyage(enclos);
                    } else if (interagir == 's') {
                        for (Creature crea : ListeCrea) {
                            crea.etreSoigne();
                        }
                    } else if (interagir == 'a') {
                        if (zoo.enclosExist.size() > 1) {
                            System.out.println("Où voulez-vous ajouter la créature ?");

                            for (int i = 0; i < zoo.enclosExist.size(); i++) {
                                System.out.println(zoo.enclosExist.get(i).getNom() + " : " + i);
                            }

                            while (true) {
                                int choixEnclos = sc.nextInt();}
                        }
                    }
                }
            }
        }
    }
}

