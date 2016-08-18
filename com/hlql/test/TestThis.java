package com.hlql.test;

public class TestThis {
	String name;
	int a;
	
	public TestThis()
	{
		System.out.println("aaaa");
	}
	
	public TestThis(String name){
		this();
		this.name = name;
		System.out.println(name);
	}
	
	public TestThis(String name, int a){
		this.name = name;
		this.a = a;
		System.out.println(name);
		System.out.println(a);
	}
	
	public void test(){
		System.out.println("cccc");
	}
	
	public static void main(String[] args){
		TestThis a = new TestThis("bbbb");
		a.test();
	}
}
