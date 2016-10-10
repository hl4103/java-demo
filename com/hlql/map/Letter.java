package com.hlql.map;

public class Letter {
	
	private String name;
	private int count;

	// alt + /
	public Letter(){}

	// alt + shift + s ---> o
	public Letter(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	
	public Letter(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	// setter与getter 访问器
	// alt + shift + s ---> r ---> tab ---> enter ---> shift + tag ---> enter
}
