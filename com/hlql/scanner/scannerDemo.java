package com.hlql.scanner;

import java.util.Scanner;

public class scannerDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int m = 0;
		double total = 0.00;
		while (s.hasNextDouble()) {
			total += s.nextDouble();
			m += 1;
		}
		s.close();
		System.out.println("笔数:" + m);
		System.out.println("总和:" + total);
		// 输入end结束
	}
}
