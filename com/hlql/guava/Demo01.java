package com.hlql.guava;

import java.util.Set;

import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;

public class Demo01 {

	public static void main(String[] args) {
		Set<Integer> sets = Sets.newHashSet(1, 2, 3, 4, 5, 6);
		Set<Integer> sets2 = Sets.newHashSet(2, 3, 4, 5, 8, 9);

		// 交集
		System.out.println("交集");
		SetView<Integer> interesection = Sets.intersection(sets, sets2);
		for (Integer temp : interesection) {
			System.out.print(temp + ",");
		}

		// 并集
		System.out.println("并集");
		SetView<Integer> union = Sets.union(sets, sets2);
		for (Integer temp : union) {
			System.out.print(temp + ",");
		}

		// 差集
		System.out.println("差集");
		SetView<Integer> diff = Sets.difference(sets, sets2);
		for (Integer temp : diff) {
			System.out.print(temp + ",");
		}
	}

}
