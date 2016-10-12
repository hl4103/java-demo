package com.hlql.others_enum;

import java.util.Enumeration;
import java.util.Vector;

public class Demo01 {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.add("aa");
		vector.add("bb");
		vector.add("cc");
		
		// 遍历该vector
		Enumeration<String> en = vector.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
		
	}
}
