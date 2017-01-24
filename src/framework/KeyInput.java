package framework;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import window.Game;
import window.Game.States;

public class KeyInput extends KeyAdapter {
	public Game game;
	
	public KeyInput(Game game){
		this.game = game;
	}

	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		
		if(game.gameState == States.Game || game.gameState == States.Menu){
			if(key == e.VK_ESCAPE)
				System.exit(0);
		}
	}
	
	public void keyReleased(KeyEvent e){
		
	}
	
}
