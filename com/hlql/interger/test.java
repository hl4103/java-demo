package com.hlql.interger;

public class test {
	
	public static void main(String[] args)
	{
		Integer d1 = 1000;
		Integer d2 = 1000;
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));
		
		Integer d3 = 100;
		Integer d4 = 100;
		System.out.println(d3 == d4); // [-128, 127]之间的数,仍然当做基本数据类型来处理
		System.out.println(d3.equals(d4));
	}
}
