package gui;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame implements Displayer {

    private static final Window instance = new Window(500, 600);

    private final Panel panel;

    private Window(int width, int heigth) {
        if (width < 1 || heigth < 1)
            throw new IllegalArgumentException("Window size must be positive");
        setSize(width, heigth);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new Panel();
        add(panel);
        pack();
        setVisible(true);
        int t = panel.getHeight();
        int t2 = panel.getWidth();

    }

    public static Window getInstance() {
        if (instance == null)
            throw new RuntimeException("Window already exists");
        return instance;
    }

    public int getWidth() {
        return super.getWidth();
    }

    public int getHeight() {
        return super.getHeight();
    }

    public Graphics2D getGraphics() {
        return (Graphics2D) super.getGraphics();
    }

    public void repaint() {
//        super.repaint();
        panel.repaint();
    }

    public void setTitle(String title) {
        super.setTitle(title);
    }
}
