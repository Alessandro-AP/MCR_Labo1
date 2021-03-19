package shapes;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public abstract class Circle extends Form {

    public Circle(int heigth, int width, int x, int y, Color color) {
        super(heigth, width, x, y,  color);
//        if (heigth != width)
//            throw new IllegalArgumentException();
    }

    @Override
    public Shape getShape() {
        return new Ellipse2D.Double(x, y, width, heigth);
    }
}
