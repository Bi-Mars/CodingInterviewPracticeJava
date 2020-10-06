package com.interview.repeatingdecimal;

import java.util.HashMap;

/*
 * Problem description:
 * 		Create a program that is able to take 2 numbers (the numerator and denominator of a fraction)
 * 			that returns the results of the fraction in decimal form,
 * 				enclosing in parenthesis any repeating decimal
 * 
 * Example:
 * 		(1, 3) = 0.(3)
 * 		(1,4) = 0.25
 * 		(1,5) = 0.2
 * 		(1,6) = 0.1(6)
 * 		(1,7) = 0.(142857)
 * 		(1,8)  = 0.125
 */

public class RepeatingDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fractionToDecimal(1,4));

	}
	
	private static String repeatingDecimal(int numerator, int denominator) {	
		//fact cases
		if(numerator == 0) {
			return "0";
		}
		if(denominator == 0) {
			return "Undefined";
		}
		if(numerator % denominator == 0) {
			double result = numerator/denominator;
			return String.valueOf(result);
		}
	
		//Initialize the result
		String result = "";
		
		// create a map to store already seen remainder.
			// remainder is used as key
			// its position in result is stored as value 
		
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		hMap.clear();
		
		// first remainder
		int remainder = numerator % denominator;
		
		//keep finding remainder until either remainder becomes 0 or repeats
		while(remainder !=0 && (!hMap.containsValue(remainder))) {
			
			//store this remainder
			hMap.put(remainder, result.length());
			//multiply remainder by 10
			remainder = remainder * 10;
			// append remainder / denominator to result
			int result_part = remainder/denominator;
			result += String.valueOf(result_part);
			
			//update the remainder
			remainder = remainder % denominator;
			
			if(remainder == 0) {
				return result;
			}
			else if(hMap.containsKey(remainder)) {
				String parenthesis = result + "(" + result.substring(hMap.get(remainder)) + ")";
				return parenthesis;
			}
		}
		return " Empty";
	}
	
	 public static String fractionToDecimal(int numerator, int denominator) {
	        if (numerator == 0) {
	            return "0";
	        }
	        StringBuilder res = new StringBuilder();
	        
	        // XOR operation returns true only if one of the bit is 1
	        		// if numerator and denominator > 0, both returns 1
	        				// 1 ^ 1 = 0
	        		// if numerator and denominator < 0, both returns 0
	        				// 0 ^ 0 = 0
	        // "+" or "-"
	        res.append(((numerator > 0) ^ (denominator > 0)) ? "-" : "");
	        
	        // get absolute value
	        long num = Math.abs((long)numerator);
	        long den = Math.abs((long)denominator);

	        // integral part
	        res.append(num / den);
	        num %= den;
	        if (num == 0) {
	            return res.toString();
	        }

	        // fractional part
	        res.append(".");
	        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
	        map.put(num, res.length());
	        while (num != 0) {
	            num *= 10;
	            res.append(num / den);
	            num %= den;
	            if (map.containsKey(num)) {
	                int index = map.get(num);
	                res.insert(index, "(");
	                res.append(")");
	                break;
	            }
	            else {
	                map.put(num, res.length());
	            }
	        }
	        return res.toString();
	    }
}
