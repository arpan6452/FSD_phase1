package com.producer_consumer_multithreading;

public class MainClass {
	public static void main(String[] args) {
		Resource resource = new Resource();
	    Producer p1 = new Producer(resource);
	    Consumer c1 = new Consumer(resource);
	    p1.start(); 
	    c1.start();
	}
}
