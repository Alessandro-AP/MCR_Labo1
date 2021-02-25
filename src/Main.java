import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main extends JPanel{
	private List<Object> shapes = new ArrayList<>();
	
	public Main() {
    	setBackground(Color.BLACK);
    	setPreferredSize(new Dimension(1000, 1000));

    		for(int j=0;j<200;++j){
    			int x = generateRandomIntIntRange(20,980);
    			int y = generateRandomIntIntRange(20,980);
				shapes.add(new Circle(x,y));
				shapes.add(new Rectangle(y, x));
    	}
	}

	public static int generateRandomIntIntRange(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
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
    }

	public static void main(String[] args) {

		JFrame frame = new JFrame("Labo1");
		frame.add(new Main());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}
}

