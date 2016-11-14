package com.hlql.net.udp;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class MyClient {

	public static void main(String[] args) throws IOException {
		// 1. 创建客户端 + 端口
		DatagramSocket client = new DatagramSocket(6666);
		// 2. 准备数据 double ---> 字节数组
		String msg = "UDP 传输测试";
		byte[] data = convert(msg);
		// 3. 打包(发送地点及端口) DatagramPocket(byte[] buf, int lenght, InetAddress());
		DatagramPacket packet = new DatagramPacket(data, 0, data.length, new InetSocketAddress("localhost", 8888));
		// 4. 发送
		client.send(packet);
		// 5. 释放
		client.close();
	}
	
	public static byte[] convert(String str) {
		byte[] data = null;
		data = str.getBytes();
		return data;
	}

	public static byte[] convert(double num) throws IOException {
		byte[] data = null;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeDouble(num);
		dos.flush();
		dos.close();
		return data;
	}


}
