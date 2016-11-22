package com.hlql.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private ServerSocket server;

	public static void main(String[] args) {
		Server server = new Server();
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
			StringBuilder sb = new StringBuilder();

			// 存在问题,不能接收到post请求的数据
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			while ((msg = reader.readLine()).length() > 0) {
				sb.append(msg);
				sb.append("\r\n");
				if (null == msg) {
					break;
				}
			}
			// 接受客户端的请求信息
			String requestInfo = sb.toString().trim();
			System.out.println(requestInfo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void stop() {

	}

}
