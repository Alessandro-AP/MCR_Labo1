import movements.CardinalPoints;

import java.awt.*;

abstract public class Shape {
    int x, y, width, height;
    Color color;
    int velocity = 2;
    CardinalPoints movementDirection;

    public Shape(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void draw(Graphics g){ g.setColor(color);}
    public void move(){}
}
