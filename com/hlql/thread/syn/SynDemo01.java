package com.hlql.thread.syn;

public class SynDemo01 {

	public static void main(String[] args) {
		Web12306 web = new Web12306();
		Thread t1 = new Thread(web, "张三");
		Thread t2 = new Thread(web, "李四");
		Thread t3 = new Thread(web, "王五");
		t1.start();
		t2.start();
		t3.start();
	}

}

class Web12306 implements Runnable {

	private int num = 10;
	private boolean flag = true;

	@Override
	public void run() {
		while (flag) {
			test03();
		}
	}

	public void test03() {
		synchronized (this) {
			if (num <= 0) {
				this.flag = false;
				return;
			}
			// 延时 5s
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "抢到了" + num--);
		}
	}

	public void test01() {
		if (num <= 0) {
			this.flag = false;
			return;
		}
		// 延时 5s
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "抢到了" + num--);
	}

	public synchronized void test02() {
		if (num <= 0) {
			this.flag = false;
			return;
		}
		// 延时 5s
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "抢到了" + num--);
	}

}