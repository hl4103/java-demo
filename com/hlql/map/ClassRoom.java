package com.hlql.map;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
	private String no;
	private double total;
	private List<Student> list;
	
	public ClassRoom(){
		this.list = new ArrayList<Student>();
	}
	
	public ClassRoom(String no){
		this();
		this.no = no;
	}

	public ClassRoom(String no, double total, List<Student> list) {
		super();
		this.no = no;
		this.total = total;
		this.list = list;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}
	
}
