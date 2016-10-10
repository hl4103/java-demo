package com.hlql.generic;

/**
 * 泛型接口
 * 
 * @author tom
 *
 * @param <T>
 */
public interface Comparator<T> {
	// 全局常量
	/*public static final*/ int MAX_VALUE = 1024;
	
	// 公共的抽象方法
	/*public abstract*/ void compare(T t);
	/*public abstract*/ T xxxx(T t);
}
