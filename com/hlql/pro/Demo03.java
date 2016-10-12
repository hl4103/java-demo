package com.hlql.pro;

import java.io.IOException;
import java.util.Properties;

/**
 * 使用类相对路径读取文件
 * 
 * @author tom
 *
 */
public class Demo03 {

	public static void main(String[] args) throws IOException {
		Properties pro = new Properties();
		
		// 类相对路径 bin/
		// pro.load(Demo03.class.getResourceAsStream("/com/hlql/pro/demo01.properties"));

		pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("com/hlql/pro/demo01.properties"));
		System.out.println(pro.getProperty("aa"));
	}
}
