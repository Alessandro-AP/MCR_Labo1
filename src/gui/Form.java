package gui;

import java.awt.*;

public abstract class Form implements Bouncable {
    protected int x, y;
    protected int heigth, width;
    private int xVel, yVel;
    final private Color color;
    //    private Shape shape;
    private Renderer renderer = new FillRenderer2D(); // passer au constructeur pour recevoir le bon renderer
    private Graphics2D g2d;

    // ajouter le renderer ?
    public Form(int heigth, int width, int x, int y, int xVel, int yVel, Color color) {
        this.heigth = heigth;
        this.width = width;
        this.x = x;
        this.y = y;
        this.xVel = xVel;
        this.yVel = yVel;
        this.color = color;
    }

    public int width() {
        return width;
    }
    public int heigth() {
        return heigth;
    }

    public void setG(Graphics g) {
        g2d = (Graphics2D) g;
    }

    @Override
    public void draw() { renderer.display(g2d, this); }

    @Override
    public void move() {
        x += xVel;
        y += yVel;
    }

    public void setDirection(int xMax, int yMax) {
        if (x < 0 || x >= xMax)
            xVel = -xVel;
        if (y < 0 || y >= yMax)
            yVel = -yVel;
    }

    @Override
    public Color getColor() {
        return color;
    }

//    @Override
//    public Shape getShape() {
//        return shape;
//    }

//    protected void setShape(Shape shape) {
//        this.shape = shape;
//    }

}