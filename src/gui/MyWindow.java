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

/**
 * Fenêtre principale gérant l'affichage de son contenu (Singleton).
 */
public class MyWindow implements Displayer {

    private static MyWindow instance;
    private static final int WINDOW_WIDTH = 600, WINDOW_HEIGTH = 800;

    private final JFrame frame = new JFrame();
    private final JPanel panel = new JPanel();
    private BufferedImage bufferedImage;

    /**
     * Constructeur
     */
    private MyWindow() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGTH);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        frame.setVisible(true);
        // Image contenant les formes
        bufferedImage = (BufferedImage) panel.createImage(WINDOW_WIDTH, WINDOW_HEIGTH);
        bufferedImage.createGraphics().drawImage(bufferedImage, null, 0, 0);
    }

    /**
     * Retourne l'instance de la classe MyWindow
     * @return instance de la classe MyWindow
     */
    public static MyWindow getInstance() {
        if (instance == null)
            instance = new MyWindow();
        return instance;
    }

    /**
     * Modifie le titre de la fenêtre
     * @param title Titre de la fenêtre
     */
    @Override
    public void setTitle(String title) {
        frame.setTitle(title);
    }

    /**
     * Rafraichit l'affichage de la fenêtre
     */
    @Override
    public void repaint() {
        panel.getGraphics().drawImage(bufferedImage, 0, 0, null);
        bufferedImage = (BufferedImage) panel.createImage(panel.getWidth(), panel.getHeight());
    }

    /**
     * Ajoute un KeyAdapter à la fenêtre
     * @param ka KeyAdapter a ajouter
     */
    @Override
    public void addKeyListener(KeyAdapter ka) {
        frame.addKeyListener(ka);
    }

//--------------------- GETTERS-----------------------------

    /**
     * Récupère la largeur de l'intérieur de la fenêtre
     * @return largeur de l'intérieur de la fenêtre
     */
    @Override
    public int getWidth() {
        return panel.getWidth();
    }

    /**
     * Récupère la hauteur de l'intérieur de la fenêtre
     * @return hauteur de l'intérieur de la fenêtre
     */
    @Override
    public int getHeight() {
        return panel.getHeight();
    }

    /**
     * Récupère le Graphics2D associé à l'image de la fenêtre
     * @return Graphics2D associé à l'image de la fenêtre
     */
    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) bufferedImage.getGraphics();
    }

}
