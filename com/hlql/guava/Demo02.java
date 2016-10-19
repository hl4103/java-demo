package com.hlql.guava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.ImmutableList;

public class Demo02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");

		List<String> cc = Collections.unmodifiableList(list);
		// cc.add("ee");

		list.add("fff");
		for (String temp : cc) {
			System.out.println(temp);
		}
		
		// guava 对只读设置安全可靠, 相对简单
		List<String> immutableList = ImmutableList.of("a", "b", "c");
		// immutableList.add("aa");
	}
}
