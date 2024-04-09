package com.java.basic;

public class Lesson3 {

	public static void main(String[] args) {
		TestData a = new TestData("Mike");
		TestData b = new TestData("Cathy");
		TestData c = new TestData("Ichiro");
		
		a.setScore(90);
		b.setScore(30);
		c.setScore(50);
		
		System.out.println(a.getName()+"のテスト結果："+a.getResult());
		System.out.println(b.getName()+"のテスト結果："+b.getResult());
		System.out.println(c.getName()+"のテスト結果："+c.getResult());
	}

}
