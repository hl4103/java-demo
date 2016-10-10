package com.hlql.sort_col;

public class Worker implements java.lang.Comparable<Worker> {

	private String type;
	private double salay;

	public Worker() {
	}

	public Worker(String type, double salay) {
		super();
		this.type = type;
		this.salay = salay;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getSalay() {
		return salay;
	}

	public void setSalay(double salay) {
		this.salay = salay;
	}

	/**
	 * 按工资升序
	 */
	@Override
	public int compareTo(Worker o) {
		return this.salay > o.salay ? 1 : (this.salay == o.salay ? 0 : -1);
	}

	@Override
	public String toString() {
		return "姓名: " + this.type + ", 薪资: " + this.salay + "\n";
	}

}
