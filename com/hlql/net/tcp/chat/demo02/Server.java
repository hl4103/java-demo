package com.hlql.net.tcp.chat.demo02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class Server {

	private List<MyChannel> members = new ArrayList<MyChannel>();
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		new Server().start();
	}

	public void start() throws IOException {
		ServerSocket server = new ServerSocket(9999);
		while (true) {
			Socket client = server.accept();
			MyChannel channel = new MyChannel(client);
			members.add(channel);
			new Thread(channel).start();
		}
	}

	private class MyChannel implements Runnable {

		private DataInputStream dis;
		private DataOutputStream dos;
		private boolean isRunning = true;

		public MyChannel(Socket client) {
			try {
				dis = new DataInputStream(client.getInputStream());
				dos = new DataOutputStream(client.getOutputStream());
			} catch (IOException e) {
				// e.printStackTrace();
				close();
			}
		}

		private String receive() {
			String msg = "";
			try {
				msg = dis.readUTF();
			} catch (IOException e) {
				// e.printStackTrace();
				close();
			}
			return msg;
		}

		private void send(String msg) {
			if (null == msg || msg.equals("")) {
				return;
			}
			try {
				dos.writeUTF(msg);
				dos.flush();
			} catch (IOException e) {
				// e.printStackTrace();
				close();
			}
		}

		/**
		 * 发送给其它客户端
		 */
		private void sendOthers() {
			String msg = receive();
			for (MyChannel other : members) {
				if (other == this)
					continue;
				other.send(msg);
			}
		}

		@Override
		public void run() {
			while (isRunning) {
				// send(receive());
				sendOthers();
			}
		}

		public void close() {
			isRunning = false;
			CloseUtil.closeAll(dis, dos);
			members.remove(this);
		}
	}

}
