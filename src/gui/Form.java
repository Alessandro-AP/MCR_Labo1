package gui;

import java.awt.*;

public abstract class Form {
    protected int x, y;
    private int xVel, yVel;
    final private Color color;

    public Form(int x, int y, int xVel, int yVel, Color color) {
        this.x = x;
        this.y = y;
        this.xVel = xVel;
        this.yVel = yVel;
        this.color = color;
    }

    abstract int width();
    abstract int heigth();

    public void draw(Graphics g) {
        g.setColor(color);
    }

    public void updateDirection(int xMax, int yMax) {
//        x += xVel;
//        y += yVel;
        if (x < 0 || x >= xMax)
            xVel = -xVel;
        if (y < 0 || y >= yMax)
            yVel = -yVel;
        x += xVel;
        y += yVel;
    }
}
