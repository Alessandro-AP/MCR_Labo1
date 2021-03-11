package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;

import static utils.RandomInt.randomInt;

public class MyWindow extends JFrame implements Displayer, ActionListener {

    private static final MyWindow instance = new MyWindow(500, 600);

    private final JPanel panel;
    private final LinkedList<Form> elements = new LinkedList<>();

    private MyWindow(int width, int heigth) {
        if (width < 1 || heigth < 1)
            throw new IllegalArgumentException("Window size must be positive");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Bouncers");
        setSize(width, heigth);
        setLocationRelativeTo(null);

        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (Form s : elements) {
                    s.draw(g);
                }
            }
        };
        add(panel);
        setVisible(true);

        generateRandomShapes();
        Timer timer = new Timer(5, this);
        timer.start();

        // tentative de remettre les formes dans la fenetre lors d'une diminution de la fenetre
//        addComponentListener(new ComponentAdapter() {
//            @Override
//            public void componentResized(ComponentEvent e) {
//                repaint();
//            }
//        });
    }

    public static MyWindow getInstance() {
        if (instance == null)
            throw new RuntimeException("Window already exists");
        return instance;
    }

    public int getWidth() {
        return super.getWidth();
    }

    public int getHeight() {
        return super.getHeight();
    }

    public Graphics2D getGraphics() {
        return (Graphics2D) super.getGraphics();
    }

    public void repaint() {
        super.repaint();
//        panel.repaint();
    }

    public void setTitle(String title) {
        super.setTitle(title);
    }

    private void generateRandomShapes() {
        int nbElemMin = 5,
                nbElemMax = 100,
                elemSizeMax = 50,
                elemSizeMin = 5,
                velMin = 1,
                velMax = 5;

        int xMax = panel.getWidth() - elemSizeMax,
            yMax = panel.getHeight() - elemSizeMax;

        for (int i = 0; i < randomInt(nbElemMin, nbElemMax); ++i) {
            elements.add(new Square(randomInt(0, xMax), randomInt(0, yMax),
                    randomInt(velMin, velMax), randomInt(velMin, velMax),
                    Color.yellow, randomInt(elemSizeMin, elemSizeMax)));

            elements.add(new Circle(randomInt(0, xMax), randomInt(0, yMax),
                    randomInt(velMin, velMax), randomInt(velMin, velMax),
                    Color.blue, randomInt(elemSizeMin, elemSizeMax)));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Form s : elements) {
            int xMax = panel.getWidth() - s.width();
            int yMax = panel.getHeight() - s.heigth();
            s.updateDirection(xMax, yMax);
        }
        repaint();
    }
}
