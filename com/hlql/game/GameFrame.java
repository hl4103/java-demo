package com.hlql.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame extends Frame {

	Image img = GameUtil.getImage("images/sun.png");
	double x = 100, y = 100;

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
		// TODO Auto-generated method stub
		// super.paint(g);
		Color c = g.getColor();
		g.drawLine(100, 200, 200, 100);
		g.drawRect(100, 200, 200, 100);
		g.drawOval(100, 200, 200, 100);
		g.drawString("Hello World", 200, 100);
		g.fillRect(100, 200, 50, 10);

		g.setColor(Color.blue);
		g.drawString("aaaaa", 100, 200);

		g.setColor(c);

		Font f = new Font("宋体", Font.BOLD, 100);
		g.setFont(f);
		g.drawString("您好", 200, 200);
		g.drawImage(img, (int) x, (int) y, null);

		x += 3;
		y += 3;
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
		GameFrame gf = new GameFrame();
		gf.launchFrame();
	}
}


