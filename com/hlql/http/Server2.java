package com.hlql.http;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
	private ServerSocket server;

	public static void main(String[] args) {
		Server2 server = new Server2();
		server.start();
	}

	/**
	 * 启动
	 */
	public void start() {
		try {
			this.server = new ServerSocket(9999);
			this.receive();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 接受客户端
	 */
	private void receive() {
		try {
			Socket client = this.server.accept();
			String msg = null;
			byte[] data = new byte[20480];
			int len = client.getInputStream().read(data);
			// 接受客户端的请求信息
			String requestInfo = new String(data, 0, len).trim();
			System.out.println(requestInfo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void stop() {

	}

}
