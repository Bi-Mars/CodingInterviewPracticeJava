package com.interview.swap2varibles;

public class Swap2VariablesWithoutUsingThird {

	public static void main(String[] args) {
		
		int var1 = 3;
		int var2 = 7;
		
		var2 = var1 + var2;
		var1 = var2 - var1;
		var2 = var2 - var1;
		
		System.out.println("Var1: " + var1);
		System.out.println("Var2: " + var2);


	}

}
