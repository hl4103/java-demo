package com.hlql.gen02;

/**
 * 
 * @author tom
 *
 * @param <T1>
 * @param <T2>
 */
public abstract class Father<T1, T2> {
	T1 age;
	public abstract void test(T2 name);
}

// 保留 ---> 泛型子类
// 1. 全部保留
class C1 <T1, T2> extends Father<T1, T2>{

	@Override
	public void test(T2 name) {
		// TODO Auto-generated method stub
		
	}
}
//class C1 <T1, T2, A> extends Father<T1, T2>{}
// 2. 部分保留
class C2 <T2> extends Father<Integer, T2>{

	@Override
	public void test(T2 name) {
		// TODO Auto-generated method stub
		
	}
}
// 不保留 ---> 按需实现
// 1. 具体类型
class C3 extends Father<Integer, String>{

	@Override
	public void test(String name) {
		// TODO Auto-generated method stub
		
	}
}
//class C3<A, B> extends Father<Integer, String>{}
// 2. 没有泛型 擦除 Object
class C4 extends Father{

	@Override
	public void test(Object name) {
		// TODO Auto-generated method stub
		
	}
}