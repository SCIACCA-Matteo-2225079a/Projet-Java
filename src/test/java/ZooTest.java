import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    void setCreaturePres() {
    }

    @Test
    void getNom() {
    }

    @Test
    void setNom() {
    }

    @Test
    void maitre() {
    }

    @Test
    void getNbCreatures() {
    }

    @Test
    void setNbCreatures() {
    }

    @Test
    void afficherNbCreatures() {
    }

    @Test
    void afficherCreaturesPres() {
    }

    @Test
    void incrementerJour() {
    }

    @Test
    void lancerTimer() {
    }

    @Test
    void getJour() {
    }

    @Test
    void nbMaxEnclos() {
    }

    @Test
    void ajouterEnclos() {
    }

    @Test
    void testToString() {
    }


    @Test
    void TestSetCreaturePres() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        ArrayList<Creature> creatures = new ArrayList<>();
        creatures.add(new Creature("Lion", "Mâle", 200, 150, 5, true, false, false, 100, false,"dsq"));
        zoo.setCreaturePres(creatures);
        assertEquals(creatures, zoo.afficherCreaturesPres());
    }

    @Test
    void TestGetNom() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        assertEquals("Mon Zoo", zoo.getNom());
    }

    @Test
    void TestSetNom() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        zoo.setNom("Nouveau Zoo");
        assertEquals("Nouveau Zoo", zoo.getNom());
    }

    //@Test
   // void TestMaitre() {
   //     Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
   //     assertEquals("John Doe", zoo.maitre(zoo.getMaitre()));
    //}

    @Test
    void TestGetNbCreatures() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        assertEquals(0, zoo.getNbCreaturesZoo());
    }

    @Test
    void TestSetNbCreatures() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        zoo.setNbCreaturesZoo(10);
        assertEquals(0, zoo.getNbCreaturesZoo());
    }

    @Test
    void TestAfficherNbCreatures() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        assertEquals(0, zoo.afficherNbCreaturesZoo());
    }

    @Test
    void TestAfficherCreaturesPres() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        ArrayList<Creature> creatures = new ArrayList<>();
        creatures.add(new Creature("Lion", "Mâle", 200, 150, 5, true, false, false, 100, false,"dsdq"));
        zoo.setCreaturePres(creatures);
        assertEquals(creatures, zoo.afficherCreaturesPres());
    }

    @Test
    void TestIncrementerJour() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        assertEquals(2, zoo.incrementerJour());
    }

    @Test
    void TestLancerTimer() {
        // Difficile à tester directement dans une méthode de test
        // car cela implique une attente pour observer le changement
        // dans la valeur de jour.
    }

    @Test
    void TestGetJour() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        assertEquals(1, zoo.getJour());
    }

    @Test
    void TestNbMaxEnclos() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
        assertEquals(5, zoo.nbMaxEnclos());
    }

    //@Test
    //void TestAjouterEnclos() {
    //    Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 0, new ArrayList<>(), new ArrayList<>(), 5);
    //    Enclos enclos = new Aquarium("Aquarium", 100.0, 5, new ArrayList<>(), 8, 10.0, 25.0);
    //    zoo.ajouterEnclos(enclos);
     //   assertEquals(1, zoo.getEnclosExist().size());
    //}

    @Test
    void TestToString() {
        Zoo zoo = new Zoo("Mon Zoo", new MaitreZoo("John Doe", "Homme", 35), 1, new ArrayList<>(), new ArrayList<>(), 5);
        assertEquals("Bienvenue à Mon Zoo nombre d'enclos : 1", zoo.toString());
    }



}