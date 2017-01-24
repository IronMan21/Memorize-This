package window;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import GameObjects.Object1;
import GameObjects.Object10;
import GameObjects.Object11;
import GameObjects.Object12;
import GameObjects.Object13;
import GameObjects.Object14;
import GameObjects.Object15;
import GameObjects.Object16;
import GameObjects.Object17;
import GameObjects.Object18;
import GameObjects.Object19;
import GameObjects.Object2;
import GameObjects.Object20;
import GameObjects.Object21;
import GameObjects.Object22;
import GameObjects.Object23;
import GameObjects.Object24;
import GameObjects.Object25;
import GameObjects.Object26;
import GameObjects.Object27;
import GameObjects.Object28;
import GameObjects.Object29;
import GameObjects.Object3;
import GameObjects.Object30;
import GameObjects.Object31;
import GameObjects.Object32;
import GameObjects.Object33;
import GameObjects.Object34;
import GameObjects.Object35;
import GameObjects.Object36;
import GameObjects.Object37;
import GameObjects.Object38;
import GameObjects.Object39;
import GameObjects.Object4;
import GameObjects.Object40;
import GameObjects.Object41;
import GameObjects.Object42;
import GameObjects.Object5;
import GameObjects.Object6;
import GameObjects.Object7;
import GameObjects.Object8;
import GameObjects.Object9;
import GameObjects.blackObject;
import GameObjects.blackObject10;
import GameObjects.blackObject11;
import GameObjects.blackObject12;
import GameObjects.blackObject13;
import GameObjects.blackObject14;
import GameObjects.blackObject15;
import GameObjects.blackObject16;
import GameObjects.blackObject17;
import GameObjects.blackObject18;
import GameObjects.blackObject19;
import GameObjects.blackObject2;
import GameObjects.blackObject20;
import GameObjects.blackObject21;
import GameObjects.blackObject22;
import GameObjects.blackObject23;
import GameObjects.blackObject24;
import GameObjects.blackObject25;
import GameObjects.blackObject26;
import GameObjects.blackObject27;
import GameObjects.blackObject28;
import GameObjects.blackObject29;
import GameObjects.blackObject3;
import GameObjects.blackObject30;
import GameObjects.blackObject31;
import GameObjects.blackObject32;
import GameObjects.blackObject33;
import GameObjects.blackObject34;
import GameObjects.blackObject35;
import GameObjects.blackObject36;
import GameObjects.blackObject37;
import GameObjects.blackObject38;
import GameObjects.blackObject39;
import GameObjects.blackObject4;
import GameObjects.blackObject40;
import GameObjects.blackObject41;
import GameObjects.blackObject42;
import GameObjects.blackObject5;
import GameObjects.blackObject6;
import GameObjects.blackObject7;
import GameObjects.blackObject8;
import GameObjects.blackObject9;
import framework.HUD;
import framework.Handler;
import framework.ID;
import framework.KeyInput;
import framework.Menu;
import framework.Recall;
import framework.Spawner;
import framework.Texture;

public class Game extends Canvas implements Runnable {

	private static final long serialVersionUID = -7516887150698980623L;
	private Thread thread = new Thread();
	private boolean running = false;

	private Handler handler;
	private Spawner spawner;
	private Menu menu;
	private ID id;
	private Recall recall;
	private HUD hud;
	static Texture tex;
	
	// game objects
	public Object1 object1 = new Object1(814, 770, ID.num1);
	public Object2 object2 = new Object2(370, 732, ID.num2);
	public Object3 object3 = new Object3(42, 81, ID.num3);
	public Object4 object4 = new Object4(597, 531, ID.num4);
	public Object5 object5 = new Object5(158, 50, ID.num5);
	public Object6 object6 = new Object6(649, 214, ID.num6);
	public Object7 object7 = new Object7(63, 93, ID.num7);
	public Object8 object8 = new Object8(577, 349, ID.num8);
	public Object9 object9 = new Object9(284, 482, ID.num9);
	
	/////////////////// complete creating more random areas on the screen //////////////////////////
	
	public Object10 object10 = new Object10(200, 300, ID.num10);
	public Object11 object11 = new Object11(200, 400, ID.num11);
	public Object12 object12 = new Object12(200, 500, ID.num12);
	public Object13 object13 = new Object13(200, 600, ID.num13);
	public Object14 object14 = new Object14(200, 700, ID.num14);
	public Object15 object15 = new Object15(300, 100, ID.num15);
	public Object16 object16 = new Object16(300, 200, ID.num16);
	public Object17 object17 = new Object17(300, 300, ID.num17);
	public Object18 object18 = new Object18(300, 400, ID.num18);
	public Object19 object19 = new Object19(300, 500, ID.num19);
	public Object20 object20 = new Object20(300, 600, ID.num20);
	public Object21 object21 = new Object21(300, 700, ID.num21);
	public Object22 object22 = new Object22(400, 100, ID.num22);
	public Object23 object23 = new Object23(400, 200, ID.num23);
	public Object24 object24 = new Object24(400, 300, ID.num24);
	public Object25 object25 = new Object25(400, 400, ID.num25);
	public Object26 object26 = new Object26(400, 500, ID.num26);
	public Object27 object27 = new Object27(400, 600, ID.num27);
	public Object28 object28 = new Object28(400, 700, ID.num28);
	public Object29 object29 = new Object29(500, 100, ID.num29);
	public Object30 object30 = new Object30(500, 200, ID.num30);
	public Object31 object31 = new Object31(500, 300, ID.num31);
	public Object32 object32 = new Object32(500, 400, ID.num32);
	public Object33 object33 = new Object33(500, 500, ID.num33);
	public Object34 object34 = new Object34(500, 600, ID.num34);
	public Object35 object35 = new Object35(500, 700, ID.num35);
	public Object36 object36 = new Object36(600, 100, ID.num36);
	public Object37 object37 = new Object37(600, 200, ID.num37);
	public Object38 object38 = new Object38(600, 300, ID.num38);
	public Object39 object39 = new Object39(600, 400, ID.num39);
	public Object40 object40 = new Object40(600, 500, ID.num40);
	public Object41 object41 = new Object41(600, 600, ID.num41);
	public Object42 object42 = new Object42(600, 700, ID.num42);
	
	// recall objects
	public blackObject blackObject1 = new blackObject(814, 770, ID.black_cover);
	public blackObject2 blackObject2 = new blackObject2(370, 732, ID.black_cover);
	public blackObject3 blackObject3 = new blackObject3(42, 81, ID.black_cover);
	public blackObject4 blackObject4 = new blackObject4(597, 531, ID.black_cover);
	public blackObject5 blackObject5 = new blackObject5(158, 50, ID.black_cover);
	public blackObject6 blackObject6 = new blackObject6(649, 214, ID.black_cover);
	public blackObject7 blackObject7 = new blackObject7(63, 93, ID.black_cover);
	public blackObject8 blackObject8 = new blackObject8(577, 349, ID.black_cover);
	public blackObject9 blackObject9 = new blackObject9(284, 482, ID.black_cover);
	
	////////////////////// complete creating more random areas on the screen /////////////////////////////
	
	public blackObject10 blackObject10 = new blackObject10(200, 300, ID.black_cover);
	public blackObject11 blackObject11 = new blackObject11(200, 400, ID.black_cover);
	public blackObject12 blackObject12 = new blackObject12(200, 500, ID.black_cover);
	public blackObject13 blackObject13 = new blackObject13(200, 600, ID.black_cover);
	public blackObject14 blackObject14 = new blackObject14(300, 700, ID.black_cover);
	public blackObject15 blackObject15 = new blackObject15(300, 100, ID.black_cover);
	public blackObject16 blackObject16 = new blackObject16(300, 200, ID.black_cover);
	public blackObject17 blackObject17 = new blackObject17(300, 300, ID.black_cover);
	public blackObject18 blackObject18 = new blackObject18(300, 400, ID.black_cover);
	public blackObject19 blackObject19 = new blackObject19(300, 500, ID.black_cover);
	public blackObject20 blackObject20 = new blackObject20(300, 600, ID.black_cover);
	public blackObject21 blackObject21 = new blackObject21(300, 700, ID.black_cover);
	public blackObject22 blackObject22 = new blackObject22(400, 100, ID.black_cover);
	public blackObject23 blackObject23 = new blackObject23(400, 200, ID.black_cover);
	public blackObject24 blackObject24 = new blackObject24(400, 300, ID.black_cover);
	public blackObject25 blackObject25 = new blackObject25(400, 400, ID.black_cover);
	public blackObject26 blackObject26 = new blackObject26(400, 500, ID.black_cover);
	public blackObject27 blackObject27 = new blackObject27(400, 600, ID.black_cover);
	public blackObject28 blackObject28 = new blackObject28(400, 700, ID.black_cover);
	public blackObject29 blackObject29 = new blackObject29(500, 100, ID.black_cover);
	public blackObject30 blackObject30 = new blackObject30(500, 200, ID.black_cover);
	public blackObject31 blackObject31 = new blackObject31(500, 300, ID.black_cover);
	public blackObject32 blackObject32 = new blackObject32(500, 400, ID.black_cover);
	public blackObject33 blackObject33 = new blackObject33(500, 500, ID.black_cover);
	public blackObject34 blackObject34 = new blackObject34(500, 600, ID.black_cover);
	public blackObject35 blackObject35 = new blackObject35(500, 700, ID.black_cover);
	public blackObject36 blackObject36 = new blackObject36(600, 100, ID.black_cover);
	public blackObject37 blackObject37 = new blackObject37(600, 200, ID.black_cover);
	public blackObject38 blackObject38 = new blackObject38(600, 300, ID.black_cover);
	public blackObject39 blackObject39 = new blackObject39(600, 400, ID.black_cover);
	public blackObject40 blackObject40 = new blackObject40(600, 500, ID.black_cover);
	public blackObject41 blackObject41 = new blackObject41(600, 600, ID.black_cover);
	public blackObject42 blackObject42 = new blackObject42(600, 700, ID.black_cover);

	public enum States {
		Game, Menu, Help, Recall_Test, Winner, Loser;
	}

	public States gameState = States.Menu;

	public synchronized void start() {
		if (running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}

	private void init() {
		// TODO Auto-generated method stub
		tex = new Texture();
		handler = new Handler();
		hud = new HUD();
		spawner = new Spawner(handler, this, id, hud);
		menu = new Menu(this);
		recall = new Recall(handler, this, id, hud);
		this.addMouseListener(spawner);
		this.addMouseListener(menu);
		this.addKeyListener(new KeyInput(this));
		this.addMouseListener(recall);

		// spawning objects within the Game gameState
		// corresponding to level
		if (hud.getLevel() == 1) {
			handler.addObject(object1);
			handler.addObject(object2);
			handler.addObject(object3);
		} else if (hud.getLevel() == 2) {
			handler.addObject(object1);
			handler.addObject(object2);
			handler.addObject(object3);
			handler.addObject(object4);
			handler.addObject(object5);
		} else if (hud.getLevel() == 3) {
			handler.addObject(object1);
			handler.addObject(object2);
			handler.addObject(object3);
			handler.addObject(object4);
			handler.addObject(object5);
			handler.addObject(object6);
			handler.addObject(object7);
		} else if (hud.getLevel() == 4) {
			handler.addObject(object1);
			handler.addObject(object2);
			handler.addObject(object3);
			handler.addObject(object4);
			handler.addObject(object5);
			handler.addObject(object6);
			handler.addObject(object7);
		} else if (hud.getLevel() == 5) {
			handler.addObject(object1);
			handler.addObject(object2);
			handler.addObject(object3);
			handler.addObject(object4);
			handler.addObject(object5);
			handler.addObject(object6);
			handler.addObject(object7);
			handler.addObject(object8);
			handler.addObject(object9);
		} else if (hud.getLevel() == 6) {
			handler.addObject(object1);
			handler.addObject(object2);
			handler.addObject(object3);
			handler.addObject(object4);
			handler.addObject(object5);
			handler.addObject(object6);
			handler.addObject(object7);
			handler.addObject(object8);
			handler.addObject(object9);
			handler.addObject(object10);
			handler.addObject(object11);
		} else if (hud.getLevel() == 7) {
			handler.addObject(object1);
			handler.addObject(object2);
			handler.addObject(object3);
			handler.addObject(object4);
			handler.addObject(object5);
			handler.addObject(object6);
			handler.addObject(object7);
			handler.addObject(object8);
			handler.addObject(object9);
			handler.addObject(object10);
			handler.addObject(object11);
			handler.addObject(object12);
			handler.addObject(object13);

		} else if (hud.getLevel() == 8) {
			handler.addObject(object1);
			handler.addObject(object2);
			handler.addObject(object3);
			handler.addObject(object4);
			handler.addObject(object5);
			handler.addObject(object6);
			handler.addObject(object7);
			handler.addObject(object8);
			handler.addObject(object9);
			handler.addObject(object10);
			handler.addObject(object11);
			handler.addObject(object12);
			handler.addObject(object13);
			handler.addObject(object14);
			handler.addObject(object15);
		} else if (hud.getLevel() == 9) {
			handler.addObject(object1);
			handler.addObject(object2);
			handler.addObject(object3);
			handler.addObject(object4);
			handler.addObject(object5);
			handler.addObject(object6);
			handler.addObject(object7);
			handler.addObject(object8);
			handler.addObject(object9);
			handler.addObject(object10);
			handler.addObject(object11);
			handler.addObject(object12);
			handler.addObject(object13);
			handler.addObject(object14);
			handler.addObject(object15);
			handler.addObject(object16);
			handler.addObject(object17);
		} else if (hud.getLevel() == 10) {
			handler.addObject(object1);
			handler.addObject(object2);
			handler.addObject(object3);
			handler.addObject(object4);
			handler.addObject(object5);
			handler.addObject(object6);
			handler.addObject(object7);
			handler.addObject(object8);
			handler.addObject(object9);
			handler.addObject(object10);
			handler.addObject(object11);
			handler.addObject(object12);
			handler.addObject(object13);
			handler.addObject(object14);
			handler.addObject(object15);
			handler.addObject(object16);
			handler.addObject(object17);
			handler.addObject(object18);
			handler.addObject(object19);
		} else if (hud.getLevel() == 11) {
			handler.addObject(object1);
			handler.addObject(object2);
			handler.addObject(object3);
			handler.addObject(object4);
			handler.addObject(object5);
			handler.addObject(object6);
			handler.addObject(object7);
			handler.addObject(object8);
			handler.addObject(object9);
			handler.addObject(object10);
			handler.addObject(object11);
			handler.addObject(object12);
			handler.addObject(object13);
			handler.addObject(object14);
			handler.addObject(object15);
			handler.addObject(object16);
			handler.addObject(object17);
			handler.addObject(object18);
			handler.addObject(object19);
			handler.addObject(object20);
			handler.addObject(object21);
			handler.addObject(object22);
		} else if (hud.getLevel() == 12) {
			handler.addObject(object1);
			handler.addObject(object2);
			handler.addObject(object3);
			handler.addObject(object4);
			handler.addObject(object5);
			handler.addObject(object6);
			handler.addObject(object7);
			handler.addObject(object8);
			handler.addObject(object9);
			handler.addObject(object10);
			handler.addObject(object11);
			handler.addObject(object12);
			handler.addObject(object13);
			handler.addObject(object14);
			handler.addObject(object15);
			handler.addObject(object16);
			handler.addObject(object17);
			handler.addObject(object18);
			handler.addObject(object19);
			handler.addObject(object20);
			handler.addObject(object21);
			handler.addObject(object22);
			handler.addObject(object23);
			handler.addObject(object24);
		} else if (hud.getLevel() == 13) {
			handler.addObject(object1);
			handler.addObject(object2);
			handler.addObject(object3);
			handler.addObject(object4);
			handler.addObject(object5);
			handler.addObject(object6);
			handler.addObject(object7);
			handler.addObject(object8);
			handler.addObject(object9);
			handler.addObject(object10);
			handler.addObject(object11);
			handler.addObject(object12);
			handler.addObject(object13);
			handler.addObject(object14);
			handler.addObject(object15);
			handler.addObject(object16);
			handler.addObject(object17);
			handler.addObject(object18);
			handler.addObject(object19);
			handler.addObject(object20);
			handler.addObject(object21);
			handler.addObject(object22);
			handler.addObject(object23);
			handler.addObject(object24);
			handler.addObject(object25);
			handler.addObject(object26);
		} else if (hud.getLevel() == 14) {
			handler.addObject(object1);
			handler.addObject(object2);
			handler.addObject(object3);
			handler.addObject(object4);
			handler.addObject(object5);
			handler.addObject(object6);
			handler.addObject(object7);
			handler.addObject(object8);
			handler.addObject(object9);
			handler.addObject(object10);
			handler.addObject(object11);
			handler.addObject(object12);
			handler.addObject(object13);
			handler.addObject(object14);
			handler.addObject(object15);
			handler.addObject(object16);
			handler.addObject(object17);
			handler.addObject(object18);
			handler.addObject(object19);
			handler.addObject(object20);
			handler.addObject(object21);
			handler.addObject(object22);
			handler.addObject(object23);
			handler.addObject(object24);
			handler.addObject(object25);
			handler.addObject(object26);
			handler.addObject(object27);
			handler.addObject(object28);
		} else if (hud.getLevel() == 15) {
			handler.addObject(object1);
			handler.addObject(object2);
			handler.addObject(object3);
			handler.addObject(object4);
			handler.addObject(object5);
			handler.addObject(object6);
			handler.addObject(object7);
			handler.addObject(object8);
			handler.addObject(object9);
			handler.addObject(object10);
			handler.addObject(object11);
			handler.addObject(object12);
			handler.addObject(object13);
			handler.addObject(object14);
			handler.addObject(object15);
			handler.addObject(object16);
			handler.addObject(object17);
			handler.addObject(object18);
			handler.addObject(object19);
			handler.addObject(object20);
			handler.addObject(object21);
			handler.addObject(object22);
			handler.addObject(object23);
			handler.addObject(object24);
			handler.addObject(object25);
			handler.addObject(object26);
			handler.addObject(object27);
			handler.addObject(object28);
			handler.addObject(object29);
			handler.addObject(object30);
		} else if (hud.getLevel() == 16) {
			handler.addObject(object1);
			handler.addObject(object2);
			handler.addObject(object3);
			handler.addObject(object4);
			handler.addObject(object5);
			handler.addObject(object6);
			handler.addObject(object7);
			handler.addObject(object8);
			handler.addObject(object9);
			handler.addObject(object10);
			handler.addObject(object11);
			handler.addObject(object12);
			handler.addObject(object13);
			handler.addObject(object14);
			handler.addObject(object15);
			handler.addObject(object16);
			handler.addObject(object17);
			handler.addObject(object18);
			handler.addObject(object19);
			handler.addObject(object20);
			handler.addObject(object21);
			handler.addObject(object22);
			handler.addObject(object23);
			handler.addObject(object24);
			handler.addObject(object25);
			handler.addObject(object26);
			handler.addObject(object27);
			handler.addObject(object28);
			handler.addObject(object29);
			handler.addObject(object30);
			handler.addObject(object31);
			handler.addObject(object32);
		} else if (hud.getLevel() == 17) {
			handler.addObject(object1);
			handler.addObject(object2);
			handler.addObject(object3);
			handler.addObject(object4);
			handler.addObject(object5);
			handler.addObject(object6);
			handler.addObject(object7);
			handler.addObject(object8);
			handler.addObject(object9);
			handler.addObject(object10);
			handler.addObject(object11);
			handler.addObject(object12);
			handler.addObject(object13);
			handler.addObject(object14);
			handler.addObject(object15);
			handler.addObject(object16);
			handler.addObject(object17);
			handler.addObject(object18);
			handler.addObject(object19);
			handler.addObject(object20);
			handler.addObject(object21);
			handler.addObject(object22);
			handler.addObject(object23);
			handler.addObject(object24);
			handler.addObject(object25);
			handler.addObject(object26);
			handler.addObject(object27);
			handler.addObject(object28);
			handler.addObject(object29);
			handler.addObject(object30);
			handler.addObject(object31);
			handler.addObject(object32);
			handler.addObject(object33);
			handler.addObject(object34);
		} else if (hud.getLevel() == 18) {
			handler.addObject(object1);
			handler.addObject(object2);
			handler.addObject(object3);
			handler.addObject(object4);
			handler.addObject(object5);
			handler.addObject(object6);
			handler.addObject(object7);
			handler.addObject(object8);
			handler.addObject(object9);
			handler.addObject(object10);
			handler.addObject(object11);
			handler.addObject(object12);
			handler.addObject(object13);
			handler.addObject(object14);
			handler.addObject(object15);
			handler.addObject(object16);
			handler.addObject(object17);
			handler.addObject(object18);
			handler.addObject(object19);
			handler.addObject(object20);
			handler.addObject(object21);
			handler.addObject(object22);
			handler.addObject(object23);
			handler.addObject(object24);
			handler.addObject(object25);
			handler.addObject(object26);
			handler.addObject(object27);
			handler.addObject(object28);
			handler.addObject(object29);
			handler.addObject(object30);
			handler.addObject(object31);
			handler.addObject(object32);
			handler.addObject(object33);
			handler.addObject(object34);
			handler.addObject(object35);
			handler.addObject(object36);
		} else if (hud.getLevel() == 19) {
			handler.addObject(object1);
			handler.addObject(object2);
			handler.addObject(object3);
			handler.addObject(object4);
			handler.addObject(object5);
			handler.addObject(object6);
			handler.addObject(object7);
			handler.addObject(object8);
			handler.addObject(object9);
			handler.addObject(object10);
			handler.addObject(object11);
			handler.addObject(object12);
			handler.addObject(object13);
			handler.addObject(object14);
			handler.addObject(object15);
			handler.addObject(object16);
			handler.addObject(object17);
			handler.addObject(object18);
			handler.addObject(object19);
			handler.addObject(object20);
			handler.addObject(object21);
			handler.addObject(object22);
			handler.addObject(object23);
			handler.addObject(object24);
			handler.addObject(object25);
			handler.addObject(object26);
			handler.addObject(object27);
			handler.addObject(object28);
			handler.addObject(object29);
			handler.addObject(object30);
			handler.addObject(object31);
			handler.addObject(object32);
			handler.addObject(object33);
			handler.addObject(object34);
			handler.addObject(object35);
			handler.addObject(object36);
			handler.addObject(object37);
			handler.addObject(object38);
			handler.addObject(object39);
			handler.addObject(object40);
		} else if (hud.getLevel() == 20) {
			handler.addObject(object1);
			handler.addObject(object2);
			handler.addObject(object3);
			handler.addObject(object4);
			handler.addObject(object5);
			handler.addObject(object6);
			handler.addObject(object7);
			handler.addObject(object8);
			handler.addObject(object9);
			handler.addObject(object10);
			handler.addObject(object11);
			handler.addObject(object12);
			handler.addObject(object13);
			handler.addObject(object14);
			handler.addObject(object15);
			handler.addObject(object16);
			handler.addObject(object17);
			handler.addObject(object18);
			handler.addObject(object19);
			handler.addObject(object20);
			handler.addObject(object21);
			handler.addObject(object22);
			handler.addObject(object23);
			handler.addObject(object24);
			handler.addObject(object25);
			handler.addObject(object26);
			handler.addObject(object27);
			handler.addObject(object28);
			handler.addObject(object29);
			handler.addObject(object30);
			handler.addObject(object31);
			handler.addObject(object32);
			handler.addObject(object33);
			handler.addObject(object34);
			handler.addObject(object35);
			handler.addObject(object36);
			handler.addObject(object37);
			handler.addObject(object38);
			handler.addObject(object39);
			handler.addObject(object40);
			handler.addObject(object41);
			handler.addObject(object42);
		}
	}

	@Override
	public void run() {
		// game loop that is copied and pasted from realTutsGML
		this.requestFocus();
		init();

		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int updates = 0;
		int frames = 0;
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while (delta >= 1) {
				tick();
				updates++;
				delta--;
			}
			render();
			frames++;

			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				// System.out.println("FPS: " + frames + " TICKS: " + updates);
				// System.out.println("FPS: " + frames + " Ticks" + updates);
				frames = 0;
				updates = 0;
			}
		}
	}

	public void tick() {
		if (gameState == States.Game) {
			handler.tick();
			spawner.tick();
		} else if(gameState == States.Menu){
			menu.tick();
		}
		if (gameState == States.Recall_Test || gameState == States.Winner) {
			handler.tick();
			handler.tick_recall();
			handler.tick_recall2();
			handler.tick_recall3();
			spawner.tick();
			recall.tick();
		}

	}

	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}

		Graphics g = bs.getDrawGraphics();
		// draw here
		g.setColor(Color.black);
		g.fillRect(0, 0, getWidth(), getHeight());

		if (gameState == States.Game) {
			handler.render(g);
			hud.render(g);
		} else if (gameState == States.Menu)
			menu.render(g);
		else if (gameState == States.Help)
			menu.render(g);
		else if (gameState == States.Recall_Test || gameState == States.Winner || gameState == States.Loser) {
			handler.render(g);
			handler.render_recall(g);
			handler.render_recall2(g);
			handler.render_recall3(g);
			hud.render(g);
			recall.render(g);
		}

		//
		g.dispose();
		bs.show();

	}
	
	public static Texture getInstance(){
		return tex;
	}

	public static void main(String args[]) {
		new Window(900, 800, "Memorize", new Game());
	}
}
