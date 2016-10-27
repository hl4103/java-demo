package com.hlql.io.convert;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Demo01 {

	public static void main(String[] args) throws IOException {

		// 指定解码字符集
		BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(new File("/home/tom/workspace/demo/src/test.txt")), "GBK"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("/home/tom/workspace/demo/src/encode.txt"));
		String info = null;
		if(null != (info = br.readLine())){
			System.out.println(info);
		}
		br.close();
		
		convert();
		test01();
	}

	/**
	 * 编码不一致导致乱码
	 * 
	 * @throws UnsupportedEncodingException
	 */
	public static void convert() throws UnsupportedEncodingException {
		String str = "中国";
		byte[] data = str.getBytes();
		System.out.println(new String(data));

		data = str.getBytes("GBK");
		System.out.println(new String(data));

		byte[] data2 = "中国".getBytes("GBK");
		System.out.println(new String(data2, "GBK"));
	}

	/**
	 * 字节数不完整导致乱码
	 */
	public static void test01() {
		String str = "中国";
		byte[] data = str.getBytes();
		System.out.println(new String(data, 0, 1));
	}

}
