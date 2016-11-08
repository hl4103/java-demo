package com.hlql.thread.status;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 倒计时
 * @author tom
 *
 */
public class SleepDemo {

	/**
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		Date endTime = new Date(System.currentTimeMillis() + 10 * 1000);
		long end = endTime.getTime();
		while (true) {
			System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
			endTime = new Date(endTime.getTime() - 1000);
			Thread.sleep(1000);
			if (end - 10000 > endTime.getTime()) {
				break;
			}
		}
	}

	public static void test01() throws InterruptedException {
		int num = 10;
		while (num >= 0) {
			Thread.sleep(1000);
			System.out.println(num--);
		}
	}
}
