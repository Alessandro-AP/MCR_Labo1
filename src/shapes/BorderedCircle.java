/*
 * @file BorderedCircle.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package shapes;

import fabrication.BorderedFormRenderer;

import java.awt.*;

/**
 * Classe permettant de créer un cercle avec bordure (non-rempli)
 */
public class BorderedCircle extends Circle {

    /**
     * Constructeur d'un cercle avec bordure
     * @param x Abscisse du cercle
     * @param y Coordonnée du cercle
     * @param width Largeur du cercle
     * @param heigth Hauteur du cercle
     * @param color Couleur du cercle
     */
    public BorderedCircle(int x, int y, int width, int heigth, Color color) {
        super(x, y, width, heigth, color);
        renderer = new BorderedFormRenderer();
    }
}
