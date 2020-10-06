package com.interview.fibonacci;

import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int fiboNum = Integer.parseInt(sc.nextLine());
		
		int current = 1;
		int previous = 1;
		int next = 0;
		if (fiboNum > 0) {
			System.out.println(current);
			System.out.println(previous);
			
			while(next < fiboNum) {
				next = current + previous;
				previous = current;
				current = next;
				
				if(current < fiboNum) {
					System.out.println(current);
				}
			}
		}
		
	}

}
