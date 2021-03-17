package shapes;

import fabrication.Renderer;
import java.awt.*;
import static utils.RandomInt.randomInt;

public abstract class Form implements Bouncable {

    protected int x, y;
    protected int heigth, width;

    private int xVel = randomInt(-3,3),
                yVel = randomInt(-3,3);

    final private Color color;
    protected Renderer renderer;
    protected Graphics2D g2d;


    public Form(int heigth, int width, int x, int y, Color color) {
        this.heigth = heigth;
        this.width = width;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public void move() {
        x += xVel;
        y += yVel;
    }

    //-----------------------SETTERS---------------------------------

    public void setGraphics2D(Graphics g) {
        g2d = (Graphics2D) g;
    }
    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }
    public void setDirection(int xMax, int yMax) {
        if (x < 0 || x >= xMax)
            xVel = -xVel;
        if (y < 0 || y >= yMax)
            yVel = -yVel;
    }
    public void setVelocity(int vel){
        xVel = vel;
        yVel = vel;
    }

    //-----------------------GETTERS---------------------------------
    @Override
    public Color getColor() {
        return color;
    }
    public int width() {
        return width;
    }
    public int heigth() {
        return heigth;
    }
//    public Renderer getRenderer(){return renderer;}
//    public Graphics2D getGraphics2D(){return g2d;}

}