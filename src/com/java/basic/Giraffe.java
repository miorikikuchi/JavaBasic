package com.java.basic;

public class Giraffe extends Mammalian{
	public static final String ANIMAL_NAME = "キリン";
	
	Giraffe() {
		super(ANIMAL_NAME);
	}
	
	@Override
	public String move() {
		return "歩きます。";
	}
	@Override
	public String eat() {
		return "草木を食べます。";
	}
}
