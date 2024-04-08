package com.java.basic;

import java.util.ArrayList;

public class CollectionList {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("リンゴ");
		fruits.add("バナナ");
		fruits.add("キウイ");
		fruits.add("ブドウ");
		fruits.add("リンゴ");
		fruits.add("カボチャ");
		fruits.add("トマト");
		fruits.add("ニンジン");
		fruits.set(5,"ナシ");
		fruits.remove(7);
		fruits.remove("トマト");
		
		for(int i = 0; i < fruits.size(); i++) {
			System.out.println("fruitsリスト:"+fruits.get(i));
		}
	}

}
