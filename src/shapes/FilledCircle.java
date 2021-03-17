package shapes;

import fabrication.FillRenderer2D;

import java.awt.Color;


public class FilledCircle extends Circle{
    public FilledCircle(int heigth, int width, int x, int y, Color color) {
        super(heigth, width, x, y, color);
        setRenderer(new FillRenderer2D());
    }

    @Override
    public void draw() {
        renderer.display( g2d, this);
    }

}
