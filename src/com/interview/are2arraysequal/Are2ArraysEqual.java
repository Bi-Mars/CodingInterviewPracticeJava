package com.interview.are2arraysequal;

import java.util.HashMap;

public class Are2ArraysEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] first = {1,2,4,2,3,1,3,1};
		int[] second = {4,2,5,1,3,2,1,3};
		System.out.println(isArrayEqual(first, second));

	}
	
	public static boolean isArrayEqual(int[] firstArray, int[] secondArray) {
		
		if(firstArray.length != secondArray.length) {
			return false;
		}
		HashMap<Integer, Integer> elementCounter = new HashMap<Integer, Integer>();
		//put All the elements of first array into hashmap including the counter
		for(int i = 0; i < firstArray.length; i++) {
			Integer key = firstArray[i];
			Integer frequency = elementCounter.get(key);
			if( frequency != null) {
				elementCounter.put(key, frequency+1);
			}else {
				elementCounter.put(key, 1);
			}
		}
		
		//check if element exist in 2nd array and decrease the counter
		for(int i = 0; i < secondArray.length; i++) {
			Integer key = secondArray[i];
			Integer value = elementCounter.get(key);
			if(!elementCounter.containsKey(secondArray[i])) {
				return false;
			}
			
			if ( value == 0) {
                return false; 
			}
			
			elementCounter.put(key,  value-1);
		}
		
		
		return true;
	}

}
