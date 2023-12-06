

import src.main.java.Creature;

import static org.junit.jupiter.api.Assertions.*;

class CreatureTest {

    @org.junit.jupiter.api.Test
    void getNom() {
    }
  
    @org.junit.jupiter.api.Test
    void setNom() {
    }

    @org.junit.jupiter.api.Test
    void getSexe() {
    }

    @org.junit.jupiter.api.Test
    void setSexe() {
    }

    @org.junit.jupiter.api.Test
    void getPoids() {
    }

    @org.junit.jupiter.api.Test
    void setPoids() {
    }

    @org.junit.jupiter.api.Test
    void getTaille() {
    }

    @org.junit.jupiter.api.Test
    void setTaille() {
    }

    @org.junit.jupiter.api.Test
    void getAge() {
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }

    @org.junit.jupiter.api.Test
    void isIndicateurDeFaim() {
    }

    @org.junit.jupiter.api.Test
    void setIndicateurDeFaim() {
    }

    @org.junit.jupiter.api.Test
    void isIndicateurDeSommeil() {
    }

    @org.junit.jupiter.api.Test
    void setIndicateurDeSommeil() {
    }

    @org.junit.jupiter.api.Test
    void isDormir() {
    }

    @org.junit.jupiter.api.Test
    void setDormir() {
    }

    @org.junit.jupiter.api.Test
    void getIndicateurDeSante() {
    }

    @org.junit.jupiter.api.Test
    void setIndicateurDeSante() {
    }

    @org.junit.jupiter.api.Test
    void isMalade() {
    }

    @org.junit.jupiter.api.Test
    void setMalade() {
    }

    @org.junit.jupiter.api.Test
    void manger() {
    }

    @org.junit.jupiter.api.Test
    void emettreUnSon() {
    }

    @org.junit.jupiter.api.Test
    void etreSoigne() {
    }

    @org.junit.jupiter.api.Test
    void sommeil() {
    }

    @org.junit.jupiter.api.Test
    void sante() {
    }

    @org.junit.jupiter.api.Test
    void maladie() {
    }

    @org.junit.jupiter.api.Test
    void genererNouvelleCréature() {
    }

    @org.junit.jupiter.api.Test
    void mourir() {
    }

    @org.junit.jupiter.api.Test
    void mettreABas() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    @org.junit.jupiter.api.Test
    public void testCreatureConstructor() {
        Creature creature = new Creature("NomTest", "Male", 50, 150, 5, false, true, false, 100, false);
        assertNotNull(creature);
        assertEquals("NomTest", creature.getNom());
    }

    @org.junit.jupiter.api.Test
    public void testManger() {
        Creature creature = new Creature("Test", "Male", 50, 150, 5, false, true, false, 100, false);
        creature.manger();
        assertFalse(creature.isIndicateurDeFaim());
    }

    @org.junit.jupiter.api.Test
    public void testEmettreUnSon() {
        Creature creature = new Creature("Lycanthropes", "Male", 50, 150, 5, true, true, false, 100, false);
        assertEquals("Aouuuuh", creature.emettreUnSon(creature.getNom()));
    }

    @org.junit.jupiter.api.Test
    public void testEtreSoigne() {
        Creature creature = new Creature("Test", "Male", 50, 150, 5, true, true, false, 80, false);
        creature.etreSoigne();
        assertEquals(100, creature.getIndicateurDeSante());
    }

    @org.junit.jupiter.api.Test
    public void testGenererNouvelleCreature() {
        Creature creature = new Creature("Test", "Male", 50, 150, 5, true, true, false, 80, false);
        Creature newCreature = creature.genererNouvelleCréature();
        assertNotNull(newCreature);
        System.out.println(newCreature);

    }





}