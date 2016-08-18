package com.hlql.callback;

public class testFrame {
	public static void drawFrame(MyFrame f){
		System.out.print("Start");
		f.paint();
		System.out.println("End");
	}
	
	public static void main(String[] args){
		MyFrame f = new GameFrame01();
		drawFrame(f);
	}
}
