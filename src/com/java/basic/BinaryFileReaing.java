package com.java.basic;

import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileReaing {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("C:¥¥java-basic\\test\\abc.dat");) {
			int i = fis.read();
			while (i != -1) {
				String b = Integer.toBinaryString(i);
				System.out.print(b);
				i = fis.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
