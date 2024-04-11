package com.java.basic;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("C:¥¥java-basic\\test\\HelloWorld.txt",true);
			fw.write("Hello,world!!");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}

	}

	}

