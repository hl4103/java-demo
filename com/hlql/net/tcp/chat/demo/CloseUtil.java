package com.hlql.net.tcp.chat.demo;

import java.io.Closeable;
import java.io.IOException;

public class CloseUtil {

	public static void closeAll(Closeable... io) {
		for (Closeable temp : io) {
			try {
				if (null != temp) {
					temp.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}