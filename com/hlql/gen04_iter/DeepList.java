package com.hlql.gen04_iter;

import java.util.Arrays;
import java.util.Iterator;

/**
 * 一个容器可以创建多个迭代对象
 * 迭代器原理 1. 匿名内部类 | 内部类
 * 
 * 使用 Iterable 实现foreach 迭代
 * 
 * @author tom
 *
 */
public class DeepList implements java.lang.Iterable{

	// 数组存储值
	// private String[] elem = { "A", "B", "C" };
	private String[] elem = new String[5];

	// 数组元素个数
	private int size = 0;

	// 计数器 游标 指针
	private int coursor = -1;

	// 获取元素个数
	public int size() {
		return this.size;
	}

	// 在末尾添加元素
	public void add(String ele) {
		if (this.size == elem.length) { // 容量不够,扩容
			elem = Arrays.copyOf(elem, elem.length + 5);
		}
		elem[size] = ele; // 数组中加入元素
		size++; // 实际大小加一
	}

	// 匿名内部类.
	public Iterator iterator() {
		return new Iterator() {
			// 判断是否存在下一个
			public boolean hasNext() {
				return coursor + 1 < size;
			}

			// 获取下一个元素
			public String next() {
				coursor++;
				return elem[coursor];
			}

			// 移除元素
			public void remove() {
				// 移动数组元素
				System.arraycopy(elem, coursor + 1, elem, coursor,
						/* DeepList.this. */size - (coursor + 1));
				// 回退
				/* DeepList.this. */coursor--;
				// 实际大小减一
				/* DeepList.this. */size--;
			}
		};
	}

	public Iterator iterator1() {
		return new MyIter();
	}

	class MyIter implements Iterator {
		// 判断是否存在下一个
		public boolean hasNext() {
			return coursor + 1 < size;
		}

		// 获取下一个元素
		public String next() {
			coursor++;
			return elem[coursor];
		}

		// 移除元素
		public void remove() {
			// 移动数组元素
			System.arraycopy(elem, coursor + 1, elem, coursor,
					/* DeepList.this. */size - (coursor + 1));
			// 回退
			/* DeepList.this. */coursor--;
			// 实际大小减一
			/* DeepList.this. */size--;
		}
	}

	public static void main(String[] args) {
		DeepList list = new DeepList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("A1");
		list.add("A2");
		list.add("A3");
		Iterator iter = list.iterator1();
		while (iter.hasNext()) {
			System.out.println(iter.next());
//			iter.remove();
		}
		
		for(Object str : list){
			System.out.println(str);
		}
		
//		System.out.println("-----------");
//		iter = list.iterator1();
//		while (iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
	}
}
