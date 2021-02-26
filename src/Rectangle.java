import movements.CardinalPoints;
import movements.NormalMovement;

import java.awt.Color;
import java.awt.Graphics;

import static outils.RandomNumber.generateRandomIntIntRange;

public class Rectangle extends Shape implements NormalMovement {

    public Rectangle(int x, int y, int width, int height, Color c) {
        super(x, y, width, height, c);
        movementDirection = CardinalPoints.values()[generateRandomIntIntRange(0,3)];
    }

    public void draw(Graphics g) {
        super.draw(g);
        g.fillRect(x, y, width, height);
    }

    public void inverse(){
        switch (movementDirection){
            case NORTH: movementDirection = CardinalPoints.SOUTH;break;
            case SOUTH: movementDirection = CardinalPoints.NORTH;break;
            case WEST:  movementDirection = CardinalPoints.EAST;break;
            case EAST:  movementDirection = CardinalPoints.WEST;break;
        }
    }
    public void move(){
        if(x < 0 || y < 0 || x > 1000 || y > 1000 )
            inverse();
        switch (movementDirection){
            case NORTH: moveNorth();break;
            case SOUTH: moveSouth();break;
            case WEST : moveWest() ;break;
            case EAST : moveEast() ;break;
        }
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