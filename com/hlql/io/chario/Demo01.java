package com.hlql.io.chario;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Demo01 {

	public static void main(String[] args) {
		File src = new File("/home/tom/workspace/demo/src/xxx.txt");

		Reader reader = null;

		try {
			reader = new FileReader(src);
			char[] flush = new char[1024];
			int len = 0;
			if (-1 == (len = reader.read(flush))) {
				String str = new String(flush, 0, len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			System.out.println("该文件不存在");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("文件读取失败");
			e.printStackTrace();
		} finally {
			try {
				if (null != reader) {
					reader.close();
				}
			} catch (IOException e) {
				System.out.println("关闭失败");
				e.printStackTrace();
			}
		}
	}
}
