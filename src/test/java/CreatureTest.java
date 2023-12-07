import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CreatureTest {

    @Test
    void sommeil() {
        Creature creature = new Creature("Mégalodon", "Male", 50, 150, 5, true, true, true, 100, false);
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
        Creature creature = new Creature("NomTest", "Male", 50, 150, 5, false, true, false, 100, false);
        assertNotNull(creature);
        assertEquals("NomTest", creature.getNom());
    }

    @Test
    public void testManger() {
        Creature creature = new Creature("Test", "Male", 50, 150, 5, false, true, false, 100, false);
        creature.manger();
        assertFalse(creature.isIndicateurDeFaim());
    }

    @Test
    public void testEmettreUnSon() {
        Creature creature = new Creature("Lycanthropes", "Male", 50, 150, 5, true, true, false, 100, false);
        assertEquals("Aouuuuh", creature.emettreUnSon(creature.getNom()));
    }

    @Test
    public void testEtreSoigne() {
        Creature creature = new Creature("Test", "Male", 50, 150, 5, true, true, false, 80, false);
        creature.etreSoigne();
        assertEquals(100, creature.getIndicateurDeSante());
    }

    @Test
    public void testGenererNouvelleCreature() {
        Creature creature = new Creature("Test", "Male", 50, 150, 5, true, true, false, 80, false);
        Creature newCreature = creature.genererNouvelleCréature();
        assertNotNull(newCreature);
        System.out.println(newCreature);

    }





}