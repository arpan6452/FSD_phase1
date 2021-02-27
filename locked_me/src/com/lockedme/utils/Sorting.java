package com.lockedme.utils;


//using quicksort for sorting the elements in ascending order
public class Sorting {

	//sub dividing the array 
	private int partition(String[] fileNames, int first, int last) {
        String pivotValue = fileNames[first];
        while (first < last) {
           String value1;
           String value2;
           while ((value1 = fileNames[first]).compareTo( pivotValue ) < 0) {
               first = first + 1;
           }
           while ((value2 = fileNames[last]).compareTo( pivotValue ) > 0) {
               last = last - 1;
           }
           fileNames[first] = value2;
           fileNames[last] = value1;
        }
        return first;
    }
	
	//Recursively calling the array for sorting till it reaches the end 
    private void QuicksortString(String[] fileNames, int first, int last) {
        if (first >= last) {            
            return;
        }
        int pivotIndex = partition(fileNames, first, last);
        QuicksortString(fileNames, first, pivotIndex);
        QuicksortString(fileNames, pivotIndex+1, last);
     }
    
    //calling the QuicksortString Method by taking the start point of sorting as 0 and end is till the end of the array
    public void QuicksortString(String[] fileNames) {
        QuicksortString(fileNames, 0, fileNames.length - 1);
    }
    
}
