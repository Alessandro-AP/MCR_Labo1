/*
 * @file BorderedSquare.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package shapes;

import fabrication.BorderedFormRenderer;

import java.awt.*;

/**
 * Classe permettant de créer un carrée avec bordure (non-rempli)
 */
public class BorderedSquare extends Square {

    /**
     * Constructeur de carrée avec bordure
     * @param heigth Hauteur du carrée
     * @param width Largeur du carrée
     * @param x Abscisse du carrée
     * @param y Coordonnée du carrée
     * @param color Couleur du carrée
     */
    public BorderedSquare(int heigth, int width, int x, int y, Color color) {
        super(heigth, width, x, y, color);
        renderer = new BorderedFormRenderer();
    }
}
