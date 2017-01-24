package framework;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import GameObjects.blackObject;
import GameObjects.blackObject2;
import GameObjects.blackObject3;
import window.Game;
import window.Game.States;

public class Recall extends MouseAdapter {
	Handler handler;
	Game game;
	ID id;
	HUD hud;

	public Recall(Handler handler, Game game, ID id, HUD hud) {
		this.handler = handler;
		this.game = game;
		this.id = id;
		this.hud = hud;
	}

	public void tick() {

	}

	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();

		if (game.gameState == States.Recall_Test) {
			if (hud.getLevel() == 1) { // level 1
				if (handler.recall_clicked.size() == 3) {
					// checking if the objects were clicked in the correct order
					if (handler.isSame(handler.objects_recall, handler.recall_clicked) == true) { // winner
						game.gameState = States.Winner;
						hud.setLevel(hud.getLevel() + 1);
					} else if (handler.isSame(handler.objects_recall, handler.recall_clicked) == false) // loser
						game.gameState = States.Loser;
				} else if (handler.recall_clicked.size() != 3) {
					if (mouseOver(mx, my, 814, 770, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject1);
						handler.addObject_recall_clicked2(game.object1);
					} else if (mouseOver(mx, my, 370, 732, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject2);
						handler.addObject_recall_clicked2(game.object2);
					} else if (mouseOver(mx, my, 42, 81, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject3);
						handler.addObject_recall_clicked2(game.object3);
					}
				}
			} else if (hud.getLevel() == 2) { // level 2
				if (handler.recall_clicked.size() == 5) {
					// checking if the objects were clicked in the correct order
					if (handler.isSame(handler.objects_recall, handler.recall_clicked) == true) {
						game.gameState = States.Winner;
						hud.setLevel(hud.getLevel() + 1);
					} else if (handler.isSame(handler.objects_recall, handler.recall_clicked) == false) {
						game.gameState = States.Loser;
					}
				} else if (handler.recall_clicked.size() != 5) {
					if (mouseOver(mx, my, 814, 770, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject1);
						handler.addObject_recall_clicked2(game.object1);
					} else if (mouseOver(mx, my, 370, 732, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject2);
						handler.addObject_recall_clicked2(game.object2);
					} else if (mouseOver(mx, my,42, 81, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject3);
						handler.addObject_recall_clicked2(game.object3);
					} else if (mouseOver(mx, my, 597, 531, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject4);
						handler.addObject_recall_clicked2(game.object4);
					} else if (mouseOver(mx, my, 158, 50, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject5);
						handler.addObject_recall_clicked2(game.object5);
					}
				}
			} else if (hud.getLevel() == 3) { // level 3
				if (handler.recall_clicked.size() == 7) {
					// checking if the objects were clicked in the correct order
					if (handler.isSame(handler.objects_recall, handler.recall_clicked) == true) {
						game.gameState = States.Winner;
						hud.setLevel(hud.getLevel() + 1);
					} else if (handler.isSame(handler.objects_recall, handler.recall_clicked) == false) {
						game.gameState = States.Loser;
					}
				} else if (handler.recall_clicked.size() != 7) {
					if (mouseOver(mx, my, 814, 770, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject1);
						handler.addObject_recall_clicked2(game.object1);
					} else if (mouseOver(mx, my, 370, 732, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject2);
						handler.addObject_recall_clicked2(game.object2);
					} else if (mouseOver(mx, my,42, 81, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject3);
						handler.addObject_recall_clicked2(game.object3);
					} else if (mouseOver(mx, my, 597, 531, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject4);
						handler.addObject_recall_clicked2(game.object4);
					} else if (mouseOver(mx, my, 158, 50, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject5);
						handler.addObject_recall_clicked2(game.object5);
					} else if (mouseOver(mx, my, 649, 214, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject6);
						handler.addObject_recall_clicked2(game.object6);
					} else if (mouseOver(mx, my, 63, 93, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject7);
						handler.addObject_recall_clicked2(game.object7);
					}
				}
			} else if (hud.getLevel() == 4) { // level 4
				if (handler.recall_clicked.size() == 7) {
					// checking if the objects were clicked in the correct order
					if (handler.isSame(handler.objects_recall, handler.recall_clicked) == true) {
						game.gameState = States.Winner;
						hud.setLevel(hud.getLevel() + 1);
					} else if (handler.isSame(handler.objects_recall, handler.recall_clicked) == false) {
						game.gameState = States.Loser;
					}
				} else if (handler.recall_clicked.size() != 7) {
					if (mouseOver(mx, my, 814, 770, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject1);
						handler.addObject_recall_clicked2(game.object1);
					} else if (mouseOver(mx, my, 370, 732, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject2);
						handler.addObject_recall_clicked2(game.object2);
					} else if (mouseOver(mx, my,42, 81, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject3);
						handler.addObject_recall_clicked2(game.object3);
					} else if (mouseOver(mx, my, 597, 531, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject4);
						handler.addObject_recall_clicked2(game.object4);
					} else if (mouseOver(mx, my, 158, 50, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject5);
						handler.addObject_recall_clicked2(game.object5);
					} else if (mouseOver(mx, my, 649, 214, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject6);
						handler.addObject_recall_clicked2(game.object6);
					} else if (mouseOver(mx, my, 63, 93, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject7);
						handler.addObject_recall_clicked2(game.object7);
					}
				}
			} else if (hud.getLevel() == 5) { // level 5
				if (handler.recall_clicked.size() == 9) {
					// checking if the objects were clicked in the correct order
					if (handler.isSame(handler.objects_recall, handler.recall_clicked) == true) {
						game.gameState = States.Winner;
						hud.setLevel(hud.getLevel() + 1);
					} else if (handler.isSame(handler.objects_recall, handler.recall_clicked) == false) {
						game.gameState = States.Loser;
					}
				} else if (handler.recall_clicked.size() != 9) {
					if (mouseOver(mx, my, 814, 770, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject1);
						handler.addObject_recall_clicked2(game.object1);
					} else if (mouseOver(mx, my, 370, 732, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject2);
						handler.addObject_recall_clicked2(game.object2);
					} else if (mouseOver(mx, my,42, 81, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject3);
						handler.addObject_recall_clicked2(game.object3);
					} else if (mouseOver(mx, my, 597, 531, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject4);
						handler.addObject_recall_clicked2(game.object4);
					} else if (mouseOver(mx, my, 158, 50, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject5);
						handler.addObject_recall_clicked2(game.object5);
					} else if (mouseOver(mx, my, 649, 214, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject6);
						handler.addObject_recall_clicked2(game.object6);
					} else if (mouseOver(mx, my, 63, 93, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject7);
						handler.addObject_recall_clicked2(game.object7);
					} else if (mouseOver(mx, my, 577, 349, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject8);
						handler.addObject_recall_clicked2(game.object8);
					} else if (mouseOver(mx, my, 284, 482, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject9);
						handler.addObject_recall_clicked2(game.object9);
					}
				}
			}
			
	///////////////////////////////////////////////////////////////////////////////////
			// complete the rest below. the game is not done yet !!!
			
			else if (hud.getLevel() == 6) { // level 6
				if (handler.recall_clicked.size() == 11) {
					// checking if the objects were clicked in the correct order
					if (handler.isSame(handler.objects_recall, handler.recall_clicked) == true) {
						game.gameState = States.Winner;
						hud.setLevel(hud.getLevel() + 1);
					} else if (handler.isSame(handler.objects_recall, handler.recall_clicked) == false) {
						game.gameState = States.Loser;
					}
				} else if (handler.recall_clicked.size() != 11) {
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object1);
						handler.addObject_recall_clicked2(game.blackObject1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject2);
						handler.addObject_recall_clicked2(game.blackObject2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject3);
						handler.addObject_recall_clicked2(game.blackObject3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject4);
						handler.addObject_recall_clicked2(game.blackObject4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject5);
						handler.addObject_recall_clicked2(game.blackObject5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject6);
						handler.addObject_recall_clicked2(game.blackObject6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject7);
						handler.addObject_recall_clicked2(game.blackObject7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject8);
						handler.addObject_recall_clicked2(game.blackObject8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject9);
						handler.addObject_recall_clicked2(game.blackObject9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject11);
						handler.addObject_recall_clicked2(game.blackObject10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject12);
						handler.addObject_recall_clicked2(game.blackObject11);
					}
				}
			} else if (hud.getLevel() == 7) { // level 7
				if (handler.recall_clicked.size() == 13) {
					// checking if the objects were clicked in the correct order
					if (handler.isSame(handler.objects_recall, handler.recall_clicked) == true) {
						game.gameState = States.Winner;
						hud.setLevel(hud.getLevel() + 1);
					} else if (handler.isSame(handler.objects_recall, handler.recall_clicked) == false) {
						game.gameState = States.Loser;
					}
				} else if (handler.recall_clicked.size() != 13) {
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object1);
						handler.addObject_recall_clicked2(game.blackObject1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject2);
						handler.addObject_recall_clicked2(game.blackObject2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject3);
						handler.addObject_recall_clicked2(game.blackObject3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject4);
						handler.addObject_recall_clicked2(game.blackObject4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject5);
						handler.addObject_recall_clicked2(game.blackObject5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject6);
						handler.addObject_recall_clicked2(game.blackObject6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject7);
						handler.addObject_recall_clicked2(game.blackObject7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject8);
						handler.addObject_recall_clicked2(game.blackObject8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject9);
						handler.addObject_recall_clicked2(game.blackObject9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject11);
						handler.addObject_recall_clicked2(game.blackObject10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject12);
						handler.addObject_recall_clicked2(game.blackObject11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject13);
						handler.addObject_recall_clicked2(game.blackObject12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject14);
						handler.addObject_recall_clicked2(game.blackObject13);
					}
				}
			} else if (hud.getLevel() == 8) { // level 8
				if (handler.recall_clicked.size() == 15) {
					// checking if the objects were clicked in the correct order
					if (handler.isSame(handler.objects_recall, handler.recall_clicked) == true) {
						game.gameState = States.Winner;
						hud.setLevel(hud.getLevel() + 1);
					} else if (handler.isSame(handler.objects_recall, handler.recall_clicked) == false) {
						game.gameState = States.Loser;
					}
				} else if (handler.recall_clicked.size() != 15) {
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object1);
						handler.addObject_recall_clicked2(game.blackObject1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject2);
						handler.addObject_recall_clicked2(game.blackObject2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject3);
						handler.addObject_recall_clicked2(game.blackObject3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject4);
						handler.addObject_recall_clicked2(game.blackObject4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject5);
						handler.addObject_recall_clicked2(game.blackObject5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject6);
						handler.addObject_recall_clicked2(game.blackObject6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject7);
						handler.addObject_recall_clicked2(game.blackObject7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject8);
						handler.addObject_recall_clicked2(game.blackObject8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject9);
						handler.addObject_recall_clicked2(game.blackObject9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject11);
						handler.addObject_recall_clicked2(game.blackObject10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject12);
						handler.addObject_recall_clicked2(game.blackObject11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject13);
						handler.addObject_recall_clicked2(game.blackObject12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject14);
						handler.addObject_recall_clicked2(game.blackObject13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object14);
						handler.addObject_recall_clicked2(game.blackObject14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object15);
						handler.addObject_recall_clicked2(game.blackObject15);
					}
				}
			} else if (hud.getLevel() == 9) { // level 9
				if (handler.recall_clicked.size() == 17) {
					// checking if the objects were clicked in the correct order
					if (handler.isSame(handler.objects_recall, handler.recall_clicked) == true) {
						game.gameState = States.Winner;
						hud.setLevel(hud.getLevel() + 1);
					} else if (handler.isSame(handler.objects_recall, handler.recall_clicked) == false) {
						game.gameState = States.Loser;
					}
				} else if (handler.recall_clicked.size() != 17) {
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object1);
						handler.addObject_recall_clicked2(game.blackObject1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject2);
						handler.addObject_recall_clicked2(game.blackObject2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject3);
						handler.addObject_recall_clicked2(game.blackObject3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject4);
						handler.addObject_recall_clicked2(game.blackObject4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject5);
						handler.addObject_recall_clicked2(game.blackObject5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject6);
						handler.addObject_recall_clicked2(game.blackObject6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject7);
						handler.addObject_recall_clicked2(game.blackObject7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject8);
						handler.addObject_recall_clicked2(game.blackObject8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject9);
						handler.addObject_recall_clicked2(game.blackObject9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject11);
						handler.addObject_recall_clicked2(game.blackObject10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject12);
						handler.addObject_recall_clicked2(game.blackObject11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject13);
						handler.addObject_recall_clicked2(game.blackObject12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject14);
						handler.addObject_recall_clicked2(game.blackObject13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object14);
						handler.addObject_recall_clicked2(game.blackObject14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object15);
						handler.addObject_recall_clicked2(game.blackObject15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object16);
						handler.addObject_recall_clicked2(game.blackObject16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object17);
						handler.addObject_recall_clicked2(game.blackObject17);
					}
				}
			} else if (hud.getLevel() == 10) { // level 10
				if (handler.recall_clicked.size() == 19) {
					// checking if the objects were clicked in the correct order
					if (handler.isSame(handler.objects_recall, handler.recall_clicked) == true) {
						game.gameState = States.Winner;
						hud.setLevel(hud.getLevel() + 1);
					} else if (handler.isSame(handler.objects_recall, handler.recall_clicked) == false) {
						game.gameState = States.Loser;
					}
				} else if (handler.recall_clicked.size() != 19) {
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object1);
						handler.addObject_recall_clicked2(game.blackObject1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject2);
						handler.addObject_recall_clicked2(game.blackObject2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject3);
						handler.addObject_recall_clicked2(game.blackObject3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject4);
						handler.addObject_recall_clicked2(game.blackObject4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject5);
						handler.addObject_recall_clicked2(game.blackObject5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject6);
						handler.addObject_recall_clicked2(game.blackObject6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject7);
						handler.addObject_recall_clicked2(game.blackObject7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject8);
						handler.addObject_recall_clicked2(game.blackObject8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject9);
						handler.addObject_recall_clicked2(game.blackObject9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject11);
						handler.addObject_recall_clicked2(game.blackObject10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject12);
						handler.addObject_recall_clicked2(game.blackObject11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject13);
						handler.addObject_recall_clicked2(game.blackObject12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject14);
						handler.addObject_recall_clicked2(game.blackObject13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object14);
						handler.addObject_recall_clicked2(game.blackObject14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object15);
						handler.addObject_recall_clicked2(game.blackObject15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object16);
						handler.addObject_recall_clicked2(game.blackObject16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object17);
						handler.addObject_recall_clicked2(game.blackObject17);
					} else if (mouseOver(mx, my, 300, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object18);
						handler.addObject_recall_clicked2(game.blackObject18);
					} else if (mouseOver(mx, my, 300, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object19);
						handler.addObject_recall_clicked2(game.blackObject19);
					}
				}
			} else if (hud.getLevel() == 11) { // level 11
				if (handler.recall_clicked.size() == 22) {
					// checking if the objects were clicked in the correct order
					if (handler.isSame(handler.objects_recall, handler.recall_clicked) == true) {
						game.gameState = States.Winner;
						hud.setLevel(hud.getLevel() + 1);
					} else if (handler.isSame(handler.objects_recall, handler.recall_clicked) == false) {
						game.gameState = States.Loser;
					}
				} else if (handler.recall_clicked.size() != 22) {
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object1);
						handler.addObject_recall_clicked2(game.blackObject1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject2);
						handler.addObject_recall_clicked2(game.blackObject2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject3);
						handler.addObject_recall_clicked2(game.blackObject3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject4);
						handler.addObject_recall_clicked2(game.blackObject4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject5);
						handler.addObject_recall_clicked2(game.blackObject5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject6);
						handler.addObject_recall_clicked2(game.blackObject6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject7);
						handler.addObject_recall_clicked2(game.blackObject7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject8);
						handler.addObject_recall_clicked2(game.blackObject8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject9);
						handler.addObject_recall_clicked2(game.blackObject9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject11);
						handler.addObject_recall_clicked2(game.blackObject10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject12);
						handler.addObject_recall_clicked2(game.blackObject11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject13);
						handler.addObject_recall_clicked2(game.blackObject12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject14);
						handler.addObject_recall_clicked2(game.blackObject13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object14);
						handler.addObject_recall_clicked2(game.blackObject14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object15);
						handler.addObject_recall_clicked2(game.blackObject15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object16);
						handler.addObject_recall_clicked2(game.blackObject16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object17);
						handler.addObject_recall_clicked2(game.blackObject17);
					} else if (mouseOver(mx, my, 300, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object18);
						handler.addObject_recall_clicked2(game.blackObject18);
					} else if (mouseOver(mx, my, 300, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object19);
						handler.addObject_recall_clicked2(game.blackObject19);
					} else if (mouseOver(mx, my, 300, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object20);
						handler.addObject_recall_clicked2(game.blackObject20);
					} else if (mouseOver(mx, my, 300, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object21);
						handler.addObject_recall_clicked2(game.blackObject21);
					} else if (mouseOver(mx, my, 400, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object22);
						handler.addObject_recall_clicked2(game.blackObject22);
					}
				}
			} else if (hud.getLevel() == 12) { // level 12
				if (handler.recall_clicked.size() == 24) {
					// checking if the objects were clicked in the correct order
					if (handler.isSame(handler.objects_recall, handler.recall_clicked) == true) {
						game.gameState = States.Winner;
						hud.setLevel(hud.getLevel() + 1);
					} else if (handler.isSame(handler.objects_recall, handler.recall_clicked) == false) {
						game.gameState = States.Loser;
					}
				} else if (handler.recall_clicked.size() != 24) {
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object1);
						handler.addObject_recall_clicked2(game.blackObject1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject2);
						handler.addObject_recall_clicked2(game.blackObject2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject3);
						handler.addObject_recall_clicked2(game.blackObject3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject4);
						handler.addObject_recall_clicked2(game.blackObject4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject5);
						handler.addObject_recall_clicked2(game.blackObject5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject6);
						handler.addObject_recall_clicked2(game.blackObject6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject7);
						handler.addObject_recall_clicked2(game.blackObject7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject8);
						handler.addObject_recall_clicked2(game.blackObject8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject9);
						handler.addObject_recall_clicked2(game.blackObject9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject11);
						handler.addObject_recall_clicked2(game.blackObject10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject12);
						handler.addObject_recall_clicked2(game.blackObject11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject13);
						handler.addObject_recall_clicked2(game.blackObject12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject14);
						handler.addObject_recall_clicked2(game.blackObject13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object14);
						handler.addObject_recall_clicked2(game.blackObject14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object15);
						handler.addObject_recall_clicked2(game.blackObject15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object16);
						handler.addObject_recall_clicked2(game.blackObject16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object17);
						handler.addObject_recall_clicked2(game.blackObject17);
					} else if (mouseOver(mx, my, 300, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object18);
						handler.addObject_recall_clicked2(game.blackObject18);
					} else if (mouseOver(mx, my, 300, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object19);
						handler.addObject_recall_clicked2(game.blackObject19);
					} else if (mouseOver(mx, my, 300, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object20);
						handler.addObject_recall_clicked2(game.blackObject20);
					} else if (mouseOver(mx, my, 300, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object21);
						handler.addObject_recall_clicked2(game.blackObject21);
					} else if (mouseOver(mx, my, 400, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object22);
						handler.addObject_recall_clicked2(game.blackObject22);
					} else if (mouseOver(mx, my, 400, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object23);
						handler.addObject_recall_clicked2(game.blackObject23);
					} else if (mouseOver(mx, my, 400, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object24);
						handler.addObject_recall_clicked2(game.blackObject24);
					}
				}
			} else if (hud.getLevel() == 13) { // level 13
				if (handler.recall_clicked.size() == 26) {
					// checking if the objects were clicked in the correct order
					if (handler.isSame(handler.objects_recall, handler.recall_clicked) == true) {
						game.gameState = States.Winner;
						hud.setLevel(hud.getLevel() + 1);
					} else if (handler.isSame(handler.objects_recall, handler.recall_clicked) == false) {
						game.gameState = States.Loser;
					}
				} else if (handler.recall_clicked.size() != 26) {
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object1);
						handler.addObject_recall_clicked2(game.blackObject1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject2);
						handler.addObject_recall_clicked2(game.blackObject2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject3);
						handler.addObject_recall_clicked2(game.blackObject3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject4);
						handler.addObject_recall_clicked2(game.blackObject4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject5);
						handler.addObject_recall_clicked2(game.blackObject5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject6);
						handler.addObject_recall_clicked2(game.blackObject6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject7);
						handler.addObject_recall_clicked2(game.blackObject7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject8);
						handler.addObject_recall_clicked2(game.blackObject8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject9);
						handler.addObject_recall_clicked2(game.blackObject9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject11);
						handler.addObject_recall_clicked2(game.blackObject10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject12);
						handler.addObject_recall_clicked2(game.blackObject11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject13);
						handler.addObject_recall_clicked2(game.blackObject12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject14);
						handler.addObject_recall_clicked2(game.blackObject13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object14);
						handler.addObject_recall_clicked2(game.blackObject14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object15);
						handler.addObject_recall_clicked2(game.blackObject15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object16);
						handler.addObject_recall_clicked2(game.blackObject16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object17);
						handler.addObject_recall_clicked2(game.blackObject17);
					} else if (mouseOver(mx, my, 300, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object18);
						handler.addObject_recall_clicked2(game.blackObject18);
					} else if (mouseOver(mx, my, 300, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object19);
						handler.addObject_recall_clicked2(game.blackObject19);
					} else if (mouseOver(mx, my, 300, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object20);
						handler.addObject_recall_clicked2(game.blackObject20);
					} else if (mouseOver(mx, my, 300, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object21);
						handler.addObject_recall_clicked2(game.blackObject21);
					} else if (mouseOver(mx, my, 400, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object22);
						handler.addObject_recall_clicked2(game.blackObject22);
					} else if (mouseOver(mx, my, 400, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object23);
						handler.addObject_recall_clicked2(game.blackObject23);
					} else if (mouseOver(mx, my, 400, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object24);
						handler.addObject_recall_clicked2(game.blackObject24);
					} else if (mouseOver(mx, my, 400, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object25);
						handler.addObject_recall_clicked2(game.blackObject25);
					} else if (mouseOver(mx, my, 400, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object26);
						handler.addObject_recall_clicked2(game.blackObject26);
					}
				}
			} else if (hud.getLevel() == 14) { // level 14
				if (handler.recall_clicked.size() == 28) {
					// checking if the objects were clicked in the correct order
					if (handler.isSame(handler.objects_recall, handler.recall_clicked) == true) {
						game.gameState = States.Winner;
						hud.setLevel(hud.getLevel() + 1);
					} else if (handler.isSame(handler.objects_recall, handler.recall_clicked) == false) {
						game.gameState = States.Loser;
					}
				} else if (handler.recall_clicked.size() != 28) {
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object1);
						handler.addObject_recall_clicked2(game.blackObject1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject2);
						handler.addObject_recall_clicked2(game.blackObject2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject3);
						handler.addObject_recall_clicked2(game.blackObject3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject4);
						handler.addObject_recall_clicked2(game.blackObject4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject5);
						handler.addObject_recall_clicked2(game.blackObject5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject6);
						handler.addObject_recall_clicked2(game.blackObject6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject7);
						handler.addObject_recall_clicked2(game.blackObject7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject8);
						handler.addObject_recall_clicked2(game.blackObject8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject9);
						handler.addObject_recall_clicked2(game.blackObject9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject11);
						handler.addObject_recall_clicked2(game.blackObject10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject12);
						handler.addObject_recall_clicked2(game.blackObject11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject13);
						handler.addObject_recall_clicked2(game.blackObject12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject14);
						handler.addObject_recall_clicked2(game.blackObject13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object14);
						handler.addObject_recall_clicked2(game.blackObject14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object15);
						handler.addObject_recall_clicked2(game.blackObject15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object16);
						handler.addObject_recall_clicked2(game.blackObject16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object17);
						handler.addObject_recall_clicked2(game.blackObject17);
					} else if (mouseOver(mx, my, 300, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object18);
						handler.addObject_recall_clicked2(game.blackObject18);
					} else if (mouseOver(mx, my, 300, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object19);
						handler.addObject_recall_clicked2(game.blackObject19);
					} else if (mouseOver(mx, my, 300, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object20);
						handler.addObject_recall_clicked2(game.blackObject20);
					} else if (mouseOver(mx, my, 300, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object21);
						handler.addObject_recall_clicked2(game.blackObject21);
					} else if (mouseOver(mx, my, 400, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object22);
						handler.addObject_recall_clicked2(game.blackObject22);
					} else if (mouseOver(mx, my, 400, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object23);
						handler.addObject_recall_clicked2(game.blackObject23);
					} else if (mouseOver(mx, my, 400, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object24);
						handler.addObject_recall_clicked2(game.blackObject24);
					} else if (mouseOver(mx, my, 400, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object25);
						handler.addObject_recall_clicked2(game.blackObject25);
					} else if (mouseOver(mx, my, 400, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object26);
						handler.addObject_recall_clicked2(game.blackObject26);
					} else if (mouseOver(mx, my, 400, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object27);
						handler.addObject_recall_clicked2(game.blackObject27);
					} else if (mouseOver(mx, my, 400, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object28);
						handler.addObject_recall_clicked2(game.blackObject28);
					}
				}
			} else if (hud.getLevel() == 15) { // level 15
				if (handler.recall_clicked.size() == 30) {
					// checking if the objects were clicked in the correct order
					if (handler.isSame(handler.objects_recall, handler.recall_clicked) == true) {
						game.gameState = States.Winner;
						hud.setLevel(hud.getLevel() + 1);
					} else if (handler.isSame(handler.objects_recall, handler.recall_clicked) == false) {
						game.gameState = States.Loser;
					}
				} else if (handler.recall_clicked.size() != 30) {
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object1);
						handler.addObject_recall_clicked2(game.blackObject1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject2);
						handler.addObject_recall_clicked2(game.blackObject2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject3);
						handler.addObject_recall_clicked2(game.blackObject3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject4);
						handler.addObject_recall_clicked2(game.blackObject4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject5);
						handler.addObject_recall_clicked2(game.blackObject5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject6);
						handler.addObject_recall_clicked2(game.blackObject6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject7);
						handler.addObject_recall_clicked2(game.blackObject7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject8);
						handler.addObject_recall_clicked2(game.blackObject8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject9);
						handler.addObject_recall_clicked2(game.blackObject9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject11);
						handler.addObject_recall_clicked2(game.blackObject10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject12);
						handler.addObject_recall_clicked2(game.blackObject11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject13);
						handler.addObject_recall_clicked2(game.blackObject12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject14);
						handler.addObject_recall_clicked2(game.blackObject13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object14);
						handler.addObject_recall_clicked2(game.blackObject14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object15);
						handler.addObject_recall_clicked2(game.blackObject15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object16);
						handler.addObject_recall_clicked2(game.blackObject16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object17);
						handler.addObject_recall_clicked2(game.blackObject17);
					} else if (mouseOver(mx, my, 300, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object18);
						handler.addObject_recall_clicked2(game.blackObject18);
					} else if (mouseOver(mx, my, 300, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object19);
						handler.addObject_recall_clicked2(game.blackObject19);
					} else if (mouseOver(mx, my, 300, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object20);
						handler.addObject_recall_clicked2(game.blackObject20);
					} else if (mouseOver(mx, my, 300, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object21);
						handler.addObject_recall_clicked2(game.blackObject21);
					} else if (mouseOver(mx, my, 400, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object22);
						handler.addObject_recall_clicked2(game.blackObject22);
					} else if (mouseOver(mx, my, 400, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object23);
						handler.addObject_recall_clicked2(game.blackObject23);
					} else if (mouseOver(mx, my, 400, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object24);
						handler.addObject_recall_clicked2(game.blackObject24);
					} else if (mouseOver(mx, my, 400, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object25);
						handler.addObject_recall_clicked2(game.blackObject25);
					} else if (mouseOver(mx, my, 400, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object26);
						handler.addObject_recall_clicked2(game.blackObject26);
					} else if (mouseOver(mx, my, 400, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object27);
						handler.addObject_recall_clicked2(game.blackObject27);
					} else if (mouseOver(mx, my, 400, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object28);
						handler.addObject_recall_clicked2(game.blackObject28);
					} else if (mouseOver(mx, my, 500, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object27);
						handler.addObject_recall_clicked2(game.blackObject29);
					} else if (mouseOver(mx, my, 500, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object28);
						handler.addObject_recall_clicked2(game.blackObject30);
					}
				}
			} else if (hud.getLevel() == 16) { // level 16
				if (handler.recall_clicked.size() == 32) {
					// checking if the objects were clicked in the correct order
					if (handler.isSame(handler.objects_recall, handler.recall_clicked) == true) {
						game.gameState = States.Winner;
						hud.setLevel(hud.getLevel() + 1);
					} else if (handler.isSame(handler.objects_recall, handler.recall_clicked) == false) {
						game.gameState = States.Loser;
					}
				} else if (handler.recall_clicked.size() != 32) {
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object1);
						handler.addObject_recall_clicked2(game.blackObject1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject2);
						handler.addObject_recall_clicked2(game.blackObject2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject3);
						handler.addObject_recall_clicked2(game.blackObject3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject4);
						handler.addObject_recall_clicked2(game.blackObject4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject5);
						handler.addObject_recall_clicked2(game.blackObject5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject6);
						handler.addObject_recall_clicked2(game.blackObject6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject7);
						handler.addObject_recall_clicked2(game.blackObject7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject8);
						handler.addObject_recall_clicked2(game.blackObject8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject9);
						handler.addObject_recall_clicked2(game.blackObject9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject11);
						handler.addObject_recall_clicked2(game.blackObject10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject12);
						handler.addObject_recall_clicked2(game.blackObject11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject13);
						handler.addObject_recall_clicked2(game.blackObject12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject14);
						handler.addObject_recall_clicked2(game.blackObject13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object14);
						handler.addObject_recall_clicked2(game.blackObject14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object15);
						handler.addObject_recall_clicked2(game.blackObject15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object16);
						handler.addObject_recall_clicked2(game.blackObject16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object17);
						handler.addObject_recall_clicked2(game.blackObject17);
					} else if (mouseOver(mx, my, 300, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object18);
						handler.addObject_recall_clicked2(game.blackObject18);
					} else if (mouseOver(mx, my, 300, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object19);
						handler.addObject_recall_clicked2(game.blackObject19);
					} else if (mouseOver(mx, my, 300, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object20);
						handler.addObject_recall_clicked2(game.blackObject20);
					} else if (mouseOver(mx, my, 300, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object21);
						handler.addObject_recall_clicked2(game.blackObject21);
					} else if (mouseOver(mx, my, 400, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object22);
						handler.addObject_recall_clicked2(game.blackObject22);
					} else if (mouseOver(mx, my, 400, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object23);
						handler.addObject_recall_clicked2(game.blackObject23);
					} else if (mouseOver(mx, my, 400, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object24);
						handler.addObject_recall_clicked2(game.blackObject24);
					} else if (mouseOver(mx, my, 400, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object25);
						handler.addObject_recall_clicked2(game.blackObject25);
					} else if (mouseOver(mx, my, 400, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object26);
						handler.addObject_recall_clicked2(game.blackObject26);
					} else if (mouseOver(mx, my, 400, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object27);
						handler.addObject_recall_clicked2(game.blackObject27);
					} else if (mouseOver(mx, my, 400, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object28);
						handler.addObject_recall_clicked2(game.blackObject28);
					} else if (mouseOver(mx, my, 500, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object27);
						handler.addObject_recall_clicked2(game.blackObject29);
					} else if (mouseOver(mx, my, 500, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object28);
						handler.addObject_recall_clicked2(game.blackObject30);
					} else if (mouseOver(mx, my, 500, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object31);
						handler.addObject_recall_clicked2(game.blackObject31);
					} else if (mouseOver(mx, my, 500, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object32);
						handler.addObject_recall_clicked2(game.blackObject32);
					}
				}
			} else if (hud.getLevel() == 17) { // level 17
				if (handler.recall_clicked.size() == 34) {
					// checking if the objects were clicked in the correct order
					if (handler.isSame(handler.objects_recall, handler.recall_clicked) == true) {
						game.gameState = States.Winner;
						hud.setLevel(hud.getLevel() + 1);
					} else if (handler.isSame(handler.objects_recall, handler.recall_clicked) == false) {
						game.gameState = States.Loser;
					}
				} else if (handler.recall_clicked.size() != 34) {
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object1);
						handler.addObject_recall_clicked2(game.blackObject1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject2);
						handler.addObject_recall_clicked2(game.blackObject2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject3);
						handler.addObject_recall_clicked2(game.blackObject3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject4);
						handler.addObject_recall_clicked2(game.blackObject4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject5);
						handler.addObject_recall_clicked2(game.blackObject5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject6);
						handler.addObject_recall_clicked2(game.blackObject6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject7);
						handler.addObject_recall_clicked2(game.blackObject7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject8);
						handler.addObject_recall_clicked2(game.blackObject8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject9);
						handler.addObject_recall_clicked2(game.blackObject9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject11);
						handler.addObject_recall_clicked2(game.blackObject10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject12);
						handler.addObject_recall_clicked2(game.blackObject11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject13);
						handler.addObject_recall_clicked2(game.blackObject12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object13);
						handler.addObject_recall_clicked2(game.blackObject13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object14);
						handler.addObject_recall_clicked2(game.blackObject14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object15);
						handler.addObject_recall_clicked2(game.blackObject15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object16);
						handler.addObject_recall_clicked2(game.blackObject16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object17);
						handler.addObject_recall_clicked2(game.blackObject17);
					} else if (mouseOver(mx, my, 300, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object18);
						handler.addObject_recall_clicked2(game.blackObject18);
					} else if (mouseOver(mx, my, 300, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object19);
						handler.addObject_recall_clicked2(game.blackObject19);
					} else if (mouseOver(mx, my, 300, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object20);
						handler.addObject_recall_clicked2(game.blackObject20);
					} else if (mouseOver(mx, my, 300, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object21);
						handler.addObject_recall_clicked2(game.blackObject21);
					} else if (mouseOver(mx, my, 400, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object22);
						handler.addObject_recall_clicked2(game.blackObject22);
					} else if (mouseOver(mx, my, 400, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object23);
						handler.addObject_recall_clicked2(game.blackObject23);
					} else if (mouseOver(mx, my, 400, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object24);
						handler.addObject_recall_clicked2(game.blackObject24);
					} else if (mouseOver(mx, my, 400, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object25);
						handler.addObject_recall_clicked2(game.blackObject25);
					} else if (mouseOver(mx, my, 400, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object26);
						handler.addObject_recall_clicked2(game.blackObject26);
					} else if (mouseOver(mx, my, 400, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object27);
						handler.addObject_recall_clicked2(game.blackObject27);
					} else if (mouseOver(mx, my, 400, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object28);
						handler.addObject_recall_clicked2(game.blackObject28);
					} else if (mouseOver(mx, my, 500, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object27);
						handler.addObject_recall_clicked2(game.blackObject29);
					} else if (mouseOver(mx, my, 500, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object28);
						handler.addObject_recall_clicked2(game.blackObject30);
					} else if (mouseOver(mx, my, 500, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object31);
						handler.addObject_recall_clicked2(game.blackObject31);
					} else if (mouseOver(mx, my, 500, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object32);
						handler.addObject_recall_clicked2(game.blackObject32);
					} else if (mouseOver(mx, my, 500, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object33);
						handler.addObject_recall_clicked2(game.blackObject33);
					} else if (mouseOver(mx, my, 500, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object34);
						handler.addObject_recall_clicked2(game.blackObject34);
					}
				}
			} else if (hud.getLevel() == 18) { // level 18
				if (handler.recall_clicked.size() == 36) {
					// checking if the objects were clicked in the correct order
					if (handler.isSame(handler.objects_recall, handler.recall_clicked) == true) {
						game.gameState = States.Winner;
						hud.setLevel(hud.getLevel() + 1);
					} else if (handler.isSame(handler.objects_recall, handler.recall_clicked) == false) {
						game.gameState = States.Loser;
					}
				} else if (handler.recall_clicked.size() != 36) {
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object1);
						handler.addObject_recall_clicked2(game.blackObject1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject2);
						handler.addObject_recall_clicked2(game.blackObject2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject3);
						handler.addObject_recall_clicked2(game.blackObject3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject4);
						handler.addObject_recall_clicked2(game.blackObject4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject5);
						handler.addObject_recall_clicked2(game.blackObject5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject6);
						handler.addObject_recall_clicked2(game.blackObject6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject7);
						handler.addObject_recall_clicked2(game.blackObject7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject8);
						handler.addObject_recall_clicked2(game.blackObject8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject9);
						handler.addObject_recall_clicked2(game.blackObject9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject11);
						handler.addObject_recall_clicked2(game.blackObject10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject12);
						handler.addObject_recall_clicked2(game.blackObject11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject13);
						handler.addObject_recall_clicked2(game.blackObject12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object13);
						handler.addObject_recall_clicked2(game.blackObject13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object14);
						handler.addObject_recall_clicked2(game.blackObject14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object15);
						handler.addObject_recall_clicked2(game.blackObject15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object16);
						handler.addObject_recall_clicked2(game.blackObject16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object17);
						handler.addObject_recall_clicked2(game.blackObject17);
					} else if (mouseOver(mx, my, 300, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object18);
						handler.addObject_recall_clicked2(game.blackObject18);
					} else if (mouseOver(mx, my, 300, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object19);
						handler.addObject_recall_clicked2(game.blackObject19);
					} else if (mouseOver(mx, my, 300, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object20);
						handler.addObject_recall_clicked2(game.blackObject20);
					} else if (mouseOver(mx, my, 300, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object21);
						handler.addObject_recall_clicked2(game.blackObject21);
					} else if (mouseOver(mx, my, 400, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object22);
						handler.addObject_recall_clicked2(game.blackObject22);
					} else if (mouseOver(mx, my, 400, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object23);
						handler.addObject_recall_clicked2(game.blackObject23);
					} else if (mouseOver(mx, my, 400, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object24);
						handler.addObject_recall_clicked2(game.blackObject24);
					} else if (mouseOver(mx, my, 400, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object25);
						handler.addObject_recall_clicked2(game.blackObject25);
					} else if (mouseOver(mx, my, 400, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object26);
						handler.addObject_recall_clicked2(game.blackObject26);
					} else if (mouseOver(mx, my, 400, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object27);
						handler.addObject_recall_clicked2(game.blackObject27);
					} else if (mouseOver(mx, my, 400, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object28);
						handler.addObject_recall_clicked2(game.blackObject28);
					} else if (mouseOver(mx, my, 500, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object27);
						handler.addObject_recall_clicked2(game.blackObject29);
					} else if (mouseOver(mx, my, 500, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object28);
						handler.addObject_recall_clicked2(game.blackObject30);
					} else if (mouseOver(mx, my, 500, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object31);
						handler.addObject_recall_clicked2(game.blackObject31);
					} else if (mouseOver(mx, my, 500, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object32);
						handler.addObject_recall_clicked2(game.blackObject32);
					} else if (mouseOver(mx, my, 500, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object33);
						handler.addObject_recall_clicked2(game.blackObject33);
					} else if (mouseOver(mx, my, 500, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object34);
						handler.addObject_recall_clicked2(game.blackObject34);
					} else if (mouseOver(mx, my, 500, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object35);
						handler.addObject_recall_clicked2(game.blackObject35);
					} else if (mouseOver(mx, my, 600, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object36);
						handler.addObject_recall_clicked2(game.blackObject36);
					}
				}
			} else if (hud.getLevel() == 19) { // level 19
				if (handler.recall_clicked.size() == 40) {
					// checking if the objects were clicked in the correct order
					if (handler.isSame(handler.objects_recall, handler.recall_clicked) == true) {
						game.gameState = States.Winner;
						hud.setLevel(hud.getLevel() + 1);
					} else if (handler.isSame(handler.objects_recall, handler.recall_clicked) == false) {
						game.gameState = States.Loser;
					}
				} else if (handler.recall_clicked.size() != 40) {
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object1);
						handler.addObject_recall_clicked2(game.blackObject1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject2);
						handler.addObject_recall_clicked2(game.blackObject2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject3);
						handler.addObject_recall_clicked2(game.blackObject3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject4);
						handler.addObject_recall_clicked2(game.blackObject4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject5);
						handler.addObject_recall_clicked2(game.blackObject5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject6);
						handler.addObject_recall_clicked2(game.blackObject6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject7);
						handler.addObject_recall_clicked2(game.blackObject7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject8);
						handler.addObject_recall_clicked2(game.blackObject8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject9);
						handler.addObject_recall_clicked2(game.blackObject9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject10);
						handler.addObject_recall_clicked2(game.blackObject10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject11);
						handler.addObject_recall_clicked2(game.blackObject11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject12);
						handler.addObject_recall_clicked2(game.blackObject12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object13);
						handler.addObject_recall_clicked2(game.blackObject13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object14);
						handler.addObject_recall_clicked2(game.blackObject14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object15);
						handler.addObject_recall_clicked2(game.blackObject15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object16);
						handler.addObject_recall_clicked2(game.blackObject16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object17);
						handler.addObject_recall_clicked2(game.blackObject17);
					} else if (mouseOver(mx, my, 300, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object18);
						handler.addObject_recall_clicked2(game.blackObject18);
					} else if (mouseOver(mx, my, 300, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object19);
						handler.addObject_recall_clicked2(game.blackObject19);
					} else if (mouseOver(mx, my, 300, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object20);
						handler.addObject_recall_clicked2(game.blackObject20);
					} else if (mouseOver(mx, my, 300, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object21);
						handler.addObject_recall_clicked2(game.blackObject21);
					} else if (mouseOver(mx, my, 400, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object22);
						handler.addObject_recall_clicked2(game.blackObject22);
					} else if (mouseOver(mx, my, 400, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object23);
						handler.addObject_recall_clicked2(game.blackObject23);
					} else if (mouseOver(mx, my, 400, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object24);
						handler.addObject_recall_clicked2(game.blackObject24);
					} else if (mouseOver(mx, my, 400, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object25);
						handler.addObject_recall_clicked2(game.blackObject25);
					} else if (mouseOver(mx, my, 400, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object26);
						handler.addObject_recall_clicked2(game.blackObject26);
					} else if (mouseOver(mx, my, 400, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object27);
						handler.addObject_recall_clicked2(game.blackObject27);
					} else if (mouseOver(mx, my, 400, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object28);
						handler.addObject_recall_clicked2(game.blackObject28);
					} else if (mouseOver(mx, my, 500, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object27);
						handler.addObject_recall_clicked2(game.blackObject29);
					} else if (mouseOver(mx, my, 500, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object28);
						handler.addObject_recall_clicked2(game.blackObject30);
					} else if (mouseOver(mx, my, 500, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object31);
						handler.addObject_recall_clicked2(game.blackObject31);
					} else if (mouseOver(mx, my, 500, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object32);
						handler.addObject_recall_clicked2(game.blackObject32);
					} else if (mouseOver(mx, my, 500, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object33);
						handler.addObject_recall_clicked2(game.blackObject33);
					} else if (mouseOver(mx, my, 500, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object34);
						handler.addObject_recall_clicked2(game.blackObject34);
					} else if (mouseOver(mx, my, 500, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object35);
						handler.addObject_recall_clicked2(game.blackObject35);
					} else if (mouseOver(mx, my, 600, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object36);
						handler.addObject_recall_clicked2(game.blackObject36);
					} else if (mouseOver(mx, my, 600, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object37);
						handler.addObject_recall_clicked2(game.blackObject37);
					} else if (mouseOver(mx, my, 600, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object38);
						handler.addObject_recall_clicked2(game.blackObject38);
					} else if (mouseOver(mx, my, 600, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object39);
						handler.addObject_recall_clicked2(game.blackObject39);
					} else if (mouseOver(mx, my, 600, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object40);
						handler.addObject_recall_clicked2(game.blackObject40);
					}
				}
			} else if (hud.getLevel() == 20) { // level 20
				if (handler.recall_clicked.size() == 42) {
					// checking if the objects were clicked in the correct order
					if (handler.isSame(handler.objects_recall, handler.recall_clicked) == true) {
						game.gameState = States.Winner;
						hud.setLevel(hud.getLevel() + 1);
					} else if (handler.isSame(handler.objects_recall, handler.recall_clicked) == false) {
						game.gameState = States.Loser;
					}
				} else if (handler.recall_clicked.size() != 42) {
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object1);
						handler.addObject_recall_clicked2(game.blackObject1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject2);
						handler.addObject_recall_clicked2(game.blackObject2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject3);
						handler.addObject_recall_clicked2(game.blackObject3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject4);
						handler.addObject_recall_clicked2(game.blackObject4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject5);
						handler.addObject_recall_clicked2(game.blackObject5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject6);
						handler.addObject_recall_clicked2(game.blackObject6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject7);
						handler.addObject_recall_clicked2(game.blackObject7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject8);
						handler.addObject_recall_clicked2(game.blackObject8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject9);
						handler.addObject_recall_clicked2(game.blackObject9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject11);
						handler.addObject_recall_clicked2(game.blackObject10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject12);
						handler.addObject_recall_clicked2(game.blackObject11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.blackObject13);
						handler.addObject_recall_clicked2(game.blackObject12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object13);
						handler.addObject_recall_clicked2(game.blackObject13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object14);
						handler.addObject_recall_clicked2(game.blackObject14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object15);
						handler.addObject_recall_clicked2(game.blackObject15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object16);
						handler.addObject_recall_clicked2(game.blackObject16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object17);
						handler.addObject_recall_clicked2(game.blackObject17);
					} else if (mouseOver(mx, my, 300, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object18);
						handler.addObject_recall_clicked2(game.blackObject18);
					} else if (mouseOver(mx, my, 300, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object19);
						handler.addObject_recall_clicked2(game.blackObject19);
					} else if (mouseOver(mx, my, 300, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object20);
						handler.addObject_recall_clicked2(game.blackObject20);
					} else if (mouseOver(mx, my, 300, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object21);
						handler.addObject_recall_clicked2(game.blackObject21);
					} else if (mouseOver(mx, my, 400, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object22);
						handler.addObject_recall_clicked2(game.blackObject22);
					} else if (mouseOver(mx, my, 400, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object23);
						handler.addObject_recall_clicked2(game.blackObject23);
					} else if (mouseOver(mx, my, 400, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object24);
						handler.addObject_recall_clicked2(game.blackObject24);
					} else if (mouseOver(mx, my, 400, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object25);
						handler.addObject_recall_clicked2(game.blackObject25);
					} else if (mouseOver(mx, my, 400, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object26);
						handler.addObject_recall_clicked2(game.blackObject26);
					} else if (mouseOver(mx, my, 400, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object27);
						handler.addObject_recall_clicked2(game.blackObject27);
					} else if (mouseOver(mx, my, 400, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object28);
						handler.addObject_recall_clicked2(game.blackObject28);
					} else if (mouseOver(mx, my, 500, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object27);
						handler.addObject_recall_clicked2(game.blackObject29);
					} else if (mouseOver(mx, my, 500, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object28);
						handler.addObject_recall_clicked2(game.blackObject30);
					} else if (mouseOver(mx, my, 500, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object31);
						handler.addObject_recall_clicked2(game.blackObject31);
					} else if (mouseOver(mx, my, 500, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object32);
						handler.addObject_recall_clicked2(game.blackObject32);
					} else if (mouseOver(mx, my, 500, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object33);
						handler.addObject_recall_clicked2(game.blackObject33);
					} else if (mouseOver(mx, my, 500, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object34);
						handler.addObject_recall_clicked2(game.blackObject34);
					} else if (mouseOver(mx, my, 500, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object35);
						handler.addObject_recall_clicked2(game.blackObject35);
					} else if (mouseOver(mx, my, 600, 100, 40, 40)) {
						handler.addObject_recall_clicked(game.object36);
						handler.addObject_recall_clicked2(game.blackObject36);
					} else if (mouseOver(mx, my, 600, 200, 40, 40)) {
						handler.addObject_recall_clicked(game.object37);
						handler.addObject_recall_clicked2(game.blackObject37);
					} else if (mouseOver(mx, my, 600, 300, 40, 40)) {
						handler.addObject_recall_clicked(game.object38);
						handler.addObject_recall_clicked2(game.blackObject38);
					} else if (mouseOver(mx, my, 600, 400, 40, 40)) {
						handler.addObject_recall_clicked(game.object39);
						handler.addObject_recall_clicked2(game.blackObject39);
					} else if (mouseOver(mx, my, 600, 500, 40, 40)) {
						handler.addObject_recall_clicked(game.object40);
						handler.addObject_recall_clicked2(game.blackObject40);
					} else if (mouseOver(mx, my, 600, 600, 40, 40)) {
						handler.addObject_recall_clicked(game.object41);
						handler.addObject_recall_clicked2(game.blackObject41);
					} else if (mouseOver(mx, my, 600, 700, 40, 40)) {
						handler.addObject_recall_clicked(game.object42);
						handler.addObject_recall_clicked2(game.blackObject42);
					}
				}
			}
			//////////////////////////////////////////////////////////////////////////
		}
		else if (game.gameState == States.Loser) {
			if (mouseOver(mx, my, 340, 360, 230, 70)) {
				// if you click the Try Again button,
				handler.clear_objects();
				handler.clear_objects_recall();
				handler.clear_recall_clicked();
				handler.clear_black_objects();

				if (hud.getLevel() == 1) { // level 1
					handler.addObject(game.blackObject1);
					handler.addObject(game.blackObject2);
					handler.addObject(game.blackObject3);
					game.gameState = States.Game;
				} else if (hud.getLevel() == 2) { // level 2
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					game.gameState = States.Game;
				} else if (hud.getLevel() == 3) { // level 3
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.blackObject7);
					handler.addObject(game.blackObject8);
					game.gameState = States.Game;
				} else if (hud.getLevel() == 4) { // level 4
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					game.gameState = States.Game;
				} else if (hud.getLevel() == 5) { // level 5
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.blackObject12);
					game.gameState = States.Game;
				} else if (hud.getLevel() == 6) { // level 6
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.blackObject11);
					handler.addObject(game.object10);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					game.gameState = States.Game;
				} else if (hud.getLevel() == 7) { // level 7
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					game.gameState = States.Game;
				} else if (hud.getLevel() == 8) { // level 8
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					game.gameState = States.Game;
				} else if (hud.getLevel() == 9) { // level 9
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					game.gameState = States.Game;
				} else if (hud.getLevel() == 10) { // level 10
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					handler.addObject(game.object18);
					handler.addObject(game.object19);
					game.gameState = States.Game;
				} else if (hud.getLevel() == 11) { // level 11
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					handler.addObject(game.object18);
					handler.addObject(game.object19);
					handler.addObject(game.object20);
					handler.addObject(game.object21);
					handler.addObject(game.object22);
					game.gameState = States.Game;
				} else if (hud.getLevel() == 12) { // level 12
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					handler.addObject(game.object18);
					handler.addObject(game.object19);
					handler.addObject(game.object20);
					handler.addObject(game.object21);
					handler.addObject(game.object22);
					handler.addObject(game.object23);
					handler.addObject(game.object24);
					game.gameState = States.Game;
				} else if (hud.getLevel() == 13) { // level 13
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					handler.addObject(game.object18);
					handler.addObject(game.object19);
					handler.addObject(game.object20);
					handler.addObject(game.object21);
					handler.addObject(game.object22);
					handler.addObject(game.object23);
					handler.addObject(game.object24);
					handler.addObject(game.object25);
					handler.addObject(game.object26);
					game.gameState = States.Game;
				} else if (hud.getLevel() == 14) { // level 14
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					handler.addObject(game.object18);
					handler.addObject(game.object19);
					handler.addObject(game.object20);
					handler.addObject(game.object21);
					handler.addObject(game.object22);
					handler.addObject(game.object23);
					handler.addObject(game.object24);
					handler.addObject(game.object25);
					handler.addObject(game.object26);
					handler.addObject(game.object27);
					handler.addObject(game.object28);
					game.gameState = States.Game;
				} else if (hud.getLevel() == 14) { // level 14
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					handler.addObject(game.object18);
					handler.addObject(game.object19);
					handler.addObject(game.object20);
					handler.addObject(game.object21);
					handler.addObject(game.object22);
					handler.addObject(game.object23);
					handler.addObject(game.object24);
					handler.addObject(game.object25);
					handler.addObject(game.object26);
					handler.addObject(game.object27);
					handler.addObject(game.object28);
					game.gameState = States.Game;
				} else if (hud.getLevel() == 15) { // level 15
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					handler.addObject(game.object18);
					handler.addObject(game.object19);
					handler.addObject(game.object20);
					handler.addObject(game.object21);
					handler.addObject(game.object22);
					handler.addObject(game.object23);
					handler.addObject(game.object24);
					handler.addObject(game.object25);
					handler.addObject(game.object26);
					handler.addObject(game.object27);
					handler.addObject(game.object28);
					handler.addObject(game.object29);
					handler.addObject(game.object30);
					game.gameState = States.Game;
				} else if (hud.getLevel() == 16) { // level 16
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					handler.addObject(game.object18);
					handler.addObject(game.object19);
					handler.addObject(game.object20);
					handler.addObject(game.object21);
					handler.addObject(game.object22);
					handler.addObject(game.object23);
					handler.addObject(game.object24);
					handler.addObject(game.object25);
					handler.addObject(game.object26);
					handler.addObject(game.object27);
					handler.addObject(game.object28);
					handler.addObject(game.object29);
					handler.addObject(game.object30);
					handler.addObject(game.object31);
					handler.addObject(game.object32);
					game.gameState = States.Game;
				} else if (hud.getLevel() == 17) { // level 17
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					handler.addObject(game.object18);
					handler.addObject(game.object19);
					handler.addObject(game.object20);
					handler.addObject(game.object21);
					handler.addObject(game.object22);
					handler.addObject(game.object23);
					handler.addObject(game.object24);
					handler.addObject(game.object25);
					handler.addObject(game.object26);
					handler.addObject(game.object27);
					handler.addObject(game.object28);
					handler.addObject(game.object29);
					handler.addObject(game.object30);
					handler.addObject(game.object31);
					handler.addObject(game.object32);
					handler.addObject(game.object33);
					handler.addObject(game.object34);
					game.gameState = States.Game;
				} else if (hud.getLevel() == 18) { // level 18
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					handler.addObject(game.object18);
					handler.addObject(game.object19);
					handler.addObject(game.object20);
					handler.addObject(game.object21);
					handler.addObject(game.object22);
					handler.addObject(game.object23);
					handler.addObject(game.object24);
					handler.addObject(game.object25);
					handler.addObject(game.object26);
					handler.addObject(game.object27);
					handler.addObject(game.object28);
					handler.addObject(game.object29);
					handler.addObject(game.object30);
					handler.addObject(game.object31);
					handler.addObject(game.object32);
					handler.addObject(game.object33);
					handler.addObject(game.object34);
					handler.addObject(game.object35);
					handler.addObject(game.object36);
					game.gameState = States.Game;
				} else if (hud.getLevel() == 19) { // level 19
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					handler.addObject(game.object18);
					handler.addObject(game.object19);
					handler.addObject(game.object20);
					handler.addObject(game.object21);
					handler.addObject(game.object22);
					handler.addObject(game.object23);
					handler.addObject(game.object24);
					handler.addObject(game.object25);
					handler.addObject(game.object26);
					handler.addObject(game.object27);
					handler.addObject(game.object28);
					handler.addObject(game.object29);
					handler.addObject(game.object30);
					handler.addObject(game.object31);
					handler.addObject(game.object32);
					handler.addObject(game.object33);
					handler.addObject(game.object34);
					handler.addObject(game.object35);
					handler.addObject(game.object36);
					handler.addObject(game.object37);
					handler.addObject(game.object38);
					handler.addObject(game.object39);
					handler.addObject(game.object40);
					game.gameState = States.Game;
				} else if (hud.getLevel() == 20) { // level 20
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					handler.addObject(game.object18);
					handler.addObject(game.object19);
					handler.addObject(game.object20);
					handler.addObject(game.object21);
					handler.addObject(game.object22);
					handler.addObject(game.object23);
					handler.addObject(game.object24);
					handler.addObject(game.object25);
					handler.addObject(game.object26);
					handler.addObject(game.object27);
					handler.addObject(game.object28);
					handler.addObject(game.object29);
					handler.addObject(game.object30);
					handler.addObject(game.object31);
					handler.addObject(game.object32);
					handler.addObject(game.object33);
					handler.addObject(game.object34);
					handler.addObject(game.object35);
					handler.addObject(game.object36);
					handler.addObject(game.object37);
					handler.addObject(game.object38);
					handler.addObject(game.object39);
					handler.addObject(game.object40);
					handler.addObject(game.object41);
					handler.addObject(game.object42);
					game.gameState = States.Game;
				}
			}
		} else if (game.gameState == States.Winner) { // creating game
														// objects
														// after hitting
														// next
														// level button
			if (mouseOver(mx, my, 340, 360, 230, 70)) {
				handler.clear_objects();
				handler.clear_objects_recall();
				handler.clear_recall_clicked();
				handler.clear_black_objects();
				game.gameState = States.Game;

				if (hud.getLevel() == 2) { // level 2
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
				} else if (hud.getLevel() == 3) { // level 3
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
				} else if (hud.getLevel() == 4) { // level 4
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
				} else if (hud.getLevel() == 5) { // level 5
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
				} else if (hud.getLevel() == 6) { // level 6
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
				} else if (hud.getLevel() == 7) { // level 7
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
				} else if (hud.getLevel() == 8) { // level 8
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
				} else if (hud.getLevel() == 9) { // level 9
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
				} else if (hud.getLevel() == 10) { // level 10
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					handler.addObject(game.object18);
					handler.addObject(game.object19);
				} else if (hud.getLevel() == 11) { // level 11
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					handler.addObject(game.object18);
					handler.addObject(game.object19);
					handler.addObject(game.object20);
					handler.addObject(game.object21);
					handler.addObject(game.object22);
				} else if (hud.getLevel() == 12) { // level 12
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					handler.addObject(game.object18);
					handler.addObject(game.object19);
					handler.addObject(game.object20);
					handler.addObject(game.object21);
					handler.addObject(game.object22);
					handler.addObject(game.object23);
					handler.addObject(game.object24);
				} else if (hud.getLevel() == 13) { // level 13
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					handler.addObject(game.object18);
					handler.addObject(game.object19);
					handler.addObject(game.object20);
					handler.addObject(game.object21);
					handler.addObject(game.object22);
					handler.addObject(game.object23);
					handler.addObject(game.object24);
					handler.addObject(game.object25);
					handler.addObject(game.object26);
				} else if (hud.getLevel() == 14) { // level 14
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					handler.addObject(game.object18);
					handler.addObject(game.object19);
					handler.addObject(game.object20);
					handler.addObject(game.object21);
					handler.addObject(game.object22);
					handler.addObject(game.object23);
					handler.addObject(game.object24);
					handler.addObject(game.object25);
					handler.addObject(game.object26);
					handler.addObject(game.object27);
					handler.addObject(game.object28);
				} else if (hud.getLevel() == 15) { // level 15
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					handler.addObject(game.object18);
					handler.addObject(game.object19);
					handler.addObject(game.object20);
					handler.addObject(game.object21);
					handler.addObject(game.object22);
					handler.addObject(game.object23);
					handler.addObject(game.object24);
					handler.addObject(game.object25);
					handler.addObject(game.object26);
					handler.addObject(game.object27);
					handler.addObject(game.object28);
					handler.addObject(game.object29);
					handler.addObject(game.object30);
				} else if (hud.getLevel() == 16) { // level 16
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					handler.addObject(game.object18);
					handler.addObject(game.object19);
					handler.addObject(game.object20);
					handler.addObject(game.object21);
					handler.addObject(game.object22);
					handler.addObject(game.object23);
					handler.addObject(game.object24);
					handler.addObject(game.object25);
					handler.addObject(game.object26);
					handler.addObject(game.object27);
					handler.addObject(game.object28);
					handler.addObject(game.object29);
					handler.addObject(game.object30);
					handler.addObject(game.object31);
					handler.addObject(game.object32);
				} else if (hud.getLevel() == 17) { // level 17
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					handler.addObject(game.object18);
					handler.addObject(game.object19);
					handler.addObject(game.object20);
					handler.addObject(game.object21);
					handler.addObject(game.object22);
					handler.addObject(game.object23);
					handler.addObject(game.object24);
					handler.addObject(game.object25);
					handler.addObject(game.object26);
					handler.addObject(game.object27);
					handler.addObject(game.object28);
					handler.addObject(game.object29);
					handler.addObject(game.object30);
					handler.addObject(game.object31);
					handler.addObject(game.object32);
					handler.addObject(game.object33);
					handler.addObject(game.object34);
				} else if (hud.getLevel() == 19) { // level 19
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					handler.addObject(game.object18);
					handler.addObject(game.object19);
					handler.addObject(game.object20);
					handler.addObject(game.object21);
					handler.addObject(game.object22);
					handler.addObject(game.object23);
					handler.addObject(game.object24);
					handler.addObject(game.object25);
					handler.addObject(game.object26);
					handler.addObject(game.object27);
					handler.addObject(game.object28);
					handler.addObject(game.object29);
					handler.addObject(game.object30);
					handler.addObject(game.object31);
					handler.addObject(game.object32);
					handler.addObject(game.object33);
					handler.addObject(game.object34);
					handler.addObject(game.object35);
					handler.addObject(game.object36);
					handler.addObject(game.object37);
					handler.addObject(game.object38);
					handler.addObject(game.object39);
					handler.addObject(game.object40);
				} else if (hud.getLevel() == 20) { // level 20
					handler.addObject(game.object1);
					handler.addObject(game.object2);
					handler.addObject(game.object3);
					handler.addObject(game.object4);
					handler.addObject(game.object5);
					handler.addObject(game.object6);
					handler.addObject(game.object7);
					handler.addObject(game.object8);
					handler.addObject(game.object9);
					handler.addObject(game.object10);
					handler.addObject(game.object11);
					handler.addObject(game.object12);
					handler.addObject(game.object13);
					handler.addObject(game.object14);
					handler.addObject(game.object15);
					handler.addObject(game.object16);
					handler.addObject(game.object17);
					handler.addObject(game.object18);
					handler.addObject(game.object19);
					handler.addObject(game.object20);
					handler.addObject(game.object21);
					handler.addObject(game.object22);
					handler.addObject(game.object23);
					handler.addObject(game.object24);
					handler.addObject(game.object25);
					handler.addObject(game.object26);
					handler.addObject(game.object27);
					handler.addObject(game.object28);
					handler.addObject(game.object29);
					handler.addObject(game.object30);
					handler.addObject(game.object31);
					handler.addObject(game.object32);
					handler.addObject(game.object33);
					handler.addObject(game.object34);
					handler.addObject(game.object35);
					handler.addObject(game.object36);
					handler.addObject(game.object37);
					handler.addObject(game.object38);
					handler.addObject(game.object39);
					handler.addObject(game.object40);
					handler.addObject(game.object41);
					handler.addObject(game.object42);
				}
			}
		}
	}
	// public void mouseReleased(MouseEvent e) {
	//
	// }

	public boolean mouseOver(int mx, int my, int x, int y, int width, int height) {
		if (mx < x + width && mx > x) {
			if (my < y + height && my > y) {
				return true;
			} else
				return false;
		} else
			return false;
	}

	public void render(Graphics g) {
		if (game.gameState == States.Recall_Test) {
			g.setColor(Color.WHITE);
			Font myfont = new Font("Times New Roman", 4, 50);
			g.setFont(myfont);
			g.drawString("RECALL!!!", 340, 50);
			g.drawLine(310, 70, 600, 70);
		} else if (game.gameState == States.Winner) {
			g.setColor(Color.white);
			Font myfont = new Font("Times New Roman", 1, 70);
			g.setFont(myfont);
			g.drawString("Correct !!!", 300, 60);

			g.setColor(Color.white);
			Font myfont1 = new Font("Times New Roman", 4, 50);
			g.setFont(myfont1);
			g.drawRect(340, 360, 230, 70);
			g.drawString("Next Level", 346, 410);

		} else if (game.gameState == States.Loser) {
			g.setColor(Color.white);
			Font myfont = new Font("Times New Roman", 1, 70);
			g.setFont(myfont);
			g.drawString("Wrong !!!", 300, 60);

			g.setColor(Color.white);
			Font myfont1 = new Font("Times New Roman", 4, 50);
			g.setFont(myfont1);
			g.drawRect(340, 360, 230, 70);
			g.drawString("Try Again", 352, 410);
		}
	}

}