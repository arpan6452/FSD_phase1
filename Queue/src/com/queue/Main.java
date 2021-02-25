package com.queue;

public class Main {
	public static void main(String[] args) {		
		
		Queue stack = new Queue(5);
		stack.add(2);
		stack.add(5);
		stack.add(20);
		stack.add(42);
		stack.add(29);
		
		stack.display();
		
		System.out.println("Peek" + stack.peek());
		System.out.println("Remove"+ stack.remove());
		
		stack.display();
	}
}
