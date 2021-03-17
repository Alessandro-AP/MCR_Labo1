package abstractFactory;

import shapes.Circle;
import shapes.Square;
import java.awt.Color;
import static utils.RandomInt.randomInt;

public class FilledFormFactory implements FormFactory{
    @Override
    public Square createSquare() {
        int sizeSquare = randomInt(elemSizeMin, elemSizeMax);
        return new Square(sizeSquare,sizeSquare,
                randomInt(0, xMax), randomInt(0, yMax),
                randomInt(velMin, velMax), randomInt(velMin, velMax),
                Color.yellow);
    }

    @Override
    public Circle createCircle() {
        int sizeCircle = randomInt(elemSizeMin, elemSizeMax);
        return new Circle(sizeCircle, sizeCircle,
                randomInt(0, xMax), randomInt(0, yMax),
                randomInt(velMin, velMax), randomInt(velMin, velMax),
                Color.blue);
    }
}
