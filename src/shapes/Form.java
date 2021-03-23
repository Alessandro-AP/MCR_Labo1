/*
 * @file Form.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package shapes;

import fabrication.Renderer;
import gui.MyWindow;

import java.awt.*;

import static utils.RandomNumber.randomInt;

public abstract class Form implements Bouncable {

    private static final MyWindow window = MyWindow.getInstance(); //instance unique
    protected int x, y;
    protected final int heigth, width;
    private final Color color;
    private int xVelocity = randomInt(-3,3),
                yVelocity = randomInt(-3,3);
    protected Renderer renderer;

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

        if (x < 0) {
            xVelocity = -xVelocity;
            x = 0;
        }
        if (x >= xMax) {
            xVelocity = -xVelocity;
            x = xMax;
        }
        if (y < 0) {
            yVelocity = -yVelocity;
            y = 0;
        }
        if (y >= yMax) {
            yVelocity = -yVelocity;
            y = yMax;
        }

        x += xVelocity;
        y += yVelocity;
    }

//-----------------------GETTER---------------------------------
    @Override
    public Color getColor() {
        return color;
    }

}
