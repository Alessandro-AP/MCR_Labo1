package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;

public class MyWindow implements Displayer {

    private static final MyWindow instance = new MyWindow(500, 600);

    private final JFrame frame = new JFrame();
    private final JPanel panel = new JPanel();

    private MyWindow(int width, int heigth) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, heigth);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        frame.setVisible(true);
    }

    public static MyWindow getInstance() {
        if (instance == null)
            throw new RuntimeException("MyWindow already exists");
        return instance;
    }

    public void setTitle(String title) {
        frame.setTitle(title);
    }

    public void repaint() {
        panel.repaint();
    }

    @Override
    public void addKeyListener(KeyAdapter ka) { frame.addKeyListener(ka); }

    //--------------------- GETTERS-----------------------------

    public int getWidth() {
        return frame.getWidth();
    }
    public int getHeight() {
        return frame.getHeight();
    }
    public int getPanelWidth() {
        return panel.getWidth();
    }
    public int getPanelHeight() {
        return panel.getHeight();
    }
    public Graphics2D getGraphics() {
        return (Graphics2D) panel.getGraphics();
    }

}