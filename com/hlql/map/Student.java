package com.hlql.map;

public class Student {
	private String no;
	private double score;
	private String name;
	
	public Student(){
		
	}
	
	public Student(String no, double score, String name) {
		super();
		this.no = no;
		this.score = score;
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
