package com.java.basic;

public class StringFunction {

	public static void main(String[] args) {
		
		String str1 = "soba";
		String str2 ="yakisoba";
		String str3 ="sobakasu";
		
		System.out.println("(1)");
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str3.length());
		
		System.out.println("(2)");
		System.out.println(str2.equals("yakisoba"));
		System.out.println(str2.equals("yaki"+str1));
		
		System.out.println("(3)");
		String str4 = "";
		String str5 = null;
		System.out.println(str4 == null);
		System.out.println(str5 == null);
		System.out.println(str4.isEmpty());
		//System.out.println(str5.isEmpty());
		
		System.out.println("(4)");
		String str6 ="I like elephant better than giraffe.";
		String[]  letter6 =str6.split("");
		for(String word : letter6) {
			System.out.println("word:"+word);
		}
		
		System.out.println("(5)");
		System.out.println(String.join(",", letter6));
		System.out.println(String.join("", letter6));
		
		System.out.println("(6)");
		System.out.println(str2.substring(0,4));
		System.out.println(str2.substring(4));
		
		System.out.println("(7)");
		System.out.println(str3.contains("soba"));
		System.out.println(str3.contains("yaki"));
		System.out.println(str2.indexOf("soba"));
		System.out.println(str3.indexOf("yaki"));
		System.out.println(str2.startsWith("soba"));
		System.out.println(str2.endsWith("soba"));
		System.out.println(str3.startsWith("soba"));
		System.out.println(str3.endsWith("soba"));
		
		System.out.println("(8)");
		String str7 = "I,like,elephant,better,than,giraffe";
		System.out.println(str7.replace(","," "));
		String str8 = "the cat is pretty";
		System.out.println(str8.replace("cat","cap"));
		
		System.out.println("(9)");
		String format = "私の名前は、%sです。年齢は、%dです。";
		System.out.println(String.format(format, "Mike",18));
		System.out.println(String.format(format, "Cathy",20));
		System.out.println(String.format(format, "Jon",25));
	}

}
