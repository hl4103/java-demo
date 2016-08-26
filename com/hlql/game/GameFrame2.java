package com.hlql.game;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame2 extends Frame {

	Image img = GameUtil.getImage("images/sun.png");
	private double x = 0, y = 0;
	private boolean left;
	private boolean up;

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

		if (left) {
			x -= 3;
		} else {
			x += 3;
		}
		if (x > 500 - 189) {
			left = true;
		}
		if (x < 0) {
			left = false;
		}

		if (up) {
			y -= 3;
		} else {
			y += 3;
		}
		if (y > 500 - 49) {
			up = true;
		}
		if (y < 0) {
			up = false;
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
		GameFrame2 gf = new GameFrame2();
		gf.launchFrame();
	}
}


