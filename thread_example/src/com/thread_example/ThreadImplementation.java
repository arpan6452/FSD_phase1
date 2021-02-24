package com.thread_example;

public class ThreadImplementation {
	public static void main(String[] args) {
		ThreadClassImpl thread1 = new ThreadClassImpl();
		thread1.setName("Thread1");		
		ThreadClassImpl thread2 = new ThreadClassImpl();
		thread2.setName("Thread2");
		ThreadClassImpl thread3 = new ThreadClassImpl();
		thread3.setName("Thread3");
		ThreadClassImpl thread4 = new ThreadClassImpl();
		thread4.setName("Thread4");
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}
