package com.hlql.thread.info;

public class MyThread implements Runnable{
	
	private boolean flag = true;
	private int num = 0;

	@Override
	public void run() {
		while(flag){
			System.out.println(Thread.currentThread().getName() + "==>" + num ++);
		}
	}
	
	/**
	 * 停止运行
	 */
	public void stop(){
		this.flag = !flag;
	}
	
}
