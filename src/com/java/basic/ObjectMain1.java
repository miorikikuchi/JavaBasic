package com.java.basic;

public class ObjectMain1 {

	public static void main(String[] args) {
		int x = 10;
		int y = 7;
		Calculator calcuA = new Calculator("計算機A");
		Calculator calcuB = new Calculator("計算機B");
		calcuA.setResult(3.0);
		calcuB.setResult(-3.0);
		System.out.println("計算機Aの結果:"+calcuA.getResult());
		System.out.println("計算機Bの結果:"+calcuB.getResult());
	}

}
