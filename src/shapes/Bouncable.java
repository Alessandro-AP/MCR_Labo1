/*
 * @file Bouncable.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package shapes;

import java.awt.*;

/**
 * Interface de formes rebondissantes
 */
public interface Bouncable {
    /**
     * Dessine un Bouncable
     */
    void draw();

    /**
     * Déplace un Bouncable
     */
    void move();

    /**
     * Récupère la couleur d'un Bouncable
     * @return la couleur d'un Bouncable
     */
    Color getColor();

    /**
     * Récupère la Shape d'un Bouncable
     * @return la Shape d'un Bouncable
     */
    Shape getShape();
}