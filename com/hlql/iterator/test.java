package com.hlql.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class test {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("aaa");
		list.add("bbbb");
		list.add("cccc");

		// 1. 通过索引遍历 List
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 2. 通过迭代器遍历 List
		for(Iterator iter2 = list.iterator(); iter2.hasNext();){
			System.out.println(iter2.next());
//			iter2.remove();
		}

		Set set = new HashSet();
		set.add("发生地方");
		set.add("阿萨德飞");
		set.add("dddd");

//		Iterator iter = set.iterator();
//		while (iter.hasNext()) {
		for(Iterator iter = set.iterator();iter.hasNext();){
			String str = (String) iter.next();
			System.out.println(str);
		}
	}
}
