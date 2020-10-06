package com.interview.gcd;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int firstNum = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter 2nd number: ");
		int secondNum = Integer.parseInt(sc.nextLine());
		
		System.out.println("GCD is " + gcd(firstNum, secondNum));
		
	}
	
	public static int gcd(int firstNum, int secondNum) {
		if(secondNum == 0) {
			return firstNum;
		}
		
		return gcd(secondNum, firstNum%secondNum);
	}

}
