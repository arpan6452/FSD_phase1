package com.thread_nonsync;

public class ThreadClass1 extends Thread {
	PrintNumberClass printNum;
	
	public ThreadClass1(PrintNumberClass printNum) {
		this.printNum = printNum;
	}
	
	@Override
	public void run() {
		printNum.printThreadDetails();
	}
}
