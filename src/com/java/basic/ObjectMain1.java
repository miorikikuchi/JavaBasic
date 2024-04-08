package com.java.basic;

public class ObjectMain1 {

	public static void main(String[] args) {
		int x = 10;
		int y = 7;
		Calculator calcuA = new Calculator("計算機A");
		Calculator calcuB = new Calculator("計算機B");
		calcuA.init(3);
		calcuA.add(2);
		calcuA.mult(6);
		calcuB.init(3);
		calcuB.add(2);
		calcuB.mult(6);
		System.out.println("計算機Aの結果:"+calcuA.getResult());
		System.out.println("計算機Bの結果:"+calcuB.getResult());
	}

}
