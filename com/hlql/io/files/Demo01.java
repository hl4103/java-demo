package com.hlql.io.files;

import java.io.File;
import java.io.FileFilter;

public class Demo01 {

	public static void main(String[] args) {
		String path = "/home/tom/workspace/demo/src";
		File parent = new File(path);
		printName(parent);
	}

	public static void printName(File src) {
		if (null == src || !src.exists()) {
			return;
		}
		System.out.println(src.getAbsolutePath());
		if (src.isDirectory()) {
			File[] files = src.listFiles(new FileFilter() {

				@Override
				public boolean accept(File pathname) {
					return (pathname.isFile() && pathname.getName().endsWith(".java")) || pathname.isDirectory();
				}

			});

			for (File temp : files) {
				printName(temp);
			}
		}
	}

}
