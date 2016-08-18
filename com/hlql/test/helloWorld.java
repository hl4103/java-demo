package com.hlql.test;

/**
 * 测试文档
 * @author tom
 * @version 1.0
 *
 */
public class helloWorld {
	
	/**
	 * 主要方法
	 * @param args
	 * @return 调试返回
	 */
	public static void main(String[] args) {
		System.out.println("Hello World !");
		int aa = 10;
		int aa1 = 010;
		int aa2 = 0x10;
		double aa3 = 3.14;
		float aa4 = 6.28F;
		double aa5 = 3.45E-12;
		int aa8 = 0b00000000000000000000000000000011;
		int aa9 = 0b0000_0000_0000_0000_0000_0000_0000_0011;
		System.out.println(aa8);
		System.out.println(aa9);
		System.out.println(aa1);
		System.out.println(aa2);
		System.out.println(Integer.toBinaryString(aa));
		System.out.println(Integer.toOctalString(aa));
		System.out.println(Integer.toHexString(aa));
		System.out.println(aa3);
		System.out.println(aa4);
		System.out.println(aa5);
		
		float aa6 = 0.1f;
		double aa7 = 1.0/10;
		System.out.println(aa6 == aa7);
		
	}
}
