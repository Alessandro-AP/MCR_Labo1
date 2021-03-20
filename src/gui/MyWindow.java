/*
 * @file MyWindow.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.image.BufferedImage;

public class MyWindow implements Displayer {

    private static MyWindow instance;
    private static final int WINDOW_WIDTH = 600, WINDOW_HEIGTH = 800;

    private final JFrame frame = new JFrame();
    private final JPanel panel = new JPanel();
    private BufferedImage bufferedImage;

    private MyWindow() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGTH);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        frame.setVisible(true);

        bufferedImage = (BufferedImage) panel.createImage(WINDOW_WIDTH, WINDOW_HEIGTH);
        bufferedImage.createGraphics().drawImage(bufferedImage, null, 0, 0);
    }

    public static MyWindow getInstance() {
        if (instance == null)
            instance = new MyWindow();
        return instance;
    }

    @Override
    public void setTitle(String title) {
        frame.setTitle(title);
    }

    @Override
    public void repaint() {
        panel.getGraphics().drawImage(bufferedImage, 0, 0, null);
        bufferedImage = (BufferedImage) panel.createImage(panel.getWidth(), panel.getHeight());
    }

    @Override
    public void addKeyListener(KeyAdapter ka) {
        frame.addKeyListener(ka);
    }

//--------------------- GETTERS-----------------------------
    @Override
    public int getWidth() {
        return panel.getWidth();
    }

    @Override
    public int getHeight() {
        return panel.getHeight();
    }

    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) bufferedImage.getGraphics();
    }

}
