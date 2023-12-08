import modele.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MaitreZooTest {

    @Test
    void testExaminerEnclos() {
        // Création d'une instance d'enclos pour les tests
        Enclos enclosTest = new Enclos("Enclos de Test", 100.0, 10, new ArrayList<>(), 8);

        // Création d'une instance de MaitreZoo pour les tests
        MaitreZoo maitreZoo = new MaitreZoo("John Doe", "Homme", 35);

        // Appel de la méthode d'examen d'enclos
        maitreZoo.examinerEnclos(enclosTest);

        assertEquals("John Doe", maitreZoo.getNom());
        assertEquals("Homme", maitreZoo.getSexe());
        assertEquals(35, maitreZoo.getAge());
        assertEquals("Enclos de Test", enclosTest.getNom());
        assertEquals(100.0, enclosTest.getSuperficie());
        assertEquals(10, enclosTest.getNbMaxCreatures());
        assertEquals(10, enclosTest.getProprete());
        System.out.println("-------------------------------");

    }

    @Test
    public void testNettoyage() {
        // Création d'une instance d'enclos pour les tests
        Enclos enclosTest = new Enclos("Enclos de Test", 100.0, 0, new ArrayList<>(), 2);

        // Création d'une instance de MaitreZoo pour les tests
        MaitreZoo maitreZoo = new MaitreZoo("John Doe", "Homme", 35);

        // Appel de la méthode de nettoyage d'enclos
        maitreZoo.nettoyage(enclosTest);

        // Vérifier que l'enclos a bien été nettoyé
        assertEquals(10, enclosTest.getProprete());
        System.out.println("-------------------------------");

    }

    @Test
    public void testNourrir() {
        // Création d'une créature pour les tests
        Creature creatureTest = new Creature("Lion", "Mâle", 150, 100, 5, true, false, false, 90, false,"dqzd");

        // Création d'une instance de MaitreZoo pour les tests
        MaitreZoo maitreZoo = new MaitreZoo("John Doe", "Homme", 35);

        // Appel de la méthode de nourrissage
        boolean resultat = maitreZoo.nourrir(creatureTest);

        // Vérifier que la créature a bien été nourrie
        assertFalse(resultat);
        assertFalse(creatureTest.isIndicateurDeFaim());
        System.out.println("-------------------------------");

    }

}



