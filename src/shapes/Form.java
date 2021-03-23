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

/**
 * Classe abstraite permettant de créer une forme
 */
public abstract class Form implements Bouncable {

    private static final MyWindow window = MyWindow.getInstance();
    protected int x, y;
    protected final int heigth, width;
    private final Color color;
    private int xVelocity = randomInt(-3,3),
                yVelocity = randomInt(-3,3);
    protected Renderer renderer;

    /**
     * Constructeur
     * @param x Abscisse  de la forme
     * @param y Coordonnée de la forme
     * @param width Largeur  de la forme
     * @param heigth Hauteur de la forme
     * @param color Couleur de la forme
     */
    public Form(int x, int y, int width, int heigth, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.heigth = heigth;
        this.color = color;
    }

    /**
     * Dessine une forme
     */
    @Override
    public void draw() {
        renderer.display(window.getGraphics(), this);
    }

    /**
     * Déplace une forme dans une fenêtre. Si la forme atteint le bord de la
     * fenêtre, elle rebondit.
     * Si la fenêtre est réduite la forme est ramenée à l'intérieur.
     */
    @Override
    public void move() {
        int xMax = window.getWidth() - width;
        int yMax = window.getHeight() - heigth;

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

    /**
     * Récupère la couleur d'une forme
     * @return la couleur d'une forme
     */
    @Override
    public Color getColor() {
        return color;
    }

}
