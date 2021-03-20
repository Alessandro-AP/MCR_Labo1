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

public class FilledFormFactory implements FormFactory{

    @Override
    public Square createSquare() {
        int sizeSquare = randomInt(elemSizeMin, elemSizeMax);
        return new FilledSquare(sizeSquare,sizeSquare,
                randomInt(0, xMax), randomInt(0, yMax),
                Color.yellow);
    }

    @Override
    public Circle createCircle() {
        int sizeCircle = randomInt(elemSizeMin, elemSizeMax);
        return new FilledCircle(sizeCircle, sizeCircle,
                randomInt(0, xMax), randomInt(0, yMax),
                Color.blue);
    }
}