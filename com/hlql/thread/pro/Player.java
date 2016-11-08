package com.hlql.thread.pro;

/**
 * 生产者
 * @author tom
 *
 */
public class Player implements Runnable{
	private Movie m;

	public Player(Movie m) {
		super();
		this.m = m;
	}


	@Override
	public void run() {
		for(int i = 0; i<100;i++){
			if(0 == i%2){
				m.play("偶数:"+i);
			} else {
				m.play("奇数:"+i);
			}
		}
	}
	
}
