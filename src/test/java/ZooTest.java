import modele.Creature;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {


    @Test
    void TestGetNom() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        assertEquals("Mon Zoo", zoo.getNom());
    }

    @Test
    void TestSetNom() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        zoo.setNom("Nouveau Zoo");
        assertEquals("Nouveau Zoo", zoo.getNom());
    }

    @Test
    void TestGetNbCreatures() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        assertEquals(0, zoo.getNbCreaturesZoo());
    }

    @Test
    void TestSetNbCreatures() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        zoo.setNbCreaturesZoo(10);
        assertEquals(0, zoo.getNbCreaturesZoo());
    }

    @Test
    void TestAfficherNbCreatures() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        assertEquals(0, zoo.afficherNbCreaturesZoo());
    }

    @Test
    void TestIncrementerJour() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        assertEquals(2, zoo.incrementerJour());
    }


    @Test
    void TestGetJour() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        assertEquals(1, zoo.getJour());
    }

    @Test
    void TestNbMaxEnclos() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        assertEquals(5, zoo.nbMaxEnclos());
    }

    @Test
    void TestToString() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 1, new ArrayList<>(), new ArrayList<>(), 5);
        Enclos enclos = new Enclos("EnclosTest", 100.0, 3, new ArrayList<>(), 8);
        enclos.genererNouvelleEnclos();
        assertEquals("Bienvenue à Mon Zoo nombre d'enclos : 1", zoo.toString());
    }

    @Test
void TesttrierParOrdreAlphabetique () {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);

        // Création de quelques créatures non triées
        ArrayList<Creature> creatures = new ArrayList<>();
        creatures.add(new Creature("Lion", "Mâle", 200, 150, 5, true, false, false, 100, false, "dsdq"));
        creatures.add(new Creature("Tigre", "Femelle", 180, 120, 4, true, false, false, 90, false, "dsdq"));
        creatures.add(new Creature("Girafe", "Mâle", 600, 300, 8, true, false, false, 200, false, "dsdq"));

        // Appel de la méthode pour trier les créatures
        zoo.trierParOrdreAlphabetique(creatures);

        // Création de la liste triée attendue
        ArrayList<Creature> expectedSortedCreatures = new ArrayList<>();
        expectedSortedCreatures.add(new Creature("Girafe", "Mâle", 600, 300, 8, true, false, false, 200, false, "dsdq"));
        expectedSortedCreatures.add(new Creature("Lion", "Mâle", 200, 150, 5, true, false, false, 100, false, "dsdq"));
        expectedSortedCreatures.add(new Creature("Tigre", "Femelle", 180, 120, 4, true, false, false, 90, false, "dsdq"));

        // Vérification que la liste a été triée correctement
        assertEquals(expectedSortedCreatures, creatures);
    }
}