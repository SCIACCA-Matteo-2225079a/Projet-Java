package vue;

import controller.menuController;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Exécution des fonctions.
 */

public class Main {

    public static void main(String[] args) {
    menuController menu = new menuController();
    menu.commandeMaitreZoo();
    menu.interaction();
    }
}