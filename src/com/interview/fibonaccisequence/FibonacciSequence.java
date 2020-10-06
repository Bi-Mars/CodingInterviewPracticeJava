package com.interview.fibonaccisequence;

import java.util.HashMap;

public class FibonacciSequence {

		private static HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacciSequenceWithDP(7));
		System.out.println("*****************************");
		System.out.println(fibonacciSequenceWithoutDP(7));


	}

	public static int fibonacciSequenceWithoutDP(int number) {
		
		//Base Case
		if(number== 0) {
			return 0;
		}
		else if(number == 1) {
			return 1;
		}
		
		return fibonacciSequenceWithoutDP(number-1) + fibonacciSequenceWithoutDP(number - 2);
	}
	
	public static int fibonacciSequenceWithDP(int number) {
		
		//check if the number if already in the HashMap/Table
		if(hMap.containsKey(number)) {
			return hMap.get(number);
		}
		
		// then check base condition
		if(number== 0) {
			return 0;
		}
		else if(number == 1) {
			return 1;
		}
		
		int nthValue = fibonacciSequenceWithDP(number - 1) + fibonacciSequenceWithDP(number -2);
		System.out.println("Fibonacci sequence for --> " +  number + " - 1 + "  + number + " - 2 is = " + nthValue);
		hMap.put(number, nthValue);
		return nthValue;
	}
}
