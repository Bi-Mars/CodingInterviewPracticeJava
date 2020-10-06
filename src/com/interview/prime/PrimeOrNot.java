package com.interview.prime;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		System.out.println("Enter a number to check if it is prime or not");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			int number = Integer.parseInt(sc.nextLine());
			
			if(number < 2) {
				throw new Exception("Number should be greater than or equals to 2");
			}
			
			if(primeornot(number)) {
				System.out.println(number + " is prime");
			}
			else {
				System.out.println(number + " is not prime");

			}
		}catch(Exception e) {
			System.out.println("Error Occurred " + e.getMessage());
		}
		
		
	}
	
	public static boolean primeornot(int number) {
		boolean isPrime = true;
		
		if(number > 2) {
			for(int i = 2; i < number/2; i++) {
				
				if(number % i == 0) {
					isPrime = false;
					break;
				}
				
			}
		}
		
		return isPrime;
	}

}
