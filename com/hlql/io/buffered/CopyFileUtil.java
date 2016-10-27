package com.hlql.io.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * 复制文件
	 * 
	 * @param src
	 * @param dest
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void copyFile(File src, File dest) throws FileNotFoundException, IOException {
		if (!src.isFile()) {
			System.out.println("只能拷贝文件");
			throw new IOException("只能拷贝文件");
		}
		if (!dest.isDirectory()) {
			System.out.println("不能建立于文件夹同名的文件");
			throw new IOException("不能建立于文件夹同名的文件");
		}
		InputStream source = new BufferedInputStream(new FileInputStream(src));
		OutputStream dests = new BufferedOutputStream(new FileOutputStream(dest));
		int len = 0;
		byte[] flush = new byte[1024];
		while (-1 != (len = source.read(flush))) {
			dests.write(flush, 0, len);
		}
		dests.flush();

		dests.close();
		source.close();
	}
}
