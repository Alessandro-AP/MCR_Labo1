package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;
import java.util.Vector;

import static utils.RandomInt.randomInt;

public class MyWindow extends JFrame implements Displayer , ActionListener {

    private static final MyWindow instance = new MyWindow(500, 600);

    private final JPanel panel;

    private final LinkedList<Form> elements = new LinkedList<>();

    public void addForm(Form v) {
        elements.add(v);
    }

    private KeyAdapter keyAdapter;

    private MyWindow(int width, int heigth) {
        if (width < 1 || heigth < 1)
            throw new IllegalArgumentException("MyWindow size must be positive");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, heigth);
        setLocationRelativeTo(null);

//        panel = new JPanel();
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                if(elements == null)
                    return;
                    super.paintComponent(g);
                    for (Form s : elements) {
                        s.draw(g);
                    }
                }

        };
        add(panel);
        setVisible(true);



        // tentative de remettre les formes dans la fenetre lors d'une diminution de la fenetre
//        addComponentListener(new ComponentAdapter() {
//            @Override
//            public void componentResized(ComponentEvent e) {
//                repaint();
//            }
//        });
    }

    public void startTimer(){
        Timer timer = new Timer(5, this);
        timer.start();
    }

    public static MyWindow getInstance() {
        if (instance == null)
            throw new RuntimeException("MyWindow already exists");
        return instance;
    }

    public int getWidth() {
        return super.getWidth();
    }

    public int getHeight() {
        return super.getHeight();
    }

    public int getPanelWidth() {
        return panel.getWidth();
    }

    public int getPanelHeight() {
        return panel.getHeight();
    }

    public Graphics2D getGraphics() {
        return (Graphics2D) super.getGraphics();
    }

    public void repaint() {
        super.repaint();
//        panel.paintComponents(getGraphics());
    }

    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public void addKeyListener(KeyAdapter ka) {
//        keyAdapter = ka;
        super.addKeyListener(ka);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Form s : elements) {
                int xMax = panel.getWidth() - s.width();
                int yMax = panel.getHeight() - s.heigth();
                s.setDirection(xMax, yMax);
                s.move();
        }
        repaint();
    }

}