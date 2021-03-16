package gui;

import java.awt.*;

public class FormRenderer implements Renderer {
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.draw(b.getShape());
        g.fill(b.getShape());
    }
}