package com.java.basic;

public class Giraffe extends Mammalian{
	public static final String ANIMAL_NAME = "キリン";
	
	@Override
	public String move() {
		return "歩きます。";
	}
	@Override
	public String eat() {
		return "草木を食べます。";
	}
	@Override
	public String respiration() {
		return "肺呼吸します。";
	}

}
