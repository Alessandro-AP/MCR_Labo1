/*
 * @file BouncersApp.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

import abstractFactory.BorderedFormFactory;
import abstractFactory.FilledFormFactory;
import abstractFactory.FormFactory;
import gui.MyWindow;
import shapes.Bouncable;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class BouncersApp implements ActionListener {

    private static final MyWindow window = MyWindow.getInstance();
    private final LinkedList<Bouncable> bouncersList = new LinkedList<>();
    private static final int NB_BOUNCERS = 10;

    Timer timer = new Timer(5, this);

    public BouncersApp() {
        window.setTitle("Bouncers");
        window.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {

                int key = Character.toUpperCase(e.getKeyChar());
                timer.start();

                switch (key) {
                    // Clear window
                    case KeyEvent.VK_E:
                        bouncersList.clear();
                        window.repaint();
                        timer.stop();
                        break;

                    // Generate 10 filled squares and circles
                    case KeyEvent.VK_F:
                        fabricate(new FilledFormFactory());
                        break;

                    // Generate 10 only bordered squares and circles
                    case KeyEvent.VK_B:
                        fabricate(new BorderedFormFactory());
                        break;

                    // Exit program
                    case KeyEvent.VK_Q:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Wrong key");
                }
            }
        });

    }

    public void fabricate(FormFactory factory) {
        for (int i = 0; i < NB_BOUNCERS; i++) {
            bouncersList.add(factory.createSquare());
            bouncersList.add(factory.createCircle());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Bouncable b : bouncersList) {
            b.draw();
            b.move();
        }
        window.repaint();
    }

    //public void run(){timer.start();}

    public static void main(String... args) {
        new BouncersApp();
    }
}
