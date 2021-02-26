import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel{

	public static void main(String[] args) {

		JFrame frame = new JFrame("Labo1");
		frame.add(new Window());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}
}

