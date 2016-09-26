package com.hlql.employee;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private int id;
	private String name;
	private int salay;
	private String department;
	private Date hireDate;

	public Employee(int id, String name, int salay, String department, String hireDate) {
		super();
		this.id = id;
		this.name = name;
		this.salay = salay;
		this.department = department;
		DateFormat format = new SimpleDateFormat("YYYY-MM");
		try {
			this.hireDate = format.parse(hireDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalay() {
		return salay;
	}

	public void setSalay(int salay) {
		this.salay = salay;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		DateFormat format = new SimpleDateFormat("YYYY-MM");
		try {
			this.hireDate = format.parse(hireDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
