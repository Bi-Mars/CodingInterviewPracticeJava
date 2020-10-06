package com.interview.palindrome;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a sring to check if it is palindrome");
		
		String userInput = sc.nextLine().toUpperCase();
		
		StringBuilder original = new StringBuilder(userInput);
		//userInput.reverse();
		
		if(userInput.toString().equals(original.toString())) {
			System.out.println(userInput + " is a Palindrome");
		}
		else {
			System.out.println(userInput + " is not a Palindrome");
		}	
		
		if(isPalindrome(userInput)) {
			System.out.println("Palindrome without API " + true);
		}
		else {
			System.out.println("Palindrome without API " + false);

		}
		

	}
	
	// without using API
	public static boolean isPalindrome(String userInput) {
		boolean isPalindrome = false;
		int length = userInput.length();
		
		for(int i = 0; i < length/2; i++) {
			
			if(userInput.charAt(i) == userInput.charAt(length - i-1)) {
				isPalindrome = true;
				
			}else {
				isPalindrome = false;
				return isPalindrome;
			}
				
		}
		
		return isPalindrome;
	}

}
