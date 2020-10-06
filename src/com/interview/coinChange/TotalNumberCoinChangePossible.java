package com.interview.coinChange;

public class TotalNumberCoinChangePossible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coinChange[] = {1, 2, 3};
		int sum = 4;
		System.out.println(count(coinChange, coinChange.length, sum));

	}
	
	public static int count( int coins[], int coinChangeLength, int totalSum ) 
	{ 
	    // table[i] will be storing the number of solutions for 
	    // value i. We need totalSum+1 rows as the table is constructed 
	    // in bottom up manner using the base case (totalSum = 0) 
	    int table[]=new int[totalSum+1]; 
	  
	    // Base case (If given value is 0) 
	    table[0] = 1; 
	  
	    // Pick all coins one by one and update the table[] values 
	    // after the index greater than or equal to the value of the 
	    // picked coin 
	    for(int i=0; i<coinChangeLength; i++) 
	    {
	    	for(int j=coins[i]; j<=totalSum; j++) {
		        table[j] += table[j-coins[i]]; 
	    	}
	    }
	       
	    return table[totalSum]; 
	} 

}
