package shapes;

import fabrication.Renderer;
import gui.MyWindow;

import java.awt.*;

import static utils.RandomInt.randomInt;

public abstract class Form implements Bouncable {

    protected int x, y;
    protected int heigth, width;

    private int xVel = randomInt(-3,3),
                yVel = randomInt(-3,3);

    final private Color color;
    protected Renderer renderer;
    protected Graphics2D g2d = MyWindow.getInstance().getGraphics();


    public Form(int heigth, int width, int x, int y, Color color) {
        this.heigth = heigth;
        this.width = width;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public void move() {
        int xMax = MyWindow.getInstance().getPanelWidth() - width;
        int yMax = MyWindow.getInstance().getPanelWidth() - heigth;

        if (x < 0 || x >= xMax)
            xVel = -xVel;
        if (y < 0 || y >= yMax)
            yVel = -yVel;

        x += xVel;
        y += yVel;
    }

    //-----------------------SETTERS---------------------------------

    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    //-----------------------GETTERS---------------------------------
    @Override
    public Color getColor() {
        return color;
    }

}