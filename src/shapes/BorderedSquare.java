/*
 * @file BorderedSquare.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package shapes;

import fabrication.BorderRenderer2D;

import java.awt.*;

public class BorderedSquare extends Square {

    public BorderedSquare(int heigth, int width, int x, int y, Color color) {
        super(heigth, width, x, y, color);
        renderer = new BorderRenderer2D();
    }
}
