package com.mylinklist;

public class RunnerClass {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(4);
		list.insert(18);
		list.insert(26);
		list.insertAtStart(11);
		list.insertAt(2, 42);
		list.delete(3);
		
		list.display();
	}
}
