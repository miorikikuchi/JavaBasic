package com.java.basic;

import java.util.function.IntBinaryOperator;

public class FuncObject {

	public static void main(String[] args) {
		int x = 10;
		int y = 15;
		
		IntBinaryOperator func = FuncObject:: add;
		
		System.out.println(func.applyAsInt(x, y));
		
		System.out.println(func);

	}

	public static int add(int x, int y) {
		return x + y;
	}

}
