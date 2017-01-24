package framework;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class HUD {
	int level = 1;

	public void render(Graphics g) {
		Font myfont = new Font("TImes New Roman", 3, 30);
		g.setColor(Color.WHITE);
		g.setFont(myfont);
		g.drawString("Level = " + level, 20, 800);
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

}
