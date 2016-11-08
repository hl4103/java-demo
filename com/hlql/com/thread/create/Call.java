package com.hlql.com.thread.create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Call {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// 1. 创建线程
		ExecutorService ser = Executors.newFixedThreadPool(1);
		Race rab = new Race();
		// 获取值
		Future<Integer> result = ser.submit(rab);
		int num = result.get();
		System.out.println(num);
		// 停止服务
		ser.shutdownNow();
	}
	
}

class Race implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		return 1000;
	}
	
}