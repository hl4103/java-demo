package com.hlql.file;

import java.io.File;
import java.io.IOException;

public class testFile {

	public static void main(String[] args) {
		File f = new File("/home/tom/workspace/demo/src/com/hlql/file/aaaa.java");
		File f1 = new File("/home/tom/workspace/demo/src/com/hlql/file");
		File f2 = new File(f1, "aaaaTest.java");
		File f3 = new File(f1, "demo.java.aa");
		File f4 = new File("/home/tom/workspace/demo/src/com/hlql/file/aa/bb/cc");
		File f5 = new File("/home/tom/workspace/demo/src/com/hlql/file/dd");

		f5.mkdir();
		f4.mkdirs();
		try {
			f3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f2.delete();
		if (f1.isDirectory()) {
			System.out.println("是一个目录");
		}
		if (f.isFile()) {
			System.out.println("是一个文件");
		}
	}
}
