package com.hlql.net.url;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlDemo02 {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.baidu.com");
		InputStream is = url.openStream();

		byte[] flush = new byte[2048];
		int len = 0;
		while (-1 != (len = is.read(flush))) {
			System.out.println(new String(flush, 0, len));
		}
	}

}
