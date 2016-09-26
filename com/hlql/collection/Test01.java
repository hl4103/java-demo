package com.hlql.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {

		Collection c;
		List list = new ArrayList();
		// ArrayList 底层实现是数组, 所以查询快, 但 修改,插入,删除慢 线程不安全, 效率高
		// LinkedList 底层实现是链表, 所以 查询慢, 但修改,插入,删除快 线程不安全, 效率高
		// Vector: 线程安全的,但效率低.

		list.add("aaaa");
		list.add(new Date());
		list.add(new Dog());
		list.add(12314); // 包装类, 自动装箱
		System.out.println(list.size());
	}

}

class Dog {

}
