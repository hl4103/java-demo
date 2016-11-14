package com.hlql.net.udp;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MyServer {

	public static void main(String[] args) throws IOException {
		// 1. 创建服务端+端口
		DatagramSocket server = new DatagramSocket(8888);
		// 2. 准备接受容器
		byte[] container = new byte[1024];
		// 3. 封装成包 DatagramPacket(byte[] buf, int length);
		DatagramPacket packet = new DatagramPacket(container, container.length);
		// 4. 接收数据
		server.receive(packet);
		// 5. 分析数据 字节数组 ---> double
		byte[] data = packet.getData();
		int len = packet.getLength();
		System.out.println(new String(data, 0, len));
		// System.out.println(convert(packet.getData()));
		// 6. 关闭
		server.close();
	}

	public static double convert(byte[] data) throws IOException {
		DataInputStream dis = new DataInputStream(new ByteArrayInputStream(data));
		double num = dis.readDouble();
		dis.close();
		return num;
	}

}
