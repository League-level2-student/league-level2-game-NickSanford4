import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener {
	int score = 0;
	Character character;
void setShip(Character character) {
	this.character = character;
}

	ObjectManager(Character character) {
		this.character = character;
	}


	void draw(Graphics g) {
		character.draw(g);
		}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		

	}

}