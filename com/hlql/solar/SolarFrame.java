package com.hlql.solar;

import java.awt.Graphics;
import java.awt.Image;

public class SolarFrame extends MyFrame {

	Image bg = GameUtil.getImage("images/bg.png");
	Star sun = new Star("images/sun.png", Constant.GAME_WIDTH / 2, Constant.GAME_HEIGHT / 2);
	Planet earth = new Planet("images/earth.png", 150, 100, 0.1, sun);

	@Override
	public void paint(Graphics g) {
		g.drawImage(bg, 0, 0, null);
		sun.draw(g);
	}

	public static void main(String[] args) {
		new SolarFrame().launchFrame();
	}
}
