package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import static utils.RandomInt.randomInt;

public class Window extends JPanel implements ActionListener {
    final private int heigth, width;
    LinkedList<Shape> elements = new LinkedList<>();
    Timer timer;

    public Window(int width, int heigth) {
        if (width < 1 || heigth < 1)
            throw new IllegalArgumentException("Window size must be positive");
        this.width = width;
        this.heigth = heigth;
//        setSize(width, heigth);

        generateRandomShapes();

        timer = new Timer(5, this);
        timer.start();
    }

    private void generateRandomShapes() {
        int nbElemMin = 5,
            nbElemMax = 100,
            elemSizeMax = 50,
            elemSizeMin = 5,
            velMin = 1,
            velMax = 5;

        for (int i = 0; i < randomInt(nbElemMin, nbElemMax); ++i) {
            elements.add(new Square(randomInt(0, width - elemSizeMax), randomInt(0, heigth - elemSizeMax),
                    randomInt(velMin, velMax), randomInt(velMin, velMax),
                    Color.yellow, randomInt(elemSizeMin, elemSizeMax)));

            elements.add(new Circle(randomInt(0, width - elemSizeMax), randomInt(0, heigth - elemSizeMax),
                    randomInt(velMin, velMax), randomInt(velMin, velMax),
                    Color.blue, randomInt(elemSizeMin, elemSizeMax)));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape s : elements) {
            s.draw(g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Shape s : elements) {
            int xMax = width - s.width();
            int yMax = heigth - s.heigth();
            s.updateDirection(xMax, yMax);
        }
        repaint();
    }

}
