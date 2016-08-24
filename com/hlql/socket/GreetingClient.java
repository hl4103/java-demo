package com.hlql.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//编译 java 代码，并执行以下命令来启动服务，使用端口号为 6066：
//$ java GreetingServer 6066
//Waiting for client on port 6066... 像下面一样开启客户端：
//$ java GreetingClient localhost 6066
//Connecting to localhost on port 6066
//Just connected to localhost/127.0.0.1:6066
//Server says Thank you for connecting to /127.0.0.1:6066
//Goodbye!
public class GreetingClient {
	public static void main(String[] args) {
		String serverName = args[0];
		int port = Integer.parseInt(args[1]);
		try {
			System.out.println("Connecting to " + serverName + " on port " + port);
			Socket client = new Socket(serverName, port);
			System.out.println("Just connected to " + client.getRemoteSocketAddress());
			OutputStream outToServer = client.getOutputStream();
			DataOutputStream out = new DataOutputStream(outToServer);

			out.writeUTF("Hello from " + client.getLocalSocketAddress());
			InputStream inFromServer = client.getInputStream();
			DataInputStream in = new DataInputStream(inFromServer);
			System.out.println("Server says " + in.readUTF());
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
