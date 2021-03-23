/*
 * @file FilledSquare.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package shapes;

import fabrication.FilledFormRenderer;

import java.awt.*;

/**
 * Classe permettant de créer un carrée plein
 */
public class FilledSquare extends Square {

    /**
     * Constructeur de carrée plein
     * @param x Abscisse du carrée
     * @param y Coordonnée du carrée
     * @param width Largeur du carrée
     * @param heigth Hauteur du carrée
     * @param color Couleur du carrée
     */
    public FilledSquare(int x, int y, int width, int heigth, Color color) {
        super(x, y, width, heigth, color);
        renderer = new FilledFormRenderer();
    }
}
