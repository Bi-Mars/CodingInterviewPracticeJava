package com.interview.fibonacci;

import java.util.Scanner;

public class FiboRecursion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		
		
	}
	
	public static int fiboNum( int count) {
		if(count == 1 || count == 2) {
			return 1;
		}
		
		return fiboNum (count -1) + fiboNum(count - 2);
		
	}

}
