package com.hlql.gen04_iter;

/**
 * 迭代器原理
 * @author tom
 *
 */
public class SimpleList {

	// 数组存储值
	private String[] elem = { "A", "B", "C" };

	// 数组元素个数
	private int size = elem.length;

	// 计数器 游标 指针
	private int coursor = -1;
	
	// 获取元素个数
	public int size() {
		return this.size;
	}

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
		System.arraycopy(elem, coursor + 1, elem, coursor, this.size - (coursor + 1));
		// 回退
		this.coursor --;
		// 实际大小减一
		this.size --;
	}

	public static void main(String[] args) {
		SimpleList list = new SimpleList();
		if(list.hasNext()){
			System.out.println(list.next());
			list.remove();
		}
		if(list.hasNext()){
			System.out.println(list.next());
			list.remove();
		}
		if(list.hasNext()){
			System.out.println(list.next());
			list.remove();
		}
		if(list.hasNext()){
			System.out.println(list.next());
			list.remove();
		}
		System.out.println(list.size());
	}
}
