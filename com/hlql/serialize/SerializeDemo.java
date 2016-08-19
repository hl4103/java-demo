package com.hlql.serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Reyan Ali";
		e.address = "Phokka Kuan, Ambehta Peer";
		e.SSN = 11122333;
		e.number = 101;
		try {
			FileOutputStream fileOut = new FileOutputStream(
					"/home/tom/workspace/java-demo/src/com/hlql/serialize/employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf(
					"Serialized data is saved in /home/tom/workspace/java-demo/src/com/hlql/serialize/employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}
