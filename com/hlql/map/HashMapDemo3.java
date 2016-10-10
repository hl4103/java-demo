package com.hlql.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapDemo3 {

	public static void main(String[] args) {
		List<Student> list = exam();
		Map<String, ClassRoom> map = total(list);
		view(map);
	}

	/**
	 * 展示数据
	 */
	public static void view(Map<String, ClassRoom> map) {
		Set<String> keys = map.keySet();
		Iterator<String> keyIt = keys.iterator();
		while(keyIt.hasNext()){
			String no = keyIt.next();
			ClassRoom room = map.get(no);
			double total = room.getTotal();
			double avg = total / room.getList().size();
			System.out.println(no + "--->" + total + "--->" + avg);
		}
	}

	/**
	 * 计算数据
	 */
	public static Map<String, ClassRoom> total(List<Student> list) {
		Map<String, ClassRoom> map = new HashMap<String, ClassRoom>();
		for (Student stu : list) {
			String no = stu.getNo();
			double score = stu.getScore();
			ClassRoom room = map.get(no);
			if (null == room) {
				room = new ClassRoom(no);
				map.put(no, room);
			}
			room.getList().add(stu);
			room.setTotal(room.getTotal() + score);
		}
		return map;
	}

	/**
	 * 存储数据
	 */
	public static List<Student> exam() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("a", 80, "张三"));
		list.add(new Student("a", 83, "李四"));
		list.add(new Student("a", 80, "王五"));
		list.add(new Student("b", 84, "赵六"));
		list.add(new Student("b", 80, "钱七"));
		list.add(new Student("a", 89, "孙八"));
		return list;
	}
}
