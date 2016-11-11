package com.hlql.net.url;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlDemo01 {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://www.hlql.com.cn/index.php?aa=bb&cc=dd#ee");
		System.out.println("协议:" + url.getProtocol());
		System.out.println("域名:" + url.getHost());
		System.out.println("端口:" + url.getPort());
		System.out.println("资源:" + url.getFile());
		System.out.println("相对路径:" + url.getPath());
		System.out.println("锚点:" + url.getRef());
		System.out.println("参数:" + url.getQuery()); // 当有锚点且在参数及url之间, 那么返回null
	}

}
