package com.interview.anagram;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		System.out.println(isAnagram("Army", "Mary"));
		System.out.println(checkAnagram("Army", "Mary"));


	}
	
	public static boolean isAnagram(String word, String anagram){
		char[] charFromWord = word.toLowerCase().toCharArray(); 
		char[] charFromAnagram = anagram.toLowerCase().toCharArray(); 
		Arrays.sort(charFromWord); Arrays.sort(charFromAnagram); 
		return Arrays.equals(charFromWord, charFromAnagram); 
	}
	
	public static boolean checkAnagram(String word, String anagram){ 
		word = word.toLowerCase();
		anagram = anagram.toLowerCase();
		if(word.length() != anagram.length())
		{
			return false; 
		} 
		char[] chars = word.toCharArray();
		for(char c : chars)
		{ 
			int index = anagram.indexOf(c); 
			if(index != -1)
			{
				anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length()); 
			}
			else
			{
				return false; 
			} 
		} 
		return anagram.isEmpty(); 
	}


}
