package com.hlql.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// 1. 分割字符串
		String[] strArr = new String("This is a cat and that is a mice and where is the food ?").split(" ");
		// 2. 分拣乘除
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String key : strArr) {
			// System.out.println(key);
			/*if(!map.containsKey(key)){ // 判断是否存在该单词
				map.put(key, 1);
			} else { // 存在
				map.put(key, map.get(key) + 1);
			}*/
			Integer value = map.get(key);
			map.put(key, (null == value ? 1 : value + 1));
		}
		// 3. 查看每个单词出现的次数
		Set<String> keySet = map.keySet();
		// 获取对象
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()){ // 判断
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key + "---->" + value);
		}
	}
}
