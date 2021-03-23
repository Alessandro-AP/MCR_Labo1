/*
 * @file BorderedFormRenderer.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package fabrication;

import shapes.Bouncable;

import java.awt.*;

/**
 * Renderer affichant des formes avec bordure (non-remplies)
 */
public class BorderedFormRenderer implements Renderer {
    /**
     * Affiche un Bouncable avec bordure dans un graphics2D
     * @param g2d Graphics2D dans lequel le Bouncable est dessiné
     * @param b Bouncable à dessiner
     */
    @Override
    public void display(Graphics2D g2d, Bouncable b) {
        Renderer.super.display(g2d, b);
        g2d.setStroke(new BasicStroke(2.0f));
        g2d.draw(b.getShape());
    }
}

