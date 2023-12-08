import modele.Creature;
import modele.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EnclosTest {

    /**
     * test si la fonction ContientCreature est correcte
     */
    @Test
    void testContientCreature() {
        Enclos enclos = new Enclos("Enclos Test", 100.0, 3, new ArrayList<>(), 8);
        Creature creature = new Creature("Mégalodon", "Male", 50, 150, 5, true, true, false, 100, false,"Hiiii");

        enclos.ajouterCreature(creature);
        assertTrue(enclos.contientCreature(creature));
    }
    /**
     * test si la fonction TypeEnclos est correcte
     */
    @Test
    void testTypeEnclos() {
        Enclos enclos = new Enclos("Cage", 100.0, 3, new ArrayList<>(), 8);
        assertEquals("Cage", enclos.getNom());
    }
    /**
     * test si la fonction EtatProrete est correcte
     */
    @Test
    void testEtatProprete() {
        Enclos enclos = new Enclos("Enclos Test", 100.0, 3, new ArrayList<>(), 8);

    }

}


