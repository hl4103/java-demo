package com.hlql.employee;

import java.util.ArrayList;
import java.util.List;

public class test01 {

	public static void main(String[] args) {
		Employee e1 = new Employee(01001, "zhangsan", 3000, "jsb", "2016-10");
		Employee e2 = new Employee(01002, "lisi", 3200, "cwb", "2005-10");
		Employee e3 = new Employee(01003, "wangwu", 3300, "swb", "2003-10");

		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		printName(list);
	}

	public static void printName(List<Employee> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
	}
}
