package com.java.basic;

public class Lesson1 {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Java	入門";
		String str3 = "Java基礎";
		String format = "文字列\"%s\"の文字列の長さは、%dです。";
		String format2 = "文字列\"%s\"の場所は、%d番目です。";
		String sentence = "I#study#programing.#I#learn#XXX.#I#want#to#make#some#XXXXXX#applications.";
		String result = "";
		
		System.out.println(String.format(format,str1,str1.length()));
		System.out.println(String.format(format,str2,str2.length()));
		System.out.println(String.format(format,str3,str3.length()));
		
		if(result.equals("") && sentence.contains("make")); {
			System.out.println(String.format(format2, "make",sentence.indexOf("make")));
		}
		
		String[] sep = sentence.split("#");
		for(String word : sep) {
			System.out.println("split : "+ word);
		}
		
		String sentence2 = String.join(",",sep);
		System.out.println("joined :"+sentence2);
		
		result = sentence2.replace(","," ");
		System.out.println("replaced :"+result);
		
		System.out.println(result.replaceAll("X+","Java"));
	}
}
