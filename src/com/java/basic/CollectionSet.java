package com.java.basic;

import java.util.HashSet;

public class CollectionSet {

	public static void main(String[] args) {
		HashSet<String> fruitsSet = new HashSet<String>();
		fruitsSet.add("リンゴ");
		fruitsSet.add("バナナ");
		fruitsSet.add("キウイ");
		fruitsSet.add("ブドウ");
		fruitsSet.add("リンゴ");
		fruitsSet.add("トマト");
		fruitsSet.remove("トマト");
		
		for(String fruit:fruitsSet) {
			System.out.println("fruitセット:"+fruit);
		}
	}
}
