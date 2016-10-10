package com.hlql.sort_col;

import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		Worker work1 = new Worker("张三", 10000);
		Worker work2 = new Worker("李四", 5000);
		Worker work3 = new Worker("王五", 60000);
		Worker work4 = new Worker("赵柳", 30000);

		TreeMap<Worker, String> employees = new TreeMap<Worker, String>();
		employees.put(work1, "aa");
		employees.put(work2, "aa");
		employees.put(work3, "aa");
		employees.put(work4, "aa");

		System.out.println(employees.keySet());
	}

}
