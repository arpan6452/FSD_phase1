package com.collections;

import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class CollectionUtils {
	public void printDetails(List<String> list) {
		Iterator<String> iterator = list.iterator(); 
		while (iterator.hasNext()) 
            System.out.print(iterator.next() + " "); 
		System.out.println("\n");
	}
	
	public void printDetails(Queue<String> queue) {		
		Iterator<String> iterator = queue.iterator(); 
		while (iterator.hasNext()) 
            System.out.print(iterator.next() + " "); 
		System.out.println("\n");
	}
	
	public void printDetails(Set<String> list) {
		Iterator<String> iterator = list.iterator(); 
		while (iterator.hasNext()) 
            System.out.print(iterator.next() + " "); 
		System.out.println("\n");
	}
	
	
	
	
}
