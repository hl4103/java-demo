package com.hlql.http;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * 请求并响应
 * 
 * @author tom
 *
 */
public class Server3 {
	private ServerSocket server;
	private Socket client;
	public static final String CRLF = "\r\n";
	public static final String BLANK = " ";

	public static void main(String[] args) {
		Server3 server = new Server3();
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
			this.client = this.server.accept();
			byte[] data = new byte[20480];
			int len = client.getInputStream().read(data);
			// 接受客户端的请求信息
			String requestInfo = new String(data, 0, len).trim();

			System.out.println(requestInfo);

			String str = "<html><head><title>Hello</title></head><body>Hello World!</body></html>";
			response(str);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 响应
	 * 
	 * @param str
	 * @throws IOException
	 */
	private void response(String str) throws IOException {
		// 响应
		StringBuilder responseContent = new StringBuilder();
		responseContent.append(str);

		StringBuilder response = responseHeader();
		// 正文长度
		response.append("Content-Length:").append(responseContent.toString().getBytes().length).append(CRLF);
		// 正文之前
		response.append(CRLF);
		// 正文
		response.append(responseContent);

		// 输出流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(this.client.getOutputStream()));
		bw.write(response.toString());
		bw.flush();
		bw.close();
	}

	/**
	 * 响应头
	 * 
	 * @return
	 */
	private StringBuilder responseHeader() {
		StringBuilder response = new StringBuilder();
		// 1. http协议版本, 状态代码, 描述
		response.append("HTTP/1.1").append(BLANK).append("200").append(BLANK).append("OK").append(CRLF);
		// 2. 响应头 (Response Head)
		response.append("Server:hlql").append(BLANK).append("Server/0.0.0.01").append(CRLF);
		response.append("Date:").append(new Date()).append(CRLF);
		response.append("Content-type:text/html;charset=utf-8").append(CRLF);
		return response;
	}

	public void stop() {

	}

}
