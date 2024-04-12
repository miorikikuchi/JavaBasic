package com.java.basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lesson7 {

	public static void main(String[] args) {
		File dir = new File("C:\\java-basic\\lesson7");
		File file = new File("C:\\java-basic\\lesson7\\months.txt");
		
		dir.mkdirs();
		
		try {
			file.createNewFile();
		}catch(IOException e) {
			System.out.println("テキストファイルの作成に失敗しました。");
		}
		
		try(FileWriter fw = new FileWriter("C:\\java-basic\\lesson7\\months.txt")) {
			fw.write("January \n");
			fw.write("February \n");
			fw.write("March \n");
			fw.write("April \n");
			fw.write("May \n");
			fw.write("June \n");
			fw.write("July \n");
			fw.write("August \n");
			fw.write("September \n");
			fw.write("October \n");
			fw.write("November \n");
			fw.write("December \n");
		}catch(IOException e) {
			System.out.println("テキストファイルの書き込みに失敗しました。");
		}
		
		try(FileReader fr = new FileReader("C:\\java-basic\\lesson7\\months.txt")) {
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			int month = 1;
			while(line != null) {
				System.out.println(month+"月:"+line);
				line =br.readLine();
				month++;
			}
		}catch(IOException e) {
			System.out.println("テキストファイルの書き込みに失敗しました。");
		}
		
	}

}
