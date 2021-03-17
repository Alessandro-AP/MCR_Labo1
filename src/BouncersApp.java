import shapes.Bouncable;
import gui.MyWindow;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import abstractFactory.*;

public class BouncersApp {

    private final LinkedList<Bouncable> list = new LinkedList<>();

    MyWindow w = MyWindow.getInstance();

    void fabricate(FormFactory factory){
        for(int i =0; i < 10;++i) {
            list.add(factory.createSquare());
            list.add(factory.createCircle());
        }
    }

    public void run() {

        w.setTitle("Bouncers");

        w.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {

                int keyNumber = Character.toUpperCase(e.getKeyChar());

                switch (keyNumber) {

                    // Clear window
                    case KeyEvent.VK_E:
                        w.resetWindow();
                        break;

                    // Generate 10 filled squares and circles
                    case KeyEvent.VK_F:
                        fabricate(new FilledFormFactory());
                        w.addElements(list);
                        list.clear();
                        w.startTimer();
                        break;

                    // Generate 10 only border squares and circles
                    case KeyEvent.VK_B:
                        fabricate(new BorderFormFactory());
                        w.addElements(list);
                        list.clear();
                        w.startTimer();
                        break;

                    //Exit
                    case KeyEvent.VK_Q:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("wrong key");
                }

            }
        });

    }


    public static void main(String[] args) {
        new BouncersApp().run();
    }

}