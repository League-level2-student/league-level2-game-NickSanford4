import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener {
	int score = 0;
	Character character;
void setCharacter(Character character) {
	this.character = character;
}
ArrayList<Wall> walls = new ArrayList<Wall>();
	ObjectManager(Character character) {
		this.character = character;
		addWall();
	}
	void addWall() {
		//			    (x,y,width,height)
		walls.add(new Wall(0,0,10,800));
		walls.add(new Wall(790,0,10,800));
		walls.add(new Wall(0,0,800,10));
		walls.add(new Wall(0,790,800,10));
		walls.add(new Wall(40,70,5,200));
		walls.add(new Wall(40,70,200,5));
	}

	void draw(Graphics g) {
		character.draw(g);
		for (int i = 0; i < walls.size(); i++) {
			walls.get(i).draw(g);
		}
		}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		

	}

}