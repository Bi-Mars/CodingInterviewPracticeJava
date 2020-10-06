package com.interview.twosumIndices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TargetSumIndices {

	public static void main(String[] args) {
		int[] nums = {1,2,2,4, 9};
		int[] indices = twoSum(nums, 10);
		System.out.println(indices[0]);
		System.out.println(indices[1]);

	}

	 public static int[] twoSum(int[] nums, int target) {
	        int[] indices = new int[2]; 
	        List<Integer> listNums= Arrays.stream(nums).boxed().collect(Collectors.toList());
	        
	        int firstIndex = 0;
	        int lastIndex = 0 ;
	 
	        for(int i = 0; i < listNums.size(); i++){
	          int  firstNum = listNums.get(i);
	          int  secondNum = target - firstNum;
	            
	            if(listNums.contains(secondNum)){
	                lastIndex = listNums.indexOf(secondNum);
	                firstIndex = i;
	                break;
	            }
	        }
	        
	        indices[0] = firstIndex;
	        indices[1] =  lastIndex;
	        
	        return indices;
	    
	    }
}
