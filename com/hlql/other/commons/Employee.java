package com.hlql.other.commons;

public class Employee {

	private String name;
	private double salary;

	// alt + /
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// alt + shift + s ---> o
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	// alt + shift + s ---> r --->tab回车 shift+tab + 回车
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "(姓名:" + this.name + ",薪资:" + this.salary + ")";
	}
}
