import src.main.java.Creature;

public class Threads implements Runnable {

    public void vieillir()
    {
        try {
            Thread.sleep(60000);
        }
        catch (InterruptedException e) {
            // Gérer l'interruption si nécessaire
            e.printStackTrace();
        }
        ++Creature.age;
    }

    public void avoirFaim()
    {
        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e) {
            // Gérer l'interruption si nécessaire
            e.printStackTrace();
        }
        Creature.indicateurDeFaim = true;
    }

    public void avoirSommeil()
    {
        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e) {
            // Gérer l'interruption si nécessaire
            e.printStackTrace();
        }
        Creature.indicateurDeSommeil = true;
    }

    public void êtreMalade()
    {
        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e) {
            // Gérer l'interruption si nécessaire
            e.printStackTrace();
        }
        if (Math.random() == 0)
        {
            System.out.println(Creature.getNom() + " est malade.");
            while (Creature.indicateurDeSante != 0)
            {
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    // Gérer l'interruption si nécessaire
                    e.printStackTrace();
                }
                --Creature.indicateurDeSante;
            }
        }
    }

    @Override
    public void run() {
        while (true)
        {
            vieillir();
            avoirFaim();
            avoirSommeil();
            êtreMalade();
        }
    }
}
