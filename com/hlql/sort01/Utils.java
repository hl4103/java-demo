package com.hlql.sort01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 排序
 * 
 * @author tom
 *
 */
public class Utils {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("baa");
		list.add("aca");
		list.add("aad");
		list.add("afa");
		sort(list);
		System.out.println(list);

		String[] strArr = { "a", "ab", "abcd", "abc" };
		sort(strArr, new StringComp());
		System.out.println(Arrays.toString(strArr));

		List<String> list2 = new ArrayList<String>();
		list2.add("baa");
		list2.add("acaa");
		list2.add("aadaa");
		list2.add("afa");
		sort(list2, new StringComp());
		System.out.println(list2);

	}

	/**
	 * 数组排序
	 * 
	 * @param arr
	 */
	public static <T> void sort(Object[] arr, Comparator<T> comp) {
		boolean tag = true;
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			tag = true;
			for (int j = 0; j < len - i - 1; j++) {
				if (comp.compare((T) arr[j], (T) arr[j + 1]) > 0) {
					Object temp = arr[j];
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
	 * 容器排序
	 * 
	 * @param arr
	 */
	// public static <T extends Comparable<T>> void sort(List<T> list,
	// Comparator<T> comp) {
	public static <T> void sort(List<T> list, Comparator<T> comp) {
		Object[] arr = list.toArray();
		sort(arr, comp);
		for (int i = 0; i < arr.length; i++) {
			list.set(i, (T) (arr[i]));
		}
	}

	/**
	 * 数组排序
	 * 
	 * @param arr
	 */
	public static void sort(Object[] arr) {
		boolean tag = true;
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			tag = true;
			for (int j = 0; j < len - i - 1; j++) {
				if (((Comparable) arr[j]).compareTo(arr[j + 1]) > 0) {
					Object temp = arr[j];
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
	 * 使用泛型排序
	 * 
	 * @param arr
	 */
	public static <T extends Comparable<T>> void sort(T[] arr) {
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
	 * 容器排序
	 * 
	 * @param arr
	 */
	public static <T extends Comparable<T>> void sort(List<T> list) {
		Object[] arr = list.toArray();
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			list.set(i, (T) (arr[i]));
		}
	}
}
