package com.hlql.net.ip;

import java.net.InetAddress;
import java.net.InetSocketAddress;

public class InetSockeDemo01 {

	public static void main(String[] args) {
		InetSocketAddress address = new InetSocketAddress("127.0.0.1", 9999);
		
		System.out.println(address.getHostName());
		System.out.println(address.getPort());
		
		InetAddress addr = address.getAddress();
		System.out.println(addr.getHostAddress());
		System.out.println(addr.getHostName());
	}

}
