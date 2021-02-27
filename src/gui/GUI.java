package gui;

import javax.swing.*;

public class GUI extends JFrame {

    public GUI(int width, int heigth) {
        if (width < 1 || heigth < 1)
            throw new IllegalArgumentException("Window size must be positive");
        setSize(width, heigth);
        setLocationRelativeTo(null);
        setTitle("bouncers");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new Window(width, heigth));
        setVisible(true);
    }

    public static void main(String[] args) {
        new GUI(500, 600);
    }
}
