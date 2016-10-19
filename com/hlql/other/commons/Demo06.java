package com.hlql.other.commons;

import org.apache.commons.collections4.IterableMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.map.HashedMap;

public class Demo06 {

	public static void main(String[] args) {
		mapIt();
	}

	/**
	 * map迭代器
	 */
	public static void mapIt() {
		IterableMap<String, String> map = new HashedMap<String, String>();
		map.put("a", "aaaaa");
		map.put("b", "bbbbb");
		map.put("c", "ccccc");

		MapIterator<String, String> it = map.mapIterator();
		while (it.hasNext()) {
			// it.next();
			// String key = it.getKey();
			String key = it.next();
			String value = it.getValue();
			System.out.println(key + "====>" + value);
		}
	}
}
