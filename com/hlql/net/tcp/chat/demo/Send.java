package com.hlql.net.tcp.chat.demo;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Send implements Runnable {

	private BufferedReader console;
	private DataOutputStream dos;
	private boolean isRunning = true;

	public Send() {
		console = new BufferedReader(new InputStreamReader(System.in));
	}

	public Send(Socket client) {
		this();
		try {
			dos = new DataOutputStream(client.getOutputStream());
		} catch (IOException e) {
			// e.printStackTrace();
			close();
		}
	}

	// 获取数据
	public String getMsgFromConsole() {
		try {
			return console.readLine();
		} catch (IOException e) {
			// e.printStackTrace();
		}
		return "";
	}

	// 发送数据
	public void send() {
		String msg = getMsgFromConsole();
		try {
			if (msg != null && !msg.equals("")) {
				dos.writeUTF(msg);
				dos.flush();
			}
		} catch (IOException e) {
			// e.printStackTrace();
			close();
		}
	}

	public void close() {
		isRunning = false;
		CloseUtil.closeAll(dos, console);
	}

	@Override
	public void run() {
		while (isRunning) {
			send();
		}
	}

}
