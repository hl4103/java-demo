package com.hlql.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1. binarySearch(List<? extends Comparable<? super T>> list, T key) 容器有序 2.
 * sort(List<T> list); sort(List<T> list, Comparator<? super T> c) 3.
 * reverse(List<?> list) 4. shuffle(List<?> list) 洗牌 5. swap(List<?> list, int
 * i, int j)
 * 
 * @author tom
 *
 */
public class CollectionsDemo {

	public static void main(String[] args) {
		List<Integer> card = new ArrayList<Integer>();
		for (int i = 0; i < 54; i++) {
			card.add(i);
		}
		Collections.shuffle(card);

		List<Integer> p1 = new ArrayList<Integer>();
		List<Integer> p2 = new ArrayList<Integer>();
		List<Integer> p3 = new ArrayList<Integer>();
		List<Integer> last = new ArrayList<Integer>();

		for (int j = 0; j < 51; j += 3) {
			p1.add(card.get(j));
			p2.add(card.get(j+1));
			p3.add(card.get(j+2));
		}
		last.add(card.get(51));
		last.add(card.get(52));
		last.add(card.get(53));

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(last);
	}

	public static void test() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}
}
