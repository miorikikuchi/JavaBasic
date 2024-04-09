package com.java.basic;

public class ObjectMain3 {

	public static void main(String[] args) {
		Dolphin dolphin = new Dolphin();
		
		Giraffe giraffe = new Giraffe();
		
		System.out.println(Dolphin.ANIMAL_NAME+"は、"+dolphin.move());
		System.out.println(Giraffe.ANIMAL_NAME+"は、"+giraffe.move());
		
		System.out.println(Dolphin.ANIMAL_NAME+"は、"+dolphin.eat());
		System.out.println(Giraffe.ANIMAL_NAME+"は、"+giraffe.eat());
		
		System.out.println(Dolphin.ANIMAL_NAME+"は、"+dolphin.respiration());
		System.out.println(Giraffe.ANIMAL_NAME+"は、"+giraffe.respiration());

	}

}
