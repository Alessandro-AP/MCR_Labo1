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
     * @param x Abscisse du carrée
     * @param y Coordonnée du carrée
     * @param width Largeur du carrée
     * @param heigth Hauteur du carrée
     * @param color Couleur du carrée
     */
    public BorderedSquare(int x, int y, int width, int heigth, Color color) {
        super(x, y, width, heigth, color);
        renderer = new BorderedFormRenderer();
    }
}
