package gui;

import java.awt.*;

public class Square extends Form {
    private int side;

    public Square(int x, int y, int xVel, int yVel, Color color, int side) {
        super(x, y, xVel, yVel, color);
        this.side = side;
    }

    @Override
    public int width() {
        return side;
    }
    @Override
    public int heigth() {
        return side;
    }

    public void draw(Graphics g) {
        super.draw(g);
        g.fillRect(super.x, super.y, side, side);
    }
}
