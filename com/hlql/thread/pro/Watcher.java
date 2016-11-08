package com.hlql.thread.pro;

/**
 * 消费者
 * @author tom
 *
 */
public class Watcher implements Runnable{
	private Movie m;

	public Watcher(Movie m) {
		super();
		this.m = m;
	}


	@Override
	public void run() {
		for(int i = 0; i<100;i++){
			m.watch();
		}
	}
	
}