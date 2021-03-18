package abstractFactory;

import gui.MyWindow;
import shapes.Circle;
import shapes.Square;

public interface FormFactory {

    int elemSizeMax = 50,
        elemSizeMin = 10;

    MyWindow w = MyWindow.getInstance();

    int xMax = w.getPanelWidth() - elemSizeMax,
        yMax = w.getPanelHeight() - elemSizeMax;

     Square createSquare();
     Circle createCircle();
}
