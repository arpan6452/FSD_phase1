package com.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Collections {
	public static void main(String[] args) {
		CollectionUtils collectionUtils = new CollectionUtils();
		// list implementation
		// arrylist(contiguous memory location )
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Sachin");
		arrayList.add("Virat");
		arrayList.add("Dhoni");
		arrayList.add("Raina");
		arrayList.add("Yuvraj");
		System.out.println("This is an arraylist: ");
		collectionUtils.printDetails(arrayList);
		System.out.println("This is an arraylist after adding a new element: ");
		arrayList.add(3, "Jadeja");
		collectionUtils.printDetails(arrayList);
		System.out.println("This is an linkedlist after deleting an element: ");
		arrayList.remove(2);
		collectionUtils.printDetails(arrayList);

		// linkedlist(non contiguous memory location )
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Sachin");
		linkedList.add("Virat");
		linkedList.add("Dhoni");
		linkedList.add("Raina");
		linkedList.add("Yuvraj");
		System.out.println("This is an linkedlist");
		collectionUtils.printDetails(linkedList);
		System.out.println("This is an linkedlist after adding a new element: ");
		linkedList.add(3, "Jadeja");
		collectionUtils.printDetails(linkedList);
		System.out.println("This is an linkedlist after deleting an element: ");
		linkedList.remove(4);
		collectionUtils.printDetails(linkedList);

		// vector(synchronized)
		List<String> vector = new Vector<>();
		vector.add("Sachin");
		vector.add("Virat");
		vector.add("Dhoni");
		vector.add("Raina");
		vector.add("Yuvraj");
		System.out.println("This is an vector");
		collectionUtils.printDetails(vector);
		System.out.println("This is an vector after adding a new element: ");
		vector.add(3, "Jadeja");
		collectionUtils.printDetails(vector);
		System.out.println("This is an vector after deleting an element: ");
		vector.remove(4);
		collectionUtils.printDetails(vector);

		// queue
		Queue<String> queue = new LinkedList<String>();
		queue.add("Sachin");
		queue.add("Virat");
		queue.add("Dhoni");
		queue.add("Raina");
		queue.add("Yuvraj");
		System.out.println("This is an queue");
		collectionUtils.printDetails(queue);
		System.out.println("This is an queue after adding a new element: ");
		queue.add("Jadeja");
		collectionUtils.printDetails(queue);
		System.out.println("This is an queue after deleting an element: ");
		queue.poll();
		collectionUtils.printDetails(queue);

		Queue<String> priorityQueue = new PriorityQueue<String>();
		priorityQueue.add("Sachin");
		priorityQueue.add("Sachin");
		priorityQueue.add("Virat");
		priorityQueue.add("Dhoni");
		priorityQueue.add("Raina");
		priorityQueue.add("Yuvraj");		
		
		System.out.println("This is an priorityQueue sorted by default:");
		collectionUtils.printDetails(priorityQueue);
		System.out.println("Display the last element: " + priorityQueue.peek());
		System.out.println("This is an priorityQueue after adding a new element: ");
		priorityQueue.add("Jadeja");
		collectionUtils.printDetails(priorityQueue);
		System.out.println("This is an priorityQueue after deleting an element: ");
		priorityQueue.poll();
		collectionUtils.printDetails(priorityQueue);
		
		//Set
		Set<String> linkedhashSet = new LinkedHashSet<String>();
		linkedhashSet.add("Sachin");
		linkedhashSet.add("Sachin");
		linkedhashSet.add("Virat");
		linkedhashSet.add("Dhoni");
		linkedhashSet.add("Raina");
		linkedhashSet.add("Yuvraj");		
		
		System.out.println("This is an linkedhashSet doesn't support duplicate:");
		collectionUtils.printDetails(linkedhashSet);		
		System.out.println("This is an linkedhashSet after adding a new element: ");
		linkedhashSet.add("Jadeja");
		collectionUtils.printDetails(linkedhashSet);
		System.out.println("This is an linkedhashSet after deleting an element: ");
		linkedhashSet.remove("Yuvraj");
		collectionUtils.printDetails(linkedhashSet);
		
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("Sachin");
		treeSet.add("Sachin");
		treeSet.add("Virat");
		treeSet.add("Dhoni");
		treeSet.add("Raina");
		treeSet.add("Yuvraj");		
		
		System.out.println("This is an treeSet doesn't support duplicate and is sorted:");
		collectionUtils.printDetails(treeSet);		
		System.out.println("This is an treeSet after adding a new element: ");
		treeSet.add("Jadeja");
		collectionUtils.printDetails(treeSet);
		System.out.println("This is an treeSet after deleting an element: ");
		treeSet.remove("Yuvraj");
		collectionUtils.printDetails(treeSet);
		
	}
}
