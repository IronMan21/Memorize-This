package framework;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import window.Game;
import window.Game.States;

public class Spawner extends MouseAdapter {
	public Handler handler;
	public Game game;
	public ID id;
	public HUD hud;

	public Spawner(Handler handler, Game game, ID id, HUD hud) {
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

		if (game.gameState == States.Game) {
			if (handler.objects.size() == 0) {
				// Recall_Test gamestate
				game.gameState = States.Recall_Test;
				if (game.gameState == States.Recall_Test) {
//					if (hud.getLevel() == 1) { // level 1
//						handler.addObject(game.blackObject1);
//						handler.addObject(game.blackObject2);
//						handler.addObject(game.blackObject3);
//					} else if (hud.getLevel() == 2) { // level 2
//						handler.addObject(game.blackObject1);
//						handler.addObject(game.blackObject2);
//						handler.addObject(game.blackObject3);
//						handler.addObject(game.blackObject4);
//						handler.addObject(game.blackObject5);
//					} else if (hud.getLevel() == 3) { // level 3
//						handler.addObject(game.blackObject1);
//						handler.addObject(game.blackObject2);
//						handler.addObject(game.blackObject3);
//						handler.addObject(game.blackObject4);
//						handler.addObject(game.blackObject5);
//						handler.addObject(game.blackObject6);
//						handler.addObject(game.blackObject7);
//					} else if (hud.getLevel() == 4) { // level 4
//						handler.addObject(game.blackObject1);
//						handler.addObject(game.blackObject2);
//						handler.addObject(game.blackObject3);
//						handler.addObject(game.blackObject4);
//						handler.addObject(game.blackObject5);
//						handler.addObject(game.blackObject6);
//						handler.addObject(game.blackObject7);
//					} else if (hud.getLevel() == 5) { // level 5
//						handler.addObject(game.blackObject1);
//						handler.addObject(game.blackObject2);
//						handler.addObject(game.blackObject3);
//						handler.addObject(game.blackObject4);
//						handler.addObject(game.blackObject5);
//						handler.addObject(game.blackObject6);
//						handler.addObject(game.blackObject7);
//						handler.addObject(game.blackObject8);
//						handler.addObject(game.blackObject9);
//					} 
//					else if (hud.getLevel() == 6) { // level 6
//						handler.addObject(game.blackObject1);
//						handler.addObject(game.blackObject2);
//						handler.addObject(game.blackObject3);
//						handler.addObject(game.blackObject4);
//						handler.addObject(game.blackObject5);
//						handler.addObject(game.blackObject6);
//						handler.addObject(game.blackObject7);
//						handler.addObject(game.blackObject8);
//						handler.addObject(game.blackObject9);
//						handler.addObject(game.blackObject10);
//						handler.addObject(game.blackObject11);
//					} else if (hud.getLevel() == 7) { // level 7
//						handler.addObject(game.blackObject1);
//						handler.addObject(game.blackObject2);
//						handler.addObject(game.blackObject3);
//						handler.addObject(game.blackObject4);
//						handler.addObject(game.blackObject5);
//						handler.addObject(game.blackObject6);
//						handler.addObject(game.blackObject7);
//						handler.addObject(game.blackObject8);
//						handler.addObject(game.blackObject9);
//						handler.addObject(game.blackObject10);
//						handler.addObject(game.blackObject11);
//						handler.addObject(game.blackObject12);
//						handler.addObject(game.blackObject13);
//					} else if (hud.getLevel() == 8) { // level 8
//						handler.addObject(game.blackObject1);
//						handler.addObject(game.blackObject2);
//						handler.addObject(game.blackObject3);
//						handler.addObject(game.blackObject4);
//						handler.addObject(game.blackObject5);
//						handler.addObject(game.blackObject6);
//						handler.addObject(game.blackObject7);
//						handler.addObject(game.blackObject8);
//						handler.addObject(game.blackObject9);
//						handler.addObject(game.blackObject10);
//						handler.addObject(game.blackObject11);
//						handler.addObject(game.blackObject12);
//						handler.addObject(game.blackObject13);
//						handler.addObject(game.blackObject14);
//						handler.addObject(game.blackObject15);
//					} else if (hud.getLevel() == 9) { // level 10
//						handler.addObject(game.blackObject1);
//						handler.addObject(game.blackObject2);
//						handler.addObject(game.blackObject3);
//						handler.addObject(game.blackObject4);
//						handler.addObject(game.blackObject5);
//						handler.addObject(game.blackObject6);
//						handler.addObject(game.blackObject7);
//						handler.addObject(game.blackObject8);
//						handler.addObject(game.blackObject9);
//						handler.addObject(game.blackObject10);
//						handler.addObject(game.blackObject11);
//						handler.addObject(game.blackObject12);
//						handler.addObject(game.blackObject13);
//						handler.addObject(game.blackObject14);
//						handler.addObject(game.blackObject15);
//						handler.addObject(game.blackObject16);
//						handler.addObject(game.blackObject17);
//					} else if (hud.getLevel() == 10) { // level 10
//						handler.addObject(game.blackObject1);
//						handler.addObject(game.blackObject2);
//						handler.addObject(game.blackObject3);
//						handler.addObject(game.blackObject4);
//						handler.addObject(game.blackObject5);
//						handler.addObject(game.blackObject6);
//						handler.addObject(game.blackObject7);
//						handler.addObject(game.blackObject8);
//						handler.addObject(game.blackObject9);
//						handler.addObject(game.blackObject10);
//						handler.addObject(game.blackObject11);
//						handler.addObject(game.blackObject12);
//						handler.addObject(game.blackObject13);
//						handler.addObject(game.blackObject14);
//						handler.addObject(game.blackObject15);
//						handler.addObject(game.blackObject16);
//						handler.addObject(game.blackObject17);
//						handler.addObject(game.blackObject18);
//						handler.addObject(game.blackObject19);
//					} else if (hud.getLevel() == 11) { // level 11
//						handler.addObject(game.blackObject1);
//						handler.addObject(game.blackObject2);
//						handler.addObject(game.blackObject3);
//						handler.addObject(game.blackObject4);
//						handler.addObject(game.blackObject5);
//						handler.addObject(game.blackObject6);
//						handler.addObject(game.blackObject7);
//						handler.addObject(game.blackObject8);
//						handler.addObject(game.blackObject9);
//						handler.addObject(game.blackObject10);
//						handler.addObject(game.blackObject11);
//						handler.addObject(game.blackObject12);
//						handler.addObject(game.blackObject13);
//						handler.addObject(game.blackObject14);
//						handler.addObject(game.blackObject15);
//						handler.addObject(game.blackObject16);
//						handler.addObject(game.blackObject17);
//						handler.addObject(game.blackObject18);
//						handler.addObject(game.blackObject19);
//						handler.addObject(game.blackObject20);
//						handler.addObject(game.blackObject21);
//						handler.addObject(game.blackObject22);
//
//					} else if (hud.getLevel() == 12) { // level 12
//						handler.addObject(game.blackObject1);
//						handler.addObject(game.blackObject2);
//						handler.addObject(game.blackObject3);
//						handler.addObject(game.blackObject4);
//						handler.addObject(game.blackObject5);
//						handler.addObject(game.blackObject6);
//						handler.addObject(game.blackObject7);
//						handler.addObject(game.blackObject8);
//						handler.addObject(game.blackObject9);
//						handler.addObject(game.blackObject10);
//						handler.addObject(game.blackObject11);
//						handler.addObject(game.blackObject12);
//						handler.addObject(game.blackObject13);
//						handler.addObject(game.blackObject14);
//						handler.addObject(game.blackObject15);
//						handler.addObject(game.blackObject16);
//						handler.addObject(game.blackObject17);
//						handler.addObject(game.blackObject18);
//						handler.addObject(game.blackObject19);
//						handler.addObject(game.blackObject20);
//						handler.addObject(game.blackObject21);
//						handler.addObject(game.blackObject22);
//						handler.addObject(game.blackObject23);
//						handler.addObject(game.blackObject24);
//
//					} else if (hud.getLevel() == 13) { // level 13
//						handler.addObject(game.blackObject1);
//						handler.addObject(game.blackObject2);
//						handler.addObject(game.blackObject3);
//						handler.addObject(game.blackObject4);
//						handler.addObject(game.blackObject5);
//						handler.addObject(game.blackObject6);
//						handler.addObject(game.blackObject7);
//						handler.addObject(game.blackObject8);
//						handler.addObject(game.blackObject9);
//						handler.addObject(game.blackObject10);
//						handler.addObject(game.blackObject11);
//						handler.addObject(game.blackObject12);
//						handler.addObject(game.blackObject13);
//						handler.addObject(game.blackObject14);
//						handler.addObject(game.blackObject15);
//						handler.addObject(game.blackObject16);
//						handler.addObject(game.blackObject17);
//						handler.addObject(game.blackObject18);
//						handler.addObject(game.blackObject19);
//						handler.addObject(game.blackObject20);
//						handler.addObject(game.blackObject21);
//						handler.addObject(game.blackObject22);
//						handler.addObject(game.blackObject23);
//						handler.addObject(game.blackObject24);
//						handler.addObject(game.blackObject25);
//						handler.addObject(game.blackObject26);
//
//					} else if (hud.getLevel() == 14) { // level 14
//						handler.addObject(game.blackObject1);
//						handler.addObject(game.blackObject2);
//						handler.addObject(game.blackObject3);
//						handler.addObject(game.blackObject4);
//						handler.addObject(game.blackObject5);
//						handler.addObject(game.blackObject6);
//						handler.addObject(game.blackObject7);
//						handler.addObject(game.blackObject8);
//						handler.addObject(game.blackObject9);
//						handler.addObject(game.blackObject10);
//						handler.addObject(game.blackObject11);
//						handler.addObject(game.blackObject12);
//						handler.addObject(game.blackObject13);
//						handler.addObject(game.blackObject14);
//						handler.addObject(game.blackObject15);
//						handler.addObject(game.blackObject16);
//						handler.addObject(game.blackObject17);
//						handler.addObject(game.blackObject18);
//						handler.addObject(game.blackObject19);
//						handler.addObject(game.blackObject20);
//						handler.addObject(game.blackObject21);
//						handler.addObject(game.blackObject22);
//						handler.addObject(game.blackObject23);
//						handler.addObject(game.blackObject24);
//						handler.addObject(game.blackObject25);
//						handler.addObject(game.blackObject26);
//						handler.addObject(game.blackObject27);
//						handler.addObject(game.blackObject28);
//
//					} else if (hud.getLevel() == 15) { // level 15
//						handler.addObject(game.blackObject1);
//						handler.addObject(game.blackObject2);
//						handler.addObject(game.blackObject3);
//						handler.addObject(game.blackObject4);
//						handler.addObject(game.blackObject5);
//						handler.addObject(game.blackObject6);
//						handler.addObject(game.blackObject7);
//						handler.addObject(game.blackObject8);
//						handler.addObject(game.blackObject9);
//						handler.addObject(game.blackObject10);
//						handler.addObject(game.blackObject11);
//						handler.addObject(game.blackObject12);
//						handler.addObject(game.blackObject13);
//						handler.addObject(game.blackObject14);
//						handler.addObject(game.blackObject15);
//						handler.addObject(game.blackObject16);
//						handler.addObject(game.blackObject17);
//						handler.addObject(game.blackObject18);
//						handler.addObject(game.blackObject19);
//						handler.addObject(game.blackObject20);
//						handler.addObject(game.blackObject21);
//						handler.addObject(game.blackObject22);
//						handler.addObject(game.blackObject23);
//						handler.addObject(game.blackObject24);
//						handler.addObject(game.blackObject25);
//						handler.addObject(game.blackObject26);
//						handler.addObject(game.blackObject27);
//						handler.addObject(game.blackObject28);
//						handler.addObject(game.blackObject29);
//						handler.addObject(game.blackObject30);
//
//					} else if (hud.getLevel() == 16) { // level 16
//						handler.addObject(game.blackObject1);
//						handler.addObject(game.blackObject2);
//						handler.addObject(game.blackObject3);
//						handler.addObject(game.blackObject4);
//						handler.addObject(game.blackObject5);
//						handler.addObject(game.blackObject6);
//						handler.addObject(game.blackObject7);
//						handler.addObject(game.blackObject8);
//						handler.addObject(game.blackObject9);
//						handler.addObject(game.blackObject10);
//						handler.addObject(game.blackObject11);
//						handler.addObject(game.blackObject12);
//						handler.addObject(game.blackObject13);
//						handler.addObject(game.blackObject14);
//						handler.addObject(game.blackObject15);
//						handler.addObject(game.blackObject16);
//						handler.addObject(game.blackObject17);
//						handler.addObject(game.blackObject18);
//						handler.addObject(game.blackObject19);
//						handler.addObject(game.blackObject20);
//						handler.addObject(game.blackObject21);
//						handler.addObject(game.blackObject22);
//						handler.addObject(game.blackObject23);
//						handler.addObject(game.blackObject24);
//						handler.addObject(game.blackObject25);
//						handler.addObject(game.blackObject26);
//						handler.addObject(game.blackObject27);
//						handler.addObject(game.blackObject28);
//						handler.addObject(game.blackObject29);
//						handler.addObject(game.blackObject30);
//						handler.addObject(game.blackObject31);
//						handler.addObject(game.blackObject32);
//
//					} else if (hud.getLevel() == 17) { // level 17
//						handler.addObject(game.blackObject1);
//						handler.addObject(game.blackObject2);
//						handler.addObject(game.blackObject3);
//						handler.addObject(game.blackObject4);
//						handler.addObject(game.blackObject5);
//						handler.addObject(game.blackObject6);
//						handler.addObject(game.blackObject7);
//						handler.addObject(game.blackObject8);
//						handler.addObject(game.blackObject9);
//						handler.addObject(game.blackObject10);
//						handler.addObject(game.blackObject11);
//						handler.addObject(game.blackObject12);
//						handler.addObject(game.blackObject13);
//						handler.addObject(game.blackObject14);
//						handler.addObject(game.blackObject15);
//						handler.addObject(game.blackObject16);
//						handler.addObject(game.blackObject17);
//						handler.addObject(game.blackObject18);
//						handler.addObject(game.blackObject19);
//						handler.addObject(game.blackObject20);
//						handler.addObject(game.blackObject21);
//						handler.addObject(game.blackObject22);
//						handler.addObject(game.blackObject23);
//						handler.addObject(game.blackObject24);
//						handler.addObject(game.blackObject25);
//						handler.addObject(game.blackObject26);
//						handler.addObject(game.blackObject27);
//						handler.addObject(game.blackObject28);
//						handler.addObject(game.blackObject29);
//						handler.addObject(game.blackObject30);
//						handler.addObject(game.blackObject31);
//						handler.addObject(game.blackObject32);
//						handler.addObject(game.blackObject33);
//						handler.addObject(game.blackObject34);
//						handler.addObject(game.blackObject35);
//						handler.addObject(game.blackObject36);
//					} else if (hud.getLevel() == 18) { // level 18
//						handler.addObject(game.blackObject1);
//						handler.addObject(game.blackObject2);
//						handler.addObject(game.blackObject3);
//						handler.addObject(game.blackObject4);
//						handler.addObject(game.blackObject5);
//						handler.addObject(game.blackObject6);
//						handler.addObject(game.blackObject7);
//						handler.addObject(game.blackObject8);
//						handler.addObject(game.blackObject9);
//						handler.addObject(game.blackObject10);
//						handler.addObject(game.blackObject11);
//						handler.addObject(game.blackObject12);
//						handler.addObject(game.blackObject13);
//						handler.addObject(game.blackObject14);
//						handler.addObject(game.blackObject15);
//						handler.addObject(game.blackObject16);
//						handler.addObject(game.blackObject17);
//						handler.addObject(game.blackObject18);
//						handler.addObject(game.blackObject19);
//						handler.addObject(game.blackObject20);
//						handler.addObject(game.blackObject21);
//						handler.addObject(game.blackObject22);
//						handler.addObject(game.blackObject23);
//						handler.addObject(game.blackObject24);
//						handler.addObject(game.blackObject25);
//						handler.addObject(game.blackObject26);
//						handler.addObject(game.blackObject27);
//						handler.addObject(game.blackObject28);
//						handler.addObject(game.blackObject29);
//						handler.addObject(game.blackObject30);
//						handler.addObject(game.blackObject31);
//						handler.addObject(game.blackObject32);
//						handler.addObject(game.blackObject33);
//						handler.addObject(game.blackObject34);
//						handler.addObject(game.blackObject35);
//						handler.addObject(game.blackObject36);
//						handler.addObject(game.blackObject37);
//						handler.addObject(game.blackObject38);
//					} else if (hud.getLevel() == 19) { // level 19
//						handler.addObject(game.blackObject1);
//						handler.addObject(game.blackObject2);
//						handler.addObject(game.blackObject3);
//						handler.addObject(game.blackObject4);
//						handler.addObject(game.blackObject5);
//						handler.addObject(game.blackObject6);
//						handler.addObject(game.blackObject7);
//						handler.addObject(game.blackObject8);
//						handler.addObject(game.blackObject9);
//						handler.addObject(game.blackObject10);
//						handler.addObject(game.blackObject11);
//						handler.addObject(game.blackObject12);
//						handler.addObject(game.blackObject13);
//						handler.addObject(game.blackObject14);
//						handler.addObject(game.blackObject15);
//						handler.addObject(game.blackObject16);
//						handler.addObject(game.blackObject17);
//						handler.addObject(game.blackObject18);
//						handler.addObject(game.blackObject19);
//						handler.addObject(game.blackObject20);
//						handler.addObject(game.blackObject21);
//						handler.addObject(game.blackObject22);
//						handler.addObject(game.blackObject23);
//						handler.addObject(game.blackObject24);
//						handler.addObject(game.blackObject25);
//						handler.addObject(game.blackObject26);
//						handler.addObject(game.blackObject27);
//						handler.addObject(game.blackObject28);
//						handler.addObject(game.blackObject29);
//						handler.addObject(game.blackObject30);
//						handler.addObject(game.blackObject31);
//						handler.addObject(game.blackObject32);
//						handler.addObject(game.blackObject33);
//						handler.addObject(game.blackObject34);
//						handler.addObject(game.blackObject35);
//						handler.addObject(game.blackObject36);
//						handler.addObject(game.blackObject37);
//						handler.addObject(game.blackObject38);
//						handler.addObject(game.blackObject39);
//						handler.addObject(game.blackObject40);
//					} else if (hud.getLevel() == 20) { // level 20
//						handler.addObject(game.blackObject1);
//						handler.addObject(game.blackObject2);
//						handler.addObject(game.blackObject3);
//						handler.addObject(game.blackObject4);
//						handler.addObject(game.blackObject5);
//						handler.addObject(game.blackObject6);
//						handler.addObject(game.blackObject7);
//						handler.addObject(game.blackObject8);
//						handler.addObject(game.blackObject9);
//						handler.addObject(game.blackObject10);
//						handler.addObject(game.blackObject11);
//						handler.addObject(game.blackObject12);
//						handler.addObject(game.blackObject13);
//						handler.addObject(game.blackObject14);
//						handler.addObject(game.blackObject15);
//						handler.addObject(game.blackObject16);
//						handler.addObject(game.blackObject17);
//						handler.addObject(game.blackObject18);
//						handler.addObject(game.blackObject19);
//						handler.addObject(game.blackObject20);
//						handler.addObject(game.blackObject21);
//						handler.addObject(game.blackObject22);
//						handler.addObject(game.blackObject23);
//						handler.addObject(game.blackObject24);
//						handler.addObject(game.blackObject25);
//						handler.addObject(game.blackObject26);
//						handler.addObject(game.blackObject27);
//						handler.addObject(game.blackObject28);
//						handler.addObject(game.blackObject29);
//						handler.addObject(game.blackObject30);
//						handler.addObject(game.blackObject31);
//						handler.addObject(game.blackObject32);
//						handler.addObject(game.blackObject33);
//						handler.addObject(game.blackObject34);
//						handler.addObject(game.blackObject35);
//						handler.addObject(game.blackObject36);
//						handler.addObject(game.blackObject37);
//						handler.addObject(game.blackObject38);
//						handler.addObject(game.blackObject39);
//						handler.addObject(game.blackObject40);
//						handler.addObject(game.blackObject41);
//						handler.addObject(game.blackObject42);
//					}
				}
			} else if (handler.objects.size() != 0) {
				// if you clicked the boxes in Game gamestate
				if (hud.getLevel() == 1) { // level 1
					if (mouseOver(mx, my, 814, 770, 40, 40)) {
						handler.removeObject(game.object1);
						handler.addObject_recall(game.blackObject1);
					} else if (mouseOver(mx, my, 370, 732, 40, 40)) {
						handler.removeObject(game.object2);
						handler.addObject_recall(game.blackObject2);
					} else if (mouseOver(mx, my, 48, 81, 40, 40)) {
						handler.removeObject(game.object3);
						handler.addObject_recall(game.blackObject3);
					}
				} else if (hud.getLevel() == 2) { // level 2
					if (mouseOver(mx, my, 814, 770, 40, 40)) {
						handler.removeObject(game.object1);
						handler.addObject_recall(game.blackObject1);
					} else if (mouseOver(mx, my, 370, 732, 40, 40)) {
						handler.removeObject(game.object2);
						handler.addObject_recall(game.blackObject2);
					} else if (mouseOver(mx, my, 48, 81, 40, 40)) {
						handler.removeObject(game.object3);
						handler.addObject_recall(game.blackObject3);
					} else if (mouseOver(mx, my, 597, 531, 40, 40)) {
						handler.removeObject(game.object4);
						handler.addObject_recall(game.blackObject4);
					} else if (mouseOver(mx, my, 158, 50, 40, 40)) {
						handler.removeObject(game.object5);
						handler.addObject_recall(game.blackObject5);
					}
				} else if (hud.getLevel() == 3) { // level 3
					if (mouseOver(mx, my, 814, 770, 40, 40)) {
						handler.removeObject(game.object1);
						handler.addObject_recall(game.blackObject1);
					} else if (mouseOver(mx, my, 370, 732, 40, 40)) {
						handler.removeObject(game.object2);
						handler.addObject_recall(game.blackObject2);
					} else if (mouseOver(mx, my, 48, 81, 40, 40)) {
						handler.removeObject(game.object3);
						handler.addObject_recall(game.blackObject3);
					} else if (mouseOver(mx, my, 597, 531, 40, 40)) {
						handler.removeObject(game.object4);
						handler.addObject_recall(game.blackObject4);
					} else if (mouseOver(mx, my, 158, 50, 40, 40)) {
						handler.removeObject(game.object5);
						handler.addObject_recall(game.blackObject5);
					} else if (mouseOver(mx, my, 649, 214, 40, 40)) {
						handler.removeObject(game.object6);
						handler.addObject_recall(game.blackObject6);
					} else if (mouseOver(mx, my, 63, 93, 40, 40)) {
						handler.removeObject(game.object7);
						handler.addObject_recall(game.object7);
					}
				} else if (hud.getLevel() == 4) { // level 4
					if (mouseOver(mx, my, 814, 770, 40, 40)) {
						handler.removeObject(game.object1);
						handler.addObject_recall(game.blackObject1);
					} else if (mouseOver(mx, my, 370, 732, 40, 40)) {
						handler.removeObject(game.object2);
						handler.addObject_recall(game.blackObject2);
					} else if (mouseOver(mx, my, 48, 81, 40, 40)) {
						handler.removeObject(game.object3);
						handler.addObject_recall(game.blackObject3);
					} else if (mouseOver(mx, my, 597, 531, 40, 40)) {
						handler.removeObject(game.object4);
						handler.addObject_recall(game.blackObject4);
					} else if (mouseOver(mx, my,158, 50, 40, 40)) {
						handler.removeObject(game.object5);
						handler.addObject_recall(game.blackObject5);
					} else if (mouseOver(mx, my, 649, 214, 40, 40)) {
						handler.removeObject(game.object6);
						handler.addObject_recall(game.blackObject6);
					} else if (mouseOver(mx, my, 63, 93, 40, 40)) {
						handler.removeObject(game.object7);
						handler.addObject_recall(game.blackObject7);
					}
				} else if (hud.getLevel() == 5) { // level 5
					if (mouseOver(mx, my,814, 770, 40, 40)) {
						handler.removeObject(game.object1);
						handler.addObject_recall(game.blackObject1);
					} else if (mouseOver(mx, my, 370, 732, 40, 40)) {
						handler.removeObject(game.object2);
						handler.addObject_recall(game.blackObject2);
					} else if (mouseOver(mx, my, 48, 81, 40, 40)) {
						handler.removeObject(game.object3);
						handler.addObject_recall(game.blackObject3);
					} else if (mouseOver(mx, my, 597, 531, 40, 40)) {
						handler.removeObject(game.object4);
						handler.addObject_recall(game.blackObject4);
					} else if (mouseOver(mx, my, 158, 50, 40, 40)) {
						handler.removeObject(game.object5);
						handler.addObject_recall(game.blackObject5);
					} else if (mouseOver(mx, my, 649, 214, 40, 40)) {
						handler.removeObject(game.object6);
						handler.addObject_recall(game.blackObject6);
					} else if (mouseOver(mx, my, 63, 93, 40, 40)) {
						handler.removeObject(game.object7);
						handler.addObject_recall(game.blackObject7);
					} else if (mouseOver(mx, my, 577, 349, 40, 40)) {
						handler.removeObject(game.object8);
						handler.addObject_recall(game.blackObject8);
					} else if (mouseOver(mx, my, 284, 482, 40, 40)) {
						handler.removeObject(game.object9);
						handler.addObject_recall(game.blackObject9);
					}
				}
				
		//////////////////// complete the rest later, changing the removeobjects from objectX to blackObjectX./////////
				else if (hud.getLevel() == 6) { // level 6
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.removeObject(game.object1);
						handler.addObject_recall(game.object1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.removeObject(game.object2);
						handler.addObject_recall(game.object2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.removeObject(game.object3);
						handler.addObject_recall(game.object3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.removeObject(game.object4);
						handler.addObject_recall(game.object4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.removeObject(game.object5);
						handler.addObject_recall(game.object5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.removeObject(game.object6);
						handler.addObject_recall(game.object6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.removeObject(game.object7);
						handler.addObject_recall(game.object7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.removeObject(game.object8);
						handler.addObject_recall(game.object8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.removeObject(game.object9);
						handler.addObject_recall(game.object9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.removeObject(game.object10);
						handler.addObject_recall(game.object10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.removeObject(game.object11);
						handler.addObject_recall(game.object11);
					}
				} else if (hud.getLevel() == 7) { // level 7
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.removeObject(game.object1);
						handler.addObject_recall(game.object1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.removeObject(game.object2);
						handler.addObject_recall(game.object2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.removeObject(game.object3);
						handler.addObject_recall(game.object3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.removeObject(game.object4);
						handler.addObject_recall(game.object4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.removeObject(game.object5);
						handler.addObject_recall(game.object5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.removeObject(game.object6);
						handler.addObject_recall(game.object6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.removeObject(game.object7);
						handler.addObject_recall(game.object7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.removeObject(game.object8);
						handler.addObject_recall(game.object8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.removeObject(game.object9);
						handler.addObject_recall(game.object9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.removeObject(game.object10);
						handler.addObject_recall(game.object10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.removeObject(game.object11);
						handler.addObject_recall(game.object11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.removeObject(game.object12);
						handler.addObject_recall(game.object12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.removeObject(game.object13);
						handler.addObject_recall(game.object13);
					}
				} else if (hud.getLevel() == 8) { // level 8
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.removeObject(game.object1);
						handler.addObject_recall(game.object1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.removeObject(game.object2);
						handler.addObject_recall(game.object2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.removeObject(game.object3);
						handler.addObject_recall(game.object3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.removeObject(game.object4);
						handler.addObject_recall(game.object4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.removeObject(game.object5);
						handler.addObject_recall(game.object5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.removeObject(game.object6);
						handler.addObject_recall(game.object6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.removeObject(game.object7);
						handler.addObject_recall(game.object7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.removeObject(game.object8);
						handler.addObject_recall(game.object8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.removeObject(game.object9);
						handler.addObject_recall(game.object9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.removeObject(game.object10);
						handler.addObject_recall(game.object10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.removeObject(game.object11);
						handler.addObject_recall(game.object11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.removeObject(game.object12);
						handler.addObject_recall(game.object12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.removeObject(game.object13);
						handler.addObject_recall(game.object13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.removeObject(game.object14);
						handler.addObject_recall(game.object14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.removeObject(game.object15);
						handler.addObject_recall(game.object15);
					}
				} else if (hud.getLevel() == 9) { // level 9
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.removeObject(game.object1);
						handler.addObject_recall(game.object1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.removeObject(game.object2);
						handler.addObject_recall(game.object2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.removeObject(game.object3);
						handler.addObject_recall(game.object3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.removeObject(game.object4);
						handler.addObject_recall(game.object4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.removeObject(game.object5);
						handler.addObject_recall(game.object5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.removeObject(game.object6);
						handler.addObject_recall(game.object6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.removeObject(game.object7);
						handler.addObject_recall(game.object7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.removeObject(game.object8);
						handler.addObject_recall(game.object8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.removeObject(game.object9);
						handler.addObject_recall(game.object9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.removeObject(game.object10);
						handler.addObject_recall(game.object10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.removeObject(game.object11);
						handler.addObject_recall(game.object11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.removeObject(game.object12);
						handler.addObject_recall(game.object12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.removeObject(game.object13);
						handler.addObject_recall(game.object13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.removeObject(game.object14);
						handler.addObject_recall(game.object14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.removeObject(game.object15);
						handler.addObject_recall(game.object15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.removeObject(game.object16);
						handler.addObject_recall(game.object16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.removeObject(game.object17);
						handler.addObject_recall(game.object17);
					}
				} else if (hud.getLevel() == 10) { // level 10
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.removeObject(game.object1);
						handler.addObject_recall(game.object1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.removeObject(game.object2);
						handler.addObject_recall(game.object2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.removeObject(game.object3);
						handler.addObject_recall(game.object3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.removeObject(game.object4);
						handler.addObject_recall(game.object4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.removeObject(game.object5);
						handler.addObject_recall(game.object5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.removeObject(game.object6);
						handler.addObject_recall(game.object6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.removeObject(game.object7);
						handler.addObject_recall(game.object7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.removeObject(game.object8);
						handler.addObject_recall(game.object8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.removeObject(game.object9);
						handler.addObject_recall(game.object9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.removeObject(game.object10);
						handler.addObject_recall(game.object10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.removeObject(game.object11);
						handler.addObject_recall(game.object11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.removeObject(game.object12);
						handler.addObject_recall(game.object12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.removeObject(game.object13);
						handler.addObject_recall(game.object13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.removeObject(game.object14);
						handler.addObject_recall(game.object14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.removeObject(game.object15);
						handler.addObject_recall(game.object15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.removeObject(game.object16);
						handler.addObject_recall(game.object16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.removeObject(game.object17);
						handler.addObject_recall(game.object17);
					} else if (mouseOver(mx, my, 300, 400, 40, 40)) {
						handler.removeObject(game.object18);
						handler.addObject_recall(game.object18);
					} else if (mouseOver(mx, my, 300, 500, 40, 40)) {
						handler.removeObject(game.object19);
						handler.addObject_recall(game.object19);
					}
				} else if (hud.getLevel() == 11) { // level 11
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.removeObject(game.object1);
						handler.addObject_recall(game.object1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.removeObject(game.object2);
						handler.addObject_recall(game.object2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.removeObject(game.object3);
						handler.addObject_recall(game.object3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.removeObject(game.object4);
						handler.addObject_recall(game.object4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.removeObject(game.object5);
						handler.addObject_recall(game.object5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.removeObject(game.object6);
						handler.addObject_recall(game.object6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.removeObject(game.object7);
						handler.addObject_recall(game.object7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.removeObject(game.object8);
						handler.addObject_recall(game.object8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.removeObject(game.object9);
						handler.addObject_recall(game.object9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.removeObject(game.object10);
						handler.addObject_recall(game.object10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.removeObject(game.object11);
						handler.addObject_recall(game.object11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.removeObject(game.object12);
						handler.addObject_recall(game.object12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.removeObject(game.object13);
						handler.addObject_recall(game.object13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.removeObject(game.object14);
						handler.addObject_recall(game.object14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.removeObject(game.object15);
						handler.addObject_recall(game.object15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.removeObject(game.object16);
						handler.addObject_recall(game.object16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.removeObject(game.object17);
						handler.addObject_recall(game.object17);
					} else if (mouseOver(mx, my, 300, 400, 40, 40)) {
						handler.removeObject(game.object18);
						handler.addObject_recall(game.object18);
					} else if (mouseOver(mx, my, 300, 500, 40, 40)) {
						handler.removeObject(game.object19);
						handler.addObject_recall(game.object19);
					} else if (mouseOver(mx, my, 300, 600, 40, 40)) {
						handler.removeObject(game.object20);
						handler.addObject_recall(game.object20);
					} else if (mouseOver(mx, my, 300, 700, 40, 40)) {
						handler.removeObject(game.object21);
						handler.addObject_recall(game.object21);
					} else if (mouseOver(mx, my, 400, 100, 40, 40)) {
						handler.removeObject(game.object22);
						handler.addObject_recall(game.object22);
					}
				} else if (hud.getLevel() == 12) { // level 12
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.removeObject(game.object1);
						handler.addObject_recall(game.object1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.removeObject(game.object2);
						handler.addObject_recall(game.object2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.removeObject(game.object3);
						handler.addObject_recall(game.object3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.removeObject(game.object4);
						handler.addObject_recall(game.object4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.removeObject(game.object5);
						handler.addObject_recall(game.object5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.removeObject(game.object6);
						handler.addObject_recall(game.object6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.removeObject(game.object7);
						handler.addObject_recall(game.object7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.removeObject(game.object8);
						handler.addObject_recall(game.object8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.removeObject(game.object9);
						handler.addObject_recall(game.object9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.removeObject(game.object10);
						handler.addObject_recall(game.object10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.removeObject(game.object11);
						handler.addObject_recall(game.object11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.removeObject(game.object12);
						handler.addObject_recall(game.object12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.removeObject(game.object13);
						handler.addObject_recall(game.object13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.removeObject(game.object14);
						handler.addObject_recall(game.object14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.removeObject(game.object15);
						handler.addObject_recall(game.object15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.removeObject(game.object16);
						handler.addObject_recall(game.object16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.removeObject(game.object17);
						handler.addObject_recall(game.object17);
					} else if (mouseOver(mx, my, 300, 400, 40, 40)) {
						handler.removeObject(game.object18);
						handler.addObject_recall(game.object18);
					} else if (mouseOver(mx, my, 300, 500, 40, 40)) {
						handler.removeObject(game.object19);
						handler.addObject_recall(game.object19);
					} else if (mouseOver(mx, my, 300, 600, 40, 40)) {
						handler.removeObject(game.object20);
						handler.addObject_recall(game.object20);
					} else if (mouseOver(mx, my, 300, 700, 40, 40)) {
						handler.removeObject(game.object21);
						handler.addObject_recall(game.object21);
					} else if (mouseOver(mx, my, 400, 100, 40, 40)) {
						handler.removeObject(game.object22);
						handler.addObject_recall(game.object22);
					} else if (mouseOver(mx, my, 400, 200, 40, 40)) {
						handler.removeObject(game.object23);
						handler.addObject_recall(game.object23);
					} else if (mouseOver(mx, my, 400, 300, 40, 40)) {
						handler.removeObject(game.object24);
						handler.addObject_recall(game.object24);
					}
				} else if (hud.getLevel() == 13) { // level 13
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.removeObject(game.object1);
						handler.addObject_recall(game.object1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.removeObject(game.object2);
						handler.addObject_recall(game.object2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.removeObject(game.object3);
						handler.addObject_recall(game.object3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.removeObject(game.object4);
						handler.addObject_recall(game.object4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.removeObject(game.object5);
						handler.addObject_recall(game.object5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.removeObject(game.object6);
						handler.addObject_recall(game.object6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.removeObject(game.object7);
						handler.addObject_recall(game.object7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.removeObject(game.object8);
						handler.addObject_recall(game.object8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.removeObject(game.object9);
						handler.addObject_recall(game.object9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.removeObject(game.object10);
						handler.addObject_recall(game.object10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.removeObject(game.object11);
						handler.addObject_recall(game.object11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.removeObject(game.object12);
						handler.addObject_recall(game.object12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.removeObject(game.object13);
						handler.addObject_recall(game.object13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.removeObject(game.object14);
						handler.addObject_recall(game.object14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.removeObject(game.object15);
						handler.addObject_recall(game.object15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.removeObject(game.object16);
						handler.addObject_recall(game.object16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.removeObject(game.object17);
						handler.addObject_recall(game.object17);
					} else if (mouseOver(mx, my, 300, 400, 40, 40)) {
						handler.removeObject(game.object18);
						handler.addObject_recall(game.object18);
					} else if (mouseOver(mx, my, 300, 500, 40, 40)) {
						handler.removeObject(game.object19);
						handler.addObject_recall(game.object19);
					} else if (mouseOver(mx, my, 300, 600, 40, 40)) {
						handler.removeObject(game.object20);
						handler.addObject_recall(game.object20);
					} else if (mouseOver(mx, my, 300, 700, 40, 40)) {
						handler.removeObject(game.object21);
						handler.addObject_recall(game.object21);
					} else if (mouseOver(mx, my, 400, 100, 40, 40)) {
						handler.removeObject(game.object22);
						handler.addObject_recall(game.object22);
					} else if (mouseOver(mx, my, 400, 200, 40, 40)) {
						handler.removeObject(game.object23);
						handler.addObject_recall(game.object23);
					} else if (mouseOver(mx, my, 400, 300, 40, 40)) {
						handler.removeObject(game.object24);
						handler.addObject_recall(game.object24);
					} else if (mouseOver(mx, my, 400, 400, 40, 40)) {
						handler.removeObject(game.object25);
						handler.addObject_recall(game.object25);
					} else if (mouseOver(mx, my, 400, 500, 40, 40)) {
						handler.removeObject(game.object26);
						handler.addObject_recall(game.object26);
					}
				} else if (hud.getLevel() == 14) { // level 14
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.removeObject(game.object1);
						handler.addObject_recall(game.object1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.removeObject(game.object2);
						handler.addObject_recall(game.object2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.removeObject(game.object3);
						handler.addObject_recall(game.object3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.removeObject(game.object4);
						handler.addObject_recall(game.object4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.removeObject(game.object5);
						handler.addObject_recall(game.object5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.removeObject(game.object6);
						handler.addObject_recall(game.object6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.removeObject(game.object7);
						handler.addObject_recall(game.object7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.removeObject(game.object8);
						handler.addObject_recall(game.object8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.removeObject(game.object9);
						handler.addObject_recall(game.object9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.removeObject(game.object10);
						handler.addObject_recall(game.object10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.removeObject(game.object11);
						handler.addObject_recall(game.object11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.removeObject(game.object12);
						handler.addObject_recall(game.object12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.removeObject(game.object13);
						handler.addObject_recall(game.object13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.removeObject(game.object14);
						handler.addObject_recall(game.object14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.removeObject(game.object15);
						handler.addObject_recall(game.object15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.removeObject(game.object16);
						handler.addObject_recall(game.object16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.removeObject(game.object17);
						handler.addObject_recall(game.object17);
					} else if (mouseOver(mx, my, 300, 400, 40, 40)) {
						handler.removeObject(game.object18);
						handler.addObject_recall(game.object18);
					} else if (mouseOver(mx, my, 300, 500, 40, 40)) {
						handler.removeObject(game.object19);
						handler.addObject_recall(game.object19);
					} else if (mouseOver(mx, my, 300, 600, 40, 40)) {
						handler.removeObject(game.object20);
						handler.addObject_recall(game.object20);
					} else if (mouseOver(mx, my, 300, 700, 40, 40)) {
						handler.removeObject(game.object21);
						handler.addObject_recall(game.object21);
					} else if (mouseOver(mx, my, 400, 100, 40, 40)) {
						handler.removeObject(game.object22);
						handler.addObject_recall(game.object22);
					} else if (mouseOver(mx, my, 400, 200, 40, 40)) {
						handler.removeObject(game.object23);
						handler.addObject_recall(game.object23);
					} else if (mouseOver(mx, my, 400, 300, 40, 40)) {
						handler.removeObject(game.object24);
						handler.addObject_recall(game.object24);
					} else if (mouseOver(mx, my, 400, 400, 40, 40)) {
						handler.removeObject(game.object25);
						handler.addObject_recall(game.object25);
					} else if (mouseOver(mx, my, 400, 500, 40, 40)) {
						handler.removeObject(game.object26);
						handler.addObject_recall(game.object26);
					} else if (mouseOver(mx, my, 400, 600, 40, 40)) {
						handler.removeObject(game.object27);
						handler.addObject_recall(game.object27);
					} else if (mouseOver(mx, my, 400, 700, 40, 40)) {
						handler.removeObject(game.object28);
						handler.addObject_recall(game.object28);
					}
				} else if (hud.getLevel() == 15) { // level 15
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.removeObject(game.object1);
						handler.addObject_recall(game.object1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.removeObject(game.object2);
						handler.addObject_recall(game.object2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.removeObject(game.object3);
						handler.addObject_recall(game.object3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.removeObject(game.object4);
						handler.addObject_recall(game.object4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.removeObject(game.object5);
						handler.addObject_recall(game.object5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.removeObject(game.object6);
						handler.addObject_recall(game.object6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.removeObject(game.object7);
						handler.addObject_recall(game.object7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.removeObject(game.object8);
						handler.addObject_recall(game.object8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.removeObject(game.object9);
						handler.addObject_recall(game.object9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.removeObject(game.object10);
						handler.addObject_recall(game.object10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.removeObject(game.object11);
						handler.addObject_recall(game.object11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.removeObject(game.object12);
						handler.addObject_recall(game.object12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.removeObject(game.object13);
						handler.addObject_recall(game.object13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.removeObject(game.object14);
						handler.addObject_recall(game.object14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.removeObject(game.object15);
						handler.addObject_recall(game.object15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.removeObject(game.object16);
						handler.addObject_recall(game.object16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.removeObject(game.object17);
						handler.addObject_recall(game.object17);
					} else if (mouseOver(mx, my, 300, 400, 40, 40)) {
						handler.removeObject(game.object18);
						handler.addObject_recall(game.object18);
					} else if (mouseOver(mx, my, 300, 500, 40, 40)) {
						handler.removeObject(game.object19);
						handler.addObject_recall(game.object19);
					} else if (mouseOver(mx, my, 300, 600, 40, 40)) {
						handler.removeObject(game.object20);
						handler.addObject_recall(game.object20);
					} else if (mouseOver(mx, my, 300, 700, 40, 40)) {
						handler.removeObject(game.object21);
						handler.addObject_recall(game.object21);
					} else if (mouseOver(mx, my, 400, 100, 40, 40)) {
						handler.removeObject(game.object22);
						handler.addObject_recall(game.object22);
					} else if (mouseOver(mx, my, 400, 200, 40, 40)) {
						handler.removeObject(game.object23);
						handler.addObject_recall(game.object23);
					} else if (mouseOver(mx, my, 400, 300, 40, 40)) {
						handler.removeObject(game.object24);
						handler.addObject_recall(game.object24);
					} else if (mouseOver(mx, my, 400, 400, 40, 40)) {
						handler.removeObject(game.object25);
						handler.addObject_recall(game.object25);
					} else if (mouseOver(mx, my, 400, 500, 40, 40)) {
						handler.removeObject(game.object26);
						handler.addObject_recall(game.object26);
					} else if (mouseOver(mx, my, 400, 600, 40, 40)) {
						handler.removeObject(game.object27);
						handler.addObject_recall(game.object27);
					} else if (mouseOver(mx, my, 400, 700, 40, 40)) {
						handler.removeObject(game.object28);
						handler.addObject_recall(game.object28);
					} else if (mouseOver(mx, my, 500, 100, 40, 40)) {
						handler.removeObject(game.object29);
						handler.addObject_recall(game.object29);
					} else if (mouseOver(mx, my, 500, 200, 40, 40)) {
						handler.removeObject(game.object30);
						handler.addObject_recall(game.object30);
					}
				} else if (hud.getLevel() == 16) { // level 16
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.removeObject(game.object1);
						handler.addObject_recall(game.object1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.removeObject(game.object2);
						handler.addObject_recall(game.object2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.removeObject(game.object3);
						handler.addObject_recall(game.object3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.removeObject(game.object4);
						handler.addObject_recall(game.object4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.removeObject(game.object5);
						handler.addObject_recall(game.object5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.removeObject(game.object6);
						handler.addObject_recall(game.object6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.removeObject(game.object7);
						handler.addObject_recall(game.object7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.removeObject(game.object8);
						handler.addObject_recall(game.object8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.removeObject(game.object9);
						handler.addObject_recall(game.object9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.removeObject(game.object10);
						handler.addObject_recall(game.object10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.removeObject(game.object11);
						handler.addObject_recall(game.object11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.removeObject(game.object12);
						handler.addObject_recall(game.object12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.removeObject(game.object13);
						handler.addObject_recall(game.object13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.removeObject(game.object14);
						handler.addObject_recall(game.object14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.removeObject(game.object15);
						handler.addObject_recall(game.object15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.removeObject(game.object16);
						handler.addObject_recall(game.object16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.removeObject(game.object17);
						handler.addObject_recall(game.object17);
					} else if (mouseOver(mx, my, 300, 400, 40, 40)) {
						handler.removeObject(game.object18);
						handler.addObject_recall(game.object18);
					} else if (mouseOver(mx, my, 300, 500, 40, 40)) {
						handler.removeObject(game.object19);
						handler.addObject_recall(game.object19);
					} else if (mouseOver(mx, my, 300, 600, 40, 40)) {
						handler.removeObject(game.object20);
						handler.addObject_recall(game.object20);
					} else if (mouseOver(mx, my, 300, 700, 40, 40)) {
						handler.removeObject(game.object21);
						handler.addObject_recall(game.object21);
					} else if (mouseOver(mx, my, 400, 100, 40, 40)) {
						handler.removeObject(game.object22);
						handler.addObject_recall(game.object22);
					} else if (mouseOver(mx, my, 400, 200, 40, 40)) {
						handler.removeObject(game.object23);
						handler.addObject_recall(game.object23);
					} else if (mouseOver(mx, my, 400, 300, 40, 40)) {
						handler.removeObject(game.object24);
						handler.addObject_recall(game.object24);
					} else if (mouseOver(mx, my, 400, 400, 40, 40)) {
						handler.removeObject(game.object25);
						handler.addObject_recall(game.object25);
					} else if (mouseOver(mx, my, 400, 500, 40, 40)) {
						handler.removeObject(game.object26);
						handler.addObject_recall(game.object26);
					} else if (mouseOver(mx, my, 400, 600, 40, 40)) {
						handler.removeObject(game.object27);
						handler.addObject_recall(game.object27);
					} else if (mouseOver(mx, my, 400, 700, 40, 40)) {
						handler.removeObject(game.object28);
						handler.addObject_recall(game.object28);
					} else if (mouseOver(mx, my, 500, 100, 40, 40)) {
						handler.removeObject(game.object29);
						handler.addObject_recall(game.object29);
					} else if (mouseOver(mx, my, 500, 200, 40, 40)) {
						handler.removeObject(game.object30);
						handler.addObject_recall(game.object30);
					} else if (mouseOver(mx, my, 500, 300, 40, 40)) {
						handler.removeObject(game.object31);
						handler.addObject_recall(game.object31);
					} else if (mouseOver(mx, my, 500, 400, 40, 40)) {
						handler.removeObject(game.object32);
						handler.addObject_recall(game.object32);
					}
				} else if (hud.getLevel() == 17) { // level 17
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.removeObject(game.object1);
						handler.addObject_recall(game.object1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.removeObject(game.object2);
						handler.addObject_recall(game.object2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.removeObject(game.object3);
						handler.addObject_recall(game.object3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.removeObject(game.object4);
						handler.addObject_recall(game.object4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.removeObject(game.object5);
						handler.addObject_recall(game.object5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.removeObject(game.object6);
						handler.addObject_recall(game.object6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.removeObject(game.object7);
						handler.addObject_recall(game.object7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.removeObject(game.object8);
						handler.addObject_recall(game.object8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.removeObject(game.object9);
						handler.addObject_recall(game.object9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.removeObject(game.object10);
						handler.addObject_recall(game.object10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.removeObject(game.object11);
						handler.addObject_recall(game.object11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.removeObject(game.object12);
						handler.addObject_recall(game.object12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.removeObject(game.object13);
						handler.addObject_recall(game.object13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.removeObject(game.object14);
						handler.addObject_recall(game.object14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.removeObject(game.object15);
						handler.addObject_recall(game.object15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.removeObject(game.object16);
						handler.addObject_recall(game.object16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.removeObject(game.object17);
						handler.addObject_recall(game.object17);
					} else if (mouseOver(mx, my, 300, 400, 40, 40)) {
						handler.removeObject(game.object18);
						handler.addObject_recall(game.object18);
					} else if (mouseOver(mx, my, 300, 500, 40, 40)) {
						handler.removeObject(game.object19);
						handler.addObject_recall(game.object19);
					} else if (mouseOver(mx, my, 300, 600, 40, 40)) {
						handler.removeObject(game.object20);
						handler.addObject_recall(game.object20);
					} else if (mouseOver(mx, my, 300, 700, 40, 40)) {
						handler.removeObject(game.object21);
						handler.addObject_recall(game.object21);
					} else if (mouseOver(mx, my, 400, 100, 40, 40)) {
						handler.removeObject(game.object22);
						handler.addObject_recall(game.object22);
					} else if (mouseOver(mx, my, 400, 200, 40, 40)) {
						handler.removeObject(game.object23);
						handler.addObject_recall(game.object23);
					} else if (mouseOver(mx, my, 400, 300, 40, 40)) {
						handler.removeObject(game.object24);
						handler.addObject_recall(game.object24);
					} else if (mouseOver(mx, my, 400, 400, 40, 40)) {
						handler.removeObject(game.object25);
						handler.addObject_recall(game.object25);
					} else if (mouseOver(mx, my, 400, 500, 40, 40)) {
						handler.removeObject(game.object26);
						handler.addObject_recall(game.object26);
					} else if (mouseOver(mx, my, 400, 600, 40, 40)) {
						handler.removeObject(game.object27);
						handler.addObject_recall(game.object27);
					} else if (mouseOver(mx, my, 400, 700, 40, 40)) {
						handler.removeObject(game.object28);
						handler.addObject_recall(game.object28);
					} else if (mouseOver(mx, my, 500, 100, 40, 40)) {
						handler.removeObject(game.object29);
						handler.addObject_recall(game.object29);
					} else if (mouseOver(mx, my, 500, 200, 40, 40)) {
						handler.removeObject(game.object30);
						handler.addObject_recall(game.object30);
					} else if (mouseOver(mx, my, 500, 300, 40, 40)) {
						handler.removeObject(game.object31);
						handler.addObject_recall(game.object31);
					} else if (mouseOver(mx, my, 500, 400, 40, 40)) {
						handler.removeObject(game.object32);
						handler.addObject_recall(game.object32);
					} else if (mouseOver(mx, my, 500, 500, 40, 40)) {
						handler.removeObject(game.object33);
						handler.addObject_recall(game.object33);
					} else if (mouseOver(mx, my, 500, 600, 40, 40)) {
						handler.removeObject(game.object34);
						handler.addObject_recall(game.object34);
					}
				} else if (hud.getLevel() == 18) { // level 18
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.removeObject(game.object1);
						handler.addObject_recall(game.object1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.removeObject(game.object2);
						handler.addObject_recall(game.object2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.removeObject(game.object3);
						handler.addObject_recall(game.object3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.removeObject(game.object4);
						handler.addObject_recall(game.object4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.removeObject(game.object5);
						handler.addObject_recall(game.object5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.removeObject(game.object6);
						handler.addObject_recall(game.object6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.removeObject(game.object7);
						handler.addObject_recall(game.object7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.removeObject(game.object8);
						handler.addObject_recall(game.object8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.removeObject(game.object9);
						handler.addObject_recall(game.object9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.removeObject(game.object10);
						handler.addObject_recall(game.object10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.removeObject(game.object11);
						handler.addObject_recall(game.object11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.removeObject(game.object12);
						handler.addObject_recall(game.object12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.removeObject(game.object13);
						handler.addObject_recall(game.object13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.removeObject(game.object14);
						handler.addObject_recall(game.object14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.removeObject(game.object15);
						handler.addObject_recall(game.object15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.removeObject(game.object16);
						handler.addObject_recall(game.object16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.removeObject(game.object17);
						handler.addObject_recall(game.object17);
					} else if (mouseOver(mx, my, 300, 400, 40, 40)) {
						handler.removeObject(game.object18);
						handler.addObject_recall(game.object18);
					} else if (mouseOver(mx, my, 300, 500, 40, 40)) {
						handler.removeObject(game.object19);
						handler.addObject_recall(game.object19);
					} else if (mouseOver(mx, my, 300, 600, 40, 40)) {
						handler.removeObject(game.object20);
						handler.addObject_recall(game.object20);
					} else if (mouseOver(mx, my, 300, 700, 40, 40)) {
						handler.removeObject(game.object21);
						handler.addObject_recall(game.object21);
					} else if (mouseOver(mx, my, 400, 100, 40, 40)) {
						handler.removeObject(game.object22);
						handler.addObject_recall(game.object22);
					} else if (mouseOver(mx, my, 400, 200, 40, 40)) {
						handler.removeObject(game.object23);
						handler.addObject_recall(game.object23);
					} else if (mouseOver(mx, my, 400, 300, 40, 40)) {
						handler.removeObject(game.object24);
						handler.addObject_recall(game.object24);
					} else if (mouseOver(mx, my, 400, 400, 40, 40)) {
						handler.removeObject(game.object25);
						handler.addObject_recall(game.object25);
					} else if (mouseOver(mx, my, 400, 500, 40, 40)) {
						handler.removeObject(game.object26);
						handler.addObject_recall(game.object26);
					} else if (mouseOver(mx, my, 400, 600, 40, 40)) {
						handler.removeObject(game.object27);
						handler.addObject_recall(game.object27);
					} else if (mouseOver(mx, my, 400, 700, 40, 40)) {
						handler.removeObject(game.object28);
						handler.addObject_recall(game.object28);
					} else if (mouseOver(mx, my, 500, 100, 40, 40)) {
						handler.removeObject(game.object29);
						handler.addObject_recall(game.object29);
					} else if (mouseOver(mx, my, 500, 200, 40, 40)) {
						handler.removeObject(game.object30);
						handler.addObject_recall(game.object30);
					} else if (mouseOver(mx, my, 500, 300, 40, 40)) {
						handler.removeObject(game.object31);
						handler.addObject_recall(game.object31);
					} else if (mouseOver(mx, my, 500, 400, 40, 40)) {
						handler.removeObject(game.object32);
						handler.addObject_recall(game.object32);
					} else if (mouseOver(mx, my, 500, 500, 40, 40)) {
						handler.removeObject(game.object33);
						handler.addObject_recall(game.object33);
					} else if (mouseOver(mx, my, 500, 600, 40, 40)) {
						handler.removeObject(game.object34);
						handler.addObject_recall(game.object34);
					} else if (mouseOver(mx, my, 500, 700, 40, 40)) {
						handler.removeObject(game.object35);
						handler.addObject_recall(game.object35);
					} else if (mouseOver(mx, my, 600, 100, 40, 40)) {
						handler.removeObject(game.object36);
						handler.addObject_recall(game.object36);
					}
				} else if (hud.getLevel() == 19) { // level 19
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.removeObject(game.object1);
						handler.addObject_recall(game.object1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.removeObject(game.object2);
						handler.addObject_recall(game.object2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.removeObject(game.object3);
						handler.addObject_recall(game.object3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.removeObject(game.object4);
						handler.addObject_recall(game.object4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.removeObject(game.object5);
						handler.addObject_recall(game.object5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.removeObject(game.object6);
						handler.addObject_recall(game.object6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.removeObject(game.object7);
						handler.addObject_recall(game.object7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.removeObject(game.object8);
						handler.addObject_recall(game.object8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.removeObject(game.object9);
						handler.addObject_recall(game.object9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.removeObject(game.object10);
						handler.addObject_recall(game.object10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.removeObject(game.object11);
						handler.addObject_recall(game.object11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.removeObject(game.object12);
						handler.addObject_recall(game.object12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.removeObject(game.object13);
						handler.addObject_recall(game.object13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.removeObject(game.object14);
						handler.addObject_recall(game.object14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.removeObject(game.object15);
						handler.addObject_recall(game.object15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.removeObject(game.object16);
						handler.addObject_recall(game.object16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.removeObject(game.object17);
						handler.addObject_recall(game.object17);
					} else if (mouseOver(mx, my, 300, 400, 40, 40)) {
						handler.removeObject(game.object18);
						handler.addObject_recall(game.object18);
					} else if (mouseOver(mx, my, 300, 500, 40, 40)) {
						handler.removeObject(game.object19);
						handler.addObject_recall(game.object19);
					} else if (mouseOver(mx, my, 300, 600, 40, 40)) {
						handler.removeObject(game.object20);
						handler.addObject_recall(game.object20);
					} else if (mouseOver(mx, my, 300, 700, 40, 40)) {
						handler.removeObject(game.object21);
						handler.addObject_recall(game.object21);
					} else if (mouseOver(mx, my, 400, 100, 40, 40)) {
						handler.removeObject(game.object22);
						handler.addObject_recall(game.object22);
					} else if (mouseOver(mx, my, 400, 200, 40, 40)) {
						handler.removeObject(game.object23);
						handler.addObject_recall(game.object23);
					} else if (mouseOver(mx, my, 400, 300, 40, 40)) {
						handler.removeObject(game.object24);
						handler.addObject_recall(game.object24);
					} else if (mouseOver(mx, my, 400, 400, 40, 40)) {
						handler.removeObject(game.object25);
						handler.addObject_recall(game.object25);
					} else if (mouseOver(mx, my, 400, 500, 40, 40)) {
						handler.removeObject(game.object26);
						handler.addObject_recall(game.object26);
					} else if (mouseOver(mx, my, 400, 600, 40, 40)) {
						handler.removeObject(game.object27);
						handler.addObject_recall(game.object27);
					} else if (mouseOver(mx, my, 400, 700, 40, 40)) {
						handler.removeObject(game.object28);
						handler.addObject_recall(game.object28);
					} else if (mouseOver(mx, my, 500, 100, 40, 40)) {
						handler.removeObject(game.object29);
						handler.addObject_recall(game.object29);
					} else if (mouseOver(mx, my, 500, 200, 40, 40)) {
						handler.removeObject(game.object30);
						handler.addObject_recall(game.object30);
					} else if (mouseOver(mx, my, 500, 300, 40, 40)) {
						handler.removeObject(game.object31);
						handler.addObject_recall(game.object31);
					} else if (mouseOver(mx, my, 500, 400, 40, 40)) {
						handler.removeObject(game.object32);
						handler.addObject_recall(game.object32);
					} else if (mouseOver(mx, my, 500, 500, 40, 40)) {
						handler.removeObject(game.object33);
						handler.addObject_recall(game.object33);
					} else if (mouseOver(mx, my, 500, 600, 40, 40)) {
						handler.removeObject(game.object34);
						handler.addObject_recall(game.object34);
					} else if (mouseOver(mx, my, 500, 700, 40, 40)) {
						handler.removeObject(game.object35);
						handler.addObject_recall(game.object35);
					} else if (mouseOver(mx, my, 600, 100, 40, 40)) {
						handler.removeObject(game.object36);
						handler.addObject_recall(game.object36);
					} else if (mouseOver(mx, my, 600, 200, 40, 40)) {
						handler.removeObject(game.object39);
						handler.addObject_recall(game.object39);
					} else if (mouseOver(mx, my, 600, 300, 40, 40)) {
						handler.removeObject(game.object40);
						handler.addObject_recall(game.object40);
					}
				} else if (hud.getLevel() == 20) { // level 20
					if (mouseOver(mx, my, 100, 100, 40, 40)) {
						handler.removeObject(game.object1);
						handler.addObject_recall(game.object1);
					} else if (mouseOver(mx, my, 100, 200, 40, 40)) {
						handler.removeObject(game.object2);
						handler.addObject_recall(game.object2);
					} else if (mouseOver(mx, my, 100, 300, 40, 40)) {
						handler.removeObject(game.object3);
						handler.addObject_recall(game.object3);
					} else if (mouseOver(mx, my, 100, 400, 40, 40)) {
						handler.removeObject(game.object4);
						handler.addObject_recall(game.object4);
					} else if (mouseOver(mx, my, 100, 500, 40, 40)) {
						handler.removeObject(game.object5);
						handler.addObject_recall(game.object5);
					} else if (mouseOver(mx, my, 100, 600, 40, 40)) {
						handler.removeObject(game.object6);
						handler.addObject_recall(game.object6);
					} else if (mouseOver(mx, my, 100, 700, 40, 40)) {
						handler.removeObject(game.object7);
						handler.addObject_recall(game.object7);
					} else if (mouseOver(mx, my, 200, 100, 40, 40)) {
						handler.removeObject(game.object8);
						handler.addObject_recall(game.object8);
					} else if (mouseOver(mx, my, 200, 200, 40, 40)) {
						handler.removeObject(game.object9);
						handler.addObject_recall(game.object9);
					} else if (mouseOver(mx, my, 200, 300, 40, 40)) {
						handler.removeObject(game.object10);
						handler.addObject_recall(game.object10);
					} else if (mouseOver(mx, my, 200, 400, 40, 40)) {
						handler.removeObject(game.object11);
						handler.addObject_recall(game.object11);
					} else if (mouseOver(mx, my, 200, 500, 40, 40)) {
						handler.removeObject(game.object12);
						handler.addObject_recall(game.object12);
					} else if (mouseOver(mx, my, 200, 600, 40, 40)) {
						handler.removeObject(game.object13);
						handler.addObject_recall(game.object13);
					} else if (mouseOver(mx, my, 200, 700, 40, 40)) {
						handler.removeObject(game.object14);
						handler.addObject_recall(game.object14);
					} else if (mouseOver(mx, my, 300, 100, 40, 40)) {
						handler.removeObject(game.object15);
						handler.addObject_recall(game.object15);
					} else if (mouseOver(mx, my, 300, 200, 40, 40)) {
						handler.removeObject(game.object16);
						handler.addObject_recall(game.object16);
					} else if (mouseOver(mx, my, 300, 300, 40, 40)) {
						handler.removeObject(game.object17);
						handler.addObject_recall(game.object17);
					} else if (mouseOver(mx, my, 300, 400, 40, 40)) {
						handler.removeObject(game.object18);
						handler.addObject_recall(game.object18);
					} else if (mouseOver(mx, my, 300, 500, 40, 40)) {
						handler.removeObject(game.object19);
						handler.addObject_recall(game.object19);
					} else if (mouseOver(mx, my, 300, 600, 40, 40)) {
						handler.removeObject(game.object20);
						handler.addObject_recall(game.object20);
					} else if (mouseOver(mx, my, 300, 700, 40, 40)) {
						handler.removeObject(game.object21);
						handler.addObject_recall(game.object21);
					} else if (mouseOver(mx, my, 400, 100, 40, 40)) {
						handler.removeObject(game.object22);
						handler.addObject_recall(game.object22);
					} else if (mouseOver(mx, my, 400, 200, 40, 40)) {
						handler.removeObject(game.object23);
						handler.addObject_recall(game.object23);
					} else if (mouseOver(mx, my, 400, 300, 40, 40)) {
						handler.removeObject(game.object24);
						handler.addObject_recall(game.object24);
					} else if (mouseOver(mx, my, 400, 400, 40, 40)) {
						handler.removeObject(game.object25);
						handler.addObject_recall(game.object25);
					} else if (mouseOver(mx, my, 400, 500, 40, 40)) {
						handler.removeObject(game.object26);
						handler.addObject_recall(game.object26);
					} else if (mouseOver(mx, my, 400, 600, 40, 40)) {
						handler.removeObject(game.object27);
						handler.addObject_recall(game.object27);
					} else if (mouseOver(mx, my, 400, 700, 40, 40)) {
						handler.removeObject(game.object28);
						handler.addObject_recall(game.object28);
					} else if (mouseOver(mx, my, 500, 100, 40, 40)) {
						handler.removeObject(game.object29);
						handler.addObject_recall(game.object29);
					} else if (mouseOver(mx, my, 500, 200, 40, 40)) {
						handler.removeObject(game.object30);
						handler.addObject_recall(game.object30);
					} else if (mouseOver(mx, my, 500, 300, 40, 40)) {
						handler.removeObject(game.object31);
						handler.addObject_recall(game.object31);
					} else if (mouseOver(mx, my, 500, 400, 40, 40)) {
						handler.removeObject(game.object32);
						handler.addObject_recall(game.object32);
					} else if (mouseOver(mx, my, 500, 500, 40, 40)) {
						handler.removeObject(game.object33);
						handler.addObject_recall(game.object33);
					} else if (mouseOver(mx, my, 500, 600, 40, 40)) {
						handler.removeObject(game.object34);
						handler.addObject_recall(game.object34);
					} else if (mouseOver(mx, my, 500, 700, 40, 40)) {
						handler.removeObject(game.object35);
						handler.addObject_recall(game.object35);
					} else if (mouseOver(mx, my, 600, 100, 40, 40)) {
						handler.removeObject(game.object36);
						handler.addObject_recall(game.object36);
					} else if (mouseOver(mx, my, 600, 200, 40, 40)) {
						handler.removeObject(game.object39);
						handler.addObject_recall(game.object39);
					} else if (mouseOver(mx, my, 600, 300, 40, 40)) {
						handler.removeObject(game.object40);
						handler.addObject_recall(game.object40);
					} else if (mouseOver(mx, my, 600, 400, 40, 40)) {
						handler.removeObject(game.object41);
						handler.addObject_recall(game.object41);
					} else if (mouseOver(mx, my, 600, 500, 40, 40)) {
						handler.removeObject(game.object42);
						handler.addObject_recall(game.object42);
					}
				}
		////////////////////////////////////////////////////////////////////////////////
			}
		}
	}

	public void mouseReleased(MouseEvent e) {

	}

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
		g.setColor(Color.white);
		g.drawRect(400, 700, 100, 20);
		g.drawString("Begin", 400, 720);
	}

}
