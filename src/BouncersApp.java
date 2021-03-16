import gui.*;
import gui.MyWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

import static utils.RandomInt.randomInt;

public class BouncersApp {

    private final LinkedList<Bouncable> elements = new LinkedList<>();

    public LinkedList<Bouncable> getElements() {
        return elements;
    }

    MyWindow w = MyWindow.getInstance();

    private void generateRandomShapes(MyWindow w) {
        int nbForms = 10,
                elemSizeMax = 50,
                elemSizeMin = 10,
                velMin = 1,
                velMax = 3;

        int xMax = w.getPanelWidth() - elemSizeMax,
                yMax = w.getPanelHeight() - elemSizeMax;

        for (int i = 0; i < nbForms; ++i) {
            int sizeSquare = randomInt(elemSizeMin, elemSizeMax);
            w.addForm(new Square(sizeSquare,sizeSquare,
                    randomInt(0, xMax), randomInt(0, yMax),
                    randomInt(velMin, velMax), randomInt(velMin, velMax),
                    Color.yellow));

            int sizeCircle = randomInt(elemSizeMin, elemSizeMax);
            w.addForm(new Circle(sizeCircle, sizeCircle,
                    randomInt(0, xMax), randomInt(0, yMax),
                    randomInt(velMin, velMax), randomInt(velMin, velMax),
                    Color.blue));
        }
    }

    public void run() {
//        MyWindow w = MyWindow.getInstance();
        w.setTitle("Bouncers");

        w.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                int keyNumber = Character.toUpperCase(e.getKeyChar());
                switch (keyNumber) {
                    case KeyEvent.VK_E:
                        // efface affichage

                        break;
                    case KeyEvent.VK_F:
                        // génère 10 carrées and cercles pleins
                        System.out.println("F pressed");
                        generateRandomShapes(w);
                        w.startTimer();
//
                        break;
                    case KeyEvent.VK_B:
                        // génère 10 carrées and cercles avec bordure

                        break;
                    case KeyEvent.VK_Q:
                        // quit programm

                        break;
                    default:
                        System.out.println("wrong key"); //temp
                }

            }
        });

    }


    public static void main(String[] args) {
        new BouncersApp().run();
    }

}