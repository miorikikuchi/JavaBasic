package com.java.basic;

import java.io.FileReader;
import java.io.IOException;

public class Fileeading {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("C:¥¥java-basic\\\\test\\\\HelloWorld.txt");){
			int i =fr.read();
			while(i!= -1) {
				char c =(char) i;
				System.out.print(c);
				i=fr.read();
			}
				}catch (IOException e) {
					e.printStackTrace();
		}

	}

}
