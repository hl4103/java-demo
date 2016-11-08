package com.hlql.thread.info;

public class InfoDemo02 {

	public static void main(String[] args) throws InterruptedException {
		MyThread it1 = new MyThread();
		Thread proxy1 = new Thread(it1, "挨踢1");
		
		MyThread it2 = new MyThread();
		Thread proxy2 = new Thread(it2, "挨踢2");
		
		/**
		 * 优先级的设置代表的是概率,不代表绝对的先后顺序
		 */
		proxy1.setPriority(Thread.MAX_PRIORITY);
		proxy2.setPriority(Thread.MIN_PRIORITY);
		proxy1.start();
		proxy2.start();
		
		Thread.sleep(100);
		it1.stop();
		it2.stop();
	}

}
