package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {
	public static void main(String[] args) 
    { 
	List<String> names = Arrays.asList("Alex", "Charles", "Brian", "David");
	//Natural order
	Collections.sort(names);    //[Alex, Brian, Charles, David]
	System.out.println("Sorting in Natural order: "+names);
	//Reverse order
	Collections.sort(names, Collections.reverseOrder());
	System.out.println("Sorting in reverse order: "+names);
    }
}
