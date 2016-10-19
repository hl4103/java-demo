package com.hlql.other.commons;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.PredicateUtils;
import org.apache.commons.collections4.functors.NotNullPredicate;
import org.apache.commons.collections4.list.PredicatedList;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<String> pre = new Predicate<String>() {

			@Override
			public boolean evaluate(String object) {
				return object.length() >= 5 && object.length() <= 20;
			}
		};
		
		Predicate<String> pre2 = new Predicate<String>(){

			@Override
			public boolean evaluate(String object) {
				return !object.equals("admin");
			}
			
		};

		Predicate all = PredicateUtils.allPredicate(pre, pre2);

		List<String> list = PredicatedList.predicatedList(new ArrayList<String>(), all);
		list.add("admain");
	}

	public static void test() {
		Predicate notNull = NotNullPredicate.notNullPredicate();
		// String str = null;
		// boolean flag = notNull.evaluate(str);
		// System.out.println(flag);

		List<Long> list = PredicatedList.predicatedList(new ArrayList<Long>(), notNull);
		list.add(1000L);

		for (Long temp : list) {
			System.out.println(temp);
		}
	}
}
