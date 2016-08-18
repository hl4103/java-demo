package com.hlql.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可视化日历
 * @author tom
 *
 */
public class VisualCalendar {

	public static void main(String[] args)
	{
		System.out.println("请输入日期(按照格式: 2016-08-16)");
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();
		scanner.close();
//		String temp = "2016-08-12";
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = format.parse(temp);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			
			calendar.set(Calendar.DATE, 1);
			
//			System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
			
			// 获取当月的天数
			Integer monthDay = calendar.getActualMaximum(Calendar.DATE);
			
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			
			Integer count = 0;
			for(int j = 1; j < calendar.get(Calendar.DAY_OF_WEEK); j++) {
				System.out.print("\t");
				count ++;
			}
			for(int a = 1; a <= monthDay; a++) {
				System.out.print(a + "\t");
				count++;
				if(count%7 == 0) {
					System.out.println();
				}
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
