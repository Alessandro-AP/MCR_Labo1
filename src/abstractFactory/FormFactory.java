/*
 * @file FormFactory.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package abstractFactory;

import gui.MyWindow;
import shapes.Circle;
import shapes.Square;

/**
 * Fabrique abstraite permettant de créer des formes de taille aléatoire et ayant
 * une position et vecteur de déplacement aléatoire dans la fenêtre.
 * Elle définit la taille min/max des formes et
 * la position max de ceux-ci dans la fenêtre.
 */
public interface FormFactory {

    int elemSizeMax = 50,
        elemSizeMin = 10;

    MyWindow w = MyWindow.getInstance();

    int xMax = w.getWidth() - elemSizeMax,
        yMax = w.getHeight() - elemSizeMax;

    /**
     * Fabrication de carrée de taille, position et vecteur de déplacement aléatoire
     * @return un carrée
     */
    Square createSquare();

    /**
     * Fabrication de cercle de taille, position et vecteur de déplacement aléatoire
     * @return un cercle
     */
    Circle createCircle();
}
