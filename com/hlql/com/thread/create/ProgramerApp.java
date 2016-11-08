package com.hlql.com.thread.create;

public class ProgramerApp {

	public static void main(String[] args) {
		Programer program = new Programer();
		Thread thr = new Thread(program);
		thr.start();

		for (int i = 0; i < 100; i++) {
			System.out.println("haha" + i);
		}
	}

}
