package shapes;

import fabrication.FillRenderer2D;

import java.awt.*;

public class FilledSquare extends Square{

    public FilledSquare(int heigth, int width, int x, int y, Color color) {
        super(heigth, width, x, y, color);
        setRenderer(new FillRenderer2D());
    }

    @Override
    public void draw() {
        renderer.display( g2d, this);
    }
}
