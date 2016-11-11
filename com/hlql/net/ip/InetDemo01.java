package com.hlql.net.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetDemo01 {

	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println(addr.getHostAddress());
		System.out.println(addr.getHostName());
		
		InetAddress addr1 = InetAddress.getByName("www.163.com");
		System.out.println(addr1.getHostAddress());
		System.out.println(addr1.getHostName());
		
		InetAddress addr3 = InetAddress.getByName("124.14.16.209");
		System.out.println(addr3.getHostAddress());
		System.out.println(addr3.getHostName());
	}

}
