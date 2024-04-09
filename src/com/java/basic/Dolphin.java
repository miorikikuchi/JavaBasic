package com.java.basic;

public class Dolphin extends Mammalian {
	public static final String ANIMAL_NAME = "イルカ";
	
	Dolphin() {
		super(ANIMAL_NAME);
	}
	
	@Override
	public String move() {
		return "泳ぎます。";
	}
	
	@Override
	public String eat() {
		return "小魚を食べます。";
	}
}
