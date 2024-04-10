package com.java.basic;

import java.util.function.IntBinaryOperator;

public class Lambda {

	public static void main(String[] args) {
		int x = 10;
		int y = 15;

		IntBinaryOperator func = (int a, int b) -> {return a + b;};
		
		System.out.println(func.applyAsInt(x, y));
		
		System.out.println(func);
	}

}
