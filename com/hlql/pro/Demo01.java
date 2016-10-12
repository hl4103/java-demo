package com.hlql.pro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo01 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 创建对象
		Properties pro = new Properties();
		// 存储
		pro.setProperty("aa", "bbbb");
		pro.setProperty("cc", "cccc");
		pro.setProperty("dd", "dddd");
		pro.setProperty("ee", "eeee");

		// 存储到/home/tom/workspace/java-demo/src/com/hlql/pro 使用绝对路径
		// pro.store(new FileOutputStream(new
		// File("/home/tom/workspace/java-demo/src/com/hlql/pro/demo01.properties")),
		// "test");
		// pro.storeToXML(
		// new FileOutputStream(new
		// File("/home/tom/workspace/java-demo/src/com/hlql/pro/demo01.xml")),
		// "test");

		// 相对路径 相对的是当前项目
		// pro.store(new FileOutputStream(new File("demo01.properties")),
		// "test");
		// pro.store(new FileOutputStream(new File("src/demo01.properties")),
		// "test");
		pro.store(new FileOutputStream(new File("src/com/hlql/pro/demo01-01.properties")), "test");
	}

}
