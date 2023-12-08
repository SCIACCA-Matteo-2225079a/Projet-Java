import modele.Creature;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CreatureTest {
    /**
     * test si la sommeil est correcte
     */
    @Test
    void sommeil() {
        // Création d'une créature pour les tests
        Creature creature = new Creature("Mégalodon", "Male", 50, 150, 5, true, true, true, 100, false,"ok");
        assertEquals(true, creature.isDormir());
    }
    /**
     * test si la fonction sante est correcte
     */
    @Test
    void sante() {
        // Création d'une créature pour les tests
        Creature creature = new Creature("Mégalodon", "Male", 50, 150, 5, true, false, false, 100, false, "ok");
        assertEquals(100, creature.getIndicateurDeSante());
    }
    /**
     * test si la fonction maladie est correcte
     */
    @Test
    void maladie() {
        // Création d'une créature pour les tests
        Creature creature = new Creature("Mégalodon", "Male", 50, 150, 5, true, false, false, 100, true, "ok");
        assertEquals(true, creature.isMalade());
    }

    /**
     * test si la fonction CreatureConstructor est correcte
     */
    @Test
    public void testCreatureConstructor() {
        // Création d'une créature pour les tests
        Creature creature = new Creature("NomTest", "Male", 50, 150, 5, false, true, false, 100, false,"ok");
        assertNotNull(creature);
        assertEquals("NomTest", creature.getNom());
    }

    /**
     * test si la fonction manger est correcte
     */
    @Test
    public void testManger() {
        // Création d'une créature pour les tests
        Creature creature = new Creature("Test", "Male", 50, 150, 5, false, true, false, 100, false,"ok");
        creature.manger();
        assertFalse(creature.isIndicateurDeFaim());
    }

    /**
     * test si la fonction EtreSoigne est correcte
     */
    @Test
    public void testEtreSoigne() {
        // Création d'une créature pour les tests
        Creature creature = new Creature("Test", "Male", 50, 150, 5, true, true, false, 80, false,"ok");
        creature.etreSoigne();
        assertEquals(100, creature.getIndicateurDeSante());
    }

    /**
     * test si la fonction GenererNouvelleCreature est correcte
     */
    @Test
    public void testGenererNouvelleCreature() {
        // Création d'une créature pour les tests
        Creature creature = new Creature("Test", "Male", 50, 150, 5, true, true, false, 80, false,"ok");
        Creature newCreature = creature.genererNouvelleCréature();
        assertNotNull(newCreature);
        System.out.println(newCreature);

    }

}