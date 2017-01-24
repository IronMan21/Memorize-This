package framework;

import java.awt.Graphics;
import java.util.LinkedList;

public abstract class GameObjects {
	protected float x;
	protected float y;
	protected ID id;

	public GameObjects(float x, float y, ID id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}

	public abstract void setX(float x);

	public abstract float getX();

	public abstract void setY(float y);

	public abstract float getY();

	public abstract ID getID();

	public abstract void tick(LinkedList<GameObjects> objects);

	public abstract void render(Graphics g);

}
