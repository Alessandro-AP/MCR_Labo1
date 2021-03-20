/*
 * @file FilledCircle.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package shapes;

import fabrication.FillRenderer2D;

import java.awt.*;

public class FilledCircle extends Circle {

    public FilledCircle(int heigth, int width, int x, int y, Color color) {
        super(heigth, width, x, y, color);
         renderer = new FillRenderer2D();
    }
}
