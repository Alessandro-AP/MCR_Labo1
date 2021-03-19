
package shapes;



import fabrication.FillRenderer2D;

import java.awt.*;

public class FilledSquare extends Square {
    public FilledSquare(int heigth, int width, int x, int y, Color color) {
        super(heigth, width, x, y, color);
        renderer = new FillRenderer2D();
    }
}
