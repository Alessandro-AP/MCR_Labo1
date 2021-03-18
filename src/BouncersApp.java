import abstractFactory.BorderFormFactory;
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

    private final LinkedList<Bouncable> list = new LinkedList<>();

    MyWindow w = MyWindow.getInstance();

    Timer timer = new Timer(1, this);

    public BouncersApp() {

        w.setTitle("Bouncers");
        w.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {

                int keyNumber = Character.toUpperCase(e.getKeyChar());

                switch (keyNumber) {

                    // Clear window
                    case KeyEvent.VK_E:
                        list.clear();
                        break;

                    // Generate 10 filled squares and circles
                    case KeyEvent.VK_F:
                        fabricate(new FilledFormFactory());
                        break;

                    // Generate 10 only border squares and circles
                    case KeyEvent.VK_B:
                        fabricate(new BorderFormFactory());
                        break;

                    //Exit
                    case KeyEvent.VK_Q:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Wrong key");
                }
            }
        });
    }

    void fabricate(FormFactory factory) {
        for (int i = 0; i < 10; ++i) {
            list.add(factory.createSquare());
            list.add(factory.createCircle());
        }
    }

    public void run() {

        timer.start();

//        while (true) {
//            for (Bouncable b : list) {
//                b.draw();
//                b.move();
//            }
//            w.repaint();
//
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//            }
//        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Bouncable b : list) {
            b.draw();
            b.move();
        }
        w.repaint();
    }

    public static void main(String[] args) {
        new BouncersApp().run();
    }

}