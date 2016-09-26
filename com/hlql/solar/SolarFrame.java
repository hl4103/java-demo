package com.hlql.solar;

import java.awt.Graphics;
import java.awt.Image;

public class SolarFrame extends MyFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Image bg = GameUtil.getImage("images/bg.png");
	Star sun = new Star("images/sun.png", Constant.GAME_WIDTH / 2, Constant.GAME_HEIGHT / 2);
	Planet earth = new Planet("images/earth.png", 150, 100, 0.1, sun);
	Planet moon = new Planet("images/moon.png", 30, 20, 0.3, earth);
	// Planet moon = new Planet("images/moon.png", 30, 20, 0.3, earth, true);
	Planet mars = new Planet("images/mars.png", 200, 130, 0.2, sun);

	@Override
	public void paint(Graphics g) {
		g.drawImage(bg, 0, 0, null);
		sun.draw(g);
		earth.draw(g);
		mars.draw(g);
		moon.draw(g);
	}

	public static void main(String[] args) {
		new SolarFrame().launchFrame();
	}
}
