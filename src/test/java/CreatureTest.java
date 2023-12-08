import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CreatureTest {

    @Test
    void sommeil() {
        Creature creature = new Creature("Mégalodon", "Male", 50, 150, 5, true, true, true, 100, false,"ahaha");
        assertEquals(true, creature.isDormir());
    }

    @Test
    void sante() {
        Creature creature = new Creature("Mégalodon", "Male", 50, 150, 5, true, false, false, 100, false);
        assertEquals(100, creature.getIndicateurDeSante());
    }

    @Test
    void maladie() {
        Creature creature = new Creature("Mégalodon", "Male", 50, 150, 5, true, false, false, 100, true);
        assertEquals(true, creature.isMalade());
    }


    @Test
    void mourir() {
    }

    @Test
    void mettreABas() {
    }

    @Test
    public void testCreatureConstructor() {
        Creature creature = new Creature("NomTest", "Male", 50, 150, 5, false, true, false, 100, false,"ok");
        assertNotNull(creature);
        assertEquals("NomTest", creature.getNom());
    }

    @Test
    public void testManger() {
        Creature creature = new Creature("Test", "Male", 50, 150, 5, false, true, false, 100, false,"ok");
        creature.manger();
        assertFalse(creature.isIndicateurDeFaim());
    }


    @Test
    public void testEtreSoigne() {
        Creature creature = new Creature("Test", "Male", 50, 150, 5, true, true, false, 80, false,"ok");
        creature.etreSoigne();
        assertEquals(100, creature.getIndicateurDeSante());
    }

    @Test
    public void testGenererNouvelleCreature() {
        Creature creature = new Creature("Test", "Male", 50, 150, 5, true, true, false, 80, false,"ok");
        Creature newCreature = creature.genererNouvelleCréature();
        assertNotNull(newCreature);
        System.out.println(newCreature);

    }





}