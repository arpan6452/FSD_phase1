package com.file_project;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		// Creates a file
		try (FileOutputStream fos = new FileOutputStream("FileProject.txt", true);
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			// writing a file
			String message = "This is the first text I am writing here.";
			byte dataInbyte[] = message.getBytes();
			bos.write(dataInbyte);
			System.out.println("I have successfully created and wrote into a file.");
			String message1 = "This is the updating text I am writing here.";
			dataInbyte = message1.getBytes();
			//updating a file
			bos.write(dataInbyte);
			bos.flush();
			System.out.println("I have successfully updating into a file.");
			
			//reading from a file
			fis = new FileInputStream("FileProject.txt");
			bis = new BufferedInputStream(fis);
			StringBuffer sb = new StringBuffer();
			System.out.println("I have successfully read from a file: ");
			while (bis.available() != 0) {
				sb.append((char)bis.read());
			}
			System.out.println(sb.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {		
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
