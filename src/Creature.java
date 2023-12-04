package src;

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

        return son;
    }


    
    public void etreSoigne() {
        if (this.indicateurDeSante != 100) {
            this.indicateurDeSante = 100;
        }
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
            indicateurDeSante = indicateurDeSante - 25;
        }
            else if (this.malade == false) {
                System.out.println("L'animal n'est pas malade");
            }
    }

    @Override
    public String toString() {
        return "Creature{" +
                "nom='" + nom + '\'' +
                ", sexe='" + sexe + '\'' +
                ", poids=" + poids +
                ", taille=" + taille +
                "cm, age=" + age +
                ", indicateurDeFaim=" + indicateurDeFaim +
                ", indicateurDeSommeil=" + indicateurDeSommeil +
                ", dormir=" + dormir +
                ", indicateurDeSante=" + indicateurDeSante +
                ", malade=" + malade +
                '}';
    }
}


