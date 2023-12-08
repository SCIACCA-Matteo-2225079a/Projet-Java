import modele.Creature;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CreatureTest {

    @Test
    void sommeil() {
        // Création d'une créature pour les tests
        Creature creature = new Creature("Mégalodon", "Male", 50, 150, 5, true, true, true, 100, false,"ok");
        assertEquals(true, creature.isDormir());
    }

    @Test
    void sante() {
        // Création d'une créature pour les tests
        Creature creature = new Creature("Mégalodon", "Male", 50, 150, 5, true, false, false, 100, false, "ok");
        assertEquals(100, creature.getIndicateurDeSante());
    }

    @Test
    void maladie() {
        // Création d'une créature pour les tests
        Creature creature = new Creature("Mégalodon", "Male", 50, 150, 5, true, false, false, 100, true, "ok");
        assertEquals(true, creature.isMalade());
    }


    @Test
    public void testCreatureConstructor() {
        // Création d'une créature pour les tests
        Creature creature = new Creature("NomTest", "Male", 50, 150, 5, false, true, false, 100, false,"ok");
        assertNotNull(creature);
        assertEquals("NomTest", creature.getNom());
    }

    @Test
    public void testManger() {
        // Création d'une créature pour les tests
        Creature creature = new Creature("Test", "Male", 50, 150, 5, false, true, false, 100, false,"ok");
        creature.manger();
        assertFalse(creature.isIndicateurDeFaim());
    }


    @Test
    public void testEtreSoigne() {
        // Création d'une créature pour les tests
        Creature creature = new Creature("Test", "Male", 50, 150, 5, true, true, false, 80, false,"ok");
        creature.etreSoigne();
        assertEquals(100, creature.getIndicateurDeSante());
    }

    @Test
    public void testGenererNouvelleCreature() {
        // Création d'une créature pour les tests
        Creature creature = new Creature("Test", "Male", 50, 150, 5, true, true, false, 80, false,"ok");
        Creature newCreature = creature.genererNouvelleCréature();
        assertNotNull(newCreature);
        System.out.println(newCreature);

    }

}