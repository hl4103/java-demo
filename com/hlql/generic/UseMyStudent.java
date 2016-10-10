package com.hlql.generic;

public class UseMyStudent {

	public static void main(String[] args) {
		myStudent<Integer> test = new myStudent <Integer>();
		test.setJavase(80);
		Integer score = test.getJavase();
		System.out.println(score);
	}

}
