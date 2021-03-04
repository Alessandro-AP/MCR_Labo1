package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import static utils.RandomInt.randomInt;

public class Panel extends JPanel implements ActionListener {
//    final private int hautFrame, largFrame;
    LinkedList<Shape> elements = new LinkedList<>();
    Timer timer;

    public Panel() {
//        this.largFrame = 500;
//        this.hautFrame = 600;
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

        int test = getWidth();
        int test2 = getHeight();

        for (int i = 0; i < randomInt(nbElemMin, nbElemMax); ++i) {
//            elements.add(new Square(randomInt(0, largFrame - elemSizeMax), randomInt(0, hautFrame - elemSizeMax),
            elements.add(new Square(randomInt(0, getWidth() - elemSizeMax), randomInt(0, getHeight() - elemSizeMax),
                    randomInt(velMin, velMax), randomInt(velMin, velMax),
                    Color.yellow, randomInt(elemSizeMin, elemSizeMax)));

//            elements.add(new Circle(randomInt(0, largFrame - elemSizeMax), randomInt(0, hautFrame - elemSizeMax),
            elements.add(new Circle(randomInt(0, getWidth() - elemSizeMax), randomInt(0, getHeight() - elemSizeMax),
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
            int xMax = getWidth() - s.width();
            int yMax = getHeight() - s.heigth();
            s.updateDirection(xMax, yMax);
        }
        repaint();
    }

}
