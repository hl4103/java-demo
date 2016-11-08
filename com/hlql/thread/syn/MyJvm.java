package com.hlql.thread.syn;

/**
 * 单例创建模式:
 * 1. 懒汉式
 * 		(1). 构造器私有化,避免外部直接创建对象
 *      (2). 声明私有的静态属性
 *      (3). 对外提供访问属性的静态方法,确保该对象存在.
 * @author tom
 *
 */
public class MyJvm {
	
	private static MyJvm instance = null;
	
	private MyJvm(){}
	
	public static MyJvm getInstance(){
		if(null == instance){
			synchronized(MyJvm.class){
				if(null == instance){
					instance = new MyJvm();
				}
			}
		}
		return instance;
	}

}

/**
 * 饿汉式
 * 1. 构造器私有化
 * 2. 声明私有的静态属性, 同事创建该对象
 * 3. 对外提供访问属性的静态方法
 * @author tom
 *
 */
class MyJvm2 {
	
	private static MyJvm2 instance = new MyJvm2();
	
	private MyJvm2(){}
	
	public static MyJvm2 getInstance(){
		return instance;
	}

}

/**
 * 恶汉式,解决效率问题
 * 类在使用的时候加载
 * 延缓了加载时机
 * @author tom
 *
 */
class MyJvm3 {
	
	private static class JvmHolder{
		private static MyJvm3 instance = new MyJvm3();
	}
	
	private MyJvm3(){}
	
	public static MyJvm3 getInstance(){
		return JvmHolder.instance;
	}

}