package src;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class zoo {
    private String nom;
    private String maitre;
    private int nbCreatures;
    private int enclosExist;
    private ArrayList<Creature> creaturePres;

    private ArrayList<Enclos> enclosList;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMaitre() {
        return maitre;
    }

    public void setMaitre(String maitre) {
        this.maitre = maitre;
    }

    public int getNbCreatures() {
        return nbCreatures;
    }

    public void setNbCreatures(int nbCreatures) {
        this.nbCreatures = nbCreatures;
    }

    public int getEnclosExist() {
        return enclosExist;
    }

    public void setEnclosExist(int enclosExist) {
        this.enclosExist = enclosExist;
    }

    public ArrayList<Creature> getCreaturePres() {
        return creaturePres;
    }

    public ArrayList<Enclos> getEnclosList() {
        return enclosList;
    }

    public afficherNbCreatures() {
        return nbCreatures;
    }

    public String afficherCreaturesPres() {
        if (creaturePres == null || creaturePres.isEmpty()) {
            return "Aucune créature présente dans le zoo " + nom;
        }

        StringBuilder resultat = new StringBuilder("Créatures présentes dans le zoo " + nom + " : ");
        for (Creature creature : creaturePres) {
            resultat.append(creature.getNom()).append(", ");
        }


        resultat.delete(resultat.length() - 2, resultat.length());

        return resultat.toString();


    }


    public void setCreaturePres(ArrayList<Creature> creaturePres) {
        this.creaturePres = creaturePres;
    }


    public void setEnclosList(ArrayList<Enclos> enclosList) {
        this.enclosList = enclosList;  
    }


    public void gestionTemporel() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // À intervalles réguliers
        for (int i = 0; i < 5; i++) {                           // Par exemple, répété 5 fois (à ajuster selon vos besoins)
            // Modifier aléatoirement l'état de certaines créatures
            for (Creature creature : creaturePres) {
                // Exemple : 50% de chance de rendre une créature malade
                if (random.nextDouble() < 0.5) {
                    creature.setMalade(true);
                    System.out.println("La créature " + creature.getNom() + " est maintenant malade !");
                }
            }

            // Modifier aléatoirement l'état de certains enclos
            // Exemple : 30% de chance de rendre un enclos sale
            if (random.nextDouble() < 0.3) {
                System.out.println("Certains enclos sont devenus sales !");
                for (Enclos enclos : enclosList) {
                    enclos.setProprete("Sale");
                }

                System.out.println("Le maître de zoo fantastique prend la relève !");

                // Inviter l'utilisateur à choisir une action
                System.out.println("Que souhaitez-vous faire ?");
                System.out.println("1. Nettoyer les enclos");
                System.out.println("2. Soigner les créatures");
                System.out.print("Choix : ");
                int choixUtilisateur = scanner.nextInt();

                // Exécuter l'action en fonction du choix de l'utilisateur
                switch (choixUtilisateur) {
                    case 1:
                        nettoyerEnclos();   // a la place de ça, possibilité de recup la fonction dans enclos si elle doit etre fait sinon a faire
                        break;
                    case 2:
                        soignerCreatures();
                        break;
                    default:
                        System.out.println("Choix invalide !");
                }

                // Attendre un peu (simuler le passage du temps)
                try {
                    Thread.sleep(1000); // Attendre 1 seconde (à ajuster selon vos besoins)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}