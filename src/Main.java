package src;

import java.util.ArrayList;

/**
 * Exécution des fonctions.
 */

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Creature creature = new Creature("Jean","femme",32,5,19,false,false,false,50,false);
        Creature creature2 = new Creature("Dragon","homme",32,5,19,true,false,false,50,false);


        ArrayList<Creature> Listecreature = new ArrayList<Creature>();
        Listecreature.add(creature);
        Listecreature.add(creature2);


        Enclos enclos = new Enclos("Tanière", 32,10,5,Listecreature,6);
        MaitreZoo maitre = new MaitreZoo("Raoul", "Homme",24);
        System.out.println("Bonjour je suis "+ maitre);
        maitre.nourrir(Listecreature.get(0));
        System.out.println(" ");
        maitre.nourrir(creature2);
        maitre.examinerEnclos(enclos);

    }
}