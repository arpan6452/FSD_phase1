package com.file_CURD_operation;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("MyFile.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);) {
			// read a file
			StringBuffer sb = new StringBuffer();
			while (bis.available() != 0) {
				sb.append((char) bis.read());
			}
			System.out.println("I have successfully created and write into a file: ");
			System.out.println(sb.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
