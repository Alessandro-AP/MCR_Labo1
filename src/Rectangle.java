import java.awt.Color;
import java.awt.Graphics;


public class Rectangle extends Form {
    int vel = 2;

    public Rectangle(int x, int y, int width, int height, Color c) {
        super(x, y, width, height, c);
    }

    public void draw(Graphics g) {
        g.fillRect(x, y, 10, 10);
    }

    @Override
    public void update(){

        if(x<0 || x > 970)
            vel = -vel;

        x+= vel;


    }
}