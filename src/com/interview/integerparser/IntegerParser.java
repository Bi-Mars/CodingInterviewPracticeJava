package com.interview.integerparser;

public class IntegerParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToInt("3257") + convertToInt("3"));

	}
	
	private static Integer convertToInt(String number) {
				Integer sum = 0;
		
		//get ascii value for zero
		Integer zeroAscii = (int) '0';
		
		for(char c : number.toCharArray()) {
			int tempAscii = (int) c;
			sum = (sum*10) + (tempAscii - zeroAscii);
		}
		
		return sum;
		
	}

}
