package abstractFactory;

import shapes.BorderCircle;
import shapes.BorderSquare;
import shapes.Circle;
import shapes.Square;

import java.awt.*;

import static utils.RandomInt.randomInt;

public class BorderFormFactory implements FormFactory{

    @Override
    public Square createSquare() {
        int sizeSquare = randomInt(elemSizeMin, elemSizeMax);
        return new BorderSquare(sizeSquare,sizeSquare,
                randomInt(0, xMax), randomInt(0, yMax),
                Color.red);
    }

    @Override
    public Circle createCircle() {
        int sizeCircle = randomInt(elemSizeMin, elemSizeMax);
        return new BorderCircle(sizeCircle, sizeCircle,
                randomInt(0, xMax), randomInt(0, yMax),
                Color.green);
    }
}
