package com.hlql.net.tcp.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {

	public static void main(String[] args) throws UnknownHostException, IOException {
		ServerSocket server = new ServerSocket(9999);
		Socket client = server.accept();

		DataInputStream dis = new DataInputStream(client.getInputStream());
		String msg = dis.readUTF();

		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		dos.writeUTF("服务器返回:" + msg);
		dos.flush();
	}

}
