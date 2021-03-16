package gui;

import java.awt.*;


public interface Renderer {
    default void display(Graphics2D g, Bouncable b){
        g.setColor(b.getColor());
        g.draw( b.getShape());
    }
}