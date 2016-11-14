package com.hlql.net.tcp.chat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {
		Socket client = new Socket("localhost", 9999);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		DataInputStream dis = new DataInputStream(client.getInputStream());

		while (true) {
			String info = br.readLine();
			dos.writeUTF(info);
			dos.flush();

			String msg = dis.readUTF();
			System.out.println(msg);
		}
	}

}
