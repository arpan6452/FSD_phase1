package com.lockedme.fileManager;

import java.io.Serializable;

public class FileProperties implements Serializable{
	/**
	 * This the file Class with fileAthur
	 * file public Content and file private notes are saved
	 */
	private static final long serialVersionUID = 1L;
	private String fileAuthor;
	private String fileContent;
	

	public FileProperties(String fileAuthor, String fileContent) {
		this.fileAuthor = fileAuthor;
		this.fileContent = fileContent;
	}

	public String getFileAuthor() {
		return fileAuthor;
	}

	public void setFileAuthor(String fileAuthor) {
		this.fileAuthor = fileAuthor;
	}

	public String getFileContent() {
		return fileContent;
	}

	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}

	@Override
	public String toString() {
		return "FileClass [fileAuthor=" + fileAuthor + ", fileContent=" + fileContent + " ]";
	}

}
