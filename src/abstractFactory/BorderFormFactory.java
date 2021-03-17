package abstractFactory;


import shapes.BorderCircle;
import shapes.BorderSquare;

import java.awt.Color;

import static utils.RandomInt.randomInt;

public class BorderFormFactory implements FormFactory{

    @Override
    public BorderSquare createSquare() {
        int sizeSquare = randomInt(elemSizeMin, elemSizeMax);
        return new BorderSquare(sizeSquare,sizeSquare,
                randomInt(0, xMax), randomInt(0, yMax),
                Color.yellow);
    }

    @Override
    public BorderCircle createCircle() {
        int sizeCircle = randomInt(elemSizeMin, elemSizeMax);
        return new BorderCircle(sizeCircle, sizeCircle,
                randomInt(0, xMax), randomInt(0, yMax),
                Color.blue);
    }
}
