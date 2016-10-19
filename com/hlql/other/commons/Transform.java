package com.hlql.other.commons;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.SwitchTransformer;

public class Transform {

	public static void main(String[] args) {
		
		// 判断
		Predicate<Employee> preLow = new Predicate<Employee>() {

			@Override
			public boolean evaluate(Employee object) {
				return object.getSalary() < 10000;
			}
		};

		Predicate<Employee> preHigh = new Predicate<Employee>() {
			
			@Override
			public boolean evaluate(Employee object) {
				return object.getSalary() >= 10000;
			}
		};

		Predicate[] pre = { preLow, preHigh };

		// 转换
		Transformer<Employee, Level> tranLow = new Transformer<Employee, Level>() {
			
			@Override
			public Level transform(Employee input) {
				return new Level(input.getName(), "卖身中");
			}
		};
		
		Transformer<Employee, Level> tranHigh = new Transformer<Employee, Level>() {
			
			@Override
			public Level transform(Employee input) {
				return new Level(input.getName(), "养生中");
			}
		};

		Transformer[] trans = { tranLow, tranHigh };

		// 关联组合
		Transformer switchTrans = new SwitchTransformer<>(pre, trans, null);

		// 容器
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("张三", 5000));
		list.add(new Employee("李四", 10000));
		list.add(new Employee("王五", 40000));
		
		Collection<Level> levelList = CollectionUtils.collect(list, switchTrans);

		// 遍历容器
		Iterator<Level> iter = levelList.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	public static void inner() {
		Transformer<Long, String> trans = new Transformer<Long, String>() {

			@Override
			public String transform(Long input) {
				return new SimpleDateFormat("yyyy年MM月dd日").format(input);
			}
		};

		List<Long> list = new ArrayList<Long>();
		list.add(999999999999L);
		list.add(999999999999999L);

		Collection<String> result = CollectionUtils.collect(list, trans);
		for (String temp : result) {
			System.out.println(temp);
		}
	}
}
