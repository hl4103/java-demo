package com.hlql.game;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame3 extends Frame {

	Image img = GameUtil.getImage("images/sun.png");
	private double x = 100, y = 100;
	private double degree = 3.14 / 3;
	private double speed = 10;

	public void launchFrame() {
		setSize(500, 500);
		setLocation(100, 100);
		setVisible(true);
		
		new PaintThread().start();

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

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

	/**
	 * 定义一个重画窗口的线程类,是一个内部类
	 * 
	 * @author tom
	 *
	 */
	class PaintThread extends Thread {

		@Override
		public void run() {
			while (true) {
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		GameFrame3 gf = new GameFrame3();
		gf.launchFrame();
	}
}


