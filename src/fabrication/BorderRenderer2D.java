package fabrication;

import shapes.Bouncable;

import java.awt.*;

public class BorderRenderer2D implements Renderer {
    @Override
    public void display(Graphics2D g2d, Bouncable b) {
        Renderer.super.display(g2d, b);
        g2d.setStroke(new BasicStroke(2.0f));
    }
}

