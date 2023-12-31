package modele;

import java.util.ArrayList;
import java.util.Random;
/**
 * Définition de toutes les statistiques nécéssaires pour chaque animal.
 */

public class Creature implements Runnable{

    private String nom;
    private String sexe;
    private int poids;
    private int taille;
    private int age;
    private boolean indicateurDeFaim;
    private boolean indicateurDeSommeil;
    private boolean dormir;
    private int indicateurDeSante = 100;
    private boolean malade;
    private Thread vieillissementThread;
    private Thread maladieThread;
    private String son;
    Random random = new Random();


    /**
     * Créature
     * @param nom
     * @param sexe
     * @param poids
     * @param taille
     * @param age
     * @param indicateurDeFaim
     * @param indicateurDeSommeil
     * @param dormir
     * @param indicateurDeSante
     * @param malade
     * @param son
     */
    public Creature(String nom, String sexe, int poids, int taille, int age, boolean indicateurDeFaim,
                    boolean indicateurDeSommeil, boolean dormir, int indicateurDeSante, boolean malade,String son) {
        this.nom = nom;
        this.sexe = sexe;
        this.poids = poids;
        this.taille = taille;
        this.age = age;
        this.indicateurDeFaim = indicateurDeFaim;
        this.indicateurDeSommeil = indicateurDeSommeil;
        this.dormir = dormir;
        this.indicateurDeSante = indicateurDeSante;
        this.malade = malade;
        this.son = son;
        // Création du thread de vieillissement
        vieillissementThread = new Thread(this);
        vieillissementThread.start();
    }


    /**
     * Récupérer le nom de la créature
     * @return nom
     */
    public String getNom() {

        return nom;
    }

    /**
     * Modifier le nom de la créature
     * @param nom
     */
    public void setNom(String nom) {

        this.nom = nom;
    }

    /**
     * Récupérer le sexe de la créature
     * @return sexe
     */
    public String getSexe() {

        return sexe;
    }

    /**
     * Modifier le sexe de la créature
     * @param sexe
     */
    public void setSexe(String sexe) {

        this.sexe = sexe;
    }

    /**
     * Récupérer le poids de la créature
     * @return poids
     */
    public int getPoids() {

        return poids;
    }

    /**
     * Modifier le poids de la créature
     * @param poids
     */
    public void setPoids(int poids) {

        this.poids = poids;
    }

    /**
     * Récupérer la taille de la créature
     * @return taille
     */
    public int getTaille() {

        return taille;
    }

    /**
     * Modifier la taille de la créature
     * @param taille
     */
    public void setTaille(int taille) {

        this.taille = taille;
    }

    /**
     * Récupérer l'age de la créature
     * @return age
     */
    public int getAge() {

        return age;
    }

    /**
     * Modifier l'age de la créature
     * @param age
     */
    public void setAge(int age) {

        this.age = age;
    }

    /**
     * Savoir si la créature a faim ou pas
     * @return indicateurFaim
     */
    public boolean isIndicateurDeFaim() {

        return indicateurDeFaim;
    }

    /**
     * Indiquer si la créature a faim ou pas
     * @param indicateurDeFaim
     */
    public void setIndicateurDeFaim(boolean indicateurDeFaim) {

        this.indicateurDeFaim = indicateurDeFaim;
    }

    /**
     * Savoir si la créature doit dormir ou pas
     * @return indicateurDeSommeil
     */
    public boolean isIndicateurDeSommeil() {

        return indicateurDeSommeil;
    }

    /**
     * Indiquer si la créature doit dormir ou pas
     * @param indicateurDeSommeil
     */
    public void setIndicateurDeSommeil(boolean indicateurDeSommeil) {

        this.indicateurDeSommeil = indicateurDeSommeil;
    }

    /**
     * Savoir si la créature dort ou pas
     * @return dormir
     */
    public boolean isDormir() {

        return dormir;
    }

    /**
     * Indiquer si la créature dort ou pas
     * @param dormir
     */
    public void setDormir(boolean dormir) {

        this.dormir = dormir;
    }

    /**
     * Savoir quel est le niveau de santé de la créature
     * @return indicateurDeSante
     */
    public int getIndicateurDeSante() {

        return indicateurDeSante;
    }

    /**
     * Indiquer le niveau de santé de la créature
     * @param indicateurDeSante
     */
    public void setIndicateurDeSante(int indicateurDeSante) {

        this.indicateurDeSante = indicateurDeSante;
    }

    /**
     * Savoir si la créature est malade ou pas
     * @return malade
     */
    public boolean isMalade() {
        if(malade== true)
        {
            System.out.println(getNom()+" est malade.");

        }
        return malade;
    }

    /**
     * Indiquer si la créature est malade
     * @param malade
     */
    public void setMalade(boolean malade) {

        this.malade = malade;
    }

    /**
     * Récupérer le son de la créature
     * @return son
     */
    public String getSon() {
        return son;
    }

    /**
     * Modifier le son de la créature
     * @param son
     */
    public void setSon(String son) {
        this.son = son;
    }

    /**
     * La créature est en train de manger
     */
    public void manger() {
        if (dormir == false) {
            indicateurDeFaim = false;
            System.out.println(getNom()+" est en train de manger " +'\n'+indicateurDeFaim );

        }
    }

    /**
     * Statistiques de la créature
     * @param obj
     * @return Creature
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Creature creature = (Creature) obj;
        return nom.equals(creature.nom) &&
                sexe.equals(creature.sexe) &&
                poids == creature.poids &&
                taille == creature.taille &&
                age == creature.age &&
                indicateurDeFaim == creature.indicateurDeFaim &&
                indicateurDeSommeil == creature.indicateurDeSommeil &&
                dormir == creature.dormir &&
                indicateurDeSante == creature.indicateurDeSante &&
                malade == creature.malade;
    }

    /**
     * La créature est soignée
     * @return indicateurDeSante
     */
    public int etreSoigne() {
        if (this.indicateurDeSante != 100) {
            System.out.println(getNom()+" va être soigné. "+ getIndicateurDeSante());
            malade =  false;
            indicateurDeSante = 100;
            setIndicateurDeSante(indicateurDeSante);
            System.out.println(getNom()+" est soigné. "+ getIndicateurDeSante());
        }
        return indicateurDeSante;
    }

    /**
     * Cycle de sommeil de la créature
     */
    public void sommeil() {
                Thread sommeilThread = new Thread(() -> {
                    while (true) {
                        try {
                            // La créature dort pendant 5 secondes
                            Thread.sleep(300000);

                            synchronized (this) {
                                dormir = true;
                                System.out.println(getNom() + " dort.");
                            }

                            // La créature est réveillée pendant 5 secondes
                            Thread.sleep(420000);

                            synchronized (this) {
                                dormir = false;
                                System.out.println(getNom() + " est réveillé.");
                            }

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            // Gérer l'interruption du thread si nécessaire
                        }
                    }
                });

                sommeilThread.start();
            }


    /**
     * Indicateur de santé de la créature
     */
    public void sante() {
        if (this.indicateurDeSante == 100) {
            System.out.println("L'animal est en parfaite santé");
        }
        else if (this.indicateurDeSante == 50 ) {
            System.out.println("L'animal est en bonne santé");
        }
        else if (this.indicateurDeSante == 20) {
                    System.out.println("L'animal est en mauvaise santé");
        }
        else if (this.indicateurDeSante == 0) {
            int mortViellesse = random.nextInt(130)+80;
            if (age == mortViellesse){
                System.out.println(getNom()+" est morte de vieillesse.");
            }
            else if (indicateurDeSante == 0)
            {
                System.out.println(getNom()+" est morte d'un maladie.");

            }
        }
    }

    /**
     * Maladie de la créature
     */
    public void maladie() {
        if (this.malade == true) {
            maladieThread = new Thread(() -> {
                while (true) {
                    try {
                        Thread.sleep(10000); // intervalle de 10 secondes (ajustez selon vos besoins)
                        indicateurDeSante--;
                        sante();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        // Gérer l'interruption du thread si nécessaire
                        break; // Sortir de la boucle en cas d'interruption
                    }
                }
            });
            maladieThread.start();
        }
    }

    /**
     * Génération d'une nouvelle créature
     * @return newCreature
     */
    public  Creature genererNouvelleCréature()
    {
        Random random = new Random();

        ArrayList<String> especes = new ArrayList<>();
        especes.add("Lycanthropes");
        especes.add("Licornes");
        especes.add("Nymphes");
        especes.add("Krakens");
        especes.add("Sirènes");
        especes.add("Mégalodons");
        especes.add("Phénix");
        especes.add("Dragons");
        int nameEspece = random.nextInt(especes.size());
        setNom(especes.get(nameEspece));

        int genreIndex = random.nextInt(1)+0;
        if (genreIndex == 0)
        {
            setSexe("Male");
        }
        else
        {
            setSexe("Femelle");
        }

        int ageAl = random.nextInt(100) + 1;
        setAge(ageAl);
        int poidsAl = random.nextInt(100)+20;
        setPoids(poidsAl);
        int tailleAl = random.nextInt(50) + 1;
        setTaille(tailleAl);
        boolean faim = random.nextBoolean();
        setIndicateurDeFaim(faim);

        int santeAl = random.nextInt(100);
        setIndicateurDeSante(santeAl);
        boolean maladeAl = random.nextBoolean();
        setMalade(maladeAl);

        Creature newCreature  = new Creature(getNom(), getSexe(), getPoids(), getTaille(), getAge(), isIndicateurDeFaim(),
        isIndicateurDeSommeil(), isDormir(), getIndicateurDeSante(),isMalade(),getSon());
        return newCreature;
    }


    public void mettreABas(){}

    /**
     * Son émit par la créature
     */
    public void emettreSon(){


        // Démarrer le thread pour émettre le son de manière asynchrone
        Thread sonThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                if (getNom().equals("Lycanthropes")) {
                    setSon("Aouuuuh");
                } else if (getNom().equals("Licornes")) {
                    setSon("Hiiii");
                } else if (getNom().equals("Nymphes")) {
                    setSon("Ploc-ploc");
                } else if (getNom().equals("Krakens")) {
                    setSon("Lap-lap");
                } else if (getNom().equals("Sirènes")) {
                    setSon("Chant");
                } else if (getNom().equals("Mégalodons")) {
                    setSon("Aaaaaah");
                } else if (getNom().equals("Phénix")) {
                    setSon("Flap-flap-flap");
                } else if (getNom().equals("Dragons")) {
                    setSon("Grrrrr");
                }
                int cri = random.nextInt(180000)+120000;
                boolean maladieCreature = random.nextBoolean();
                // Vérifiez si le son à émettre n'est pas null
                if (getSon() != null && dormir ==false) {
                    System.out.println(getSon());
                    setSon("");
                    if (maladieCreature == true)
                    {
                        maladie();
                    }

                }
                try {
                    Thread.sleep(cri);  // Émettre le son dans toutes le 2 à 3 minutes
                } catch (InterruptedException e) {
                    // Le thread a été interrompu, sortez de la boucle
                    break;
                }
            }
        });
        sonThread.start();
    }

    /**
     * Vieillissement de la créature
     */
    public void startVieillissement() {
        if (!vieillissementThread.isAlive()) {
            vieillissementThread = new Thread(this);
            vieillissementThread.start();
        }
    }

    /**
     * Viellissement de la créature en cours
     */
    public void run() {
        // Tâche exécutée par le thread de vieillissement
        while (!Thread.interrupted()) {
            // Logique de vieillissement
            age++;
            System.out.println(getNom() + " vieillit. Nouvel âge : " + age);
            try {
                Thread.sleep(600000);
            } catch (InterruptedException e) {
                // Le thread a été interrompu, sortez de la boucle
                break;
            }
        }
    }

    /**
     * Affichage de toutes les statistiques de la créature
     * @return Toutes les statistiques de la créature
     */
    @Override
    public String toString() {
        return  "Espèce : " + nom + '\n' + "Sexe : " + sexe + '\n' + "Poids : " + poids + '\n'
                + "Taille : " + taille + "m"+ '\n'+"Age : " + age + '\n'+ "Indicateur de faim : " + indicateurDeFaim + '\n'+
                "Indicateur de sommeil : " + indicateurDeSommeil + '\n'+ "Endormie : " + dormir +  '\n'+"Indicateur de sante :" + indicateurDeSante
                + '\n'+ "Malade : " + malade+ '\n' ;
    }

}


