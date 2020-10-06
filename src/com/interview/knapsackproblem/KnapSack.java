package com.interview.knapsackproblem;

public class KnapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val[] = new int[] { 60, 100, 120 }; 
        int wt[] = new int[] { 10, 20, 30 }; 
        int W = 50; 
        int n = val.length; 
        System.out.println(knapSack(W, wt, val, n)); 

	}
	
    // Returns the maximum value that can 
    // be put in a knapsack of capacity knapSackCapacity 
   private static int knapSack(int knapSackCapacity, int itemWeightArr[], int itemValueArr[], int numberOfItems) 
    { 
        int countItem, countWeight; 
        int dpArr[][] = new int[numberOfItems + 1][knapSackCapacity + 1]; 
  
        // Build table dpArr[][] in bottom up manner 
        for (countItem = 0; countItem <= numberOfItems; countItem++) { 
            for (countWeight = 0; countWeight <= knapSackCapacity; countWeight++) { 
                if (countItem == 0 || countWeight == 0) 
                    dpArr[countItem][countWeight] = 0; 
                else if (itemWeightArr[countItem - 1] <= countWeight) 
                    dpArr[countItem][countWeight] = max( 
                        itemValueArr[countItem - 1] + dpArr[countItem - 1][countWeight - itemWeightArr[countItem - 1]], 
                        dpArr[countItem - 1][countWeight]); 
                else
                    dpArr[countItem][countWeight] = dpArr[countItem - 1][countWeight]; 
            } 
        } 
  
        return dpArr[numberOfItems][knapSackCapacity]; 
    } 

    // A Helper function that returns 
    // maximum of two integers 
    static int max(int a, int b) 
    { 
        return (a > b) ? a : b; 
    } 
  
}
