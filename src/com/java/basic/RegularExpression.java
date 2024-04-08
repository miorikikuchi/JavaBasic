package com.java.basic;

public class RegularExpression {

	public static void main(String[] args) {
		String myNumber = "My cellphone number is 010-1234-5678.";
		System.out.println(myNumber.replaceAll("[1-9]","x"));

	}

}
