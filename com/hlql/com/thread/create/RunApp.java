package com.hlql.com.thread.create;

public class RunApp {

	public static void main(String[] args) {
		Rabbit rab = new Rabbit();
		Tories tor = new Tories();

		rab.start();
		tor.start();

		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}

}
