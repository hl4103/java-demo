package com.hlql.gen04_iter;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList01<E> implements java.lang.Iterable<E> {

	// 数组存储值
	private Object[] elem = new Object[5];

	// 数组元素个数
	private int size = 0;

	// 计数器 游标 指针
	private int coursor = -1;

	// 获取元素个数
	public int size() {
		return this.size;
	}

	// 在末尾添加元素
	public void add(E ele) {
		if (this.size == elem.length) { // 容量不够,扩容
			elem = Arrays.copyOf(elem, elem.length + 5);
		}
		elem[size] = ele; // 数组中加入元素
		size++; // 实际大小加一
	}

	// 匿名内部类.
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			// 判断是否存在下一个
			public boolean hasNext() {
				return coursor + 1 < size;
			}

			// 获取下一个元素
			public E next() {
				coursor++;
				return (E) elem[coursor];
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

	public static void main(String[] args) {
		ArrayList01<Integer> list = new ArrayList01<Integer>();
		list.add(123);
		list.add(222);
		for (Integer e : list) {
			System.out.println(e);
		}

		ArrayList01<String> list2 = new ArrayList01<String>();
		list2.add("马云");
		list2.add("马化腾");
		list2.add("AAAA");
		Iterator<String> it = list2.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
	}
}
