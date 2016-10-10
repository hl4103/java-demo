package com.hlql.generic;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Method {
	
	public static <T> void test(T t){
		System.out.println(t);
	}
	
	public static <T extends List> void test(T t){
		System.out.println(t);
		t.add("aaa");
	}
	
	/**
	 * 释放资源
	 * @param a
	 */
	public static <T extends Closeable> void test(T... a){
		for(T temp : a){
			try{
				if(null != temp){
					temp.close();
				}
			} catch (IOException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		test(new FileInputStream("a.txt"));
	}
}
