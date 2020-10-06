package com.interview.firstletter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintFirstLetterOfEveryWord {

	public static void main(String[] args) {
		
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		
		List<Character> firstLetters = firstLetters(userInput);
		
		for(char firstLetter : firstLetters) {
			System.out.println(firstLetter);
		}
	}

	public static List<Character> firstLetters(String userString){
		List<Character> firstLetters = new ArrayList<Character>();
		
		for(String word : userString.split(" ")) {
			firstLetters.add(word.charAt(0));
		}
		
		return firstLetters;
	}
}
