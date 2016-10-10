package com.hlql.sort_col;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Person p1 = new Person("张三", 123);
		Person p2 = new Person("李四", 1231);
		Person p3 = new Person("王五", 13);
		Person p4 = new Person("赵六", 1230);

		// 依次存放到TreeSet容器中, 使用排序的业务类(匿名内部类实现方式)
		TreeSet<Person> persons = new TreeSet<Person>(new java.util.Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return -(o1.getHandsome() - o2.getHandsome());
			}

		});

		// TreeSet 在添加数据时排序(数据更改不会原来顺序)(不要修改数据否则可能重复)
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);

		System.out.println(persons);

		// 改变数据
		// p3.setHandsome(12345);
		// System.out.println(persons);
	}

}
