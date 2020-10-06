package com.interview.longestcommonsubsequence;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";
		
		char[] s1Char = s1.toCharArray();
		char[] s2Char = s2.toCharArray();
		
		System.out.println("Length of Longest Common Subsequence is: " + longestCommonSubsequence(s1Char, s2Char, s1Char.length, s2Char.length));

	}
	  /* Returns length of LCS for sequence1[0..lengthOfSequence1-1], sequence2[0..lengthOfSequence2-1] */
	 private static int longestCommonSubsequence( char[] sequence1, char[] sequence2, int lengthOfSequence1, int lengthOfSequence2 ) 
	  { 
	    int dp[][] = new int[lengthOfSequence1+1][lengthOfSequence2+1]; 
	  
	    /* Following steps build dp[lengthOfSequence1+1][lengthOfSequence2+1] in bottom up fashion. Note 
	         that dp[i][j] contains length of LCS of sequence1[0..i-1] and sequence2[0..j-1] */
	   // fill the array
	    for (int i=0; i<=lengthOfSequence1; i++) 
	    { 
	      for (int j=0; j<=lengthOfSequence2; j++) 
	      { 
	        if (i == 0 || j == 0) 
	            dp[i][j] = 0; 
	        else if (sequence1[i-1] == sequence2[j-1]) 
	            dp[i][j] = dp[i-1][j-1] + 1; 
	        else
	            dp[i][j] = max(dp[i-1][j], dp[i][j-1]); 
	      } 
	    } 
	  return dp[lengthOfSequence1][lengthOfSequence2]; 
	  } 
	  
	  /* Utility function to get max of 2 integers */
	private static  int max(int a, int b) 
	  { 
	    return (a > b)? a : b; 
	  } 
}
