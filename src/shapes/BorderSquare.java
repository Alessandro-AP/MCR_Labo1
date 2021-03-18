package shapes;

import fabrication.BorderRenderer2D;

import java.awt.*;

public class BorderSquare extends Square {

    public BorderSquare(int heigth, int width, int x, int y, Color color) {
        super(heigth, width, x, y, color);
        renderer = new BorderRenderer2D();
    }

    @Override
    public void draw() { renderer.display(g2d, this); }
}
