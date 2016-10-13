package com.hlql.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");

		List<String> cc = Collections.unmodifiableList(list);
		// cc.add("ee");

		list.add("fff");
		for (String temp : cc) {
			System.out.println(temp);
		}
	}
}
