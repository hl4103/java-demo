package com.hlql.thread.syn;

/**
 * 单例设计模式: 确保一个类只有一个对象
 * 
 * @author tom
 *
 */
public class SynDemo02 {

	public static void main(String[] args) {
		JvmThread thread1 = new JvmThread(100);
		JvmThread thread2 = new JvmThread(500);
		
		thread1.start();
		thread2.start();
	}

}

class JvmThread extends Thread{
	private long time;
	
	public JvmThread(){
		
	}
	
	public JvmThread(long time){
		this.time = time;
	}
	
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + "---> 创建" + Jvm.getInstance(time));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

/**
 * 单例设计模式 确保一个类只有一个对象 懒汉式: double checking
 * 
 * @author tom
 *
 */
class Jvm {
	// 2. 声明一个私有的静态变量
	private static Jvm instance = null;

	// 1. 构造器私有化,避免外部直接创建对象
	private Jvm() {
	}

	public static Jvm getInstance(Long time) throws InterruptedException {
		if (null == instance) { // 提高效率 提高已经存在对象的访问效率
			synchronized (Jvm.class) {
				if (null == instance) {
					Thread.sleep(time); // 放大错误概率
					instance = new Jvm();
				}
			}
		}
		return instance;
	}

	/**
	 * 效率不高
	 * 
	 * @param time
	 * @return
	 * @throws InterruptedException
	 */
	public static Jvm getInstance3(Long time) throws InterruptedException {
		synchronized (Jvm.class) {
			if (null == instance) {
				Thread.sleep(time);
				instance = new Jvm();
			}
			return instance;
		}
	}

	public synchronized static Jvm getInstance2(Long time) throws InterruptedException {
		if (null == instance) {
			Thread.sleep(time);
			instance = new Jvm();
		}
		return instance;
	}

	// 3. 创建一个对外的公共的静态方法访问该变量,如果变量没有对象,创建该对象
	public static Jvm getInstance1(Long time) throws InterruptedException {
		if (null == instance) {
			Thread.sleep(time);
			instance = new Jvm();
		}
		return instance;
	}
}