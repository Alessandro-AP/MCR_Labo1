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
        g.fillOval(x, y, width, height);
    }

    public void inverse(){
            switch (movementDirection){
                case NORTH    : movementDirection = CardinalPoints.SOUTH;    break;
                case SOUTH    : movementDirection = CardinalPoints.NORTH;    break;
                case WEST     : movementDirection = CardinalPoints.EAST;     break;
                case EAST     : movementDirection = CardinalPoints.WEST;     break;
                case NORTHWEST: movementDirection = CardinalPoints.NORTHEAST;break;
                case NORTHEAST: movementDirection = CardinalPoints.NORTHWEST;break;
                case SOUTHWEST: movementDirection = CardinalPoints.SOUTHEAST;break;
                case SOUTHEAST: movementDirection = CardinalPoints.SOUTHWEST;break;

            }
        }

    @Override
    public void move() {
        if(x < 0 || y < 0 || x > 1000 || y > 1000 )
            inverse();
        switch (movementDirection){
            case NORTH: moveNorth();break;
            case SOUTH: moveSouth();break;
            case WEST : moveWest() ;break;
            case EAST : moveEast() ;break;
            case NORTHWEST: moveNorthWest();break;
            case NORTHEAST: moveNorthEast();break;
            case SOUTHWEST: moveSouthWest();break;
            case SOUTHEAST: moveSouthEast();break;
        }
    }

    @Override
    public void moveNorthWest() {
        y-= velocity;
        x-= velocity;
    }

    @Override
    public void moveNorthEast() {
        y-= velocity;
        x+= velocity;
    }

    @Override
    public void moveSouthWest() {
        y+= velocity;
        x-= velocity;
    }

    @Override
    public void moveSouthEast() {
        y+= velocity;
        x+= velocity;
    }

    @Override
    public void moveNorth() {
        y-= velocity;
    }

    @Override
    public void moveSouth() {
        y+= velocity;
    }

    @Override
    public void moveWest() {
        x-= velocity;
    }

    @Override
    public void moveEast() {
        x+= velocity;
    }
}
