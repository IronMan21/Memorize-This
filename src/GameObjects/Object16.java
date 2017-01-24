package GameObjects;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

import framework.GameObjects;
import framework.ID;

public class Object16 extends GameObjects {

	public Object16(float x, float y, ID id) {
		super(x, y, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setX(float x) {
		// TODO Auto-generated method stub
		this.x = x;
	}

	@Override
	public float getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public void setY(float y) {
		// TODO Auto-generated method stub
		this.y = y;
	}

	@Override
	public float getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public ID getID() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void tick(LinkedList<GameObjects> objects) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.red);
		g.fillRect((int) x, (int) y, 40, 40);
	}

	

}
