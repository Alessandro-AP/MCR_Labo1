package gui;

import shapes.Form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;

public class MyWindow extends JFrame implements Displayer , ActionListener {

    private static final MyWindow instance = new MyWindow(500, 600);
    private final LinkedList<Object> elements = new LinkedList<>();
    private final JPanel panel;
    Timer timer;

    public void addElements(LinkedList<?> list){
        elements.addAll(list);
    }

    public void addElement(Object elem){
        elements.add(elem);
    }

    private MyWindow(int width, int heigth) {
        if (width < 1 || heigth < 1)
            throw new IllegalArgumentException("MyWindow size must be positive");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, heigth);
        setLocationRelativeTo(null);

        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                if(elements == null)
                    return;
                    super.paintComponent(g);
                    for (Object s : elements) {
                        ((Form) s).setGraphics2D(g);
                        ((Form) s).draw();
                    }
                }

        };

        add(panel);
        setVisible(true);

    }

    public void startTimer(){
        timer = new Timer(5, this);
        timer.start();
    }

    public static MyWindow getInstance() {
        if (instance == null)
            throw new RuntimeException("MyWindow already exists");
        return instance;
    }

    public void resetWindow(){
        elements.clear();
        if(timer != null)
            timer.stop();
        repaint();
    }

    public void repaint() { super.repaint(); }

    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public void addKeyListener(KeyAdapter ka) { super.addKeyListener(ka); }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Object s : elements) {
                int xMax = panel.getWidth() - ((Form) s).width();
                int yMax = panel.getHeight() - ((Form) s).heigth();
            ((Form) s).setDirection(xMax, yMax);
            ((Form) s).move();
        }
        repaint();
    }

    //--------------------- GETTERS-----------------------------
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

}