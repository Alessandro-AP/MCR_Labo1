/*
 * @file Renderer.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package fabrication;

import shapes.Bouncable;

import java.awt.*;

/**
 * Interface permettant d'afficher des Bouncables dans un Graphics2D
 */
public interface Renderer {
     default void display(Graphics2D g2d, Bouncable b) {
          g2d.setColor(b.getColor());
     }
}