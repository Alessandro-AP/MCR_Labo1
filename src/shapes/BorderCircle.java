package shapes;

import fabrication.BorderRenderer2D;

import java.awt.*;

public class BorderCircle extends Circle {

    public BorderCircle(int heigth, int width, int x, int y, Color color) {
        super(heigth, width, x, y, color);
        renderer = new BorderRenderer2D();
    }

    @Override
    public void draw() {
        renderer.display(g2d, this);
    }
}
