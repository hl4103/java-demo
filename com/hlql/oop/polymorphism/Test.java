package com.hlql.oop.polymorphism;

public class Test {

	public static void testVoice(Animal a){
		a.voice();
		if(a instanceof Cat){
			((Cat) a).catchMouse();
		}
	}

	public static void main(String[] args) {
		Animal a = new Cat();
		Animal b = new Dog();
		Animal c = new Pig();
		testVoice(a);
		testVoice(b);
		testVoice(c);

		Cat a1 = (Cat) a;
		a1.catchMouse();
	}
}
