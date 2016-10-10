package com.hlql.gen03;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author tom
 *
 */
public class StudentApp {

	public static void main(String[] args) {
		// 泛型嵌套
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "aaaa");
		map.put("b", "bbbb");

		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "--->" + value);
		}
	}

}
