/*
 * @file Circle.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package shapes;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Classe abstraite permettant de créer un cercle
 */
public abstract class Circle extends Form {

    /**
     * Constructeur d'un cercle
     * @param x Abscisse du cercle
     * @param y Coordonnée du cercle
     * @param width Largeur du cercle
     * @param heigth Hauteur du cercle
     * @param color Couleur du cercle
     */
    public Circle(int x, int y, int width, int heigth, Color color) {
        super(x, y, width, heigth, color);
        if (heigth != width)
            throw new IllegalArgumentException();
    }

    /**
     * Récupère la Shape d'un Cercle
     * @return la Shape d'un Cercle
     */
    @Override
    public Shape getShape() {
        return new Ellipse2D.Double(x, y, width, heigth);
    }
}
