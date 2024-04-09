package com.java.basic;

public abstract class Mammalian {
	public Mammalian(String animal) {
		System.out.println("哺乳類動物の"+animal+"を生成します。");
	}
	
	abstract public String move();

	abstract public String eat();

	public String respiration() {
		return "肺呼吸します。";
	}
}


