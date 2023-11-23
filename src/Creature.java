package src;

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

    public void manger() {
        if (this.indicateurDeSommeil == false) {
            this.indicateurDeFaim = false;
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

}


