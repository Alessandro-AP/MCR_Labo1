package shapes;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Form {

    public Circle(int heigth, int width, int x, int y, int xVel, int yVel, Color color) {
        super(heigth, width, x, y, xVel, yVel, color);
//        if (heigth != width)
//            throw new IllegalArgumentException();
    }

    @Override
    public Shape getShape() {
        return new Ellipse2D.Double( x, y, width, heigth);
    }
}