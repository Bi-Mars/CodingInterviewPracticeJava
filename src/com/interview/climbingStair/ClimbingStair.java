package com.interview.climbingStair;


// You are climbing a stair case. It takes n steps to reach to the top.
//
//	Each time you can either climb 1 or 2 steps. 
//	In how many distinct ways can you climb to the top?
//
//Note: Given n will be a positive integer.


 
public class ClimbingStair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(7));

	}
	
	 private static int climbStairs(int n) {
	        if (n <= 1) {
	            return 1;
	        }
	        
	        int[] ways = new int[n + 1];
	        ways[0] = 1;
	        ways[1] = 1;
	        
	        for (int i = 2; i <= n; i++) {
	            ways[i] = ways[i - 2] + ways[i - 1];
	        }
	        
	        return ways[n];
	    }

}
