/*
 * @file Square.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package shapes;

import java.awt.*;

/**
 * Classe abstraite permettant de créer un carrée
 */
public abstract class Square extends Form {

    /**
     * Constructeur de carrée
     * @param x Abscisse du carrée
     * @param y Coordonnée du carrée
     * @param width Largeur du carrée
     * @param heigth Hauteur du carrée
     * @param color Couleur du carrée
     */
    public Square(int x, int y, int width, int heigth, Color color) {
        super(x, y, width, heigth, color);
        if (heigth != width)
            throw new IllegalArgumentException();
    }

    /**
     * Récupère la Shape d'un carrée
     * @return la Shape d'un carrée
     */
    @Override
    public Shape getShape() {
        return new Rectangle(x, y, width, heigth);
    }
}
