package com.hlql.oop.polymorphism;

public class Animal {
	public void voice(){
		System.out.println("一般叫声");
	}
}

class Dog extends Animal{
	public void voice(){
		System.out.println("汪汪汪汪");
	}
	
	public void seeDoor(){
		System.out.println("看门");
	}
}

class Cat extends Animal{
	public void voice(){
		System.out.println("喵喵喵喵");
	}
	
	public void catchMouse(){
		System.out.println("捕捉老鼠");
	}
}

class Pig extends Animal{
	public void voice(){
		System.out.println("哼哼哼哼");
	}
}
