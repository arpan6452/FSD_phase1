package com.producer_consumer_multithreading;

public class Consumer extends Thread {
	private Resource resource;	

	public Consumer(Resource resource) {
		this.resource = resource;		
	}

	@Override
	public void run() {
		int value = 0;
		for (int i = 0; i < 10; i++) {
			value = resource.get();
			System.out.println("Consumer got: " + value);
		}
	}
}
