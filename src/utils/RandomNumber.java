/*
 * @file RandomNumber.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package utils;

import java.util.Random;

/**
 * Classe permettant de générer un entier aléatoire compris entre 2 bornes
 */
public class RandomNumber {
    /**
     * Génère un entier aléatoire entre 2 bornes.
     * L'entier ne peut pas prendre la valeur 0
     * @param min Borne minimale
     * @param max Borne maximale
     * @return entier aléatoire entre les 2 bornes
     */
    public static int randomInt(int min, int max) {
        if(max < min || (min == 0 && max == 0))
            throw new IllegalArgumentException("Illegal interval");
        Random r = new Random();
        int randomNumber;
        do {
            randomNumber = r.nextInt((max - min) + 1) + min;
        } while(randomNumber == 0);
        return randomNumber;
    }
}
