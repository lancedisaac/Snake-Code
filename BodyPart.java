import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BodyPart extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int xCoor, yCoor, width, hieght; 
	
	public BodyPart(int xCoor, int yCoor, int tileSize) {
		this.xCoor = xCoor;
		this.yCoor = yCoor;
		width = tileSize;
		hieght = tileSize;
	}
	public void tick() {
		
	}
	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(xCoor * width, yCoor * hieght, width, hieght);
	}
	public int getxCoor() {
		return xCoor;
	}
	public void setxCoor(int xCoor) {
		this.xCoor = xCoor;
	}
	public int getyCoor() {
		return yCoor;
	}
	public void setyCoor(int yCoor) {
		this.yCoor = yCoor;
	}
	
}
