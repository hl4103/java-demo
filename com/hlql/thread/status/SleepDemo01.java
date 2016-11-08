package com.hlql.thread.status;

/**
 * 模拟12306抢票
 * 多线程问题.
 * @author tom
 *
 */
public class SleepDemo01 {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		Web12306 web = new Web12306();
		Thread t1 = new Thread(web, "张三");
		Thread t2 = new Thread(web, "李四");
		Thread t3 = new Thread(web, "王五");
		t1.start();
		t2.start();
		t3.start();
	}
}

class Web12306 implements Runnable{
	
	private int num = 50;

	@Override
	public void run() {
		while(true){
			if(num < 0){
				break;
			}
			// 延时 5s
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "抢到了" + num--);
		}
	}
	
}
