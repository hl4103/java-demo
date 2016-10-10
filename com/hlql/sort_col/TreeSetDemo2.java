package com.hlql.sort_col;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		Worker work1 = new Worker("张三", 10000);
		Worker work2 = new Worker("李四", 5000);
		Worker work3 = new Worker("王五", 60000);
		Worker work4 = new Worker("赵柳", 30000);


		TreeSet<Worker> employees = new TreeSet<Worker>();
		employees.add(work1);
		employees.add(work2);
		employees.add(work3);
		employees.add(work4);

		System.out.println(employees);
	}

}
