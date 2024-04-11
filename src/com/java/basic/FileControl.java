package com.java.basic;

import java.io.File;

public class FileControl {

	public static void main(String[] args) {
		File dir = new File("C:\\java-basic\\test1");
		File[] childdirs = dir.listFiles();
		for(File childdir : childdirs) {
			childdir.delete();
		}
		dir.delete();
		System.out.println("成功しました。");

	}

}
