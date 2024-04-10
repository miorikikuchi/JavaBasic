package com.java.basic;

public class ObjectMain4 {

	public static void main(String[] args) {

		DellTabletPC dellpc = new DellTabletPC("hogehoge tablet pc");
		dellpc.boot();
		dellpc.input("dir");
		dellpc.changedInput();
		dellpc.input("dir");
		System.out.println("出力結果：" + dellpc.output());
		dellpc.shutDown();
	}

}
