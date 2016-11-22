package com.hlql.com.annotation.demo;

@SxtAnnotation01
public class Demo01 {

	@SxtAnnotation01(age = 19, studentName = "老高", id = 1001, schools = { "北京大学", "北京航空航天大学" })
	public void test() {
	}

	@SxtAnnotation02("aaaa")
	public void test2() {
	}
}
