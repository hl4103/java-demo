package com.hlql.game;

import java.awt.Graphics;
import java.awt.Image;

public class GameFrame4 extends MyFrame {

	Image img = GameUtil.getImage("images/sun.png");
	private double x = 100, y = 100;
	private double degree = 3.14 / 3;
	private double speed = 10;

	@Override
	public void paint(Graphics g) {

		g.drawImage(img, (int) x, (int) y, null);
		x += speed * Math.cos(degree);
		y += speed * Math.sin(degree);
		if (y > 500 - 49 || y < 0) {
			degree = -degree;
		}
		if (x > 500 - 189 || x < 0) {
			degree = Math.PI - degree;
		}
		if (speed > 0) {
			speed -= 0.05;
		} else {
			speed = 0;
		}
	}

	public static void main(String[] args) {
		GameFrame4 gf = new GameFrame4();
		gf.launchFrame();
	}
}


