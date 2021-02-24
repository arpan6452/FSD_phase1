package com.thread_sync;

public class ThreadClass2 extends Thread {
	PrintNumberClass printNum;
	
	public ThreadClass2(PrintNumberClass printNum) {
		this.printNum = printNum;
	}
	
	@Override
	public void run() {
		printNum.printThreadDetails();
	}
}
