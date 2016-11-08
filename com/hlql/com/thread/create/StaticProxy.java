package com.hlql.com.thread.create;

/**
 * 代理模式
 * @author tom
 *
 */
public class StaticProxy {

	public static void main(String[] args) {
		Marry you = new You();
		WeddingCompany wc = new WeddingCompany(you);
		wc.marry();
	}
}

interface Marry {
	// void marry();
	public abstract void marry();
}

class You implements Marry {

	@Override
	public void marry() {
		System.out.println("结婚了.");
	}

}

class WeddingCompany implements Marry {

	public Marry person;

	public WeddingCompany(Marry someone){
		this.person = someone;
	}
	
	public static void beforeProcess() {
		System.out.println("布置新房");
	}

	public static void afterProcess() {
		System.out.println("闹洞房");
	}

	@Override
	public void marry() {
		beforeProcess();
		person.marry();
		afterProcess();
	}

}