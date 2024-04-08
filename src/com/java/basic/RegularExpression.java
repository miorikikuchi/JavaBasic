package com.java.basic;

public class RegularExpression {

	public static void main(String[] args) {
		String myNumber = "My cellphone number is 010-1234-5678.";
		System.out.println(myNumber.replaceAll("[0-9]","x"));
		
		String test ="aaaaaabbbbbcccccccddddefggggggggg012iii";
		System.out.println(test.replaceAll("[a-z]","0"));
		System.out.println(test.replaceAll("a*b","0"));
		System.out.println(test.replaceAll("^.*[0-9]{3}","0"));
		System.out.println(test.replaceAll("[0-9|a-c]","0"));
	}

}
