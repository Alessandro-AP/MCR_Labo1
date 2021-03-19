package fabrication;


import shapes.Bouncable;

import java.awt.*;

public class FillRenderer2D implements Renderer {
    @Override
    public void display(Graphics2D g, Bouncable b) {
        Renderer.super.display(g,b);
        g.fill(b.getShape());
    }
}