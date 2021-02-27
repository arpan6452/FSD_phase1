package com.lockedme.fileManager;

import java.io.File;

public interface FileManager {
	
	String folderPath = new File("").getAbsolutePath() + "\\files";
	void createFile(String fileName);
	void createFile(String fileName, FileProperties content);
	void readFile(String fileName);	
	void deleteFile(String fileName);
	void printAllFiles();
	void serachFile(String fileName);		
}
