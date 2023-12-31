import modele.Aquarium;
import modele.Creature;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class AquariumTest {

    /**
     * test si la fonction CreationAquarium est correcte
     */
    @Test

    void testCreationAquarium() {
        ArrayList<Creature> creatures = new ArrayList<>();
        Creature creature = new Creature("Lycanthropes", "Male", 50, 150, 5, true, true, false, 100, false,"qdsdq");
        Creature CReature = new Creature("Lycanthropes", "Male", 50, 150, 5, true, true, false, 100, false,"dqsd");

        Aquarium monAquarium = new Aquarium("Aquarium 1", 50.0, 10, creatures, 5, 10.0, 20.0);

        // Affichage des caractéristiques de l'aquarium
        System.out.println("Test de création d'un aquarium :");
        System.out.println(monAquarium.afficherCaracteristiques());
        System.out.println("-------------------------------");
    }
    /**
     * test si la fonction ModificationProfondeurBassin est correcte
     */
    @Test

    void testModificationProfondeurBassin() {
        ArrayList<Creature> creatures = new ArrayList<>();
        Creature creature = new Creature("Krakens", "Male", 50, 150, 5, true, true, false, 100, false,"qsdsd");
        Aquarium monAquarium = new Aquarium("Aquarium 1", 50.0, 10, creatures, 5, 10.0, 20.0);

        // Modification de la profondeur du bassin
        monAquarium.setProfondeurBassin(15.0);

        // Affichage des caractéristiques de l'aquarium après la modification
        System.out.println("Test de modification de la profondeur du bassin :");
        System.out.println(monAquarium.afficherCaracteristiques());
        System.out.println("-------------------------------");
    }

    /**
     * test si la fonction ModificationSaliniteEau est correcte
     */
    @Test

    void testModificationSaliniteEau() {
        ArrayList<Creature> creatures = new ArrayList<>();
        Creature creature = new Creature("Mégalodons", "Male", 200, 300, 40, true, true, false, 100, false,"dsqd");
        Aquarium monAquarium = new Aquarium("Aquarium 1", 50.0, 10, creatures, 5, 10.0, 20.0);

        // Modification de la salinité de l'eau
        monAquarium.setSaliniteEau(25.0);

        // Affichage des caractéristiques de l'aquarium après la modification
        System.out.println("Test de modification de la salinité de l'eau :");
        System.out.println(monAquarium.afficherCaracteristiques());
        System.out.println("-------------------------------");
    }
}
