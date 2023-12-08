import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EnclosTest {


    @Test
    void testAjouterCreature() {
        Enclos enclos = new Enclos("EnclosTest", 100.0, 3, new ArrayList<>(), 8);
        Creature creature = new Creature("Phénix", "Male", 50, 150, 5, true, true, false, 100, false,"Hiiii");

        enclos.ajouterCreature(creature);

        assertTrue(enclos.getCreaturesPres().contains(creature));
        assertEquals(1, enclos.getNbCreatures());
    }

    @Test
    void testEnleverCreature() {
        Enclos enclos = new Enclos("Enclos Test", 100.0, 3, new ArrayList<>(), 8);
        Creature creature = new Creature("Licornes", "Male", 50, 150, 5, true, true, false, 100, false,"Hiiii");

            enclos.ajouterCreature(creature);
            enclos.enleverCreature(creature);

            assertFalse(enclos.getCreaturesPres().contains(creature));
    }

    @Test
    void testContientCreature() {
        Enclos enclos = new Enclos("Enclos Test", 100.0, 3, new ArrayList<>(), 8);
        Creature creature = new Creature("Mégalodon", "Male", 50, 150, 5, true, true, false, 100, false,"Hiiii");

        enclos.ajouterCreature(creature);
        assertTrue(enclos.contientCreature(creature));
    }

    @Test
    void testTypeEnclos() {
        Enclos enclos = new Enclos("Cage", 100.0, 3, new ArrayList<>(), 8);
        assertEquals("Cage", enclos.getNom());
    }

    @Test
    void testEtatProprete() {
        Enclos enclos = new Enclos("Enclos Test", 100.0, 3, new ArrayList<>(), 8);

    }

}


