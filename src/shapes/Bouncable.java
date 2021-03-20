/*
 * @file Bouncable.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package shapes;

import java.awt.*;

public interface Bouncable {
    void draw();
    void move();
    Color getColor();
    Shape getShape();
}