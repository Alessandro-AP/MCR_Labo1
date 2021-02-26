import java.awt.Color;
import java.awt.Graphics;


public class Circle extends Form {

    public Circle(int x, int y, int width, int height, Color c) {
        super(x, y, width, height, c);
    }

    public void draw(Graphics g) {
        g.fillOval(x, y, 10, 10);
        g.setColor(Color.red);

    }
}
