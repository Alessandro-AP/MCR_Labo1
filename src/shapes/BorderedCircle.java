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
     * @param heigth Hauteur du cercle
     * @param width Largeur du cercle
     * @param x Abscisse du cercle
     * @param y Coordonnée du cercle
     * @param color Couleur du cercle
     */
    public BorderedCircle(int heigth, int width, int x, int y, Color color) {
        super(heigth, width, x, y, color);
        renderer = new BorderedFormRenderer();
    }
}
