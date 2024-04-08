package com.java.basic;

public class ObjectMain1 {

	public static void main(String[] args) {
		int x = 10;
		int y = 7;
		Calculator calcuA = new Calculator();
		Calculator calcuB = new Calculator();
		calcuA.init(x);
		calcuA.add(y);
		calcuA.div(2);
		calcuB.init(x);
		calcuB.mult(y);
		calcuB.sqrt();
		
		System.out.println("計算機Aの結果:"+calcuA.getResult());
		System.out.println("計算機Bの結果:"+calcuB.getResult());
	}

}
