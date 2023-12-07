import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class VoliereTest {

    @Test
    void getHauteur() {
    }

    @Test
    void setHauteur() {
    }

    @Test
    void TestAfficherCaracteristiques() {
        Voliere voliere = new Voliere("Voliere Test", 200.0, 5,0, new ArrayList<>(), 10, 10);
        String caracteristiquesAttendues = "Nom : Voliere Test, Superficie : 200.0, Nombre Maximum de Créatures : 5, Propreté : 10, Hauteur de la volière : 10.0";
        assertEquals(caracteristiquesAttendues, voliere.afficherCaracteristiques(), "Les caractéristiques devraient être correctement formatées");
    }




}