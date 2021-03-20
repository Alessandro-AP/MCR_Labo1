/*
 * @file FormFactory.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package abstractFactory;

import gui.MyWindow;
import shapes.Circle;
import shapes.Square;

public  interface FormFactory {

    int elemSizeMax = 50,
        elemSizeMin = 10;

    MyWindow w = MyWindow.getInstance();

    int xMax = w.getWidth() - elemSizeMax,
        yMax = w.getHeight() - elemSizeMax;

    Square createSquare();
    Circle createCircle();
}
