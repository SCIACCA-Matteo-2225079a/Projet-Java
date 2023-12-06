package src;
import java.util.ArrayList;
import java.util.Random;
/**
 * Définition de toutes les statistiques nécéssaires pour chaque animal.
 */

public class Creature {

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


    public Creature(String nom, String sexe, int poids, int taille, int age, boolean indicateurDeFaim,
                    boolean indicateurDeSommeil, boolean dormir, int indicateurDeSante, boolean malade) {
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
    }

    public String getNom() {

        return nom;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    public String getSexe() {

        return sexe;
    }

    public void setSexe(String sexe) {

        this.sexe = sexe;
    }

    public int getPoids() {

        return poids;
    }

    public void setPoids(int poids) {

        this.poids = poids;
    }

    public int getTaille() {

        return taille;
    }

    public void setTaille(int taille) {

        this.taille = taille;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public boolean isIndicateurDeFaim() {

        return indicateurDeFaim;
    }

    public void setIndicateurDeFaim(boolean indicateurDeFaim) {

        this.indicateurDeFaim = indicateurDeFaim;
    }

    public boolean isIndicateurDeSommeil() {

        return indicateurDeSommeil;
    }

    public void setIndicateurDeSommeil(boolean indicateurDeSommeil) {

        this.indicateurDeSommeil = indicateurDeSommeil;
    }

    public boolean isDormir() {

        return dormir;
    }

    public void setDormir(boolean dormir) {

        this.dormir = dormir;
    }

    public int getIndicateurDeSante() {

        return indicateurDeSante;
    }

    public void setIndicateurDeSante(int indicateurDeSante) {

        this.indicateurDeSante = indicateurDeSante;
    }

    public boolean isMalade() {
        if(malade== true)
        {
            System.out.println(getNom()+" est malade.");
            while (indicateurDeSante !=0 )
            {
                --indicateurDeSante;
            }
        }
        return malade;
    }

    public void setMalade(boolean malade) {

        this.malade = malade;
    }

    public void manger() {
        if (this.indicateurDeSommeil == false) {
            this.indicateurDeFaim = false;
            System.out.println(getNom()+" est en train de manger " +'\n'+indicateurDeFaim );

        }
    }

    public String emettreUnSon(String son) {
        if (getNom()=="Lycanthropes")
        {
            System.out.println("Aouuuuh");
        }
        else if (getNom()=="Licornes")
        {
            System.out.println("Hiiii");
        }
        else if (getNom()=="Nymphes")
        {
            System.out.println("Ploc-ploc");
        }
        else if (getNom()=="Krakens")
        {
            System.out.println("Lap-lap");
        }
        else if (getNom()=="Sirènes")
        {
            System.out.println("Chant");
        }
        else if (getNom()=="Mégalodons")
        {
            System.out.println("Aaaaaah");
        }
        else if (getNom()=="Phénix")
        {
            System.out.println("Flap-flap-flap");
        }
        else if (getNom()=="Dragons")
        {
            System.out.println("Grrrrr");
        }

        return son;
    }


    
    public int etreSoigne() {
        if (this.indicateurDeSante != 100) {
            System.out.println(getNom()+" va être soigné. "+ getIndicateurDeSante());
            indicateurDeSante = 100;
            setIndicateurDeSante(indicateurDeSante);
            System.out.println(getNom()+" est soigné. "+ getIndicateurDeSante());
        }
        return indicateurDeSante;
    }

    public void sommeil() {
        if (this.indicateurDeSommeil == true) {
            this.dormir = true;
        }
            else if (this.indicateurDeSommeil == false) {
                this.dormir = false;
            }
        }

    public void sante() {
        if (this.indicateurDeSante == 100) {
            System.out.println("L'animal est en parfaite santé");
        }
            else if (this.indicateurDeSante >= 50 &&  this.indicateurDeSante <= 99) {
                System.out.println("L'animal est en bonne santé");
            }
                else if (this.indicateurDeSante >= 1 &&  this.indicateurDeSante <= 49) {
                    System.out.println("L'animal est en mauvaise santé");
                }
                    else if (this.indicateurDeSante == 0) {
                        System.out.println("L'animal est mort");
                    }
    }

    public void maladie() {
        if (this.malade == true) {
            System.out.println("L'animal est malade");
            indicateurDeSante = indicateurDeSante - 1;
        }
    }

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
        int tailleAl = random.nextInt(10) + 1;
        setTaille(tailleAl);
        boolean faim = random.nextBoolean();
        setIndicateurDeFaim(faim);

        int santeAl = random.nextInt(100);
        setIndicateurDeSante(santeAl);
        boolean maladeAl = random.nextBoolean();
        setMalade(maladeAl);

        Creature newCreature  = new Creature(getNom(), getSexe(), getPoids(), getTaille(), getAge(), isIndicateurDeFaim(),
        isIndicateurDeSommeil(), isDormir(), getIndicateurDeSante(),isMalade());
        return newCreature;
    }

    public void mourir()
    {
        Random random= new Random();
        int mortViellesse = random.nextInt(130)+80;
        if (age == mortViellesse){
            System.out.println(getNom()+" est morte de vieillesse.");
        }
        else if (indicateurDeSante == 0)
        {
            System.out.println(getNom()+" est morte d'un maladie.");

        }
    }

    public void mettreABas(){}

    @Override
    public String toString() {
        return  "Espèce : " + nom + '\n' + "Sexe : " + sexe + '\n' + "Poids : " + poids + '\n'
                + "Taille : " + taille + "cm"+ '\n'+"Age : " + age + '\n'+ "Indicateur de faim : " + indicateurDeFaim + '\n'+
                "Indicateur de sommeil : " + indicateurDeSommeil + '\n'+ "Endormie : " + dormir +  '\n'+"Indicateur de sante :" + indicateurDeSante
                + '\n'+ "Malade : " + malade+ '\n' ;
    }
}


