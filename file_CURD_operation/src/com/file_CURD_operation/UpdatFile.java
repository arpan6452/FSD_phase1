package com.file_CURD_operation;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UpdatFile {
	public static void main(String[] args) {
		//Creates a file
				try(FileOutputStream fos = new FileOutputStream("MyFile.txt", true);
					BufferedOutputStream bos = new BufferedOutputStream(fos);
						){
					//write a file
					String message = "\nThis is the text I am updating in the file.";
					byte dataInbyte[] = message.getBytes();
					bos.write(dataInbyte);
					bos.flush();
					System.out.println("I have successfully updated the file");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
