/*
 * @file FilledCircle.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package shapes;

import fabrication.FilledFormRenderer;

import java.awt.*;

/**
 * Classe permettant de créer un cercle plein
 */
public class FilledCircle extends Circle {

    /**
     * Constructeur d'un cercle plein
     * @param x Abscisse du cercle
     * @param y Coordonnée du cercle
     * @param width Largeur du cercle
     * @param heigth Hauteur du cercle
     * @param color Couleur du cercle
     */
    public FilledCircle(int x, int y, int width, int heigth, Color color) {
        super(x, y, width, heigth, color);
         renderer = new FilledFormRenderer();
    }
}
