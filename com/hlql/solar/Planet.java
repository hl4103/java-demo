package com.hlql.solar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Planet extends Star {

	// 除了图片,坐标. 行星沿着某个椭圆运行: 长轴,短轴,速度,角度,绕着某个star飞行
	double longAxis; // 椭圆的长轴
	double shortAxis; // 椭圆的短轴
	double speed; // 速度
	double degree; // 角度
	Star center;
	boolean satellite;

	@Override
	public void draw(Graphics g) {
		super.draw(g);
		if (!satellite) {
			drawTrace(g);
		}
		move();
	}

	/**
	 * 画运行轨迹
	 * 
	 * @param g
	 */
	public void drawTrace(Graphics g) {
		double ovalX, ovalY, ovalWidth, ovalHeight;
		ovalWidth = longAxis * 2;
		ovalHeight = shortAxis * 2;

		ovalX = center.x + center.width / 2 - longAxis;
		ovalY = center.y + center.height / 2 - shortAxis;

		Color c = g.getColor();
		g.setColor(Color.blue);
		g.drawOval((int) ovalX, (int) ovalY, (int) ovalWidth, (int) ovalHeight);
		g.setColor(c);
	}

	/**
	 * 移动方式
	 */
	public void move() {
		x = (center.x + center.width / 2) + longAxis * Math.cos(degree);
		y = (center.y + center.height / 2) + shortAxis * Math.sin(degree);

		degree += speed;
	}

	public Planet(String imgPath, double longAxis, double shortAxis, double speed, Star center) {
		super(GameUtil.getImage(imgPath));
		this.center = center;
		this.x = center.x + longAxis;
		this.y = center.y;
		// this.img = GameUtil.getImage(imgPath);
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
	}

	public Planet(String imgPath, double longAxis, double shortAxis, double speed, Star center, boolean satellite) {
		this(imgPath, longAxis, shortAxis, speed, center);
		this.satellite = satellite;
	}


	public Planet(Image img, double x, double y) {
		super(img, x, y);
	}

	public Planet(String imgPath, double x, double y) {
		super(imgPath, x, y);
	}

}
