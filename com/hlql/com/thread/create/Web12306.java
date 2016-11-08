package com.hlql.com.thread.create;

public class Web12306 implements Runnable {

	private int num = 1000;

	public static void main(String[] args) {
		Web12306 web = new Web12306();
		Thread t1 = new Thread(web, "李四");
		Thread t2 = new Thread(web, "黄牛");
		Thread t3 = new Thread(web, "张珊");
		
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void run() {
		while (true) {
			if (num <= 0)
				break;
			num --;
			System.out.println(Thread.currentThread().getName() + "抢到票" + num);
		}
	}

}
