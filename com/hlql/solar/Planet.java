package com.hlql.solar;

import java.awt.Graphics;
import java.awt.Image;

public class Planet extends Star {

	// 除了图片,坐标. 行星沿着某个椭圆运行: 长轴,短轴,速度,角度,绕着某个star飞行
	double longAxis; // 椭圆的长轴
	double shortAxis; // 椭圆的短轴
	double speed; // 速度
	double degree; // 角度
	Star center;

	@Override
	public void draw(Graphics g) {
		g.drawImage(img, (int) x, (int) y, null);

		x = center.x + longAxis * Math.cos(degree);
		y = center.y + shortAxis * Math.sin(degree);

		degree += speed;
	}

	public Planet(String imgPath, double longAxis, double shortAxis, double speed, Star center) {
		this.center = center;
		this.x = center.x + longAxis;
		this.y = center.y;
		// this.img = GameUtil.getImage(imgPath);
		super(img);
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
	}


	public Planet(Image img, double x, double y) {
		super(img, x, y);
	}

	public Planet(String imgPath, double x, double y) {
		super(imgPath, x, y);
	}

}
