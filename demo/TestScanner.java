package demo;

import java.util.Scanner;

public class TestScanner {

	public static void test01() {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		s.close();
		System.out.println(str);
	}
	
	public static void test02() {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		s.close();
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		test02();
	}
}
