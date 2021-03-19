
import abstractFactory.FormFactory;
import abstractFactory.BorderFormFactory;
import abstractFactory.FilledFormFactory;
import gui.MyWindow;
import shapes.Bouncable;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;


public class BouncersApp implements ActionListener {

    private LinkedList<Bouncable> bouncersList = new LinkedList<>();
    private final MyWindow window = MyWindow.getInstance();
    private static final int nbBouncers = 10;

    Timer timer = new Timer(5,this);

    public BouncersApp() {
        window.setTitle("BOUNCERS");
        window.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent keyEvent) {

                timer.start();

                switch (keyEvent.getKeyCode()) {
                    case KeyEvent.VK_E:
                            bouncersList.clear();
                            window.repaint();
                            timer.stop();
                        break;
                    case KeyEvent.VK_F:
                        fabricate(new FilledFormFactory());
                        break;
                    case KeyEvent.VK_B:
                        fabricate(new BorderFormFactory());
                        break;
                    case KeyEvent.VK_Q:
                        System.exit(0);
                        break;
                    default: System.out.println("Wrong key");
                }
            }
        });

    }

    public void fabricate(FormFactory factory) {
        for (int i = 0; i < nbBouncers; i++) {
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
