import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import static outils.RandomNumber.generateRandomIntIntRange;

public class Window extends JPanel implements ActionListener {
    //List of shapes
    private List<Shape> shapes = new ArrayList<>();

    //For movements
    Timer tm = new Timer(5,this);

    public Window() {
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(1000, 1000));

        for(int j=0;j<200;++j){
            int x = generateRandomIntIntRange(20,980);
            int y = generateRandomIntIntRange(20,980);
            shapes.add(new Circle(x,y,10,10,Color.GREEN));
            shapes.add(new Rectangle(y, x,10,10,Color.RED));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Object s : shapes) {
            if (s instanceof Circle){
                ((Circle) s).draw(g);
            }else if(s instanceof Rectangle){
                ((Rectangle) s).draw(g);
            }
        }
        tm.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Shape shape : shapes) {
            shape.move();
        }
        repaint();
    }
}
