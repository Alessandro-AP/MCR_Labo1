package shapes;

import fabrication.BorderRenderer2D;

import java.awt.Color;

public class BorderCircle extends Circle{
    public BorderCircle(int heigth, int width, int x, int y, Color color) {
        super(heigth, width, x, y, color);
        setRenderer(new BorderRenderer2D());
    }

    @Override
    public void draw() {
        renderer.display( g2d, this);
    }
}
