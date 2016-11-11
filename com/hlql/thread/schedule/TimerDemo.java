package com.hlql.thread.schedule;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * QUARTZ框架 , JUC.
 * join,yield
 * @author tom
 *
 */
public class TimerDemo {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask(){

			@Override
			public void run() {
				System.out.println("自动任务");
			}
			
		}, new Date(System.currentTimeMillis() + 1000), 200);
	}

}
