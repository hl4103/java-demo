package com.hlql.file;

import java.io.File;

public class testTree {

	public static void main(String[] args) {
		// testTree tree = new testTree();
		
		readFold("/home/tom/workspace/java-demo", 0);
	}

	/**
	 * 
	 * @param filePath
	 */
	public static void readFold(String filePath, int level) {
		File file = new File(filePath);
		for(int i = 0;i< level;i++){
			System.out.print("-");
		}
		System.out.println(file.getName());

		if (file.isDirectory()) {
			for (File temp : file.listFiles()) {
				readFold(temp.getPath(), level + 1);
			}
//			File[] files = file.listFiles();
//			for (int j = 0; j < files.length; j++) {
//				readFold(files[j].getAbsolutePath(), level + 1);
//			}
		}
	}
}
