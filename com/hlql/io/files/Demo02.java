package com.hlql.io.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Demo02 {

	public static void main(String[] args) {
		File src = new File("/home/tom/workspace/demo/src/demo/helloWorld.java");
		InputStream input = null;
		try {
			input = new FileInputStream(src);
			byte[] car = new byte[10];
			int len = 0;
			while (-1 != (len = input.read(car))) {
				String info = new String(car, 0, len);
				System.out.println(info);
			}
		} catch (FileNotFoundException e) {
			System.out.println("不存在该文件");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("读取文件失败");
			e.printStackTrace();
		} finally {
			try {
				if (null != input) {
					input.close();
				}
			} catch (IOException e) {
				System.out.println("关闭文件输入流失败");
				e.printStackTrace();
			}
		}
	}
}
