import movements.CardinalPoints;
import movements.DiagonalMovement;

import java.awt.Color;
import java.awt.Graphics;

import static outils.RandomNumber.generateRandomIntIntRange;


public class Circle extends Shape implements DiagonalMovement {

    public Circle(int x, int y, int width, int height, Color c) {
        super(x, y, width, height, c);
        movementDirection = CardinalPoints.values()[generateRandomIntIntRange(0,7)];
    }

    public void draw(Graphics g) {
        super.draw(g);
        g.fillOval(x, y, 10, 10);
    }
/*
    @Override
    public void move() {
        switch(movementDirection) {
            case 0:
                movementsX();
                break;
            case 1:
                movementsY();
                break;
            case 2:

                break;
            case 3:
                // code block
                break;
            case 4:
                // code block
                break;
            case 5:
                // code block
                break;
            default:
                return;
        }
    }
*/

    @Override
    public void moveNorthWest() {

    }

    @Override
    public void moveNorthEast() {

    }

    @Override
    public void moveSouthWest() {

    }

    @Override
    public void moveSouthEast() {

    }

    @Override
    public void moveNorth() {

    }

    @Override
    public void moveSouth() {

    }

    @Override
    public void moveWest() {

    }

    @Override
    public void moveEast() {

    }
}
