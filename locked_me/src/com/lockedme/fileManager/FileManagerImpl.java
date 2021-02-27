package com.lockedme.fileManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import com.lockedme.utils.Searching;
import com.lockedme.utils.Sorting;

public class FileManagerImpl implements FileManager {

	public String[] getAllFileNames() {
		try {
			String folderPath = FileManager.folderPath;
			File folder = new File(folderPath);
			File[] listOfFiles = folder.listFiles();
			String fileNames[] = new String[listOfFiles.length];
			for (int i = 0; i < listOfFiles.length; i++) {
				fileNames[i] = listOfFiles[i].getName();
			}

			return fileNames;
		} catch (NullPointerException npe) {
			return null;
		}

	}

	@Override
	public void createFile(String fileName) {
		File file = new File(FileManager.folderPath + "\\" + fileName);
		if (file.exists()) {
			System.out.println(fileName + " file already exits.");
		} else {
			try (FileOutputStream fos = new FileOutputStream(file);) {
				System.out.println(fileName + " only file is created successfully");
			} catch (FileNotFoundException e) {
				System.out.println(fileName + " file not found");
			} catch (IOException e) {
				System.out.println("Some Problem occured or Incorrect file details");
			}
		}
	}

	@Override
	public void createFile(String fileName, FileProperties content) {
		File file = new File(FileManager.folderPath + "\\" + fileName);
		if (file.exists()) {
			System.out.println(fileName + " file already exits.");
		} else {
			try (FileOutputStream fos = new FileOutputStream(file);
					ObjectOutputStream oos = new ObjectOutputStream(fos);) {
				oos.writeObject(content);
				System.out.println(fileName + " file created and updated with content successfully");
			} catch (FileNotFoundException e) {
				System.out.println(fileName + " file not found");
			} catch (IOException e) {
				System.out.println("Some problem occured or Incorrect file details");
			}
		}

	}

	@Override
	public void readFile(String fileName) {
		File file = new File(FileManager.folderPath + "\\" + fileName);
		FileProperties fileProperties;
		if (!file.exists())
			System.out.println(fileName + " file does not exits.");
		else {
			try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis);) {
				System.out.println(fileName + " content is : ");
				fileProperties = (FileProperties) ois.readObject();
				System.out.println("Author of the file is : " + fileProperties.getFileAuthor());
				System.out.println("Author's public content is : " + fileProperties.getFileContent());				

			} catch (FileNotFoundException e) {
				System.out.println(fileName + " file not found");
			} catch (IOException e) {
				System.out.println("Some problem occured or Incorrect file details");
			} catch (ClassNotFoundException e) {
				System.out.println("Some problem occured as the file properties doesn't match");
			}
		}

	}

	@Override
	public void deleteFile(String fileName) {
		File file = new File(FileManager.folderPath + "\\" + fileName);
		if (file.exists()) {
			file.delete();
			System.out.println(fileName + " File is deleted successfully");
		} else {
			System.out.println(fileName + " does not exist");
		}

	}

	@Override
	public void printAllFiles() {
		try {
			Sorting sorting = new Sorting();
			String fileNames[] = getAllFileNames();
			sorting.QuicksortString(fileNames);
			if (fileNames.length == 0)
				System.out.println("No files are present in the repository");
			else
				System.out.println("All the files are : \n" + Arrays.toString(fileNames));
		} catch (NullPointerException npe) {
			System.out.println("Some problem occured while searching the file details, there in no drectory anymore");
		}
	}

	@Override
	public void serachFile(String fileName) {
		Searching searching = new Searching();
		try {
			String fileNames[] = getAllFileNames();
			System.out.println(searching.searchFile(fileNames, fileName));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Problem occured retriving this file");
		} catch (NullPointerException e) {
			System.out.println("Problem occured retriving this file, as the directory has been removed.");
		}

	}

}
