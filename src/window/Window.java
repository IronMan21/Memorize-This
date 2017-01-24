	package window;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Window {
	
	public Window(int width, int height, String title, Game game){
		// creating your game window
		game.setPreferredSize(new Dimension(width, height));
		game.setMaximumSize(new Dimension(width, height));
		game.setMinimumSize(new Dimension(width, height));
		
		JFrame frame = new JFrame(title);
		frame.add(game);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
		
		game.start();
		
	}
	
	
}
