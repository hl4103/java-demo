package com.book.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fs = new FileInputStream("/home/tom/workspace/java-demo/src/com/book/stream/demo.txt");
		InputStreamReader in = new InputStreamReader(fs);
		System.out.println(in);
	}
}
