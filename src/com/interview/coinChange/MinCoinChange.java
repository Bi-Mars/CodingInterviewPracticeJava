package com.interview.coinChange;

public class MinCoinChange {

	public static void main(String[] args) {
		int[] coins = {1,3,5,15};
		System.out.println(CoinChange(coins, 47));
		System.out.println(coinChangeProblem(coins, 67));


	}
	
	public static int CoinChange(int coins[], int totalAmount) {
		int count = 0;
		if(totalAmount < 1) {
			return 0;
		}
		
		return minimumCoinChange(coins, totalAmount, new int[totalAmount]);
	}
	
	public static int minimumCoinChange(int coins[], int remaining, int count[]){
		if( remaining < 0) {
			return -1;
		}
		if(remaining == 0) {
			return 0;
		}
		if(count[remaining -1 ] != 0) {
			return count[remaining -1];
		}
		
		int min = Integer.MAX_VALUE;
		for(int coin : coins) {
			int res = minimumCoinChange(coins, remaining - coin, count);
			if(res >= 0 && res < min) {
				 min = 1 + res;
			}
		}
		count[remaining -1] = (min == Integer.MAX_VALUE) ? -1 : min;
		return count[remaining -1];
	}
	
	// alternative:
	
	private static int coinChangeProblem(int[] coins, int sum){
	    
		  int totalCoins = coins.length;

		  // Creating array which stores subproblems' solutions
		  double[][] arr = new double[totalCoins + 1][sum + 1];

		  // Initialising first row with +ve infinity
		  for(int j = 0; j <= sum; j++){
			  arr[0][j] = Double.POSITIVE_INFINITY;
		  }	      
	    
		  // Initialising first column with 0
		  for(int i = 1; i <= totalCoins; i++){
			  arr[i][0] = 0;
		  }

		  // Implementing the recursive solution
		  for(int i = 1; i <= totalCoins; i++){
			  for(int j = 1; j <= sum; j++){
				  if(coins[i - 1] <= j)
					  arr[i][j] = min(1 + arr[i][j - coins[i - 1]], arr[i - 1][j]);
				  else
					  arr[i][j] = arr[i - 1][j];
			  }
		  }

		  return (int)arr[totalCoins][sum];
	  }

	  // Helper function for the recursive solution.
	 private static double min(double a, double b){
	    if(a <= b){
	      return a;
	    }
	    else{
	      return b;
	    }
	  }
}
