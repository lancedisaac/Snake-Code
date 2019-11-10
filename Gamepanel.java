import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Gamepanel extends JPanel implements Runnable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int width = 500, hieght = 500;
	
	private Thread thread;
	private boolean running;
	public Gamepanel() {
		
		setPreferredSize(new Dimension(width, hieght));
		
		start();
	}
	
	public void start() {
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	public void stop() {
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void tick() {
		
	}
	public void paint(Graphics g) {
		
		 g.clearRect(0, 0, width, hieght);
		  
		 g.setColor(Color.BLACK);
		  g.fillRect(0, 0, width, hieght);
		  for(int i = 0; i < width/10 ; i++) {
		   g.drawLine(i * 10, 0, i *10, hieght);
		  }
		  for(int i = 0; i < hieght/10 ; i++) {
		   g.drawLine(0, i * 10 , hieght, i * 10);
		  }
		  
	}

	@Override
	public void run() {
		while(running) {
			tick();
			repaint();
		}
		
	}
	
}
