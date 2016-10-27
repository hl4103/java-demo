package com.hlql.io.chario;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Demo02 {

	public static void main(String[] args) {

		File dest = new File("/home/tom/workspace/demo/src/xxx.txt");
		Writer wr = null;
		try {
			wr = new FileWriter(dest);
			String str = "阿里死肯定就伐啦是框架法律速度快";
			wr.write(str);
			wr.flush();
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("文件不可写入");
			e.printStackTrace();
		} finally {
			try {
				if (null != wr) {
					wr.close();
				}
			} catch (IOException e) {
				System.out.println("文件关闭失败");
				e.printStackTrace();
			}
		}
	}
}
