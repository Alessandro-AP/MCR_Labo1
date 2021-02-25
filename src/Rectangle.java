import java.awt.Color;
import java.awt.Graphics;


public class Rectangle {
	int x, y, width, height;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        g.fillRect(x, y, 10, 10);
        g.setColor(Color.green);
    }
}