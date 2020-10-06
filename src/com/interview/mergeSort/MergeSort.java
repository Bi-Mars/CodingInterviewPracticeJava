package com.interview.mergeSort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[]{5, 6, 7, 2, 4, 1, 7};
		mergeSortDivide(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));

	}
	
	 static public void mergeSortDivide(int[] unsortedList, int lowIndex, int highIndex) {
		// if unsortedList has only 1 item in the list --> Base Case
		if(highIndex == lowIndex) {
			return;
		}
		
		//mid-point
		int midIndex = (lowIndex + highIndex)/2;
		
		//Call this function again, by sending same unsortedList but different lowIndex and highIndex
		
		//1st half of the array
		mergeSortDivide(unsortedList, lowIndex, midIndex);
		//2nd half of the array
		mergeSortDivide(unsortedList, midIndex+1, highIndex);
		//Let's merge the UnsortedList
		mergeSortConquer(unsortedList, lowIndex, midIndex, highIndex);
	}
	
	//Conquer the unsorted list
	static public void mergeSortConquer(int[] unsortedList, int lowIndex, int midIndex, int highIndex) {
		//create Temporary SubArrays
		int leftArray[] = new int[midIndex-lowIndex+1]; // length of this subarray
		int rightArray[] = new int[highIndex - midIndex];
		
		//Now copy all the elements from unsorted array into subarray
		for(int i = 0; i < leftArray.length; i++) {
			leftArray[i] = unsortedList[lowIndex + i];
		}
		
		for(int i = 0; i <rightArray.length; i++) {
			rightArray[i] = unsortedList[midIndex + 1 + i];
		}
		
		//Once we have filled the array, Iterate through the subArrays
		int leftPointer = 0;
		int rightPointer= 0;
		
		//Copy elements from leftArray and rightArray back into unsortedList
		for(int i = lowIndex; i <highIndex + 1; i++) {
			
			//We have leftPointer pointing from beginning of leftArray
			// we Have rightPointer pointing from beginning of RightArray
			if(leftPointer < leftArray.length && rightPointer < rightArray.length) {
				//if element/item in leftArray that is pointed by leftPointer is LESS in value...
				// ... than element/item in rightArray that is pointed by rightPointer
				if(leftArray[leftPointer] < rightArray[rightPointer]) {
					//At the very first index, we will put that value (lowest at the beginning of the List)
					unsortedList[i] = leftArray[leftPointer];
					leftPointer++; // increase the leftPointer --> move leftPointer to the right
				}
				else {
					unsortedList[i] = rightArray[rightPointer];
					rightPointer++;
				}
			}
			
			// all elements have been copied from rightArray, then copy rest of leftArray as it is
			else if(leftPointer < leftArray.length) {
				unsortedList[i] = leftArray[leftPointer];
				leftPointer++;
			}
			
			//if all elements have been copied from leftArray, copy rest of rightArray 
			else if(rightPointer < rightArray.length) {
				unsortedList[i] = rightArray[rightPointer];
				rightPointer++;
			}
		}
	}

}
