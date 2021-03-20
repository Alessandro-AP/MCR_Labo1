/*
 * @file FillRenderer2D.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package fabrication;

import shapes.Bouncable;

import java.awt.*;

public class FillRenderer2D implements Renderer {
    @Override
    public void display(Graphics2D g2d, Bouncable b) {
        Renderer.super.display(g2d, b);
        g2d.fill(b.getShape());
    }
}