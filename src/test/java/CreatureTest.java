import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CreatureTest {

    @Test
    void getNom() {
    }

    @Test
    void setNom() {
    }

    @Test
    void getSexe() {
    }

    @Test
    void setSexe() {
    }

    @Test
    void getPoids() {
    }

    @Test
    void setPoids() {
    }

    @Test
    void getTaille() {
    }

    @Test
    void setTaille() {
    }

    @Test
    void getAge() {
    }

    @Test
    void setAge() {
    }

    @Test
    void isIndicateurDeFaim() {
    }

    @Test
    void setIndicateurDeFaim() {
    }

    @Test
    void isIndicateurDeSommeil() {
    }

    @Test
    void setIndicateurDeSommeil() {
    }

    @Test
    void isDormir() {
    }

    @Test
    void setDormir() {
    }

    @Test
    void getIndicateurDeSante() {
    }

    @Test
    void setIndicateurDeSante() {
    }

    @Test
    void isMalade() {
    }

    @Test
    void setMalade() {
    }

    @Test
    void manger() {
    }

    @Test
    void emettreUnSon() {
    }

    @Test
    void etreSoigne() {
    }

    @Test
    void sommeil() {
    }

    @Test
    void sante() {
    }

    @Test
    void maladie() {
    }

    @Test
    void genererNouvelleCréature() {
    }

    @Test
    void mourir() {
    }

    @Test
    void mettreABas() {
    }

    @Test
    void testToString() {
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