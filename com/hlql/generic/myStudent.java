package com.hlql.generic;

/**
 * 自定义泛型 
 * 1. <> ---> 单个字母,尽可能见名思意 
 * 2. T Type
 *    K V Key Value 
 *    E Element 
 * 3. 注意点
 * 泛型不能使用在静态属性上 指定的类型不能是基本类型
 * 
 * @author tom
 *
 * @param <T> Type
 */
public class myStudent<T> {
	private T javase;

	public myStudent() {
	}

	public myStudent(T javase) {
		this.javase = javase;
	}

	public T getJavase() {
		return javase;
	}

	public void setJavase(T javase) {
		this.javase = javase;
	}
}
