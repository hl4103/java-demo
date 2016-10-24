package com.hlql.io.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Demo03 {

	public static void main(String[] args) {
		File dest = new File("/home/tom/workspace/demo/src/demo/test.txt");
		OutputStream os = null;
		try {
			os = new FileOutputStream(dest, true);
			String str = "Hello World ! \r\n";
			byte[] temp = str.getBytes();
			os.write(temp, 0, temp.length);
			os.flush();
		} catch (FileNotFoundException e) {
			System.out.println("不存在该文件");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("写入文件失败");
			e.printStackTrace();
		}
	}

}
