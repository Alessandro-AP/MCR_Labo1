/*
 * @file Square.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package shapes;

import java.awt.*;

public abstract class Square extends Form {

    public Square(int heigth, int width, int x, int y, Color color) {
        super(heigth, width, x, y,  color);
        if (heigth != width)
            throw new IllegalArgumentException();
    }

    @Override
    public Shape getShape() {
        return new Rectangle(x, y, width, heigth);
    }
}
