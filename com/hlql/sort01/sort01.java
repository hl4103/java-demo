package com.hlql.sort01;

import java.util.Arrays;
import java.util.Date;

public class sort01 {

	public static void main(String[] args) {
		String[] arr = { "aaa", "bbb", "abc", "aasdf" };
		sortT(arr);
		System.out.println(Arrays.toString(arr));

		Date[] date = new Date[3];
		date[0] = new Date();
		date[1] = new Date(System.currentTimeMillis() - 1000 * 60);
		date[2] = new Date(System.currentTimeMillis() + 1000 * 60);
		sortDate(date);
		System.out.println(Arrays.toString(date));
	}

	/**
	 * 数字数组排序
	 * 
	 * @param arr
	 */
	public static void sortInt(Integer[] arr) {
		boolean tag = true;
		for (int i = 0; i < arr.length; i++) {
			tag = true;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					Integer temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					tag = false;
				}
			}
			if (tag)
				break;
		}
	}

	/**
	 * 字符串排序
	 * 
	 * @param arr
	 */
	public static void sortString(String[] arr) {
		boolean tag = true;
		for (int i = 0; i < arr.length; i++) {
			tag = true;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (((Comparable) arr[j]).compareTo(arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					tag = false;
				}
			}
			if (tag)
				break;
		}
	}


	/**
	 * 泛型
	 * 
	 * @param arr
	 */
	public static <T extends Comparable<T>> void sortT(T[] arr) {
		boolean tag = true;
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			tag = true;
			for (int j = 0; j < len - i - 1; j++) {
				if (((Comparable) arr[j]).compareTo(arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					tag = false;
				}
			}
			if (tag)
				break;
		}
	}

	/**
	 * 日期排序
	 * 
	 * @param arr
	 */
	public static void sortDate(Date[] arr) {
		boolean tag = true;
		for (int i = 0; i < arr.length; i++) {
			tag = true;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (((Comparable) arr[j]).compareTo(arr[j + 1]) > 0) {
					Date temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					tag = false;
				}
			}
			if (tag)
				break;
		}
	}
}
