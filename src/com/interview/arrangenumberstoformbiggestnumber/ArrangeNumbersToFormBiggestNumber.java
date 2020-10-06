package com.interview.arrangenumberstoformbiggestnumber;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class ArrangeNumbersToFormBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Vector<String> arr; 
	        arr = new Vector<>(); 
	          
	        //output should be 6054854654 
	        arr.add("54"); 
	        arr.add("546"); 
	        arr.add("548"); 
	        arr.add("60");
	        arr.add("9");
	        System.out.println(arrangeBiggestNumber(arr));

	}
		  
	    // The main function that prints the  
	    // arrangement with the largest value. 
	    // The function accepts a vector of strings     
	  private static String arrangeBiggestNumber(Vector<String> arr){ 
	      
	        Collections.sort(arr, new Comparator<String>(){ 
	  
	        // A comparison function which is used by  
	        // sort() in printLargest() 
	        @Override
	        public int compare(String X, String Y) { 
	          
	        // first append Y at the end of X 
	        String XY=X + Y; 
	          
	        // then append X at the end of Y 
	        String YX=Y + X; 
	          
	        // Now see which of the two formed numbers  
	        // is greater 
	        return XY.compareTo(YX) > 0 ? -1:1; 
	    } 
	    }); 
	          
	    Iterator iterate = arr.iterator(); 
	    StringBuilder sb = new StringBuilder("");
	   while (iterate.hasNext()){
	    	sb.append(iterate.next());
	    }
	  return sb.toString();
	}
}

