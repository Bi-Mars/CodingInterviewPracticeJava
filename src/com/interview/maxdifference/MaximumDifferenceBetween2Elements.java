package com.interview.maxdifference;

public class MaximumDifferenceBetween2Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 90, 10, 110};
		System.out.println(maximumDifference(arr));
	}
	
	public static int maximumDifference(int[] arr) {
		int maxDifference = 0;
		int min = arr[0];
		int currDifference = 0;
		
		for(int i = 1; i < arr.length; i++) {
			
			// if minimum number found, then update the minimum
			if(arr[i] < min) {
				min = arr[i];
			}
			else {
				currDifference = arr[i] - min;
				
				// update the maximum difference between 2 numbers
				if(currDifference > maxDifference) {
					maxDifference = currDifference;
				}
			}
		}
		
		return maxDifference;
	}

}
