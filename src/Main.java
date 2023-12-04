package src;

import java.util.ArrayList;
//Ceci importe la classe Scanner du package java.util
import java.util.Scanner;


/**
 * Exécution des fonctions.
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO Auto-generated method stub
        Creature creature = new Creature("Jean","femme",32,5,19,false,false,false,50,false);
        Creature creature2 = new Creature("Dragon","homme",32,5,19,true,false,false,50,false);
        ArrayList<Creature> ListeCrea = new ArrayList<>();
        MaitreZoo maitre = new MaitreZoo("Raoul", "Homme",24);
        Enclos enclos = new Enclos("Tanière", 32,6,ListeCrea);
        enclos.ajouterCreature(creature);
        enclos.ajouterCreature(creature2);
        System.out.println("Bonjour je suis "+ maitre);
        maitre.examinerEnclos(enclos);
        String str = sc.nextLine();

           if (str.equals("d"))
           {

               maitre.transfer(enclos,creature);

           }
        maitre.examinerEnclos(enclos);


        /*maitre.nourrir());
        System.out.println(" ");
        System.out.println();
        maitre.nettoyage();*/

    }
}