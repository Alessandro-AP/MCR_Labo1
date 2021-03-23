/*
 * @file FilledFormFactory.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package abstractFactory;

import shapes.Circle;
import shapes.FilledCircle;
import shapes.FilledSquare;
import shapes.Square;

import java.awt.*;

import static utils.RandomNumber.randomInt;

/**
 * Fabrique de formes remplies.
 * Leur taille, position et vecteur de déplacement sont aléatoires.
 */
public class FilledFormFactory implements FormFactory{

    /**
     * Crée un carrée rempli
     * @return un carrée rempli
     */
    @Override
    public Square createSquare() {
        int sizeSquare = randomInt(elemSizeMin, elemSizeMax);
        return new FilledSquare(randomInt(0, xMax), randomInt(0, yMax),
                                sizeSquare,sizeSquare,
                                Color.yellow);
    }

    /**
     * Crée un cercle rempli
     * @return un cercle rempli
     */
    @Override
    public Circle createCircle() {
        int sizeCircle = randomInt(elemSizeMin, elemSizeMax);
        return new FilledCircle(randomInt(0, xMax), randomInt(0, yMax),
                                sizeCircle, sizeCircle,
                                Color.blue);
    }
}