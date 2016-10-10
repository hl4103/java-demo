package com.hlql.sort01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo01 {

	public static void main(String[] args) {
		List<String> list2 = new ArrayList<String>();
		list2.add("b");
		list2.add("acaa");
		list2.add("aadaa");
		list2.add("afa");
		Collections.sort(list2, new StringComp());
		System.out.println(list2);

		List<String> list = new ArrayList<String>();
		list.add("b");
		list.add("acaa");
		list.add("aadaa");
		list.add("afa");
		Collections.sort(list);
		System.out.println(list);
	}
}
