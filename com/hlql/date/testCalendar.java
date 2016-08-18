package com.hlql.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class testCalendar {
	
	public static void main (String[] args)
	{
		Calendar c = new GregorianCalendar();
		// 1. 
		c.set(2016, Calendar.FEBRUARY, 10, 12, 23, 34);
		// 2.
		c.set(Calendar.YEAR, 2017);
		c.set(Calendar.MONTH, Calendar.AUGUST);
		c.set(Calendar.DATE, 10);
		// 3. 
		c.setTime(new Date());
		
		Date d = c.getTime();
		System.out.println(d);
		System.out.println(c.get(Calendar.YEAR));
		
		// 日期计算
		c.add(Calendar.MONTH, -30);
		System.out.println(c);
	}
}
