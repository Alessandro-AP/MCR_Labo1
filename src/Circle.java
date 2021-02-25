import java.awt.Color;
import java.awt.Graphics;


public class Circle {
	int x, y, width, height;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        g.fillOval(x, y, 10, 10);
        g.setColor(Color.red);

    }
}
