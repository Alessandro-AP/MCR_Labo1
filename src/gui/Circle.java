package gui;

import java.awt.*;

public class Circle extends Shape {
    private int diameter;

    public Circle(int x, int y, int xVel, int yVel, Color color, int diameter) {
        super(x, y, xVel, yVel, color);
        this.diameter = diameter;
    }

    @Override
    public int width() {
        return diameter;
    }
    @Override
    public int heigth() {
        return diameter;
    }

    public void draw(Graphics g) {
        super.draw(g);
        g.fillOval(super.x, super.y, diameter, diameter);
    }
}
