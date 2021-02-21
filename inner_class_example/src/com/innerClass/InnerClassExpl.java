package com.innerClass;

import java.util.Arrays;

public class InnerClassExpl {
	private int privateMember = 6;
	String defaultMember = "Arpan";
	public boolean publicMember = true;
	protected int protectedMember[] = {2,3,4};
	InnerClass innerClass = new InnerClass();
	void printDetails() {
		System.out.println("Outer Class access inner Class private data : " + innerClass.innerPrivateData
				+ ", Protected Data: " + innerClass.innerProtectedData
				+ ", Public Data: " + innerClass.innerPublicMember
				);
	}
	
	protected class InnerClass{
		private int innerPrivateData = 4;
		protected String innerProtectedData = "Inner Data";
		public boolean innerPublicMember = false;
		void printMsg() {
			System.out.println("Access outerClass private: "+ privateMember);
			System.out.println("Access outerClass default: "+ defaultMember);
			System.out.println("Access outerClass public: "+ publicMember);
			System.out.println("Access outerClass protected: "+ Arrays.toString(protectedMember));
		}
	}
}
