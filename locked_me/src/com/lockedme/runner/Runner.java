package com.lockedme.runner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.lockedme.fileManager.FileManagerImpl;
import com.lockedme.fileManager.FileProperties;

public class Runner {

	/*
	 * Main class where the mechanism of user based console resides
	 * 
	 */

	public static void main(String[] args) {

		// updating all the details
		System.out.println("Welcome to : Company Lockers Pvt. Ltd.");
		System.out.println("Developer Details:");
		System.out.println("Name: Arpan Ghosh");
		System.out.println("Title: Senior Quality Engineer \n");
		
		// initially assigning the userInput as 1 so that while condition executes
		String userInput = "1";
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		// Scanner sc = new Scanner(System.in);
		try {
			
			//printing the message and showing them the options to display
			FileManagerImpl fileManagerImpl = new FileManagerImpl();
			while (!userInput.equalsIgnoreCase("6")) {
				System.out.println("Please enter 1: if you want to add a file to the existing directory list");
				System.out.println("Please enter 2: if you want to read a file from the existing directory list");
				System.out.println("Please enter 3: if you want to delete a file from the existing directory list");
				System.out.println("Please enter 4: if you want to search a file from the existing directory list");
				System.out.println("Please enter 5: if you want to display all files from the existing directory list");
				System.out.println("Please enter 6: if you want to close the application");
				userInput = sc.readLine();
				switch (userInput) {
				case "1":
					System.out.println("Please enter the fileName you want to add: ");
					String fileName = sc.readLine();
					System.out.println("Please enter author's firstName:");
					String authorName = sc.readLine();
					System.out.println("Please enter public content:");
					String publicContent = sc.readLine();
					FileProperties fileProperties = new FileProperties(authorName, publicContent);
					// any of the field should not be blank
					if(fileName.equals("") || authorName.equals("") || publicContent.equals(""))
						System.out.println("FileName or any file property can not be blank can not be blank");
					else
						fileManagerImpl.createFile(fileName, fileProperties);
					break;
				case "2":
					System.out.println("Please enter the fileName for which you want to view the content: ");
					fileName = sc.readLine();
					if (fileName.equals(null) || fileName.equals(""))
						System.out.println("FileName can not be blank");
					else
						fileManagerImpl.readFile(fileName);
					break;
				case "3":
					System.out.println("Please enter the fileName you want to delete: ");
					fileName = sc.readLine();
					if (fileName.equals(null) || fileName.equals(""))
						System.out.println("FileName can not be blank");
					else
						fileManagerImpl.deleteFile(fileName);
					break;
				case "4":
					System.out.println("Please enter the fileName you want to search: ");
					fileName = sc.readLine();
					if (fileName.equals(null) || fileName.equals(""))
						System.out.println("FileName can not be blank");
					else
						fileManagerImpl.serachFile(fileName);
					break;
				case "5":
					fileManagerImpl.printAllFiles();
					break;
				case "6":
					System.out.println("Are you sure you want to quit? yes/no");
					userInput = sc.readLine();
					if (userInput.equalsIgnoreCase("no")) {
					} else {
						userInput = "6";
						System.out.println("Bye! Hope you had a great exprience.");
					}
					break;
				default:
					System.out.println("Please select any of the correct option from the above list");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Application is down.Please connect after sometime");
		} finally {
			try {
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
