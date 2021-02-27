package com.lockedme.utils;

public class Searching {

	/*
	 * returning the position of the element if found else return -1
	 * */ 
	private int binarySearch(String[] fileNames, String fileName) {
		int first = 0;
		int last = fileNames.length - 1;

		while (first <= last) {
			int mid = first + (last - first);

			int res = fileName.compareTo(fileNames[mid]);
			if (res == 0)
				return mid;
			if (res > 0)
				first = mid + 1;
			else
				last = mid - 1;
		}
		return -1;
	}

	/*
	 * if returned value is -1 then file not present else returning the filename
	 * with the status
	 */
	public String searchFile(String fileNames[], String fileName)
			throws NullPointerException, ArrayIndexOutOfBoundsException {
		int position = binarySearch(fileNames, fileName);
		if (position != -1)

			return fileName + " is present in our repository at " + (position+1) + " position in the repository";
		else
			return fileName + " is not present in our repository";

	}

}
