package src;

/**
 * Définition des statistiques nécéssaires au maître du zoo.
 */

public class MaitreZoo {
    private String nom;
    private String sexe;
    private int age;

    public MaitreZoo()
    {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public  void examinerEnclos()
    {}
    public void nettoyerEnclos()
    {}
    public  void nourrir()
    {}
    public void transfer()
    {}
    public void seDeplacer()
    {}
}