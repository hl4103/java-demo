package com.hlql.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class testReadFile {

	public static void main(String[] args) {
		testReadFile trf = new testReadFile();
//		trf.openFile();
		trf.demoOpenFile();
	}

	public void demoOpenFile() {
		FileInputStream fs = null;
		try {
			fs = new FileInputStream("/home/tom/workspace/demo/src/com/hlql/exception/a.txt");
			char a1 = (char)fs.read();
			char a2 = (char)fs.read();
			System.out.println("" + a1 + a2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fs != null) {
					fs.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public String openFile() {
		try {
			System.out.println("start");
			FileInputStream fs = new FileInputStream("/home/tom/workspace/demo/src/com/hlql/exception/a.txt");
			int a = fs.read();
			System.out.println("end");
			return "step1";
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("step2");
			return "step2";
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("step3");
			return "step3";
		} finally {
			System.out.print("finally!");
			// return "finally";
		}
	}
}
