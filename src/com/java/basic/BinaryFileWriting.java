package com.java.basic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileWriting {

	public static void main(String[] args) {
		try {
			File binaryFile = new File("C¥¥java-basic\\test\\abc.dat");
			binaryFile.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(FileOutputStream fos = new FileOutputStream("C¥¥java-basic\\test\\abc.dat");){
			byte[] data = {0b1111111,0b1010101,0b0000111};
			fos.write(data);
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
