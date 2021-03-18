package fabrication;

import shapes.Bouncable;

import java.awt.*;

public interface Renderer {

    default void display(Graphics2D g2d, Bouncable b) {
        g2d.setColor( b.getColor() );
        g2d.draw( b.getShape() );
    }
}