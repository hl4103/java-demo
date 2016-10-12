package com.hlql.que;

public class Demo02 {

	public static void main(String[] args) {
		MyStack<String> backHistory = new MyStack<String>(3);
		backHistory.push("www.baidu.com");
		backHistory.push("www.yun-gui.com");
		backHistory.push("www.g.com");
		backHistory.push("www.qq.com");
		
		System.out.println(backHistory.size());
		
		// 遍历
		String item = null;
		while(null != (item = backHistory.pop())){
			System.out.println(item);
		}
	}
}
