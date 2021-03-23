/*
 * @file Displayer.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package gui;

import java.awt.*;
import java.awt.event.KeyAdapter;

/**
 * Interface permettant de gérer un affichage et de répondre à un KeyAdapter
 */
public interface Displayer {
    /**
     * Récupère la largeur du Displayer
     * @return largeur du Displayer
     */
    int getWidth();

    /**
     * Récupère la hauteur du Displayer
     * @return hauteur du Displayer
     */
    int getHeight();

    /**
     * Récupère le Graphics2D associé à l'image du Displayer
     * @return Graphics2D associé à l'image du Displayer
     */
    Graphics2D getGraphics();

    /**
     * Rafraichit l'affichage du Displayer
     */
    void repaint();

    /**
     * Modifie le titre du Displayer
     * @param title Titre du Displayer
     */
    void setTitle(String title);

    /**
     * Ajoute un KeyAdapter au Displayer
     * @param ka KeyAdapter a ajouter
     */
    void addKeyListener(KeyAdapter ka);
}