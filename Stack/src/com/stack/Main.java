package com.stack;

public class Main {
	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push(2);
		stack.push(5);
		stack.push(20);
		stack.push(42);
		stack.push(29);
		
		stack.display();
		
		System.out.println("Peek" + stack.peek());
		System.out.println("Pop"+ stack.pop());
		
		stack.display();
	}
}
