package com.java.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferingFilter {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("C:¥¥java-basic\\\\test\\\\HelloWorld.txt"))) {
			String line = br.readLine();
			int gyoNo = 1;
			while (line != null) {
				System.out.println(gyoNo + "行目：" + line);
				line = br.readLine();
				gyoNo++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
