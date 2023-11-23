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

    public Creature(String nom, String sexe, int poids, int taille, int age, boolean indicateurDeFaim, boolean indicateurDeSommeil, boolean dormir, int indicateurDeSante) {
        this.nom = nom;
        this.sexe = sexe;
        this.poids = poids;
        this.taille = taille;
        this.age = age;
        this.indicateurDeFaim = indicateurDeFaim;
        this.indicateurDeSommeil = indicateurDeSommeil;
        this.dormir = dormir;
        this.indicateurDeSante = indicateurDeSante;
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
}