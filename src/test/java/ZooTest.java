import modele.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    /**
     * test si le GetNom est correcte
     */
    @Test
    void TestGetNom() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        assertEquals("Mon Zoo", zoo.getNom());
    }
    /**
     * test si le SetNom est correcte
     */
    @Test
    void TestSetNom() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        zoo.setNom("Nouveau Zoo");
        assertEquals("Nouveau Zoo", zoo.getNom());
    }
    /**
     * test si le GetNbCreatures est correcte
     */
    @Test
    void TestGetNbCreatures() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        assertEquals(0, zoo.getNbCreaturesZoo());
    }
    /**
     * test si le SetNbCreature est correcte
     */
    @Test
    void TestSetNbCreatures() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        zoo.setNbCreaturesZoo(10);
        assertEquals(0, zoo.getNbCreaturesZoo());
    }
    /**
     * test si la fonction AfficherNbCreatures est correcte
     */
    @Test
    void TestAfficherNbCreatures() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        assertEquals(0, zoo.afficherNbCreaturesZoo());
    }
    /**
     * test si la fonction IncrementerJour est correcte
     */
    @Test
    void TestIncrementerJour() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        assertEquals(2, zoo.incrementerJour());
    }
    /**
     * test si le GetJour est correcte
     */

    @Test
    void TestGetJour() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        assertEquals(1, zoo.getJour());
    }
    /**
     * test si la fonction NbMaxEnclo est correcte
     */
    @Test
    void TestNbMaxEnclos() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        assertEquals(5, zoo.nbMaxEnclos());
    }
    /**
     * test si la fonction trierParOrdreAlphabetique est correcte
     */

    @Test
    void TesttrierParOrdreAlphabetique () {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);

        // Création de quelques créatures non triées
        ArrayList<Creature> creatures = new ArrayList<>();
        creatures.add(new Creature("Kraken", "Mâle", 200, 150, 5, true, false, false, 100, false, "ok"));
        creatures.add(new Creature("Phénix", "Femelle", 180, 120, 4, true, false, false, 90, false, "ok"));
        creatures.add(new Creature("Mégalodon", "Mâle", 600, 300, 8, true, false, false, 200, false, "ok"));

        // Appel de la méthode pour trier les créatures
        zoo.trierParOrdreAlphabetique(creatures);

        // Création de la liste triée attendue
        ArrayList<Creature> expectedSortedCreatures = new ArrayList<>();
        expectedSortedCreatures.add(new Creature("Kraken", "Mâle", 200, 150, 5, true, false, false, 100, false, "ok"));
        expectedSortedCreatures.add(new Creature("Mégalodon", "Mâle", 600, 300, 8, true, false, false, 200, false, "ok"));
        expectedSortedCreatures.add(new Creature("Phénix", "Femelle", 180, 120, 4, true, false, false, 90, false, "ok"));

        // Vérification que la liste a été triée correctement
        assertEquals(expectedSortedCreatures, creatures);
    }
}