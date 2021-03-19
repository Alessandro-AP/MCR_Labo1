
package shapes;

import fabrication.Renderer;
import gui.MyWindow;
import fabrication.FillRenderer2D;


import java.awt.*;


import static utils.RandomNumber.randomInt;

public abstract class Form implements Bouncable {
    private static final MyWindow window = MyWindow.getInstance();//instance unique

    protected int x, y;
    protected int heigth, width;

    private int xVel = randomInt(-3,3),
                yVel = randomInt(-3,3);
    protected Color color;
    Renderer renderer;


    public Form(int heigth, int width, int x, int y, Color color) {
        this.heigth = heigth;
        this.width = width;
        this.x = x;
        this.y = y;
        this.color = color;
    }


    @Override
    public void draw() {
        renderer.display(window.getGraphics(), this);
    }


    @Override
    public void move() {
        int xMax = MyWindow.getInstance().getWidth() - width;
        int yMax = MyWindow.getInstance().getHeight() - heigth;

        if (x < 0 || x >= xMax)
            xVel = -xVel;
        if (y < 0 || y >= yMax)
            yVel = -yVel;

        x += xVel;
        y += yVel;
    }

//-----------------------GETTERS---------------------------------
    @Override
    public Color getColor() {
        return color;
    }


}
