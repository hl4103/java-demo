package com.hlql.que;

import java.util.ArrayDeque;
import java.util.Queue;

public class Demo01 {

	public static void main(String[] args) {
		Queue<Request> que = new ArrayDeque<Request>();
		for (int i = 0; i < 10; i++) {
			final int num = i;
			que.offer(new Request() {
				public void deposit() {
					System.out.println("第" + num + "位客人,存款:" + Math.random() * 10000);
				}
			});
		}
		dealWith(que);
	}
	
	public static void dealWith(Queue<Request> que){
		Request req = null;
		while(null != (req = que.poll())){
			req.deposit();
		}
	}
}

interface Request {
	// 存款
	public void deposit();

}
