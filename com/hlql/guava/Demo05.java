package com.hlql.guava;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**
 * 统计单词出现的次数
 * 
 * @author tom
 *
 */
public class Demo05 {

	public static void main(String[] args) {

		String str = "this is cat and that is mice and where is food";

		String[] strArray = str.split(" ");
		Multiset<String> set = HashMultiset.create();
		
		for (String strTemp : strArray) {
			set.add(strTemp);
		}

		for (String temp : set) {
			System.out.println(temp + " => " + set.count(temp));
		}
	}

}
