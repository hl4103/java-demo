package com.hlql.employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorTest {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		Set set = new HashSet();
		set.add("ddd");
		set.add("eee");
		set.add("fff");

//		Iterator iter = set.iterator();
//		while (iter.hasNext()) {
		for (Iterator iter = set.iterator(); iter.hasNext();) {
			String str = (String) iter.next();
			System.out.println(str);
		}
	}
}
