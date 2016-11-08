package com.hlql.thread.info;

public class InfoDemo01 {

	public static void main(String[] args) throws InterruptedException {
		MyThread it = new MyThread();
		Thread proxy = new Thread(it, "挨踢");
		proxy.setName("test");
		
		System.out.println(proxy.getName());
		System.out.println(Thread.currentThread().getName());
		
		// 开始执行
		proxy.start();
		
		System.out.println("启动后状态" + proxy.isAlive());
		
		// 运行0.2s停止运行
		Thread.sleep(2000);
		it.stop();
		
		Thread.sleep(1000);
		System.out.println("停止后状态" + proxy.isAlive());
	}

}
