package com.thread_sync;

public class ThreadImplementationSync {
	public static void main(String[] args) {
		PrintNumberClass printNumberClass = new PrintNumberClass();
		ThreadClass1 thread1 = new ThreadClass1(printNumberClass);
		thread1.setName("ThreadSync1");
		ThreadClass1 thread2 = new ThreadClass1(printNumberClass);
		thread2.setName("ThreadSync2");		

		System.out.println(
				"Synchronized threads run in sequence");
		thread1.start();
		thread2.start();
		
	}
}
