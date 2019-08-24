import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements KeyListener,ActionListener{
	Timer timer;
	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	int currentState = MENU;
GamePanel(){
	timer = new Timer(1000 / 60, this);
	timer.start();
}
void drawMenuState(Graphics g) {
	g.setColor(Color.BLUE);
	g.fillRect(0, 0, Maze.WIDTH, Maze.HEIGHT);
	g.setFont(titleFont);
	g.setColor(Color.ORANGE);
	g.drawString("Maze", 300, 150);
	g.setFont(enter);
	g.setColor(Color.ORANGE);
	g.drawString("Press ENTER to Start", 245, 330);
	g.drawString("Press SPACE for Instructions", 205, 500);
}

void drawGameState(Graphics g) {
		
	
}

void drawEndState(Graphics g) {
	{
		g.setColor(Color.RED);
		g.fillRect(0, 0, Maze.WIDTH, Maze.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("You Win!", 250, 300);
		g.setFont(enter);
		g.setColor(Color.yellow);
		g.drawString("Press Enter to go to Home", 230, 500);

	}

}

@Override
public void paintComponent(Graphics g) {
	if (currentState == MENU) {
		drawMenuState(g);
	} else if (currentState == GAME) {
		drawGameState(g);
	} else if (currentState == END) {
		drawEndState(g);
	}
}
Font titleFont = new Font("Arial", Font.BOLD, 70);
Font enter = new Font("Arial", Font.PLAIN, 30);
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (currentState == END) {
			currentState = MENU;
			}
			else if (currentState == GAME) {
			currentState = END;
			}
			
			else if (currentState == MENU) {
			currentState = GAME;
			}
		}
			
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}

}
