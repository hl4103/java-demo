package com.hlql.others_enum;

import java.util.StringTokenizer;

public class Demo02 {
	
	public static void main(String[] args){
		String emailStr = "aa@qq.com;bb@qq.com;cc@qq.com";
		StringTokenizer token = new StringTokenizer(emailStr, ";");
		while(token.hasMoreElements()){
			System.out.println(token.nextElement());
		}
	}
}
