package com.java.basic;

import java.io.File;
import java.io.IOException;

public class FileControl {

	public static void main(String[] args) {
		File dir = new File("C:\\java-basic\\test1\\test2");
		File file = new File("C:\\\\java-basic\\\\test1\\\\test2\\HelloWorld.txt");
		
		try {
			dir.mkdirs();
			file.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("成功しました。");

	}

}
