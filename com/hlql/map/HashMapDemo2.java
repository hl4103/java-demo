package com.hlql.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		// 1. 分割字符串
		String[] strArr = new String("This is a cat and that is a mice and where is the food ?").split(" ");
		// 2. 分拣乘除
		Map<String, Letter> map = new HashMap<String, Letter>();
		for (String key : strArr) {
			// 第一次查看是否存在该键
			if(!map.containsKey(key)){
				map.put(key, new Letter(key));
			}
			// 获取具体的键
			Letter value = map.get(key);
			value.setCount(value.getCount()+1);
		}
		// 3. 查看每个单词出现的次数
		for(String key : map.keySet()){
			Letter value = map.get(key);
			System.out.println(key + "---->" + value.getCount());
		}
	}
}
