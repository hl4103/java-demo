package com.hlql.scanner;

import java.util.Scanner;

public class testScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		if (scan.hasNext()) {
			String str1 = scan.next();
			System.out.println(str1);
		}

		if (scan.hasNextLine()) {
			String str2 = scan.nextLine();
			System.out.println(str2);
		}
		scan.close();
	}
}
