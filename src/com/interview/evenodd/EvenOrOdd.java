package com.interview.evenodd;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println(isEven(19));

	}

//	public static boolean isEven(int num) {
//		boolean isEven = false;
//		int quotient = num/2;
//		
//		if(quotient*2 == num) {
//			isEven = true;
//		}
//		return isEven;
//	}
//	
	public static boolean isEven(int num) {
		boolean isEven = false;
		if((num&1) == 0) {
			isEven = true;
		}
		return isEven;
	}
	
}
