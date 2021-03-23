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

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

/**
 * Application principale
 */
public class BouncersApp {

    private static final MyWindow window = MyWindow.getInstance();
    private final LinkedList<Bouncable> bouncersList = new LinkedList<>();
    private static final int NB_BOUNCERS = 10;

    /**
     * Constructeur
     */
    public BouncersApp() {
        window.setTitle("Bouncers");

        window.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                int key = Character.toUpperCase(e.getKeyChar());

                switch (key) {
                    // Clear window
                    case KeyEvent.VK_E:
                        synchronized (bouncersList) {
                            bouncersList.clear();
                        }
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

    /**
     * Crée NB_BOUNCERS Bouncables et les ajoute à la
     * liste de Bouncables du programme
     *
     * @param factory Fabrique de formes
     */
    public void fabricate(FormFactory factory) {
        synchronized (bouncersList) {
            for (int i = 0; i < NB_BOUNCERS; i++) {
                bouncersList.add(factory.createSquare());
                bouncersList.add(factory.createCircle());
            }
        }
    }

    /**
     * Lance le dessin et le mouvement des Bouncables
     */
    public void run() {

        try {
            while (true) {
                synchronized (bouncersList) {
                    for (Bouncable b : bouncersList) {
                        b.draw();
                        b.move();
                    }
                }
                window.repaint();
                Thread.sleep(5);
            }
        }
        catch (InterruptedException ignored) {}
    }

    public static void main(String... args) {
        new BouncersApp().run();
    }
}
