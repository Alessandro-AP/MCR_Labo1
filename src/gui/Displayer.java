/*
 * @file Displayer.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package gui;

import java.awt.*;
import java.awt.event.KeyAdapter;

public interface Displayer {
    int getWidth();
    int getHeight();
    Graphics2D getGraphics();
    void repaint();
    void setTitle(String title);
    void addKeyListener(KeyAdapter ka);
}