import org.junit.jupiter.api.Test;
import src.main.java.Creature;
import src.main.java.Enclos;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EnclosTest {

    @Test
    void getNom() {
    }

    @Test
    void setNom() {
    }

    @Test
    void getSuperficie() {
    }

    @Test
    void setSuperficie() {
    }

    @Test
    void getNbMaxCreatures() {
    }

    @Test
    void setNbMaxCreatures() {
    }

    @Test
    void getNbCreatures() {
    }

    @Test
    void setNbCreatures() {
    }

    @Test
    void getCreaturesPres() {
    }

    @Test
    void setCreaturesPres() {
    }

    @Test
    void getProprete() {
    }

    @Test
    void setProprete() {
    }

    @Test
    void testToString() {
    }

    @Test
    void afficherCaracteristiques() {
    }

    @Test
    void ajouterCreature() {
    }

    @Test
    void enleverCreature() {
    }

    @Test
    void contientCreature() {
    }

    @Test
    void typeEnclos() {
    }

    @Test
    void etatpropete() {
    }

    @Test
    void genererNouvelleEnclos() {
    }

    @Test
    void testAjouterCreature() {
        Enclos enclos = new Enclos("Enclos Test", 100.0, 3, new ArrayList<>(), 8);
        Creature creature = new Creature("TestCreature");

        enclos.ajouterCreature(creature);

        assertTrue(enclos.getCreaturesPres().contains(creature));
        assertEquals(1, enclos.getNbCreatures());
    }

    @Test
    void testEnleverCreature() {
        Enclos enclos = new Enclos("Enclos Test", 100.0, 3, new ArrayList<>(), 8);
        Creature creature = new Creature("TestCreature");

        enclos.ajouterCreature(creature);
        enclos.enleverCreature(creature);

        assertFalse(enclos.getCreaturesPres().contains(creature));
        assertEquals(0, enclos.getNbCreatures());
    }

    @Test
    void testContientCreature() {
        Enclos enclos = new Enclos("Enclos Test", 100.0, 3, new ArrayList<>(), 8);
        Creature creature = new Creature("TestCreature");

        enclos.ajouterCreature(creature);

        assertTrue(enclos.contientCreature(creature));
    }

    @Test
    void testTypeEnclos() {
        Enclos enclos = new Enclos("Enclos Test", 100.0, 3, new ArrayList<>(), 8);
        assertEquals("Cage", enclos.getNom());
    }

    @Test
    void testEtatProprete() {
        Enclos enclos = new Enclos("Enclos Test", 100.0, 3, new ArrayList<>(), 8);

    }

}


