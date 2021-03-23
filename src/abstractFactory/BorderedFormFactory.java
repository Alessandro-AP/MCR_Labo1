/*
 * @file BorderedFormFactory.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package abstractFactory;

import shapes.BorderedCircle;
import shapes.BorderedSquare;
import shapes.Circle;
import shapes.Square;

import java.awt.*;

import static utils.RandomNumber.randomInt;

/**
 * Fabrique de formes ayant une bordure (non remplie).
 * Leur taille, position et vecteur de déplacement sont aléatoires.
 */
public class BorderedFormFactory implements FormFactory{

    /**
     * Crée un carrée avec bordure
     * @return un carrée avec bordure
     */
    @Override
    public Square createSquare() {
        int sizeSquare = randomInt(elemSizeMin, elemSizeMax);
        return new BorderedSquare(randomInt(0, xMax), randomInt(0, yMax),
                                  sizeSquare,sizeSquare,
                                  Color.red);
    }

    /**
     * Crée un cercle avec bordure
     * @return un cercle avec bordure
     */
    @Override
    public Circle createCircle() {
        int sizeCircle = randomInt(elemSizeMin, elemSizeMax);
        return new BorderedCircle(randomInt(0, xMax), randomInt(0, yMax),
                                  sizeCircle, sizeCircle,
                                  Color.green);
    }
}