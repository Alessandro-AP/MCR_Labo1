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

public class BorderedFormFactory implements FormFactory{

    @Override
    public Square createSquare() {
        int sizeSquare = randomInt(elemSizeMin, elemSizeMax);
        return new BorderedSquare(sizeSquare,sizeSquare,
                randomInt(0, xMax), randomInt(0, yMax),
                Color.red);
    }

    @Override
    public Circle createCircle() {
        int sizeCircle = randomInt(elemSizeMin, elemSizeMax);
        return new BorderedCircle(sizeCircle, sizeCircle,
                randomInt(0, xMax), randomInt(0, yMax),
                Color.green);
    }
}