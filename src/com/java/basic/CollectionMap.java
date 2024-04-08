package com.java.basic;

import java.util.HashMap;

public class CollectionMap {

	public static void main(String[] args) {
		HashMap<String,String>fruitsMap = new HashMap<String,String>();
		fruitsMap.put("apple","リンゴ");
		fruitsMap.put("banana","バナナ");
		fruitsMap.put("peach","モモ");
		fruitsMap.put("pear","ナシ");
		fruitsMap.put("grape","ブドウ");
		fruitsMap.put("lemon","レモン");
		fruitsMap.put("tomato","トマト");
		fruitsMap.put("carrot","ニンジン");
		fruitsMap.put("pineapple","リンゴ");
		fruitsMap.put("pineapple","パイナップル");
		fruitsMap.remove("tomato");
		fruitsMap.remove("carrot","ニンジン");
		
		for(String key : fruitsMap.keySet()) {
			System.out.println("key:"+key+"\t Value:"+fruitsMap.get(key));
		}
	}
}
