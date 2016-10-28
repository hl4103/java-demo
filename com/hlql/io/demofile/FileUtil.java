package com.hlql.io.demofile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileUtil {

	public static void main(String[] args) throws IOException {
		copyFileByByte("/home/tom/workspace/java-demo/src/com/hlql/io/demofile/dest.txt",
				"/home/tom/workspace/java-demo/src/com/hlql/io/demofile/src.txt");
	}

	/**
	 * 利用字节流复制文件
	 * 
	 * @param src
	 * @param dest
	 * @throws IOException
	 */
	public static void copyFileByByte(String src, String dest) throws IOException {
		copyFileByByteEncode(new File(src), new File(dest));
	}

	/**
	 * 利用字节流复制文件
	 * 
	 * @param src
	 * @param dest
	 * @throws IOException
	 */
	public static void copyFileByByte(File src, File dest) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		in = new FileInputStream(src);
		out = new FileOutputStream(dest);

		byte[] flush = new byte[1024];
		int len = 0;
		while (-1 != (len = in.read(flush))) {
			out.write(flush, 0, len);
		}
		out.flush();
		out.close();
		in.close();
	}

	/**
	 * 利用字节流复制文件
	 * 
	 * @param src
	 * @param dest
	 * @throws IOException
	 */
	public static void copyFileByByteOther(File src, File dest) throws IOException {
		BufferedInputStream in = null;
		BufferedOutputStream out = null;

		in = new BufferedInputStream(new FileInputStream(src));
		out = new BufferedOutputStream(new FileOutputStream(dest));

		byte[] flush = new byte[1024];
		int len = 0;
		while (-1 != (len = in.read(flush))) {
			out.write(flush, 0, len);
		}
		out.flush();
		out.close();
		in.close();
	}

	/**
	 * 利用字节流复制文件
	 * 
	 * @param src
	 * @param dest
	 * @throws IOException
	 */
	public static void copyFileByByteEncode(File src, File dest) throws IOException {
		BufferedReader in = null;
		BufferedWriter out = null;

		in = new BufferedReader(new InputStreamReader(new FileInputStream(src), "GBK"));
		out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dest), "GBK"));

		String str = "";
		while (null != (str = in.readLine())) {
			// String temp = new String(str.getBytes(), "GBK");
			// System.out.println(temp);
			out.write(str + "\r\n");
		}
		out.flush();
		if (null != out)
			out.close();
		if (null != in)
			in.close();
		System.out.print("利用字节流复制文件, 考虑编码问题");
	}

	/**
	 * 利用字符流复制文件
	 * 
	 * @param src
	 * @param dest
	 * @throws IOException
	 */
	public static void copyFile(String src, String dest) throws IOException {
		copyFile(new File(src), new File(dest));
	}

	/**
	 * 利用字符流复制文件
	 * 
	 * @param srcFile
	 * @param destFile
	 * @throws IOException
	 */
	public static void copyFile(File srcFile, File destFile) throws IOException {
		BufferedReader reader = null;
		BufferedWriter writer = null;

		reader = new BufferedReader(new FileReader(srcFile));
		writer = new BufferedWriter(new FileWriter(destFile));

		String str = null;
		while (null != (str = reader.readLine())) {
			str += "\r\n";
			writer.write(str);
		}
		writer.flush();
		writer.close();
		reader.close();
	}
}
