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
     * @param heigth Hauteur du carrée
     * @param width Largeur du carrée
     * @param x Abscisse du carrée
     * @param y Coordonnée du carrée
     * @param color Couleur du carrée
     */
    public FilledSquare(int heigth, int width, int x, int y, Color color) {
        super(heigth, width, x, y, color);
        renderer = new FilledFormRenderer();
    }
}
