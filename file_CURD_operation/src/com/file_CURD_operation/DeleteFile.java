package com.file_CURD_operation;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		try{
			File file = new File("MyFile.txt");
			if(file.exists()) {
				file.delete();
				System.out.println("I have successfully deleted the file");
			}else {
				System.out.println("No such file exists");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
