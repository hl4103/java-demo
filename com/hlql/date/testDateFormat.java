package com.hlql.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testDateFormat {

	public static void main(String[] args)
	{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date d = new Date(12314315343233L);
		String str = df.format(d);
		System.out.println(str);
		
		System.out.println("#################");
		
		
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		String str2 = "2016-10-12";
		Date d2;
		try {
			d2 = df2.parse(str2);
			System.out.println(d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
