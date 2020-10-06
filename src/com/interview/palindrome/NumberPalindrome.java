package com.interview.palindrome;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userNum = Integer.parseInt(sc.nextLine());
		
		System.out.println(isPalindrome(userNum));
		
		
	}
	
	public static boolean isPalindrome(int number) {
		
		boolean isPalindrome = false;
		
		if(number == reverseNumber(number)) {
			isPalindrome = true;
		}
		
		return isPalindrome;
	}
	
	public static int reverseNumber(int originalNumber) {
		int reverse = 0;
        while(originalNumber != 0){
          reverse = reverse*10 + originalNumber%10;
          originalNumber = originalNumber/10;
        }
             
        return reverse;
		
	}

}
