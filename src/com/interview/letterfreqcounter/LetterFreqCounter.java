package com.interview.letterfreqcounter;

import java.util.HashMap;
import java.util.Map.Entry;

public class LetterFreqCounter {

	public static void main(String[] args) {
		System.out.println(freqCounter("aabaacbbacded"));

	}
	
	public static String freqCounter(String word) {
		
		HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
		StringBuilder frequencyCounted = new StringBuilder("");
		
		for(int i = 0; i < word.length(); i++) {
			char character = word.charAt(i);
			Integer frequency = hMap.get(character);
			if(frequency != null) {
				hMap.put(character, frequency + 1);
			}
			else {
				hMap.put(character, new Integer(1));
			}
		}
		
		
		 for (Entry<Character, Integer> entry : hMap.entrySet()) {
				frequencyCounted.append(entry.getKey()).append(entry.getValue());

		 }
		 
		return frequencyCounted.toString();
	}
}
