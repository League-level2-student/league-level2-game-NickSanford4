import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Maze {
	JFrame frame;
	GamePanel panel;
	final static int HEIGHT = 800;
	final static int WIDTH = 800;

	public static void main(String[] args) {
		Maze Maze = new Maze();
		Maze.setup();
	}

	Maze() {
		frame = new JFrame();
		panel = new GamePanel();
	}

	private void setup() {
		frame.add(panel);
		frame.addKeyListener(panel);
		panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}
}
