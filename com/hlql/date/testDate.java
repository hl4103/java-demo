package com.hlql.date;

import java.util.Date;

public class testDate {
	
	public static void main (String[] args)
	{
		Date d = new Date();
		
		System.out.println(d.toString());

		long t = System.currentTimeMillis();
		System.out.println(t);
		
		Date d1 = new Date(1000);
		System.out.println(d1.toGMTString());
		
		d1.setTime(100000);
		System.out.println(d1.getTime());
	}
}
