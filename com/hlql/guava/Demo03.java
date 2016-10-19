package com.hlql.guava;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * 函数式编程 1. Predicate 2. Function
 * 
 * @author tom
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		List<String> list = Lists.newArrayList("aaaaaa", "bb", "cccc", "dddddddd");
		
		// 字符串长度超过5个则截取
		Function<String, String> f1 = new Function<String, String>(){

			@Override
			public String apply(String input) {
				return input.length() > 5 ? input.substring(0, 5) : input;
			}
			
		};
		
		// 字符串转大写
		Function<String, String> f2 = new Function<String, String>(){

			@Override
			public String apply(String input) {
				return input.toUpperCase();
			}
			
		};

		// 组合
		Function<String, String> f = Functions.compose(f1, f2);
		
		Collection<String> result = Collections2.transform(list, f);
		
		for (String temp : result) {
			System.out.println(temp);
		}
	}

	public static void test2() {
		Set<Long> timeSet = Sets.newHashSet();
		timeSet.add(1000000L);
		timeSet.add(100000000000000L);
		timeSet.add(1000L);
		timeSet.add(10000000000000L);

		Collection<String> timeStrCol = Collections2.transform(timeSet, new Function<Long, String>() {

			@Override
			public String apply(Long input) {
				return new SimpleDateFormat("yyyy-MM-dd").format(input);
			}
			
		});
		
		for (String temp : timeStrCol) {
			System.out.println(temp);
		}
	}

	public static void test1() {
		List<String> list = Lists.newArrayList("moon", "dad", "hlql", "refer", "hello");
		Collection<String> palindromeList = Collections2.filter(list, new Predicate<String>() {

			@Override
			public boolean apply(String input) {
				return new StringBuilder(input).reverse().toString().equals(input);
			}
			
		});

		for (String temp : palindromeList) {
			System.out.println(temp);
		}
	}
}
