package framework;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {

	LinkedList<GameObjects> objects = new LinkedList<GameObjects>();
	LinkedList<GameObjects> objects_recall = new LinkedList<GameObjects>();
	LinkedList<GameObjects> recall_clicked = new LinkedList<GameObjects>();
	LinkedList<GameObjects> blackOut = new LinkedList<GameObjects>();

	GameObjects tempObject;
	GameObjects tempObject_recall;
	GameObjects tempObject_recall_clicked;
	GameObjects tempObject_blackOut;

	public void render(Graphics g) {
		for (int i = 0; i < objects.size(); i++) {
			tempObject = objects.get(i);
			tempObject.render(g);
		}
	}

	public void render_recall(Graphics g) {
		for (int i = 0; i < objects_recall.size(); i++) {
			tempObject_recall = objects_recall.get(i);
			tempObject_recall.render(g);
		}
	}

	public void render_recall2(Graphics g) {
		for (int i = 0; i < recall_clicked.size(); i++) {
			tempObject_recall_clicked = recall_clicked.get(i);
			tempObject_recall_clicked.render(g);
		}
	}

	public void render_recall3(Graphics g) {
		for (int i = 0; i < blackOut.size(); i++) {
			tempObject_blackOut = blackOut.get(i);
			tempObject_blackOut.render(g);
		}
	}

	public void tick() {
		for (int i = 0; i < objects.size(); i++) {
			tempObject = objects.get(i);
			tempObject.tick(objects);
		}
	}

	public void tick_recall() {
		for (int i = 0; i < objects_recall.size(); i++) {
			tempObject_recall = objects_recall.get(i);
			tempObject_recall.tick(objects_recall);
		}
	}

	public void tick_recall2() {
		for (int i = 0; i < recall_clicked.size(); i++) {
			tempObject_recall_clicked = recall_clicked.get(i);
			tempObject_recall_clicked.tick(recall_clicked);
		}
	}

	public void tick_recall3() {
		for (int i = 0; i < blackOut.size(); i++) {
			tempObject_blackOut = blackOut.get(i);
			tempObject_blackOut.tick(blackOut);
		}
	}

	public void addObject(GameObjects objects) {
		this.objects.add(objects);
	}

	public void addObject_recall(GameObjects objects_recall) {
		this.objects_recall.add(objects_recall);
	}

	public void addObject_recall_clicked(GameObjects recall_clicked) {
		this.recall_clicked.add(recall_clicked);
	}

	public void addObject_recall_clicked2(GameObjects recall_clicked2) {
		this.blackOut.add(recall_clicked2);
	}

	public void removeObject(GameObjects objects) {
		this.objects.remove(objects);
	}

	public void removeObject_recall(GameObjects objects_recall) {
		this.objects_recall.remove(objects_recall);
	}

	public void removeObject_recall_clicked(GameObjects recall_clicked) {
		this.recall_clicked.remove(recall_clicked);
	}

	public void removeObject_recall_clicked2(GameObjects recall_clicked2) {
		this.blackOut.remove(recall_clicked2);
	}

	public void clear_objects() {
		objects.clear();
	}

	public void clear_objects_recall() {
		objects_recall.clear();
	}

	public void clear_recall_clicked() {
		recall_clicked.clear();
	}

	public void clear_black_objects() {
		blackOut.clear();
	}

	public boolean isSame(LinkedList<GameObjects> objects_recall, LinkedList<GameObjects> recall_clicked) {
		for (int i = 0; i < recall_clicked.size(); i++) {
			if (recall_clicked.get(i) == objects_recall.get(i))
				return true;
			else if (recall_clicked.get(i) != objects_recall.get(i))
				return false;
		}
		return false;
	}
}
