package com.java.basic;

import java.util.HashMap;
import java.util.function.IntBinaryOperator;

public class Lambda {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "睦月");
		map.put(2, "如月");
		map.put(3, "弥生");
		map.put(4, "卯月");
		map.put(5, "五月");
		map.put(6, "水無月");
		map.put(7, "文月");
		map.put(8, "葉月");
		map.put(9, "長月");
		map.put(10, "神無月");
		map.put(11, "霜月");
		map.put(12, "師走");
		
		map.keySet().stream().forEach(i -> System.out.println(i+"月："+map.get(i)));
	}
}
