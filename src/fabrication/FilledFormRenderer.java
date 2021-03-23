/*
 * @file FilledFormRenderer.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package fabrication;

import shapes.Bouncable;

import java.awt.*;

/**
 * Renderer affichant des formes remplies
 */
public class FilledFormRenderer implements Renderer {
    /**
     * Affiche un Bouncable rempli dans un graphics2D
     * @param g2d Graphics2D dans lequel le Bouncable est dessiné
     * @param b Bouncable à dessiner
     */
    @Override
    public void display(Graphics2D g2d, Bouncable b) {
        Renderer.super.display(g2d, b);
        g2d.fill(b.getShape());
    }
}