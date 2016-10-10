package com.hlql.sort_col;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Person p1 = new Person("张三", 123);
		Person p2 = new Person("李四", 1231);
		Person p3 = new Person("王五", 13);
		Person p4 = new Person("赵六", 1230);

		TreeMap<Person, String> map = new TreeMap<Person, String>(new java.util.Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return -(o1.getHandsome() - o2.getHandsome());
			}

		});
		map.put(p1, "aa");
		map.put(p2, "aa");
		map.put(p3, "aa");
		map.put(p4, "aa");

		// 查看键
		Set<Person> persons = map.keySet();
		System.out.println(persons);
	}

}
