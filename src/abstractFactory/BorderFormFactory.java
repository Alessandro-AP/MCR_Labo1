package abstractFactory;

import shapes.Circle;
import shapes.Square;

public class BorderFormFactory implements FormFactory{

    @Override
    public Square createSquare() {
        return null;
    }

    @Override
    public Circle createCircle() {
        return null;
    }
}
