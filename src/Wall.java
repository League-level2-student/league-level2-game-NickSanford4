import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
public class Wall {
Rectangle rect;
Wall(int x, int y, int width, int height){
rect = new Rectangle(x,y,width,height);
}
void draw(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(rect.x, rect.y, rect.width, rect.height);
}
boolean characterCollision(Character character) {
	if (character.collisionBox.intersects(rect)) {
		return true;
	}
	return false;
}
}
