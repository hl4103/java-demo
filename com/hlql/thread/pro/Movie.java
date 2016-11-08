package com.hlql.thread.pro;

/**
 * 一个场景, 共同的资源
 * @author tom
 *
 */
public class Movie {

	private String pic;
	
	/**
	 * 播放
	 * @param pic
	 */
	public synchronized void play(String pic){
		this.pic = pic;
	}
	
	/**
	 * 查看
	 */
	public synchronized void watch(){
		System.out.println(pic);
	}
}
