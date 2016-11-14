package com.hlql.net.tcp.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {

	public static void main(String[] args) throws IOException {
		// 1. 创建服务器 指定端口 ServerSocket(int port);
		ServerSocket server = new ServerSocket(8888);
		while (true) {
			// 2. 接收客户端连接 阻塞式
			Socket socket = server.accept();
			// 3. 发送数据
			String msg = "欢迎您使用该系统";
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(msg);
			dos.flush();
		}
	}

}
