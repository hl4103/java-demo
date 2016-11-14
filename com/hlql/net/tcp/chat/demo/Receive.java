package com.hlql.net.tcp.chat.demo;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Receive implements Runnable {

	private DataInputStream dis;
	private boolean isRunning = true;

	public Receive() {
	}

	public Receive(Socket client) {
		this();
		try {
			dis = new DataInputStream(client.getInputStream());
		} catch (IOException e) {
			// e.printStackTrace();
			close();
		}
	}

	public String receive() {
		String msg = "";
		try {
			msg = dis.readUTF();
		} catch (IOException e) {
			// e.printStackTrace();
			close();
		}
		return msg;
	}

	public void close() {
		isRunning = false;
		CloseUtil.closeAll(dis);
	}

	@Override
	public void run() {
		while (isRunning) {
			System.out.println(receive());
		}
	}

}
