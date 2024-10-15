package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{

	// SCREEN SETTINGS
	final int orginaltilesize = 16; // 16x16 Tile
	final int scale = 3;
	
	final int tileSize = orginaltilesize * scale; // 48x48 Tile
	final int maxscreenCol = 16;
	final int maxScreenRow = 12;
	final int screenWidth = tileSize * maxscreenCol; // 768 Pixels
	final int screenHeight = tileSize * maxScreenRow; // 576 Pixels
	
	Thread gameThread;
	
	
	public GamePanel() {
		
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
	}

	public void startGameThread() {
		
		gameThread = new Thread(this);
		gameThread.start();
	}   

	@Override
	public void run() {
		
		while(gameThread != null) {
			
			
			System.out.println("The game loop is running");		
		}
		
	}
}
