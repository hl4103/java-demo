package com.hlql.solar;

import java.awt.Graphics;
import java.awt.Image;

public class Star {
	Image img;
	double x, y, width, height;

	public void draw(Graphics g) {
		g.drawImage(img, (int) x, (int) y, null);
	}

	public Star(Image img) {
		this.img = img;
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
	}

	public Star(Image img, double x, double y) {
		this(img);
		this.x = x;
		this.y = y;
	}

	public Star(String imgPath, double x, double y) {
		this(GameUtil.getImage(imgPath), x, y); // 通过this调用构造器.
	}

	public Star() {
	}
}
