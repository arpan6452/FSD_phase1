package com.file_CURD_operation;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateAndWrite {
	public static void main(String[] args) {
		//Creates a file
		try(FileOutputStream fos = new FileOutputStream("MyFile.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
				){
			//write a file
			String message = "This is the first text I am writing here.";
			byte dataInbyte[] = message.getBytes();
			bos.write(dataInbyte);
			bos.flush();
			System.out.println("I have successfully created and wrote into a file");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
