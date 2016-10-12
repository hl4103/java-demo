package com.hlql.pro;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 使用properties 读取 配置文件
 * 
 * @author tom
 *
 */
public class Demo02 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro = new Properties();

		// 使用绝对路径读取
		// pro.load(new
		// FileReader("/home/tom/workspace/java-demo/src/com/hlql/pro/demo01.properties"));

		// 使用相对路径读取
		pro.load(new FileReader("src/com/hlql/pro/demo01-01.properties"));

		System.out.println(pro.getProperty("cc"));
	}
}
