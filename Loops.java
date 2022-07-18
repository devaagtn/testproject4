package com.test.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Loops {


	 public static void main(String args[]){
		
		    List<String> names = new ArrayList<String>();
		    names.add("Chaitanya");
		    names.add("Steve");
		    names.add("Jack");
		     
		    //enhanced for loop
		    for(String s: names){
		    	if(s.startsWith("St"))
		    	System.out.println(s);
		    }
		    //Adding Integer value to String ArrayList
		 
		    Iterator it =  names.iterator();
		System.out.println("Size before delete "+names.size());
		    while(it.hasNext()) {
		      String obj = (String)it.next();
		      if(obj.equalsIgnoreCase("steve")) {
		    	  it.remove();
		      }
		      System.out.println(obj);
		    }
			System.out.println("Size after delete "+names);
		  
	 for(int i=0;i<names.size();i++) {
	    	//
	    	if(i==1) {
	    		System.out.println(names.get(i));
	    	}
	    }
	 int x = 10;
	 do {
	   System.out.print("value of x : " + x + "\n");
	   x++;
	 }while( x < 20 ); // print numbers from 10 to 19
}
}
