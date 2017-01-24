package framework;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import window.Game;
import window.Game.States;

public class Menu extends MouseAdapter {
	private Game game;

	public Menu(Game game) {
		this.game = game;
	}

	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();

		if (game.gameState == States.Menu) {
			// play button
			if (mouseOver(mx, my, 350, 220, 250, 85)) {
				game.gameState = States.Game;
			}

			// help button
			if (mouseOver(mx, my, 350, 420, 250, 85)) {
				game.gameState = States.Help;
			}

			// quit button
			if (mouseOver(mx, my, 350, 620, 250, 85)) {
				System.exit(1);
			}
		} else if (game.gameState == States.Help) { // back button from Help Menu
			if (mouseOver(mx, my, 50, 706, 200, 55))
				game.gameState = States.Menu;
		}

	}

	public boolean mouseOver(int mx, int my, int x, int y, int w, int h) {
		if (mx > x && mx < x + w) {
			if (my > y && my < y + h)
				return true;
			return false;
		} else
			return false;

	}

	public void tick() {

	}

	public void render(Graphics g) {
		if (game.gameState == States.Menu) {
			// title
			g.setColor(Color.WHITE);
			Font myfont = new Font("Times New Roman", 3, 90);
			g.setFont(myfont);
			g.drawString("Memorize", 295, 127);
			
			// Play button
			g.setColor(Color.WHITE);
			g.drawRect(350, 220, 250, 85);
			Font myfont1 = new Font("Times New Roman",2 , 80);
			g.setFont(myfont1);
			g.drawString("PLAY", 375, 290);

			// help button
			g.setColor(Color.WHITE);
			g.drawRect(350, 420, 250, 85);
			g.drawString("HELP", 371, 490);

			// quit button
			g.setColor(Color.WHITE);
			g.drawRect(350, 620, 250, 85);

			g.drawString("QUIT", 380, 683);
		} else if (game.gameState == States.Help) {
			// title
			g.setColor(Color.WHITE);
			Font myfont = new Font("Times New Roman", 3, 80);
			g.setFont(myfont);
			g.drawString("Help Menu", 280, 90);

			g.setColor(Color.white);
			Font myfont2 = new Font("Times New Roman", 3, 40);
			g.setFont(myfont2);
			g.drawString("Instructions", 50, 260);

			// instructions
			g.setColor(Color.white);
			Font myFont1 = new Font("Times New Roman", 2, 30);
			g.setFont(myFont1);
			g.drawString("This is a simple memorization game. When the game starts, random ", 50, 300);
			g.drawString("objects of different size, shape, color and names will show on the", 50, 340);
			g.drawString("screen. As you click on the objects, remember the order and type of", 50, 380);
			g.drawString("object clicked!! Once all the objects have been clicked, you will have to ", 50, 420);
			g.drawString("recall the order and place of the objects. As you progress through.", 50, 460);
			g.drawString("the game, the levels will get harder. There are 3 levels of difficulty.", 50, 500);
			g.drawString("Easy, Medium, and Hard. Easy and Medium no time limits for recall.", 50, 540);
			g.drawString("Selecting Hard will test your mental limits!! During the game or in the  ", 50, 580);
			g.drawString("Menu, you can hit the ESC key to exit the game.", 50, 620);

			// back button
			g.setColor(Color.WHITE);
			g.setFont(myfont2);
			g.drawRect(50, 706, 200, 55);
			g.drawString("Back", 104, 750);

		}
	}
}
