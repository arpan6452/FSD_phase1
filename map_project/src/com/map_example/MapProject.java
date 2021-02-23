package com.map_example;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapProject {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(0, "Stanley");
		hashMap.put(1, "Tony Start");
		hashMap.put(2, "Hulk");
		hashMap.put(3, "Captain America");
		hashMap.put(4, "Dr Strange 1");
		hashMap.put(4, "Dr Strange");
		hashMap.put(null, "Black Panther");
		hashMap.put(5, "Black Widow");
		hashMap.put(6, "Ant Man");
		System.out.println("Best Marvel charecters: ");
		for (Map.Entry<Integer,String> entry : hashMap.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue());
		System.out.println("Removing the marvel charector who left us in real: "+ hashMap.remove(null));
		System.out.println("Overwridding key value in position 6: " + hashMap.put(6, "Spider Man"));
		for (Map.Entry<Integer,String> entry : hashMap.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue());
		System.out.println("Best marvel leader: "+ hashMap.get(3));
		
		Map<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(3, "Captain America");
		treeMap.put(2, "Hulk");
		treeMap.put(0, "Stanley");
		treeMap.put(1, "Tony Start");		
		treeMap.put(4, "Dr Strange");	
		treeMap.put(6, "Ant Man");
		treeMap.put(5, "Black Widow");
		
		System.out.println("Best Marvel charecters in sorted order: ");
		for (Map.Entry<Integer,String> entry : treeMap.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue());
		
	}
}
