package gui;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Square extends Form {

    public Square(int heigth, int width, int x, int y, int xVel, int yVel, Color color) {
        super(heigth, width, x, y, xVel, yVel, color);
        if (heigth != width)
            throw new IllegalArgumentException();
    }


    public void draw(Graphics g) {
//        Graphics2D g2 = (Graphics2D) g;
        super.draw(g);
        g.fillRect(x, y, width, heigth);
    }

    @Override
    public Shape getShape() {
        return new Rectangle(x, y, width, heigth);
    }
}